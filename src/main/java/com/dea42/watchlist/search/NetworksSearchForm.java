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
 * Title: networksSearchForm <br>
 * Description: Class for holding data from the networks table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Data
public class NetworksSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String androidapp = null;
	private String comment = null;
	private String commercials = null;
	private String fireapp = null;
	private String freewithtwcid = null;
	private String hasdirectbuyoption = null;
	private String haswatchlist = null;
	private String icanota = null;
	private Integer idMin;
	private Integer idMax;
	private String iptvservice = null;
	private String onhulu = null;
	private String persistance = null;
	private String remembersplaceinepisode = null;
	private String rememberswatchedepisodes = null;
	private String rokuapp = null;
	private Integer showsintivonplMin;
	private Integer showsintivonplMax;
	private String site = null;
	private String standardwait = null;
	private String tivoapp = null;
	private String tivoshortname = null;
	private String webinterface = null;
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
