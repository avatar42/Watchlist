package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.CablecardRepository;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.CablecardSearchForm;
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
 * Title: CablecardServices <br>
 * Description: CablecardServices. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Service
public class CablecardServices {
    @Autowired
    private CablecardRepository cablecardRepository;

	public Page<Cablecard> listAll(CablecardSearchForm form) {
		SearchSpecification<Cablecard> searchSpec = new SearchSpecification<Cablecard>();
		if (form != null) {
			log.debug(form.toString());
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getChannelname())) {
				searchSpec.add(new SearchCriteria<String>(null,"channelname", form.getChannelname().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getChannelnumberMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"channelnumber", form.getChannelnumberMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getChannelnumberMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"channelnumber", form.getChannelnumberMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getDtMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"dt", form.getDtMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getDtMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"dt", form.getDtMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getHdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"hd", form.getHdMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getHdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"hd", form.getHdMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getInnplMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"innpl", form.getInnplMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getInnplMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"innpl", form.getInnplMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getLangfield())) {
				searchSpec.add(new SearchCriteria<String>(null,"langfield", form.getLangfield().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getNet())) {
				searchSpec.add(new SearchCriteria<String>(null,"net", form.getNet().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getReceiving())) {
				searchSpec.add(new SearchCriteria<String>(null,"receiving", form.getReceiving().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getShortfield())) {
				searchSpec.add(new SearchCriteria<String>(null,"shortfield", form.getShortfield().toLowerCase(),
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
			form = new CablecardSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return cablecardRepository.findAll(searchSpec, pageable);
	}

	public Cablecard save(Cablecard cablecard) {
		return cablecardRepository.save(cablecard);
	}
	
	public Cablecard get(Integer id) {
		return cablecardRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		cablecardRepository.deleteById(id);
	}

	public PageInfo<Cablecard> getCablecards(HttpServletRequest request, PagingRequest pagingRequest) {

		CablecardSearchForm form =  (CablecardSearchForm) request.getSession().getAttribute("cablecardSearchForm");

		if (form == null ) {
			form = new CablecardSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setChannelname(value);
			form.setLangfield(value);
			form.setNet(value);
			form.setReceiving(value);
			form.setShortfield(value);
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
			form = new CablecardSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Cablecard> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Cablecard> pageInfo = new PageInfo<Cablecard>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("cablecardSearchForm", form);


		return pageInfo;
	}


}
