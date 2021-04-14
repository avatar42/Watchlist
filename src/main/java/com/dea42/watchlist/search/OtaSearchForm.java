package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: otaSearchForm <br>
 * Description: Class for holding data from the ota table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Data
public class OtaSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer atticantMin;
	private Integer atticantMax;
	private Integer chanMin;
	private Integer chanMax;
	private String channelname = null;
	private String channelnumber = null;
	private String channelnumberchannelnameincluded = null;
	private String comments = null;
	private String direction = null;
	private String enabled = null;
	private String fccinfo = null;
	private Integer freqMin;
	private Integer freqMax;
	private Integer idMin;
	private Integer idMax;
	private String langfield = null;
	private Integer listedMin;
	private Integer listedMax;
	private Integer mytivoavgstrengthMin;
	private Integer mytivoavgstrengthMax;
	private String network = null;
	private String off = null;
	private String recommendedantenna = null;
	private String rez = null;
	private String station = null;
	private Integer subchanMin;
	private Integer subchanMax;
	private BigDecimal tvfoolchanMin;
	private BigDecimal tvfoolchanMax;
	private String tvfoolestsignal = null;
	private AccountSearchForm account;
	private String watchabletablo = null;
	private String watchabletivo = null;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Ota obj into form
	 *
	 * @param obj
	 */
	public static OtaSearchForm getInstance(Ota obj) {
		OtaSearchForm form = new OtaSearchForm();
		form.setAtticantMin(obj.getAtticant());
		form.setAtticantMax(obj.getAtticant());
		form.setChanMin(obj.getChan());
		form.setChanMax(obj.getChan());
		form.setChannelname(obj.getChannelname());
		form.setChannelnumber(obj.getChannelnumber());
		form.setChannelnumberchannelnameincluded(obj.getChannelnumberchannelnameincluded());
		form.setComments(obj.getComments());
		form.setDirection(obj.getDirection());
		form.setEnabled(obj.getEnabled());
		form.setFccinfo(obj.getFccinfo());
		form.setFreqMin(obj.getFreq());
		form.setFreqMax(obj.getFreq());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setLangfield(obj.getLangfield());
		form.setListedMin(obj.getListed());
		form.setListedMax(obj.getListed());
		form.setMytivoavgstrengthMin(obj.getMytivoavgstrength());
		form.setMytivoavgstrengthMax(obj.getMytivoavgstrength());
		form.setNetwork(obj.getNetwork());
		form.setOff(obj.getOff());
		form.setRecommendedantenna(obj.getRecommendedantenna());
		form.setRez(obj.getRez());
		form.setStation(obj.getStation());
		form.setSubchanMin(obj.getSubchan());
		form.setSubchanMax(obj.getSubchan());
		form.setTvfoolchanMin(obj.getTvfoolchan());
		form.setTvfoolchanMax(obj.getTvfoolchan());
		form.setTvfoolestsignal(obj.getTvfoolestsignal());
		form.setAccount(AccountSearchForm.getInstance(obj.getAccount()));
		form.setWatchabletablo(obj.getWatchabletablo());
		form.setWatchabletivo(obj.getWatchabletivo());
		return form;
	}

	/**
	 * Generate a Sort from fields
	 * @return
	 */
	public Sort getSort() {
		if (sortAsc)
			return Sort.by(sortField).ascending();

		return Sort.by(sortField).descending();
	}

	public String getSortDir() {
		if (sortAsc)
			return "asc";
		else
			return "desc";
	}

	public String getReverseSortDir() {
		if (sortAsc)
			return "desc";
		else
			return "asc";
	}

	boolean getSortAscFlip() {
		return !sortAsc;
	}
}
