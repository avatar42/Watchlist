package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dea42.watchlist.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findOneByEmail(String email);
	Account findOneByEmailAndPassword(String email, String password);
}