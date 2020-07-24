package com.dea42.watchlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.repo.ShowsRepository;

/**
 * Title: ShowsServices <br>
 * Description: ShowsServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
@Service
public class ShowsServices {
    @Autowired
    private ShowsRepository showsRepository;

	public List<Shows> listAll() {
		return (List<Shows>) showsRepository.findAll();
	}
	
	public void save(Shows item) {
		showsRepository.save(item);
	}
	
	public Shows get(Integer id) {
		return showsRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		showsRepository.deleteById(id);
	}

}

