package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.repo.RoamiotodoRepository;
import com.dea42.watchlist.search.RoamiotodoSearchForm;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.utils.Utils;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;


/**
 * Title: RoamiotodoServices <br>
 * Description: RoamiotodoServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class RoamiotodoServices {
    @Autowired
    private RoamiotodoRepository roamiotodoRepository;

	public Page<Roamiotodo> listAll(RoamiotodoSearchForm form) {
		SearchSpecification<Roamiotodo> searchSpec = new SearchSpecification<Roamiotodo>();
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

			if (form.getDateMin() != null) {
// need to subtract a millsec here to get >= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>("date", new Date(form.getDateMin().getTime() - 1), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDateMax() != null) {
// need to add a millsec here to get <= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>("date", new Date(form.getDateMax().getTime() + 1), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getDuration())) {
				searchSpec.add(new SearchCriteria<String>("duration", form.getDuration().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEp())) {
				searchSpec.add(new SearchCriteria<String>("ep", form.getEp().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEpisodename())) {
				searchSpec.add(new SearchCriteria<String>("episodename", form.getEpisodename().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getShowname())) {
				searchSpec.add(new SearchCriteria<String>("showname", form.getShowname().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getShowtrimmed())) {
				searchSpec.add(new SearchCriteria<String>("showtrimmed", form.getShowtrimmed().toLowerCase(), SearchOperation.LIKE));
			}

		} else {
			form = new RoamiotodoSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return roamiotodoRepository.findAll(searchSpec, pageable);
	}

	public Roamiotodo save(Roamiotodo roamiotodo) {
		return roamiotodoRepository.save(roamiotodo);
	}
	
	public Roamiotodo get(Integer id) {
		return roamiotodoRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		roamiotodoRepository.deleteById(id);
	}

}

