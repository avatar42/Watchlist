package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.ShowsUserRepository;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.search.SearchType;
import com.dea42.watchlist.search.ShowsSearchForm;
import com.dea42.watchlist.search.ShowsUserSearchForm;
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
 * Title: ShowsUserServices <br>
 * Description: ShowsUserServices. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Service
public class ShowsUserServices {
    @Autowired
    private ShowsUserRepository showsUserRepository;

	public Page<ShowsUser> listAll(ShowsUserSearchForm form) {
		SearchSpecification<ShowsUser> searchSpec = new SearchSpecification<ShowsUser>();
		if (form != null) {
			log.debug(form.toString());
			searchSpec.setDoOr(form.getDoOr());
			if (!StringUtils.isBlank(form.getBestexperience())) {
				searchSpec.add(new SearchCriteria<String>(null,"bestexperience", form.getBestexperience().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getComment())) {
				searchSpec.add(new SearchCriteria<String>(null,"comment", form.getComment().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getDiff())) {
				searchSpec.add(new SearchCriteria<String>(null,"diff", form.getDiff().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getImdb())) {
				searchSpec.add(new SearchCriteria<String>(null,"imdb", form.getImdb().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getInrokufeed())) {
				searchSpec.add(new SearchCriteria<String>(null,"inrokufeed", form.getInrokufeed().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getInshowrssas())) {
				searchSpec.add(new SearchCriteria<String>(null,"inshowrssas", form.getInshowrssas().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getJustwatch())) {
				searchSpec.add(new SearchCriteria<String>(null,"justwatch", form.getJustwatch().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getLastwatched())) {
				searchSpec.add(new SearchCriteria<String>(null,"lastwatched", form.getLastwatched().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getOta())) {
				searchSpec.add(new SearchCriteria<String>(null,"ota", form.getOta().toLowerCase(),
					SearchOperation.LIKE));
			}
		if (form.getShows() != null) {
				if (!StringUtils.isBlank(form.getShows().getCancelled())) {
					searchSpec.add(new SearchCriteria<String>("shows","cancelled", form.getShows().getCancelled().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getShows().getEpguidesshowname())) {
					searchSpec.add(new SearchCriteria<String>("shows","epguidesshowname", form.getShows().getEpguidesshowname().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getShows().getIncanceledas())) {
					searchSpec.add(new SearchCriteria<String>("shows","incanceledas", form.getShows().getIncanceledas().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getShows().getLastshow())) {
					searchSpec.add(new SearchCriteria<String>("shows","lastshow", form.getShows().getLastshow().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getShows().getNetwork())) {
					searchSpec.add(new SearchCriteria<String>("shows","network", form.getShows().getNetwork().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getShows().getPremiere())) {
					searchSpec.add(new SearchCriteria<String>("shows","premiere", form.getShows().getPremiere().toLowerCase(), SearchOperation.LIKE));
				}

				if (form.getShows().getPremieredateMin() != null) {
// need to subtract a millsec here to get >= same to work reliably.
					searchSpec.add(new SearchCriteria<Date>("shows","premieredate", new Date(form.getShows().getPremieredateMin().getTime() - 1), SearchOperation.GREATER_THAN_EQUAL));
				}
				if (form.getShows().getPremieredateMax() != null) {
// need to add a millsec here to get <= same to work reliably.
					searchSpec.add(new SearchCriteria<Date>("shows","premieredate", new Date(form.getShows().getPremieredateMax().getTime() + 1), SearchOperation.LESS_THAN_EQUAL));
				}
				if (!StringUtils.isBlank(form.getShows().getStatus())) {
					searchSpec.add(new SearchCriteria<String>("shows","status", form.getShows().getStatus().toLowerCase(), SearchOperation.LIKE));
				}
				if (!StringUtils.isBlank(form.getShows().getTivoname())) {
					searchSpec.add(new SearchCriteria<String>("shows","tivoname", form.getShows().getTivoname().toLowerCase(), SearchOperation.LIKE));
				}
		}

			if (!StringUtils.isBlank(form.getTablolink())) {
				searchSpec.add(new SearchCriteria<String>(null,"tablolink", form.getTablolink().toLowerCase(),
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
			form = new ShowsUserSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return showsUserRepository.findAll(searchSpec, pageable);
	}

	public ShowsUser save(ShowsUser showsUser) {
		return showsUserRepository.save(showsUser);
	}
	
	public ShowsUser get(Integer id) {
		return showsUserRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		showsUserRepository.deleteById(id);
	}

	public PageInfo<ShowsUser> getShowsUsers(HttpServletRequest request, PagingRequest pagingRequest) {

		ShowsUserSearchForm form =  (ShowsUserSearchForm) request.getSession().getAttribute("showsUserSearchForm");

		if (form == null ) {
			form = new ShowsUserSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setBestexperience(value);
			form.setComment(value);
			form.setDiff(value);
			form.setImdb(value);
			form.setInrokufeed(value);
			form.setInshowrssas(value);
			form.setJustwatch(value);
			form.setLastwatched(value);
			form.setOta(value);
		ShowsSearchForm showsForm =  form.getShows();
		if (showsForm == null) {
			showsForm = new ShowsSearchForm();
		}
			showsForm.setCancelled(value);
			showsForm.setEpguidesshowname(value);
			showsForm.setIncanceledas(value);
			showsForm.setLastshow(value);
			showsForm.setNetwork(value);
			showsForm.setPremiere(value);
			showsForm.setStatus(value);
			showsForm.setTivoname(value);
			form.setShows(showsForm);
			form.setTablolink(value);
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
			form = new ShowsUserSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<ShowsUser> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<ShowsUser> pageInfo = new PageInfo<ShowsUser>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("showsUserSearchForm", form);


		return pageInfo;
	}


}
