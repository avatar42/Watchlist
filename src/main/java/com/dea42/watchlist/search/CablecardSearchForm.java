package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: cablecardSearchForm <br>
 * Description: Class for holding data from the cablecard table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Data
public class CablecardSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String channelname = null;
	private Integer channelnumberMin;
	private Integer channelnumberMax;
	private Integer dtMin;
	private Integer dtMax;
	private Integer hdMin;
	private Integer hdMax;
	private Integer idMin;
	private Integer idMax;
	private Integer innplMin;
	private Integer innplMax;
	private String langfield = null;
	private String net = null;
	private String receiving = null;
	private String shortfield = null;
	private AccountSearchForm account;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Cablecard obj into form
	 *
	 * @param obj
	 */
	public static CablecardSearchForm getInstance(Cablecard obj) {
		CablecardSearchForm form = new CablecardSearchForm();
		form.setChannelname(obj.getChannelname());
		form.setChannelnumberMin(obj.getChannelnumber());
		form.setChannelnumberMax(obj.getChannelnumber());
		form.setDtMin(obj.getDt());
		form.setDtMax(obj.getDt());
		form.setHdMin(obj.getHd());
		form.setHdMax(obj.getHd());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setInnplMin(obj.getInnpl());
		form.setInnplMax(obj.getInnpl());
		form.setLangfield(obj.getLangfield());
		form.setNet(obj.getNet());
		form.setReceiving(obj.getReceiving());
		form.setShortfield(obj.getShortfield());
		form.setAccount(AccountSearchForm.getInstance(obj.getAccount()));
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
