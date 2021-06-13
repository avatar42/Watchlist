package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.ShowsRepository;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.search.SearchType;
import com.dea42.watchlist.search.ShowsSearchForm;
import com.dea42.watchlist.utils.Utils;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
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
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getCancelled())) {
				searchSpec.add(new SearchCriteria<String>(null,"cancelled", form.getCancelled().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEpguidesshowname())) {
				searchSpec.add(new SearchCriteria<String>(null,"epguidesshowname", form.getEpguidesshowname().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIncanceledas())) {
				searchSpec.add(new SearchCriteria<String>(null,"incanceledas", form.getIncanceledas().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getLastshow())) {
				searchSpec.add(new SearchCriteria<String>(null,"lastshow", form.getLastshow().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getNetwork())) {
				searchSpec.add(new SearchCriteria<String>(null,"network", form.getNetwork().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getPremiere())) {
				searchSpec.add(new SearchCriteria<String>(null,"premiere", form.getPremiere().toLowerCase(),
					SearchOperation.LIKE));
			}

			if (form.getPremieredateMin() != null) {
// need to subtract a millsec here to get >= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"premieredate",
					new Date(form.getPremieredateMin().getTime() - 1),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getPremieredateMax() != null) {
// need to add a millsec here to get <= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"premieredate",
					new Date(form.getPremieredateMax().getTime() + 1),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getStatus())) {
				searchSpec.add(new SearchCriteria<String>(null,"status", form.getStatus().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getTivoname())) {
				searchSpec.add(new SearchCriteria<String>(null,"tivoname", form.getTivoname().toLowerCase(),
					SearchOperation.LIKE));
			}

		} else {
			form = new ShowsSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return showsRepository.findAll(searchSpec, pageable);
	}

	public Shows save(Shows shows) {
		return showsRepository.save(shows);
	}
	
	public Shows get(Long id) {
		return showsRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		showsRepository.deleteById(id);
	}

	public PageInfo<Shows> getShowss(HttpServletRequest request, PagingRequest pagingRequest) {

		ShowsSearchForm form =  (ShowsSearchForm) request.getSession().getAttribute("showsSearchForm");

		if (form == null ) {
			form = new ShowsSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setCancelled(value);
			form.setEpguidesshowname(value);
			form.setIncanceledas(value);
			form.setLastshow(value);
			form.setNetwork(value);
			form.setPremiere(value);
			form.setStatus(value);
			form.setTivoname(value);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new ShowsSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Shows> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Shows> pageInfo = new PageInfo<Shows>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("showsSearchForm", form);


		return pageInfo;
	}


}
