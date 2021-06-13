package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.NetworksUserRepository;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.NetworksSearchForm;
import com.dea42.watchlist.search.NetworksUserSearchForm;
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
 * Title: NetworksUserServices <br>
 * Description: NetworksUserServices. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@Service
public class NetworksUserServices {
    @Autowired
    private NetworksUserRepository networksUserRepository;

	public Page<NetworksUser> listAll(NetworksUserSearchForm form) {
		SearchSpecification<NetworksUser> searchSpec = new SearchSpecification<NetworksUser>();
		if (form != null) {
			log.debug(form.toString());
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getIusefreefreewithcablepayforhuluinstead())) {
				searchSpec.add(new SearchCriteria<String>(null,"iusefreefreewithcablepayforhuluinstead", form.getIusefreefreewithcablepayforhuluinstead().toLowerCase(),
					SearchOperation.LIKE));
			}
		if (form.getNetworks() != null) {
				if (!StringUtils.isBlank(form.getNetworks().getAndroidapp())) {
					searchSpec.add(new SearchCriteria<String>("networks","androidapp", form.getNetworks().getAndroidapp().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getComment())) {
					searchSpec.add(new SearchCriteria<String>("networks","comment", form.getNetworks().getComment().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getCommercials())) {
					searchSpec.add(new SearchCriteria<String>("networks","commercials", form.getNetworks().getCommercials().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getFireapp())) {
					searchSpec.add(new SearchCriteria<String>("networks","fireapp", form.getNetworks().getFireapp().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getFreewithtwcid())) {
					searchSpec.add(new SearchCriteria<String>("networks","freewithtwcid", form.getNetworks().getFreewithtwcid().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getHasdirectbuyoption())) {
					searchSpec.add(new SearchCriteria<String>("networks","hasdirectbuyoption", form.getNetworks().getHasdirectbuyoption().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getHaswatchlist())) {
					searchSpec.add(new SearchCriteria<String>("networks","haswatchlist", form.getNetworks().getHaswatchlist().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getIcanota())) {
					searchSpec.add(new SearchCriteria<String>("networks","icanota", form.getNetworks().getIcanota().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getIptvservice())) {
					searchSpec.add(new SearchCriteria<String>("networks","iptvservice", form.getNetworks().getIptvservice().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getOnhulu())) {
					searchSpec.add(new SearchCriteria<String>("networks","onhulu", form.getNetworks().getOnhulu().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getPersistance())) {
					searchSpec.add(new SearchCriteria<String>("networks","persistance", form.getNetworks().getPersistance().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getRemembersplaceinepisode())) {
					searchSpec.add(new SearchCriteria<String>("networks","remembersplaceinepisode", form.getNetworks().getRemembersplaceinepisode().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getRememberswatchedepisodes())) {
					searchSpec.add(new SearchCriteria<String>("networks","rememberswatchedepisodes", form.getNetworks().getRememberswatchedepisodes().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getRokuapp())) {
					searchSpec.add(new SearchCriteria<String>("networks","rokuapp", form.getNetworks().getRokuapp().toLowerCase(), SearchOperation.LIKE));
				}
				if (form.getNetworks().getShowsintivonplMin() != null) {
					searchSpec.add(new SearchCriteria<Integer>("networks","showsintivonpl", form.getNetworks().getShowsintivonplMin(), SearchOperation.GREATER_THAN_EQUAL));
				}
				if (form.getNetworks().getShowsintivonplMax() != null) {
					searchSpec.add(new SearchCriteria<Integer>("networks","showsintivonpl", form.getNetworks().getShowsintivonplMax(), SearchOperation.LESS_THAN_EQUAL));
				}
				if (!StringUtils.isBlank(form.getNetworks().getSite())) {
					searchSpec.add(new SearchCriteria<String>("networks","site", form.getNetworks().getSite().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getStandardwait())) {
					searchSpec.add(new SearchCriteria<String>("networks","standardwait", form.getNetworks().getStandardwait().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getTivoapp())) {
					searchSpec.add(new SearchCriteria<String>("networks","tivoapp", form.getNetworks().getTivoapp().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getTivoshortname())) {
					searchSpec.add(new SearchCriteria<String>("networks","tivoshortname", form.getNetworks().getTivoshortname().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getNetworks().getWebinterface())) {
					searchSpec.add(new SearchCriteria<String>("networks","webinterface", form.getNetworks().getWebinterface().toLowerCase(), SearchOperation.LIKE));
				}
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
			form = new NetworksUserSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return networksUserRepository.findAll(searchSpec, pageable);
	}

	public NetworksUser save(NetworksUser networksUser) {
		return networksUserRepository.save(networksUser);
	}
	
	public NetworksUser get(Long id) {
		return networksUserRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		networksUserRepository.deleteById(id);
	}

	public PageInfo<NetworksUser> getNetworksUsers(HttpServletRequest request, PagingRequest pagingRequest) {

		NetworksUserSearchForm form =  (NetworksUserSearchForm) request.getSession().getAttribute("networksUserSearchForm");

		if (form == null ) {
			form = new NetworksUserSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setIusefreefreewithcablepayforhuluinstead(value);
		NetworksSearchForm networksForm =  form.getNetworks();
		if (networksForm == null) {
			networksForm = new NetworksSearchForm();
		}
			networksForm.setCommercials(value);
			networksForm.setOnhulu(value);
			networksForm.setPersistance(value);
			networksForm.setRokuapp(value);
			networksForm.setSite(value);
			networksForm.setStandardwait(value);
			form.setNetworks(networksForm);
		AccountSearchForm accountForm =  form.getAccount();
		if (accountForm == null) {
			accountForm = new AccountSearchForm();
		}
			accountForm.setEmail(value);
			form.setAccount(accountForm);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new NetworksUserSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<NetworksUser> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<NetworksUser> pageInfo = new PageInfo<NetworksUser>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("networksUserSearchForm", form);


		return pageInfo;
	}


}
