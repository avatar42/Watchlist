package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: OtaSearchForm <br>
 * Description: Class for holding data from the Ota table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class OtaSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

/* info=ColInfo(fNum=14, colName=AtticAnt, msgKey=Ota.atticant, vName=atticant, type=Integer, jtype=null, stype=4, gsName=Atticant, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer atticantMin;
	private Integer atticantMax;
/* info=ColInfo(fNum=5, colName=Chan, msgKey=Ota.chan, vName=chan, type=Integer, jtype=null, stype=4, gsName=Chan, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer chanMin;
	private Integer chanMax;
	private String channelname = "";
	private String channelnumber = "";
	private String channelnumberchannelnameincluded = "";
	private String comments = "";
	private String direction = "";
	private String enabled = "";
	private String fccinfo = "";
/* info=ColInfo(fNum=12, colName=Freq, msgKey=Ota.freq, vName=freq, type=Integer, jtype=null, stype=4, gsName=Freq, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer freqMin;
	private Integer freqMax;
/* info=ColInfo(fNum=2, colName=id, msgKey=Ota.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: Ota<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	private String langfield = "";
	private Boolean listed = null;
/* info=ColInfo(fNum=13, colName=MyTivoAvgStrength, msgKey=Ota.mytivoavgstrength, vName=mytivoavgstrength, type=Integer, jtype=null, stype=4, gsName=Mytivoavgstrength, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer mytivoavgstrengthMin;
	private Integer mytivoavgstrengthMax;
	private String network = "";
	private String off = "";
	private String recommendedantenna = "";
	private String rez = "";
	private String station = "";
/* info=ColInfo(fNum=6, colName=SubChan, msgKey=Ota.subchan, vName=subchan, type=Integer, jtype=null, stype=4, gsName=Subchan, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment=null) */
	private Integer subchanMin;
	private Integer subchanMax;
/* info=ColInfo(fNum=19, colName=TvFoolChan, msgKey=Ota.tvfoolchan, vName=tvfoolchan, type=BigDecimal, jtype=null, stype=8, gsName=Tvfoolchan, length=0, pk=false, defaultVal=null, constraint=null, required=false, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=22, comment=null) */
	private BigDecimal tvfoolchanMin;
	private BigDecimal tvfoolchanMax;
	private String tvfoolestsignal = "";
	private AccountSearchForm account;
	private String watchabletablo = "";
	private String watchabletivo = "";
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones Ota obj into form
	 *
	 * @param obj
	 */
	public static OtaSearchForm getInstance(Ota obj) {
		OtaSearchForm form = new OtaSearchForm();
		form.setAtticantMin(obj.getAtticant());
		form.setAtticantMax(obj.getAtticant());
		form.setChanMin(obj.getChan());
		form.setChanMax(obj.getChan());
		form.setChannelname(obj.getChannelname());
		form.setChannelnumber(obj.getChannelnumber());
		form.setChannelnumberchannelnameincluded(obj.getChannelnumberchannelnameincluded());
		form.setComments(obj.getComments());
		form.setDirection(obj.getDirection());
		form.setEnabled(obj.getEnabled());
		form.setFccinfo(obj.getFccinfo());
		form.setFreqMin(obj.getFreq());
		form.setFreqMax(obj.getFreq());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setLangfield(obj.getLangfield());
		form.setListed(obj.getListed());
		form.setMytivoavgstrengthMin(obj.getMytivoavgstrength());
		form.setMytivoavgstrengthMax(obj.getMytivoavgstrength());
		form.setNetwork(obj.getNetwork());
		form.setOff(obj.getOff());
		form.setRecommendedantenna(obj.getRecommendedantenna());
		form.setRez(obj.getRez());
		form.setStation(obj.getStation());
		form.setSubchanMin(obj.getSubchan());
		form.setSubchanMax(obj.getSubchan());
		form.setTvfoolchanMin(obj.getTvfoolchan());
		form.setTvfoolchanMax(obj.getTvfoolchan());
		form.setTvfoolestsignal(obj.getTvfoolestsignal());
		form.setAccount(AccountSearchForm.getInstance(obj.getAccount()));
		form.setWatchabletablo(obj.getWatchabletablo());
		form.setWatchabletivo(obj.getWatchabletivo());
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
