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

import java.math.BigDecimal;

import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.repo.OtaRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: OtaServices <br>
 * Description: OtaServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */
@Service
public class OtaServices {
	private static final Logger LOGGER = LoggerFactory.getLogger(OtaServices.class.getName());
    @Autowired
    private OtaRepository otaRepository;

	public List<Ota> listAll() {
		return (List<Ota>) otaRepository.findAll();
	}
	
	public Ota save(Ota ota) {
		return otaRepository.save(ota);
	}
	
	public Ota get(Integer id) {
		return otaRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		otaRepository.deleteById(id);
	}

}

