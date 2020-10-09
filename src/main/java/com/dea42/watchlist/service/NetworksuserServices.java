package com.dea42.watchlist.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dea42.watchlist.entity.Networksuser;
import com.dea42.watchlist.repo.NetworksuserRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: NetworksuserServices <br>
 * Description: NetworksuserServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Service
public class NetworksuserServices {
    @Autowired
    private NetworksuserRepository networksuserRepository;

	public List<Networksuser> listAll() {
		return (List<Networksuser>) networksuserRepository.findAll();
	}
	
	public Networksuser save(Networksuser networksuser) {
		return networksuserRepository.save(networksuser);
	}
	
	public Networksuser get(Integer id) {
		return networksuserRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		networksuserRepository.deleteById(id);
	}

}

