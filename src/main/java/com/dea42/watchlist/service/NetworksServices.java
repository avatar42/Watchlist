package com.dea42.watchlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.repo.NetworksRepository;

/**
 * Title: NetworksServices <br>
 * Description: Class for the NetworksServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@Service
public class NetworksServices {
    @Autowired
    private NetworksRepository networksRepository;

	public List<Networks> listAll() {
		return (List<Networks>) networksRepository.findAll();
	}
	
	public void save(Networks product) {
		networksRepository.save(product);
	}
	
	public Networks get(Integer id) {
		return networksRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		networksRepository.deleteById(id);
	}

}
