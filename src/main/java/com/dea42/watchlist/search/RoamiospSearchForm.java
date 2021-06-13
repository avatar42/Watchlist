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
 * Title: RoamioSpSearchForm <br>
 * Description: Class for holding data from the RoamioSp table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class RoamiospSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String channel = "";
/* info=ColInfo(fNum=13, colName=End, msgKey=Roamiosp.end, vName=end, type=Integer, jtype=null, stype=4, gsName=End, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer endMin;
	private Integer endMax;
/* info=ColInfo(fNum=2, colName=id, msgKey=Roamiosp.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: RoamioSp<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	private String include = "";
	private String keep = "";
/* info=ColInfo(fNum=11, colName=Num, msgKey=Roamiosp.num, vName=num, type=Integer, jtype=null, stype=4, gsName=Num, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer numMin;
	private Integer numMax;
/* info=ColInfo(fNum=4, colName=Priority, msgKey=Roamiosp.priority, vName=priority, type=Integer, jtype=null, stype=4, gsName=Priority, length=0, pk=false, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer priorityMin;
	private Integer priorityMax;
	private String record = "";
/* info=ColInfo(fNum=7, colName=Season, msgKey=Roamiosp.season, vName=season, type=Integer, jtype=null, stype=4, gsName=Season, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer seasonMin;
	private Integer seasonMax;
	private String show = "";
/* info=ColInfo(fNum=12, colName=Start, msgKey=Roamiosp.start, vName=start, type=Integer, jtype=null, stype=4, gsName=Start, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer startMin;
	private Integer startMax;
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
