package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.repo.OtaRepository;
import com.dea42.watchlist.search.OtaSearchForm;
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
 * Title: OtaServices <br>
 * Description: OtaServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
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
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getAtticantMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("atticant", form.getAtticantMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getAtticantMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("atticant", form.getAtticantMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getChanMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("chan", form.getChanMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getChanMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("chan", form.getChanMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getChannelname())) {
				searchSpec.add(new SearchCriteria<String>("channelname", form.getChannelname().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getChannelnumber())) {
				searchSpec.add(new SearchCriteria<String>("channelnumber", form.getChannelnumber().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getChannelnumberchannelnameincluded())) {
				searchSpec.add(new SearchCriteria<String>("channelnumberchannelnameincluded", form.getChannelnumberchannelnameincluded().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getComments())) {
				searchSpec.add(new SearchCriteria<String>("comments", form.getComments().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getDirection())) {
				searchSpec.add(new SearchCriteria<String>("direction", form.getDirection().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getEnabled())) {
				searchSpec.add(new SearchCriteria<String>("enabled", form.getEnabled().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFccinfo())) {
				searchSpec.add(new SearchCriteria<String>("fccinfo", form.getFccinfo().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getFccinfolink())) {
				searchSpec.add(new SearchCriteria<String>("fccinfolink", form.getFccinfolink().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getFreqMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("freq", form.getFreqMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getFreqMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("freq", form.getFreqMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getLang())) {
				searchSpec.add(new SearchCriteria<String>("lang", form.getLang().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getListedMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("listed", form.getListedMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getListedMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("listed", form.getListedMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getMytivoavgstrengthMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("mytivoavgstrength", form.getMytivoavgstrengthMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getMytivoavgstrengthMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("mytivoavgstrength", form.getMytivoavgstrengthMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getNetwork())) {
				searchSpec.add(new SearchCriteria<String>("network", form.getNetwork().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getOff())) {
				searchSpec.add(new SearchCriteria<String>("off", form.getOff().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRecommendedantenna())) {
				searchSpec.add(new SearchCriteria<String>("recommendedantenna", form.getRecommendedantenna().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getRez())) {
				searchSpec.add(new SearchCriteria<String>("rez", form.getRez().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getStation())) {
				searchSpec.add(new SearchCriteria<String>("station", form.getStation().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getSubchanMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("subchan", form.getSubchanMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getSubchanMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("subchan", form.getSubchanMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (form.getTvfoolchanMin() != null) {
				BigDecimal bd = form.getTvfoolchanMin();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_DOWN);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("tvfoolchan",bd, SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getTvfoolchanMax() != null) {
				BigDecimal bd = form.getTvfoolchanMax();
// SQLite rounds scales > 10 in select where compare though returns all decimals
				if (bd.scale() > 10) {
					bd = bd.setScale(10, BigDecimal.ROUND_UP);
				}
				searchSpec.add(new SearchCriteria<BigDecimal>("tvfoolchan",bd, SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getTvfoolestsignal())) {
				searchSpec.add(new SearchCriteria<String>("tvfoolestsignal", form.getTvfoolestsignal().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getWatchabletablo())) {
				searchSpec.add(new SearchCriteria<String>("watchabletablo", form.getWatchabletablo().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getWatchabletivo())) {
				searchSpec.add(new SearchCriteria<String>("watchabletivo", form.getWatchabletivo().toLowerCase(), SearchOperation.LIKE));
			}

		} else {
			form = new OtaSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
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

}

