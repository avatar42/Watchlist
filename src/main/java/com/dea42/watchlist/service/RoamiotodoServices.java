package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.RoamiotodoRepository;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.RoamiotodoSearchForm;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.search.SearchType;
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
 * Title: RoamiotodoServices <br>
 * Description: RoamiotodoServices. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
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
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getChannel())) {
				searchSpec.add(new SearchCriteria<String>(null,"channel", form.getChannel().toLowerCase(),
					SearchOperation.LIKE));
			}

			if (form.getDatefieldMin() != null) {
// need to subtract a millsec here to get >= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"datefield",
					new Date(form.getDatefieldMin().getTime() - 1),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDatefieldMax() != null) {
// need to add a millsec here to get <= same to work reliably.
				searchSpec.add(new SearchCriteria<Date>(null,"datefield",
					new Date(form.getDatefieldMax().getTime() + 1),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getDuration())) {
				searchSpec.add(new SearchCriteria<String>(null,"duration", form.getDuration().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEp())) {
				searchSpec.add(new SearchCriteria<String>(null,"ep", form.getEp().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEpisodename())) {
				searchSpec.add(new SearchCriteria<String>(null,"episodename", form.getEpisodename().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getShowname())) {
				searchSpec.add(new SearchCriteria<String>(null,"showname", form.getShowname().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getShowtrimmed())) {
				searchSpec.add(new SearchCriteria<String>(null,"showtrimmed", form.getShowtrimmed().toLowerCase(),
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


		} else {
			form = new RoamiotodoSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return roamiotodoRepository.findAll(searchSpec, pageable);
	}

	public Roamiotodo save(Roamiotodo roamiotodo) {
		return roamiotodoRepository.save(roamiotodo);
	}
	
	public Roamiotodo get(Long id) {
		return roamiotodoRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		roamiotodoRepository.deleteById(id);
	}

	public PageInfo<Roamiotodo> getRoamiotodos(HttpServletRequest request, PagingRequest pagingRequest) {

		RoamiotodoSearchForm form =  (RoamiotodoSearchForm) request.getSession().getAttribute("roamiotodoSearchForm");

		if (form == null ) {
			form = new RoamiotodoSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setChannel(value);
			form.setDuration(value);
			form.setEp(value);
			form.setEpisodename(value);
			form.setShowname(value);
			form.setShowtrimmed(value);
		AccountSearchForm accountForm =  form.getAccount();
		if (accountForm == null) {
			accountForm = new AccountSearchForm();
		}
			accountForm.setEmail(value);
			form.setAccount(accountForm);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new RoamiotodoSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Roamiotodo> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Roamiotodo> pageInfo = new PageInfo<Roamiotodo>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("roamiotodoSearchForm", form);


		return pageInfo;
	}


}
