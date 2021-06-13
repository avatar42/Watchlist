package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.RoamiospRepository;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.RoamiospSearchForm;
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
 * Title: RoamiospServices <br>
 * Description: RoamiospServices. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
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
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getChannel())) {
				searchSpec.add(new SearchCriteria<String>(null,"channel", form.getChannel().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getEndMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"end", form.getEndMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getEndMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"end", form.getEndMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getInclude())) {
				searchSpec.add(new SearchCriteria<String>(null,"include", form.getInclude().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getKeep())) {
				searchSpec.add(new SearchCriteria<String>(null,"keep", form.getKeep().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getNumMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"num", form.getNumMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getNumMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"num", form.getNumMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getPriorityMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"priority", form.getPriorityMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getPriorityMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"priority", form.getPriorityMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getRecord())) {
				searchSpec.add(new SearchCriteria<String>(null,"record", form.getRecord().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getSeasonMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"season", form.getSeasonMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSeasonMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"season", form.getSeasonMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getShow())) {
				searchSpec.add(new SearchCriteria<String>(null,"show", form.getShow().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getStartMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"start", form.getStartMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getStartMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"start", form.getStartMax(),
					SearchOperation.LESS_THAN_EQUAL));
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
			form = new RoamiospSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return roamiospRepository.findAll(searchSpec, pageable);
	}

	public Roamiosp save(Roamiosp roamiosp) {
		return roamiospRepository.save(roamiosp);
	}
	
	public Roamiosp get(Long id) {
		return roamiospRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		roamiospRepository.deleteById(id);
	}

	public PageInfo<Roamiosp> getRoamiosps(HttpServletRequest request, PagingRequest pagingRequest) {

		RoamiospSearchForm form =  (RoamiospSearchForm) request.getSession().getAttribute("roamiospSearchForm");

		if (form == null ) {
			form = new RoamiospSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setChannel(value);
			form.setInclude(value);
			form.setKeep(value);
			form.setRecord(value);
			form.setShow(value);
		AccountSearchForm accountForm =  form.getAccount();
		if (accountForm == null) {
			accountForm = new AccountSearchForm();
		}
			accountForm.setEmail(value);
			form.setAccount(accountForm);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new RoamiospSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Roamiosp> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Roamiosp> pageInfo = new PageInfo<Roamiosp>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("roamiospSearchForm", form);


		return pageInfo;
	}


}
