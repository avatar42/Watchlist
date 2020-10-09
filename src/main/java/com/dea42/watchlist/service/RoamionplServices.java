package com.dea42.watchlist.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
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
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Service
public class RoamionplServices {
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

