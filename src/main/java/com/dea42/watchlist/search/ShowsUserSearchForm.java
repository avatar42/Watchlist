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
 * Title: ShowsUserSearchForm <br>
 * Description: Class for holding data from the ShowsUser table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class ShowsUserSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String bestexperience = "";
	private String comment = "";
/* info=ColInfo(fNum=2, colName=id, msgKey=ShowsUser.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: ShowsUser<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	private String imdb = "";
	private String inrokufeed = "";
	private String inshowrssas = "";
	private String justwatch = "";
	private String lastwatched = "";
	private String n67 = "";
	private String ota = "";
	private ShowsSearchForm shows;
	private String tablolink = "";
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
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setImdb(obj.getImdb());
		form.setInrokufeed(obj.getInrokufeed());
		form.setInshowrssas(obj.getInshowrssas());
		form.setJustwatch(obj.getJustwatch());
		form.setLastwatched(obj.getLastwatched());
		form.setN67(obj.getN67());
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
