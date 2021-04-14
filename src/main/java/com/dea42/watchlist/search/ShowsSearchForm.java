package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: showsSearchForm <br>
 * Description: Class for holding data from the shows table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Data
public class ShowsSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cancelled = null;
	private String epguidesshowname = null;
	private Integer idMin;
	private Integer idMax;
	private String incanceledas = null;
	private String lastshow = null;
	private String network = null;
	private String premiere = null;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date premieredateMin;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date premieredateMax;
	private String status = null;
	private String tivoname = null;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Shows obj into form
	 *
	 * @param obj
	 */
	public static ShowsSearchForm getInstance(Shows obj) {
		ShowsSearchForm form = new ShowsSearchForm();
		form.setCancelled(obj.getCancelled());
		form.setEpguidesshowname(obj.getEpguidesshowname());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setIncanceledas(obj.getIncanceledas());
		form.setLastshow(obj.getLastshow());
		form.setNetwork(obj.getNetwork());
		form.setPremiere(obj.getPremiere());
		form.setPremieredateMin(obj.getPremieredate());
		form.setPremieredateMax(obj.getPremieredate());
		form.setStatus(obj.getStatus());
		form.setTivoname(obj.getTivoname());
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
