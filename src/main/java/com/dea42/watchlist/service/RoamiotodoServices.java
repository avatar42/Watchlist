package com.dea42.watchlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.repo.RoamiotodoRepository;

/**
 * Title: RoamiotodoServices <br>
 * Description: RoamiotodoServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
@Service
public class RoamiotodoServices {
    @Autowired
    private RoamiotodoRepository roamiotodoRepository;

	public List<Roamiotodo> listAll() {
		return (List<Roamiotodo>) roamiotodoRepository.findAll();
	}
	
	public void save(Roamiotodo item) {
		roamiotodoRepository.save(item);
	}
	
	public Roamiotodo get(Integer id) {
		return roamiotodoRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamiotodoRepository.deleteById(id);
	}

}

