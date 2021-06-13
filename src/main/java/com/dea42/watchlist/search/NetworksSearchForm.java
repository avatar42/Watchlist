package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: NetworksSearchForm <br>
 * Description: Class for holding data from the Networks table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class NetworksSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String androidapp = "";
	private String comment = "";
	private String commercials = "";
	private String fireapp = "";
	private String freewithtwcid = "";
	private String hasdirectbuyoption = "";
	private String haswatchlist = "";
	private String icanota = "";
/* info=ColInfo(fNum=2, colName=id, msgKey=Networks.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: Networks<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	private String iptvservice = "";
	private String onhulu = "";
	private String persistance = "";
	private String remembersplaceinepisode = "";
	private String rememberswatchedepisodes = "";
	private String rokuapp = "";
/* info=ColInfo(fNum=5, colName=ShowsInTivoNpl, msgKey=Networks.showsintivonpl, vName=showsintivonpl, type=Integer, jtype=null, stype=4, gsName=Showsintivonpl, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=false, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer showsintivonplMin;
	private Integer showsintivonplMax;
	private String site = "";
	private String standardwait = "";
	private String tivoapp = "";
	private String tivoshortname = "";
	private String webinterface = "";
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Networks obj into form
	 *
	 * @param obj
	 */
	public static NetworksSearchForm getInstance(Networks obj) {
		NetworksSearchForm form = new NetworksSearchForm();
		form.setAndroidapp(obj.getAndroidapp());
		form.setComment(obj.getComment());
		form.setCommercials(obj.getCommercials());
		form.setFireapp(obj.getFireapp());
		form.setFreewithtwcid(obj.getFreewithtwcid());
		form.setHasdirectbuyoption(obj.getHasdirectbuyoption());
		form.setHaswatchlist(obj.getHaswatchlist());
		form.setIcanota(obj.getIcanota());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setIptvservice(obj.getIptvservice());
		form.setOnhulu(obj.getOnhulu());
		form.setPersistance(obj.getPersistance());
		form.setRemembersplaceinepisode(obj.getRemembersplaceinepisode());
		form.setRememberswatchedepisodes(obj.getRememberswatchedepisodes());
		form.setRokuapp(obj.getRokuapp());
		form.setShowsintivonplMin(obj.getShowsintivonpl());
		form.setShowsintivonplMax(obj.getShowsintivonpl());
		form.setSite(obj.getSite());
		form.setStandardwait(obj.getStandardwait());
		form.setTivoapp(obj.getTivoapp());
		form.setTivoshortname(obj.getTivoshortname());
		form.setWebinterface(obj.getWebinterface());
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
