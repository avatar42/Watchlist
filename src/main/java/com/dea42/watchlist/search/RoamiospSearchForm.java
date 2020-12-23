package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: roamiospSearchForm <br>
 * Description: Class for holding data from the roamiosp table for searching. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Data
public class RoamiospSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String channel = null;
	private Integer endMin;
	private Integer endMax;
	private Integer idMin;
	private Integer idMax;
	private String include = null;
	private String keep = null;
	private Integer numMin;
	private Integer numMax;
	private Integer priorityMin;
	private Integer priorityMax;
	private String record = null;
	private Integer seasonMin;
	private Integer seasonMax;
	private String show = null;
	private Integer startMin;
	private Integer startMax;
	private Account accountMin;
	private Account accountMax;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	/**
	 * Clones Roamiosp obj into form
	 *
	 * @param obj
	 */
	public static RoamiospSearchForm getInstance(Roamiosp obj) {
		RoamiospSearchForm form = new RoamiospSearchForm();
		form.setChannel(obj.getChannel());
		form.setEndMin(obj.getEnd());
		form.setEndMax(obj.getEnd());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setInclude(obj.getInclude());
		form.setKeep(obj.getKeep());
		form.setNumMin(obj.getNum());
		form.setNumMax(obj.getNum());
		form.setPriorityMin(obj.getPriority());
		form.setPriorityMax(obj.getPriority());
		form.setRecord(obj.getRecord());
		form.setSeasonMin(obj.getSeason());
		form.setSeasonMax(obj.getSeason());
		form.setShow(obj.getShow());
		form.setStartMin(obj.getStart());
		form.setStartMax(obj.getStart());
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
