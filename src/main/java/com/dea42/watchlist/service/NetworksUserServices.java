package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.repo.NetworksUserRepository;
import com.dea42.watchlist.search.NetworksUserSearchForm;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.utils.Utils;
import java.math.BigDecimal;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * Title: NetworksUserServices <br>
 * Description: NetworksUserServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class NetworksUserServices {
    @Autowired
    private NetworksUserRepository networksUserRepository;

	public Page<NetworksUser> listAll(NetworksUserSearchForm form) {
		SearchSpecification<NetworksUser> searchSpec = new SearchSpecification<NetworksUser>();
		if (form != null) {
			log.debug(form.toString());
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getIusefreefreewithcablepayforhuluinstead())) {
				searchSpec.add(new SearchCriteria<String>("iusefreefreewithcablepayforhuluinstead", form.getIusefreefreewithcablepayforhuluinstead().toLowerCase(), SearchOperation.LIKE));
			}

		} else {
			form = new NetworksUserSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return networksUserRepository.findAll(searchSpec, pageable);
	}

	public NetworksUser save(NetworksUser networksUser) {
		return networksUserRepository.save(networksUser);
	}
	
	public NetworksUser get(Integer id) {
		return networksUserRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		networksUserRepository.deleteById(id);
	}

}

