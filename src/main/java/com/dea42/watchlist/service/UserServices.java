package com.dea42.watchlist.service;

import java.util.Collections;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.repo.UserRepository;

/**
 * Title: Parent with user login services <br>
 * Description: UserServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * 
 * @author Gened by com.dea42.build.GenSpring version 0.2.3<br>
 * @version 1.0.0<br>
 */
public abstract class UserServices<T> implements UserDetailsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServices.class.getName());
	@Autowired
	protected UserRepository userRepository;

	public static final String ROLE_PREFIX = "ROLE_";

	@Autowired
	private PasswordEncoder passwordEncoder;

	protected String encrypt(String s) {
		if (StringUtils.isAllBlank(s)) {
			return null;
		}

		String rtn = passwordEncoder.encode(s);

		LOGGER.trace("Encrypted:'" + s + "' to '" + rtn + "'");
		return rtn;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = userRepository.findOneByEmail(username);
		if (account == null) {
			return null;
			// throw new UsernameNotFoundException("user not found");
		}
		return createUser(account);
	}

	public boolean isEmailAlreadyInUse(String username) throws UsernameNotFoundException {
		if (username == null)
			return false;

		Account account = userRepository.findOneByEmail(username);
		if (account == null)
			return false;

		return true;
	}

	public boolean login(String email, String password) {
		Account account = userRepository.findOneByEmail(email);
		if (account == null) {
			LOGGER.warn("User email " + email + " not found in DB");
			return false;
		}

		if (passwordEncoder.matches(password, account.getPassword())) {
			SecurityContextHolder.getContext().setAuthentication(genAuthToken(account));
			// TODO: add last logged in date/time.
			return true;
		}

		LOGGER.warn("User " + email + " password did not match");
		return false;

	}

	/**
	 * Gen token.
	 * 
	 * @param account
	 * @return
	 */
	private Authentication genAuthToken(Account account) {
		LOGGER.debug("authing:" + account);
		Authentication a = new UsernamePasswordAuthenticationToken(createUser(account), null,
				Collections.singleton(createAuthority(account)));
		LOGGER.debug("result in:" + a);
		return a;
	}

	private User createUser(Account account) {
		return new User(account.getEmail(), account.getPassword(), Collections.singleton(createAuthority(account)));
	}

	private GrantedAuthority createAuthority(Account account) {
		LOGGER.debug("logged in:" + account);
		return new SimpleGrantedAuthority(account.getRole());
	}

	public abstract T save(T obj);
}