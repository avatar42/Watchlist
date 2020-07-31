package com.dea42.watchlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.repo.RoamiospRepository;

/**
 * Title: RoamiospServices <br>
 * Description: RoamiospServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@Service
public class RoamiospServices {
    @Autowired
    private RoamiospRepository roamiospRepository;

	public List<Roamiosp> listAll() {
		return (List<Roamiosp>) roamiospRepository.findAll();
	}
	
	public void save(Roamiosp item) {
		roamiospRepository.save(item);
	}
	
	public Roamiosp get(Integer id) {
		return roamiospRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamiospRepository.deleteById(id);
	}

}

