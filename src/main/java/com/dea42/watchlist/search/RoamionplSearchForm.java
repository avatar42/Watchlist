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
 * Title: RoamioNplSearchForm <br>
 * Description: Class for holding data from the RoamioNpl table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class RoamionplSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

/* info=ColInfo(fNum=12, colName=BitrateMbps, msgKey=Roamionpl.bitratembps, vName=bitratembps, type=Integer, jtype=null, stype=4, gsName=Bitratembps, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer bitratembpsMin;
	private Integer bitratembpsMax;
	private String channel = "";
/* info=ColInfo(fNum=7, colName=DateField, msgKey=Roamionpl.datefield, vName=datefield, type=BigDecimal, jtype=null, stype=8, gsName=Datefield, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
	private BigDecimal datefieldMin;
	private BigDecimal datefieldMax;
/* info=ColInfo(fNum=10, colName=Duration, msgKey=Roamionpl.duration, vName=duration, type=BigDecimal, jtype=null, stype=8, gsName=Duration, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
	private BigDecimal durationMin;
	private BigDecimal durationMax;
	private String episode = "";
/* info=ColInfo(fNum=2, colName=id, msgKey=Roamionpl.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: RoamioNpl<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
/* info=ColInfo(fNum=14, colName=Isnew, msgKey=Roamionpl.isnew, vName=isnew, type=BigDecimal, jtype=null, stype=8, gsName=Isnew, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
	private BigDecimal isnewMin;
	private BigDecimal isnewMax;
/* info=ColInfo(fNum=16, colName=RowInShows, msgKey=Roamionpl.rowinshows, vName=rowinshows, type=Integer, jtype=null, stype=4, gsName=Rowinshows, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer rowinshowsMin;
	private Integer rowinshowsMax;
	private String seriesep = "";
	private String show = "";
/* info=ColInfo(fNum=11, colName=SizeGb, msgKey=Roamionpl.sizegb, vName=sizegb, type=Integer, jtype=null, stype=4, gsName=Sizegb, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer sizegbMin;
	private Integer sizegbMax;
/* info=ColInfo(fNum=8, colName=SortableDate, msgKey=Roamionpl.sortabledate, vName=sortabledate, type=Long, jtype=null, stype=-5, gsName=Sortabledate, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Long sortabledateMin;
	private Long sortabledateMax;
	private String title = "";
	private AccountSearchForm account;
/* info=ColInfo(fNum=13, colName=Watchedtime, msgKey=Roamionpl.watchedtime, vName=watchedtime, type=Integer, jtype=null, stype=4, gsName=Watchedtime, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
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
