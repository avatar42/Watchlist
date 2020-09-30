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


import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.repo.RoamionplRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: RoamionplServices <br>
 * Description: RoamionplServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */
@Service
public class RoamionplServices {
	private static final Logger LOGGER = LoggerFactory.getLogger(RoamionplServices.class.getName());
    @Autowired
    private RoamionplRepository roamionplRepository;

	public List<Roamionpl> listAll() {
		return (List<Roamionpl>) roamionplRepository.findAll();
	}
	
	public Roamionpl save(Roamionpl roamionpl) {
		return roamionplRepository.save(roamionpl);
	}
	
	public Roamionpl get(Integer id) {
		return roamionplRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamionplRepository.deleteById(id);
	}

}

