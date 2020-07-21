package com.dea42.watchlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.repo.CablecardRepository;

/**
 * Title: CablecardServices <br>
 * Description: Class for the CablecardServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * 
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@Service
public class CablecardServices {
	@Autowired
	private CablecardRepository cablecardRepository;

	public List<Cablecard> listAll() {
		return (List<Cablecard>) cablecardRepository.findAll();
	}

	public void save(Cablecard product) {
		cablecardRepository.save(product);
	}

	public Cablecard get(Integer id) {
		return cablecardRepository.findById(id).get();
	}

	public void delete(Integer id) {
		cablecardRepository.deleteById(id);
	}

}
