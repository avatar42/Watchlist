package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: roamiotodoSearchForm <br>
 * Description: Class for holding data from the roamiotodo table for searching. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Data
public class RoamiotodoSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String channel = null;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date dateMin;
	private Date dateMax;
	private String duration = null;
	private String ep = null;
	private String episodename = null;
	private Integer idMin;
	private Integer idMax;
	private String showname = null;
	private String showtrimmed = null;
	private Account accountMin;
	private Account accountMax;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	/**
	 * Clones Roamiotodo obj into form
	 *
	 * @param obj
	 */
	public static RoamiotodoSearchForm getInstance(Roamiotodo obj) {
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		form.setChannel(obj.getChannel());
		form.setDateMin(obj.getDate());
		form.setDateMax(obj.getDate());
		form.setDuration(obj.getDuration());
		form.setEp(obj.getEp());
		form.setEpisodename(obj.getEpisodename());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setShowname(obj.getShowname());
		form.setShowtrimmed(obj.getShowtrimmed());
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