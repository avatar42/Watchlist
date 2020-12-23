package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.repo.RoamiospRepository;
import com.dea42.watchlist.search.RoamiospSearchForm;
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
 * Title: RoamiospServices <br>
 * Description: RoamiospServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class RoamiospServices {
    @Autowired
    private RoamiospRepository roamiospRepository;

	public Page<Roamiosp> listAll(RoamiospSearchForm form) {
		SearchSpecification<Roamiosp> searchSpec = new SearchSpecification<Roamiosp>();
		if (form != null) {
			log.debug(form.toString());
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getChannel())) {
				searchSpec.add(new SearchCriteria<String>("channel", form.getChannel().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getEndMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("end", form.getEndMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getEndMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("end", form.getEndMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getInclude())) {
				searchSpec.add(new SearchCriteria<String>("include", form.getInclude().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getKeep())) {
				searchSpec.add(new SearchCriteria<String>("keep", form.getKeep().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getNumMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("num", form.getNumMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getNumMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("num", form.getNumMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getPriorityMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("priority", form.getPriorityMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getPriorityMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("priority", form.getPriorityMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getRecord())) {
				searchSpec.add(new SearchCriteria<String>("record", form.getRecord().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getSeasonMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("season", form.getSeasonMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSeasonMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("season", form.getSeasonMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getShow())) {
				searchSpec.add(new SearchCriteria<String>("show", form.getShow().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getStartMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("start", form.getStartMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getStartMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("start", form.getStartMax(), SearchOperation.LESS_THAN_EQUAL));
			}

		} else {
			form = new RoamiospSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return roamiospRepository.findAll(searchSpec, pageable);
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

