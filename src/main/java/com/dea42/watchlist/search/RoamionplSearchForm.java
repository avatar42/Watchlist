package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: roamionplSearchForm <br>
 * Description: Class for holding data from the roamionpl table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Data
public class RoamionplSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bitratembpsMin;
	private Integer bitratembpsMax;
	private String channel = null;
	private BigDecimal datefieldMin;
	private BigDecimal datefieldMax;
	private BigDecimal durationMin;
	private BigDecimal durationMax;
	private String episode = null;
	private Integer idMin;
	private Integer idMax;
	private BigDecimal isnewMin;
	private BigDecimal isnewMax;
	private Integer rowinshowsMin;
	private Integer rowinshowsMax;
	private String seriesep = null;
	private String show = null;
	private Integer sizegbMin;
	private Integer sizegbMax;
	private Long sortabledateMin;
	private Long sortabledateMax;
	private String title = null;
	private AccountSearchForm account;
	private Integer watchedtimeMin;
	private Integer watchedtimeMax;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Roamionpl obj into form
	 *
	 * @param obj
	 */
	public static RoamionplSearchForm getInstance(Roamionpl obj) {
		RoamionplSearchForm form = new RoamionplSearchForm();
		form.setBitratembpsMin(obj.getBitratembps());
		form.setBitratembpsMax(obj.getBitratembps());
		form.setChannel(obj.getChannel());
		form.setDatefieldMin(obj.getDatefield());
		form.setDatefieldMax(obj.getDatefield());
		form.setDurationMin(obj.getDuration());
		form.setDurationMax(obj.getDuration());
		form.setEpisode(obj.getEpisode());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setIsnewMin(obj.getIsnew());
		form.setIsnewMax(obj.getIsnew());
		form.setRowinshowsMin(obj.getRowinshows());
		form.setRowinshowsMax(obj.getRowinshows());
		form.setSeriesep(obj.getSeriesep());
		form.setShow(obj.getShow());
		form.setSizegbMin(obj.getSizegb());
		form.setSizegbMax(obj.getSizegb());
		form.setSortabledateMin(obj.getSortabledate());
		form.setSortabledateMax(obj.getSortabledate());
		form.setTitle(obj.getTitle());
		form.setAccount(AccountSearchForm.getInstance(obj.getAccount()));
		form.setWatchedtimeMin(obj.getWatchedtime());
		form.setWatchedtimeMax(obj.getWatchedtime());
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
