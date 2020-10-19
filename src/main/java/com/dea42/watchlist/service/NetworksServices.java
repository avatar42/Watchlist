package com.dea42.watchlist.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.repo.NetworksRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: NetworksServices <br>
 * Description: NetworksServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@Service
public class NetworksServices {
    @Autowired
    private NetworksRepository networksRepository;

	public List<Networks> listAll() {
		return (List<Networks>) networksRepository.findAll();
	}
	
	public Networks save(Networks networks) {
		return networksRepository.save(networks);
	}
	
	public Networks get(Integer id) {
		return networksRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		networksRepository.deleteById(id);
	}

}

