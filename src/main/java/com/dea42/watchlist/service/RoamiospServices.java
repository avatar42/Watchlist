package com.dea42.watchlist.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.repo.RoamiospRepository;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: RoamiospServices <br>
 * Description: RoamiospServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@Service
public class RoamiospServices {
    @Autowired
    private RoamiospRepository roamiospRepository;

	public List<Roamiosp> listAll() {
		return (List<Roamiosp>) roamiospRepository.findAll();
	}
	
	public Roamiosp save(Roamiosp roamiosp) {
		return roamiospRepository.save(roamiosp);
	}
	
	public Roamiosp get(Integer id) {
		return roamiospRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamiospRepository.deleteById(id);
	}

}

