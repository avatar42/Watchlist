package com.dea42.watchlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.repo.OtaRepository;

/**
 * Title: OtaServices <br>
 * Description: OtaServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
@Service
public class OtaServices {
    @Autowired
    private OtaRepository otaRepository;

	public List<Ota> listAll() {
		return (List<Ota>) otaRepository.findAll();
	}
	
	public void save(Ota item) {
		otaRepository.save(item);
	}
	
	public Ota get(Integer id) {
		return otaRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		otaRepository.deleteById(id);
	}

}

