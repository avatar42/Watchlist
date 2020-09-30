package com.dea42.watchlist.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.repo.RoamiotodoRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: RoamiotodoServices <br>
 * Description: RoamiotodoServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */
@Service
public class RoamiotodoServices {
	private static final Logger LOGGER = LoggerFactory.getLogger(RoamiotodoServices.class.getName());
    @Autowired
    private RoamiotodoRepository roamiotodoRepository;

	public List<Roamiotodo> listAll() {
		return (List<Roamiotodo>) roamiotodoRepository.findAll();
	}
	
	public Roamiotodo save(Roamiotodo roamiotodo) {
		return roamiotodoRepository.save(roamiotodo);
	}
	
	public Roamiotodo get(Integer id) {
		return roamiotodoRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamiotodoRepository.deleteById(id);
	}

}

