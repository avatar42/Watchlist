package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.repo.NetworksRepository;
import com.dea42.watchlist.search.NetworksSearchForm;
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
 * Title: NetworksServices <br>
 * Description: NetworksServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class NetworksServices {
    @Autowired
    private NetworksRepository networksRepository;

	public Page<Networks> listAll(NetworksSearchForm form) {
		SearchSpecification<Networks> searchSpec = new SearchSpecification<Networks>();
		if (form != null) {
			log.debug(form.toString());
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getAndroidapp())) {
				searchSpec.add(new SearchCriteria<String>("androidapp", form.getAndroidapp().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getAndroidapplink())) {
				searchSpec.add(new SearchCriteria<String>("androidapplink", form.getAndroidapplink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getComment())) {
				searchSpec.add(new SearchCriteria<String>("comment", form.getComment().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getCommentlink())) {
				searchSpec.add(new SearchCriteria<String>("commentlink", form.getCommentlink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getCommercials())) {
				searchSpec.add(new SearchCriteria<String>("commercials", form.getCommercials().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getCommercialslink())) {
				searchSpec.add(new SearchCriteria<String>("commercialslink", form.getCommercialslink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFireapp())) {
				searchSpec.add(new SearchCriteria<String>("fireapp", form.getFireapp().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFireapplink())) {
				searchSpec.add(new SearchCriteria<String>("fireapplink", form.getFireapplink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFreewithtwcid())) {
				searchSpec.add(new SearchCriteria<String>("freewithtwcid", form.getFreewithtwcid().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFreewithtwcidlink())) {
				searchSpec.add(new SearchCriteria<String>("freewithtwcidlink", form.getFreewithtwcidlink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getHasdirectbuyoption())) {
				searchSpec.add(new SearchCriteria<String>("hasdirectbuyoption", form.getHasdirectbuyoption().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getHasdirectbuyoptionlink())) {
				searchSpec.add(new SearchCriteria<String>("hasdirectbuyoptionlink", form.getHasdirectbuyoptionlink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getHaswatchlist())) {
				searchSpec.add(new SearchCriteria<String>("haswatchlist", form.getHaswatchlist().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIcanota())) {
				searchSpec.add(new SearchCriteria<String>("icanota", form.getIcanota().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIcanotalink())) {
				searchSpec.add(new SearchCriteria<String>("icanotalink", form.getIcanotalink().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getIptvservice())) {
				searchSpec.add(new SearchCriteria<String>("iptvservice", form.getIptvservice().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIptvservicelink())) {
				searchSpec.add(new SearchCriteria<String>("iptvservicelink", form.getIptvservicelink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getOnhulu())) {
				searchSpec.add(new SearchCriteria<String>("onhulu", form.getOnhulu().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getOnhululink())) {
				searchSpec.add(new SearchCriteria<String>("onhululink", form.getOnhululink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getPersistance())) {
				searchSpec.add(new SearchCriteria<String>("persistance", form.getPersistance().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRemembersplaceinepisode())) {
				searchSpec.add(new SearchCriteria<String>("remembersplaceinepisode", form.getRemembersplaceinepisode().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRememberswatchedepisodes())) {
				searchSpec.add(new SearchCriteria<String>("rememberswatchedepisodes", form.getRememberswatchedepisodes().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRokuapp())) {
				searchSpec.add(new SearchCriteria<String>("rokuapp", form.getRokuapp().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRokuapplink())) {
				searchSpec.add(new SearchCriteria<String>("rokuapplink", form.getRokuapplink().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getShowsintivonplMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("showsintivonpl", form.getShowsintivonplMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getShowsintivonplMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("showsintivonpl", form.getShowsintivonplMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getSite())) {
				searchSpec.add(new SearchCriteria<String>("site", form.getSite().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getSitelink())) {
				searchSpec.add(new SearchCriteria<String>("sitelink", form.getSitelink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getStandardwait())) {
				searchSpec.add(new SearchCriteria<String>("standardwait", form.getStandardwait().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivoapp())) {
				searchSpec.add(new SearchCriteria<String>("tivoapp", form.getTivoapp().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivoapplink())) {
				searchSpec.add(new SearchCriteria<String>("tivoapplink", form.getTivoapplink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivoshortname())) {
				searchSpec.add(new SearchCriteria<String>("tivoshortname", form.getTivoshortname().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getWebinterface())) {
				searchSpec.add(new SearchCriteria<String>("webinterface", form.getWebinterface().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getWebinterfacelink())) {
				searchSpec.add(new SearchCriteria<String>("webinterfacelink", form.getWebinterfacelink().toLowerCase(), SearchOperation.LIKE));
			}

		} else {
			form = new NetworksSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return networksRepository.findAll(searchSpec, pageable);
	}

	public Networks save(Networks networks) {
		return networksRepository.save(networks);
	}
	
	public Networks get(Integer id) {
		return networksRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		networksRepository.deleteById(id);
	}

}

