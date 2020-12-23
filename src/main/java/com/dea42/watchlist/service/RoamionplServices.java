package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.repo.RoamionplRepository;
import com.dea42.watchlist.search.RoamionplSearchForm;
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
 * Title: RoamionplServices <br>
 * Description: RoamionplServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class RoamionplServices {
    @Autowired
    private RoamionplRepository roamionplRepository;

	public Page<Roamionpl> listAll(RoamionplSearchForm form) {
		SearchSpecification<Roamionpl> searchSpec = new SearchSpecification<Roamionpl>();
		if (form != null) {
			log.debug(form.toString());
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getBitratembpsMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("bitratembps", form.getBitratembpsMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getBitratembpsMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("bitratembps", form.getBitratembpsMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getChannel())) {
				searchSpec.add(new SearchCriteria<String>("channel", form.getChannel().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getDateMin() != null) {
				BigDecimal bd = form.getDateMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("date",bd, SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDateMax() != null) {
				BigDecimal bd = form.getDateMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("date",bd, SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getDurationMin() != null) {
				BigDecimal bd = form.getDurationMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("duration",bd, SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDurationMax() != null) {
				BigDecimal bd = form.getDurationMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("duration",bd, SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getEpisode())) {
				searchSpec.add(new SearchCriteria<String>("episode", form.getEpisode().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getIsnewMin() != null) {
				BigDecimal bd = form.getIsnewMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("isnew",bd, SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIsnewMax() != null) {
				BigDecimal bd = form.getIsnewMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("isnew",bd, SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getRowinshowsMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("rowinshows", form.getRowinshowsMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getRowinshowsMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("rowinshows", form.getRowinshowsMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getSeriesep())) {
				searchSpec.add(new SearchCriteria<String>("seriesep", form.getSeriesep().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getShow())) {
				searchSpec.add(new SearchCriteria<String>("show", form.getShow().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getSizegbMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("sizegb", form.getSizegbMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSizegbMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("sizegb", form.getSizegbMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getSortabledateMin() != null) {
				searchSpec.add(new SearchCriteria<Long>("sortabledate", form.getSortabledateMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSortabledateMax() != null) {
				searchSpec.add(new SearchCriteria<Long>("sortabledate", form.getSortabledateMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getTitle())) {
				searchSpec.add(new SearchCriteria<String>("title", form.getTitle().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getWatchedtimeMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("watchedtime", form.getWatchedtimeMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getWatchedtimeMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("watchedtime", form.getWatchedtimeMax(), SearchOperation.LESS_THAN_EQUAL));
			}

		} else {
			form = new RoamionplSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return roamionplRepository.findAll(searchSpec, pageable);
	}

	public Roamionpl save(Roamionpl roamionpl) {
		return roamionplRepository.save(roamionpl);
	}
	
	public Roamionpl get(Integer id) {
		return roamionplRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamionplRepository.deleteById(id);
	}

}

