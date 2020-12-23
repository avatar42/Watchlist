package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.repo.CablecardRepository;
import com.dea42.watchlist.search.CablecardSearchForm;
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
 * Title: CablecardServices <br>
 * Description: CablecardServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class CablecardServices {
    @Autowired
    private CablecardRepository cablecardRepository;

	public Page<Cablecard> listAll(CablecardSearchForm form) {
		SearchSpecification<Cablecard> searchSpec = new SearchSpecification<Cablecard>();
		if (form != null) {
			log.debug(form.toString());
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getChannelname())) {
				searchSpec.add(new SearchCriteria<String>("channelname", form.getChannelname().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getChannelnumberMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("channelnumber", form.getChannelnumberMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getChannelnumberMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("channelnumber", form.getChannelnumberMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getDtMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("dt", form.getDtMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDtMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("dt", form.getDtMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getHdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("hd", form.getHdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getHdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("hd", form.getHdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getInnplMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("innpl", form.getInnplMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getInnplMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("innpl", form.getInnplMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getLang())) {
				searchSpec.add(new SearchCriteria<String>("lang", form.getLang().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getNet())) {
				searchSpec.add(new SearchCriteria<String>("net", form.getNet().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getReceiving())) {
				searchSpec.add(new SearchCriteria<String>("receiving", form.getReceiving().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getShortfield())) {
				searchSpec.add(new SearchCriteria<String>("shortfield", form.getShortfield().toLowerCase(), SearchOperation.LIKE));
			}

		} else {
			form = new CablecardSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return cablecardRepository.findAll(searchSpec, pageable);
	}

	public Cablecard save(Cablecard cablecard) {
		return cablecardRepository.save(cablecard);
	}
	
	public Cablecard get(Integer id) {
		return cablecardRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		cablecardRepository.deleteById(id);
	}

}

