package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.repo.ShowsRepository;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.search.ShowsSearchForm;
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
 * Title: ShowsServices <br>
 * Description: ShowsServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class ShowsServices {
    @Autowired
    private ShowsRepository showsRepository;

	public Page<Shows> listAll(ShowsSearchForm form) {
		SearchSpecification<Shows> searchSpec = new SearchSpecification<Shows>();
		if (form != null) {
			log.debug(form.toString());
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getCancelled())) {
				searchSpec.add(new SearchCriteria<String>("cancelled", form.getCancelled().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEpguidesshowname())) {
				searchSpec.add(new SearchCriteria<String>("epguidesshowname", form.getEpguidesshowname().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEpguidesshownamelink())) {
				searchSpec.add(new SearchCriteria<String>("epguidesshownamelink", form.getEpguidesshownamelink().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getIncanceledas())) {
				searchSpec.add(new SearchCriteria<String>("incanceledas", form.getIncanceledas().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIncanceledaslink())) {
				searchSpec.add(new SearchCriteria<String>("incanceledaslink", form.getIncanceledaslink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getLastshow())) {
				searchSpec.add(new SearchCriteria<String>("lastshow", form.getLastshow().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getNetwork())) {
				searchSpec.add(new SearchCriteria<String>("network", form.getNetwork().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getNetworklink())) {
				searchSpec.add(new SearchCriteria<String>("networklink", form.getNetworklink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getPremiere())) {
				searchSpec.add(new SearchCriteria<String>("premiere", form.getPremiere().toLowerCase(), SearchOperation.LIKE));
			}

			if (form.getPremieredateMin() != null) {
// need to subtract a millsec here to get >= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>("premieredate", new Date(form.getPremieredateMin().getTime() - 1), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getPremieredateMax() != null) {
// need to add a millsec here to get <= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>("premieredate", new Date(form.getPremieredateMax().getTime() + 1), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getStatus())) {
				searchSpec.add(new SearchCriteria<String>("status", form.getStatus().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivoname())) {
				searchSpec.add(new SearchCriteria<String>("tivoname", form.getTivoname().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivonamelink())) {
				searchSpec.add(new SearchCriteria<String>("tivonamelink", form.getTivonamelink().toLowerCase(), SearchOperation.LIKE));
			}

		} else {
			form = new ShowsSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return showsRepository.findAll(searchSpec, pageable);
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

