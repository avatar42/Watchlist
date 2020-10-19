package com.dea42.watchlist.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dea42.watchlist.entity.Showsuser;
import com.dea42.watchlist.repo.ShowsuserRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: ShowsuserServices <br>
 * Description: ShowsuserServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@Service
public class ShowsuserServices {
    @Autowired
    private ShowsuserRepository showsuserRepository;

	public List<Showsuser> listAll() {
		return (List<Showsuser>) showsuserRepository.findAll();
	}
	
	public Showsuser save(Showsuser showsuser) {
		return showsuserRepository.save(showsuser);
	}
	
	public Showsuser get(Integer id) {
		return showsuserRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		showsuserRepository.deleteById(id);
	}

}

