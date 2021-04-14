package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.RoamionplRepository;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.RoamionplSearchForm;
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
 * Title: RoamionplServices <br>
 * Description: RoamionplServices. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
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
			searchSpec.setDoOr(form.getDoOr());
			if (form.getBitratembpsMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"bitratembps", form.getBitratembpsMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getBitratembpsMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"bitratembps", form.getBitratembpsMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getChannel())) {
				searchSpec.add(new SearchCriteria<String>(null,"channel", form.getChannel().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getDatefieldMin() != null) {
				BigDecimal bd = form.getDatefieldMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"datefield",bd,
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDatefieldMax() != null) {
				BigDecimal bd = form.getDatefieldMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"datefield",bd,
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getDurationMin() != null) {
				BigDecimal bd = form.getDurationMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"duration",bd,
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDurationMax() != null) {
				BigDecimal bd = form.getDurationMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"duration",bd,
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getEpisode())) {
				searchSpec.add(new SearchCriteria<String>(null,"episode", form.getEpisode().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getIsnewMin() != null) {
				BigDecimal bd = form.getIsnewMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"isnew",bd,
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIsnewMax() != null) {
				BigDecimal bd = form.getIsnewMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"isnew",bd,
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getRowinshowsMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"rowinshows", form.getRowinshowsMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getRowinshowsMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"rowinshows", form.getRowinshowsMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getSeriesep())) {
				searchSpec.add(new SearchCriteria<String>(null,"seriesep", form.getSeriesep().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getShow())) {
				searchSpec.add(new SearchCriteria<String>(null,"show", form.getShow().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getSizegbMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"sizegb", form.getSizegbMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSizegbMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"sizegb", form.getSizegbMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getSortabledateMin() != null) {
				searchSpec.add(new SearchCriteria<Long>(null,"sortabledate", form.getSortabledateMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSortabledateMax() != null) {
				searchSpec.add(new SearchCriteria<Long>(null,"sortabledate", form.getSortabledateMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getTitle())) {
				searchSpec.add(new SearchCriteria<String>(null,"title", form.getTitle().toLowerCase(),
					SearchOperation.LIKE));
			}
		if (form.getAccount() != null) {
				if (!StringUtils.isBlank(form.getAccount().getEmail())) {
					searchSpec.add(new SearchCriteria<String>("account","email", form.getAccount().getEmail().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getAccount().getName())) {
					searchSpec.add(new SearchCriteria<String>("account","name", form.getAccount().getName().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getAccount().getPassword())) {
					searchSpec.add(new SearchCriteria<String>("account","password", form.getAccount().getPassword().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getAccount().getUserrole())) {
					searchSpec.add(new SearchCriteria<String>("account","userrole", form.getAccount().getUserrole().toLowerCase(), SearchOperation.LIKE));
				}
		}

			if (form.getWatchedtimeMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"watchedtime", form.getWatchedtimeMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getWatchedtimeMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"watchedtime", form.getWatchedtimeMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}

		} else {
			form = new RoamionplSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

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

	public PageInfo<Roamionpl> getRoamionpls(HttpServletRequest request, PagingRequest pagingRequest) {

		RoamionplSearchForm form =  (RoamionplSearchForm) request.getSession().getAttribute("roamionplSearchForm");

		if (form == null ) {
			form = new RoamionplSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setChannel(value);
			form.setEpisode(value);
			form.setSeriesep(value);
			form.setShow(value);
			form.setTitle(value);
		AccountSearchForm accountForm =  form.getAccount();
		if (accountForm == null) {
			accountForm = new AccountSearchForm();
		}
			accountForm.setEmail(value);
			accountForm.setUserrole(value);
			form.setAccount(accountForm);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new RoamionplSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Roamionpl> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Roamionpl> pageInfo = new PageInfo<Roamionpl>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("roamionplSearchForm", form);


		return pageInfo;
	}


}
