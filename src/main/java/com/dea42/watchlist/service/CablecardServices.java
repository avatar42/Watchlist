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


import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.repo.CablecardRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: CablecardServices <br>
 * Description: CablecardServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */
@Service
public class CablecardServices {
	private static final Logger LOGGER = LoggerFactory.getLogger(CablecardServices.class.getName());
    @Autowired
    private CablecardRepository cablecardRepository;

	public List<Cablecard> listAll() {
		return (List<Cablecard>) cablecardRepository.findAll();
	}
	
	public Cablecard save(Cablecard cablecard) {
		return cablecardRepository.save(cablecard);
	}
	
	public Cablecard get(Integer id) {
		return cablecardRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		cablecardRepository.deleteById(id);
	}

}

