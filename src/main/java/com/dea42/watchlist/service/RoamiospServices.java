package com.dea42.watchlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.repo.RoamiospRepository;

/**
 * Title: RoamiospServices <br>
 * Description: Class for the RoamiospServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@Service
public class RoamiospServices {
    @Autowired
    private RoamiospRepository roamiospRepository;

	public List<Roamiosp> listAll() {
		return (List<Roamiosp>) roamiospRepository.findAll();
	}
	
	public void save(Roamiosp product) {
		roamiospRepository.save(product);
	}
	
	public Roamiosp get(Integer id) {
		return roamiospRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamiospRepository.deleteById(id);
	}

}

