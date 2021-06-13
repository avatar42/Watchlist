package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: CablecardSearchForm <br>
 * Description: Class for holding data from the Cablecard table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class CablecardSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String channelname = "";
/* info=ColInfo(fNum=4, colName=ChannelNumber, msgKey=Cablecard.channelnumber, vName=channelnumber, type=Integer, jtype=null, stype=4, gsName=Channelnumber, length=0, pk=false, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer channelnumberMin;
	private Integer channelnumberMax;
/* info=ColInfo(fNum=9, colName=Dt, msgKey=Cablecard.dt, vName=dt, type=Integer, jtype=null, stype=4, gsName=Dt, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer dtMin;
	private Integer dtMax;
/* info=ColInfo(fNum=8, colName=Hd, msgKey=Cablecard.hd, vName=hd, type=Integer, jtype=null, stype=4, gsName=Hd, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer hdMin;
	private Integer hdMax;
/* info=ColInfo(fNum=2, colName=id, msgKey=Cablecard.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: Cablecard<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
/* info=ColInfo(fNum=11, colName=InNpl, msgKey=Cablecard.innpl, vName=innpl, type=Integer, jtype=null, stype=4, gsName=Innpl, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer innplMin;
	private Integer innplMax;
	private String langfield = "";
	private String net = "";
	private String receiving = "";
	private String shortfield = "";
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
	 * Clones Cablecard obj into form
	 *
	 * @param obj
	 */
	public static CablecardSearchForm getInstance(Cablecard obj) {
		CablecardSearchForm form = new CablecardSearchForm();
		form.setChannelname(obj.getChannelname());
		form.setChannelnumberMin(obj.getChannelnumber());
		form.setChannelnumberMax(obj.getChannelnumber());
		form.setDtMin(obj.getDt());
		form.setDtMax(obj.getDt());
		form.setHdMin(obj.getHd());
		form.setHdMax(obj.getHd());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setInnplMin(obj.getInnpl());
		form.setInnplMax(obj.getInnpl());
		form.setLangfield(obj.getLangfield());
		form.setNet(obj.getNet());
		form.setReceiving(obj.getReceiving());
		form.setShortfield(obj.getShortfield());
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
