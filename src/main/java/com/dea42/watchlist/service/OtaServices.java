package com.dea42.watchlist.service;


import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.paging.Column;
import com.dea42.watchlist.paging.Direction;
import com.dea42.watchlist.paging.Order;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.repo.OtaRepository;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.OtaSearchForm;
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
 * Title: OtaServices <br>
 * Description: OtaServices. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Service
public class OtaServices {
    @Autowired
    private OtaRepository otaRepository;

	public Page<Ota> listAll(OtaSearchForm form) {
		SearchSpecification<Ota> searchSpec = new SearchSpecification<Ota>();
		if (form != null) {
			log.debug(form.toString());
			searchSpec.setDoOr(form.getDoOr());
			if (form.getAtticantMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"atticant", form.getAtticantMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getAtticantMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"atticant", form.getAtticantMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getChanMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"chan", form.getChanMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getChanMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"chan", form.getChanMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getChannelname())) {
				searchSpec.add(new SearchCriteria<String>(null,"channelname", form.getChannelname().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getChannelnumber())) {
				searchSpec.add(new SearchCriteria<String>(null,"channelnumber", form.getChannelnumber().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getChannelnumberchannelnameincluded())) {
				searchSpec.add(new SearchCriteria<String>(null,"channelnumberchannelnameincluded", form.getChannelnumberchannelnameincluded().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getComments())) {
				searchSpec.add(new SearchCriteria<String>(null,"comments", form.getComments().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getDirection())) {
				searchSpec.add(new SearchCriteria<String>(null,"direction", form.getDirection().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEnabled())) {
				searchSpec.add(new SearchCriteria<String>(null,"enabled", form.getEnabled().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFccinfo())) {
				searchSpec.add(new SearchCriteria<String>(null,"fccinfo", form.getFccinfo().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getFreqMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"freq", form.getFreqMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getFreqMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"freq", form.getFreqMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getLangfield())) {
				searchSpec.add(new SearchCriteria<String>(null,"langfield", form.getLangfield().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getListedMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"listed", form.getListedMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getListedMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"listed", form.getListedMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getMytivoavgstrengthMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"mytivoavgstrength", form.getMytivoavgstrengthMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getMytivoavgstrengthMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"mytivoavgstrength", form.getMytivoavgstrengthMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getNetwork())) {
				searchSpec.add(new SearchCriteria<String>(null,"network", form.getNetwork().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getOff())) {
				searchSpec.add(new SearchCriteria<String>(null,"off", form.getOff().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRecommendedantenna())) {
				searchSpec.add(new SearchCriteria<String>(null,"recommendedantenna", form.getRecommendedantenna().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRez())) {
				searchSpec.add(new SearchCriteria<String>(null,"rez", form.getRez().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getStation())) {
				searchSpec.add(new SearchCriteria<String>(null,"station", form.getStation().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (form.getSubchanMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"subchan", form.getSubchanMin(),
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSubchanMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>(null,"subchan", form.getSubchanMax(),
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getTvfoolchanMin() != null) {
				BigDecimal bd = form.getTvfoolchanMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"tvfoolchan",bd,
					SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getTvfoolchanMax() != null) {
				BigDecimal bd = form.getTvfoolchanMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>(null,"tvfoolchan",bd,
					SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getTvfoolestsignal())) {
				searchSpec.add(new SearchCriteria<String>(null,"tvfoolestsignal", form.getTvfoolestsignal().toLowerCase(),
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

			if (!StringUtils.isBlank(form.getWatchabletablo())) {
				searchSpec.add(new SearchCriteria<String>(null,"watchabletablo", form.getWatchabletablo().toLowerCase(),
					SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getWatchabletivo())) {
				searchSpec.add(new SearchCriteria<String>(null,"watchabletivo", form.getWatchabletivo().toLowerCase(),
					SearchOperation.LIKE));
			}

		} else {
			form = new OtaSearchForm();
		}

		// OR queries assume at least one SearchCriteria or return nothing
		if (searchSpec.getList().isEmpty()) {
			searchSpec.setDoOr(SearchType.ADD);
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(), form.getSort());

		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return otaRepository.findAll(searchSpec, pageable);
	}

	public Ota save(Ota ota) {
		return otaRepository.save(ota);
	}
	
	public Ota get(Integer id) {
		return otaRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		otaRepository.deleteById(id);
	}

	public PageInfo<Ota> getOtas(HttpServletRequest request, PagingRequest pagingRequest) {

		OtaSearchForm form =  (OtaSearchForm) request.getSession().getAttribute("otaSearchForm");

		if (form == null ) {
			form = new OtaSearchForm();
		} else if (StringUtils.isNotBlank(pagingRequest.getSearch().getValue())) {

			String value = pagingRequest.getSearch().getValue();
			log.info("Searching for:" + value);
			form.setChannelname(value);
			form.setChannelnumber(value);
			form.setChannelnumberchannelnameincluded(value);
			form.setComments(value);
			form.setDirection(value);
			form.setEnabled(value);
			form.setFccinfo(value);
			form.setLangfield(value);
			form.setNetwork(value);
			form.setOff(value);
			form.setRecommendedantenna(value);
			form.setRez(value);
			form.setStation(value);
			form.setTvfoolestsignal(value);
		AccountSearchForm accountForm =  form.getAccount();
		if (accountForm == null) {
			accountForm = new AccountSearchForm();
		}
			accountForm.setEmail(value);
			accountForm.setUserrole(value);
			form.setAccount(accountForm);
			form.setWatchabletablo(value);
			form.setWatchabletivo(value);
			form.setDoOr(SearchType.OR);
			form.setAdvanced(false);
		} else if (!form.isAdvanced() && StringUtils.isBlank(pagingRequest.getSearch().getValue())) {
			form = new OtaSearchForm();

		}
		form.setPage(pagingRequest.getStart() + 1);
		form.setPageSize(pagingRequest.getLength());
		Order order = pagingRequest.getOrder().get(0);
		int columnIndex = order.getColumn();
		Column column = pagingRequest.getColumns().get(columnIndex);
		form.setSortField(column.getData());
		form.setSortAsc(order.getDir().equals(Direction.asc));

		Page<Ota> filtered = listAll(form);
		int count = (int) filtered.getTotalElements();

		PageInfo<Ota> pageInfo = new PageInfo<Ota>(filtered);
		pageInfo.setRecordsFiltered(count);
		pageInfo.setRecordsTotal(count);
		pageInfo.setDraw(pagingRequest.getDraw());

		request.getSession().setAttribute("otaSearchForm", form);


		return pageInfo;
	}


}
