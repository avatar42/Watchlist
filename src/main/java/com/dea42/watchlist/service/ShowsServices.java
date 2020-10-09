package com.dea42.watchlist.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.repo.ShowsRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: ShowsServices <br>
 * Description: ShowsServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Service
public class ShowsServices {
    @Autowired
    private ShowsRepository showsRepository;

	public List<Shows> listAll() {
		return (List<Shows>) showsRepository.findAll();
	}
	
	public Shows save(Shows shows) {
		return showsRepository.save(shows);
	}
	
	public Shows get(Integer id) {
		return showsRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		showsRepository.deleteById(id);
	}

}

