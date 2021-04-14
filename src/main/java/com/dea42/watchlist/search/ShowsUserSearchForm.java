package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: showsuserSearchForm <br>
 * Description: Class for holding data from the showsuser table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Data
public class ShowsUserSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String bestexperience = null;
	private String comment = null;
	private String diff = null;
	private Integer idMin;
	private Integer idMax;
	private String imdb = null;
	private String inrokufeed = null;
	private String inshowrssas = null;
	private String justwatch = null;
	private String lastwatched = null;
	private String ota = null;
	private ShowsSearchForm shows;
	private String tablolink = null;
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
	 * Clones ShowsUser obj into form
	 *
	 * @param obj
	 */
	public static ShowsUserSearchForm getInstance(ShowsUser obj) {
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		form.setBestexperience(obj.getBestexperience());
		form.setComment(obj.getComment());
		form.setDiff(obj.getDiff());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setImdb(obj.getImdb());
		form.setInrokufeed(obj.getInrokufeed());
		form.setInshowrssas(obj.getInshowrssas());
		form.setJustwatch(obj.getJustwatch());
		form.setLastwatched(obj.getLastwatched());
		form.setOta(obj.getOta());
		form.setShows(ShowsSearchForm.getInstance(obj.getShows()));
		form.setTablolink(obj.getTablolink());
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
