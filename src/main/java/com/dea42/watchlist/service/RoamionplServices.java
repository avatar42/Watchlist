package com.dea42.watchlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.repo.RoamionplRepository;

/**
 * Title: RoamionplServices <br>
 * Description: RoamionplServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@Service
public class RoamionplServices {
    @Autowired
    private RoamionplRepository roamionplRepository;

	public List<Roamionpl> listAll() {
		return (List<Roamionpl>) roamionplRepository.findAll();
	}
	
	public void save(Roamionpl item) {
		roamionplRepository.save(item);
	}
	
	public Roamionpl get(Integer id) {
		return roamionplRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamionplRepository.deleteById(id);
	}

}

