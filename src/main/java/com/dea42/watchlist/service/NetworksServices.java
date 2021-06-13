package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.NetworksRepository;
import com.dea42.watchlist.search.NetworksSearchForm;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.search.SearchType;
import com.dea42.watchlist.utils.Utils;
import java.math.BigDecimal;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
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
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getAndroidapp())) {
				searchSpec.add(new SearchCriteria<String>(null,"androidapp", form.getAndroidapp().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getComment())) {
				searchSpec.add(new SearchCriteria<String>(null,"comment", form.getComment().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getCommercials())) {
				searchSpec.add(new SearchCriteria<String>(null,"commercials", form.getCommercials().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFireapp())) {
				searchSpec.add(new SearchCriteria<String>(null,"fireapp", form.getFireapp().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFreewithtwcid())) {
				searchSpec.add(new SearchCriteria<String>(null,"freewithtwcid", form.getFreewithtwcid().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getHasdirectbuyoption())) {
				searchSpec.add(new SearchCriteria<String>(null,"hasdirectbuyoption", form.getHasdirectbuyoption().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getHaswatchlist())) {
				searchSpec.add(new SearchCriteria<String>(null,"haswatchlist", form.getHaswatchlist().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIcanota())) {
				searchSpec.add(new SearchCriteria<String>(null,"icanota", form.getIcanota().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIptvservice())) {
				searchSpec.add(new SearchCriteria<String>(null,"iptvservice", form.getIptvservice().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getOnhulu())) {
				searchSpec.add(new SearchCriteria<String>(null,"onhulu", form.getOnhulu().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getPersistance())) {
				searchSpec.add(new SearchCriteria<String>(null,"persistance", form.getPersistance().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRemembersplaceinepisode())) {
				searchSpec.add(new SearchCriteria<String>(null,"remembersplaceinepisode", form.getRemembersplaceinepisode().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRememberswatchedepisodes())) {
				searchSpec.add(new SearchCriteria<String>(null,"rememberswatchedepisodes", form.getRememberswatchedepisodes().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRokuapp())) {
				searchSpec.add(new SearchCriteria<String>(null,"rokuapp", form.getRokuapp().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getShowsintivonplMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"showsintivonpl", form.getShowsintivonplMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getShowsintivonplMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"showsintivonpl", form.getShowsintivonplMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getSite())) {
				searchSpec.add(new SearchCriteria<String>(null,"site", form.getSite().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getStandardwait())) {
				searchSpec.add(new SearchCriteria<String>(null,"standardwait", form.getStandardwait().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivoapp())) {
				searchSpec.add(new SearchCriteria<String>(null,"tivoapp", form.getTivoapp().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivoshortname())) {
				searchSpec.add(new SearchCriteria<String>(null,"tivoshortname", form.getTivoshortname().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getWebinterface())) {
				searchSpec.add(new SearchCriteria<String>(null,"webinterface", form.getWebinterface().toLowerCase(),
					SearchOperation.LIKE));
			}

		} else {
			form = new NetworksSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return networksRepository.findAll(searchSpec, pageable);
	}

	public Networks save(Networks networks) {
		return networksRepository.save(networks);
	}
	
	public Networks get(Long id) {
		return networksRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		networksRepository.deleteById(id);
	}

	public PageInfo<Networks> getNetworkss(HttpServletRequest request, PagingRequest pagingRequest) {

		NetworksSearchForm form =  (NetworksSearchForm) request.getSession().getAttribute("networksSearchForm");

		if (form == null ) {
			form = new NetworksSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setCommercials(value);
			form.setOnhulu(value);
			form.setPersistance(value);
			form.setRokuapp(value);
			form.setSite(value);
			form.setStandardwait(value);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new NetworksSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Networks> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Networks> pageInfo = new PageInfo<Networks>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("networksSearchForm", form);


		return pageInfo;
	}


}
