package com.dea42.watchlist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Title: shows Bean <br>
 * Description: Class for holding data from the shows table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 * Table name: shows<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> */
@Entity
@Table(name = "`shows`")
public class Shows implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Abc", length = 16)
	private String abc;
	@Column(name = "AbcLink", length = 62)
	private String abclink;
	@Column(name = "AcornTv", length = 43)
	private String acorntv;
	@Column(name = "AcornTvLink", length = 32)
	private String acorntvlink;
	@Column(name = "Amazon", length = 35)
	private String amazon;
	@Column(name = "AmazonLink", length = 144)
	private String amazonlink;
	@Column(name = "Amc", length = 29)
	private String amc;
	@Column(name = "AmcLink", length = 70)
	private String amclink;
	@Column(name = "Bbca", length = 29)
	private String bbca;
	@Column(name = "BbcaLink", length = 70)
	private String bbcalink;
	@Column(name = "Britbox", length = 11)
	private String britbox;
	@Column(name = "BritboxLink", length = 54)
	private String britboxlink;
	@Column(name = "BufferSpace", length = 20)
	private String bufferspace;
	@Column(name = "BufSp")
	private Integer bufsp;
	@Column(name = "Cancelled", length = 65)
	private String cancelled;
	@Column(name = "Cbs", length = 31)
	private String cbs;
	@Column(name = "CbsLink", length = 60)
	private String cbslink;
	@Column(name = "Cc", length = 5)
	private String cc;
	@Column(name = "CcLink", length = 42)
	private String cclink;
	@Column(name = "Colg", length = 65)
	private String colg;
	@Column(name = "Cw", length = 6)
	private String cw;
	@Column(name = "CwLink", length = 43)
	private String cwlink;
	@Column(name = "Diff", length = 2)
	private String diff;
	@Column(name = "EpguidesShowName", nullable = false, length = 47)
	private String epguidesshowname;
	@Column(name = "EpguidesShowNameLink", length = 60)
	private String epguidesshownamelink;
	@Column(name = "FreeformAbcf", length = 3)
	private String freeformabcf;
	@Column(name = "FreeformAbcfLink", length = 52)
	private String freeformabcflink;
	@Column(name = "Fx", length = 12)
	private String fx;
	@Column(name = "FxLink", length = 51)
	private String fxlink;
	@Column(name = "GooglePlay", length = 6)
	private String googleplay;
	@Column(name = "GooglePlayLink", length = 103)
	private String googleplaylink;
	@Column(name = "Hbo", length = 14)
	private String hbo;
	@Column(name = "HboLink", length = 65)
	private String hbolink;
	@Column(name = "HuluPlus", length = 37)
	private String huluplus;
	@Column(name = "HuluPlusLink", length = 53)
	private String hulupluslink;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Ifc", length = 20)
	private String ifc;
	@Column(name = "IfcLink", length = 35)
	private String ifclink;
	@Column(name = "InCanceledAs", length = 47)
	private String incanceledas;
	@Column(name = "InCanceledAsLink", length = 70)
	private String incanceledaslink;
	@Column(name = "InTodos", length = 28)
	private String intodos;
	@Column(name = "Itunes", length = 29)
	private String itunes;
	@Column(name = "ItunesLink", length = 73)
	private String ituneslink;
	@Column(name = "LastShow", length = 10)
	private String lastshow;
	@Column(name = "LatestInRoamioNpl", length = 8)
	private String latestinroamionpl;
	@Column(name = "LEp")
	private Integer lep;
	@Column(name = "LS", length = 1)
	private String ls;
	@Column(name = "Natgeo", length = 11)
	private String natgeo;
	@Column(name = "NatgeoLink", length = 55)
	private String natgeolink;
	@Column(name = "Nbc", length = 21)
	private String nbc;
	@Column(name = "NbcLink", length = 64)
	private String nbclink;
	@Column(name = "Netflix", length = 15)
	private String netflix;
	@Column(name = "NetflixLink", length = 115)
	private String netflixlink;
	@Column(name = "Network", length = 14)
	private String network;
	@Column(name = "NetworkLink", length = 306)
	private String networklink;
	@Column(name = "OnePassChan", length = 4)
	private String onepasschan;
	@Column(name = "Pbs", length = 12)
	private String pbs;
	@Column(name = "PbsLink", length = 29)
	private String pbslink;
	@Column(name = "Premiere", length = 65)
	private String premiere;
	@Column(name = "PremiereDate")
	private Integer premieredate;
	@Column(name = "Row")
	private Integer row;
	@Column(name = "Science", length = 11)
	private String science;
	@Column(name = "ScienceLink", length = 74)
	private String sciencelink;
	@Column(name = "Status", length = 65)
	private String status;
	@Column(name = "Syfy", length = 33)
	private String syfy;
	@Column(name = "SyfyLink", length = 41)
	private String syfylink;
	@Column(name = "Tnt", length = 6)
	private String tnt;
	@Column(name = "TntLink", length = 49)
	private String tntlink;
	@Column(name = "TodoDate", length = 1)
	private String tododate;
	@Column(name = "TvCom", length = 28)
	private String tvcom;
	@Column(name = "TvComLink", length = 69)
	private String tvcomlink;
	@Column(name = "TwcOnDemand", length = 39)
	private String twcondemand;
	@Column(name = "TwcOnDemandLink", length = 230)
	private String twcondemandlink;
	@Column(name = "Usa", length = 11)
	private String usa;
	@Column(name = "UsaLink", length = 42)
	private String usalink;
	@Column(name = "WatchedTo", length = 1)
	private String watchedto;
	@Column(name = "WEp")
	private Integer wep;
	@Column(name = "WS", length = 1)
	private String ws;
	@Column(name = "Xbox", length = 6)
	private String xbox;
	@Column(name = "XboxLink", length = 67)
	private String xboxlink;
	@Column(name = "Youtube", length = 6)
	private String youtube;
	@Column(name = "YoutubeLink", length = 62)
	private String youtubelink;

	/**
	 * Basic constructor
	 */
	public Shows() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Shows(String abc, String abclink, String acorntv, String acorntvlink, String amazon, String amazonlink, String amc, String amclink, String bbca, String bbcalink, String britbox, String britboxlink, String bufferspace, Integer bufsp, String cancelled, String cbs, String cbslink, String cc, String cclink, String colg, String cw, String cwlink, String diff, String epguidesshowname, String epguidesshownamelink, String freeformabcf, String freeformabcflink, String fx, String fxlink, String googleplay, String googleplaylink, String hbo, String hbolink, String huluplus, String hulupluslink, Integer id, String ifc, String ifclink, String incanceledas, String incanceledaslink, String intodos, String itunes, String ituneslink, String lastshow, String latestinroamionpl, Integer lep, String ls, String natgeo, String natgeolink, String nbc, String nbclink, String netflix, String netflixlink, String network, String networklink, String onepasschan, String pbs, String pbslink, String premiere, Integer premieredate, Integer row, String science, String sciencelink, String status, String syfy, String syfylink, String tnt, String tntlink, String tododate, String tvcom, String tvcomlink, String twcondemand, String twcondemandlink, String usa, String usalink, String watchedto, Integer wep, String ws, String xbox, String xboxlink, String youtube, String youtubelink) {
		this.abc = abc;
		this.abclink = abclink;
		this.acorntv = acorntv;
		this.acorntvlink = acorntvlink;
		this.amazon = amazon;
		this.amazonlink = amazonlink;
		this.amc = amc;
		this.amclink = amclink;
		this.bbca = bbca;
		this.bbcalink = bbcalink;
		this.britbox = britbox;
		this.britboxlink = britboxlink;
		this.bufferspace = bufferspace;
		this.bufsp = bufsp;
		this.cancelled = cancelled;
		this.cbs = cbs;
		this.cbslink = cbslink;
		this.cc = cc;
		this.cclink = cclink;
		this.colg = colg;
		this.cw = cw;
		this.cwlink = cwlink;
		this.diff = diff;
		this.epguidesshowname = epguidesshowname;
		this.epguidesshownamelink = epguidesshownamelink;
		this.freeformabcf = freeformabcf;
		this.freeformabcflink = freeformabcflink;
		this.fx = fx;
		this.fxlink = fxlink;
		this.googleplay = googleplay;
		this.googleplaylink = googleplaylink;
		this.hbo = hbo;
		this.hbolink = hbolink;
		this.huluplus = huluplus;
		this.hulupluslink = hulupluslink;
		this.id = id;
		this.ifc = ifc;
		this.ifclink = ifclink;
		this.incanceledas = incanceledas;
		this.incanceledaslink = incanceledaslink;
		this.intodos = intodos;
		this.itunes = itunes;
		this.ituneslink = ituneslink;
		this.lastshow = lastshow;
		this.latestinroamionpl = latestinroamionpl;
		this.lep = lep;
		this.ls = ls;
		this.natgeo = natgeo;
		this.natgeolink = natgeolink;
		this.nbc = nbc;
		this.nbclink = nbclink;
		this.netflix = netflix;
		this.netflixlink = netflixlink;
		this.network = network;
		this.networklink = networklink;
		this.onepasschan = onepasschan;
		this.pbs = pbs;
		this.pbslink = pbslink;
		this.premiere = premiere;
		this.premieredate = premieredate;
		this.row = row;
		this.science = science;
		this.sciencelink = sciencelink;
		this.status = status;
		this.syfy = syfy;
		this.syfylink = syfylink;
		this.tnt = tnt;
		this.tntlink = tntlink;
		this.tododate = tododate;
		this.tvcom = tvcom;
		this.tvcomlink = tvcomlink;
		this.twcondemand = twcondemand;
		this.twcondemandlink = twcondemandlink;
		this.usa = usa;
		this.usalink = usalink;
		this.watchedto = watchedto;
		this.wep = wep;
		this.ws = ws;
		this.xbox = xbox;
		this.xboxlink = xboxlink;
		this.youtube = youtube;
		this.youtubelink = youtubelink;
	}
	/**
	 * returns value of the Abc column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAbc() {
		return abc;
	}

	/**
	 * sets value of the Abc column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 16
	 */
	public void setAbc(String newVal) {
		abc = newVal;
	}

	/**
	 * returns value of the AbcLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAbclink() {
		return abclink;
	}

	/**
	 * sets value of the AbcLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 62
	 */
	public void setAbclink(String newVal) {
		abclink = newVal;
	}

	/**
	 * returns value of the AcornTv column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAcorntv() {
		return acorntv;
	}

	/**
	 * sets value of the AcornTv column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 43
	 */
	public void setAcorntv(String newVal) {
		acorntv = newVal;
	}

	/**
	 * returns value of the AcornTvLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAcorntvlink() {
		return acorntvlink;
	}

	/**
	 * sets value of the AcornTvLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 32
	 */
	public void setAcorntvlink(String newVal) {
		acorntvlink = newVal;
	}

	/**
	 * returns value of the Amazon column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAmazon() {
		return amazon;
	}

	/**
	 * sets value of the Amazon column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 35
	 */
	public void setAmazon(String newVal) {
		amazon = newVal;
	}

	/**
	 * returns value of the AmazonLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAmazonlink() {
		return amazonlink;
	}

	/**
	 * sets value of the AmazonLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 144
	 */
	public void setAmazonlink(String newVal) {
		amazonlink = newVal;
	}

	/**
	 * returns value of the Amc column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAmc() {
		return amc;
	}

	/**
	 * sets value of the Amc column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 29
	 */
	public void setAmc(String newVal) {
		amc = newVal;
	}

	/**
	 * returns value of the AmcLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAmclink() {
		return amclink;
	}

	/**
	 * sets value of the AmcLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 70
	 */
	public void setAmclink(String newVal) {
		amclink = newVal;
	}

	/**
	 * returns value of the Bbca column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getBbca() {
		return bbca;
	}

	/**
	 * sets value of the Bbca column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 29
	 */
	public void setBbca(String newVal) {
		bbca = newVal;
	}

	/**
	 * returns value of the BbcaLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getBbcalink() {
		return bbcalink;
	}

	/**
	 * sets value of the BbcaLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 70
	 */
	public void setBbcalink(String newVal) {
		bbcalink = newVal;
	}

	/**
	 * returns value of the Britbox column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getBritbox() {
		return britbox;
	}

	/**
	 * sets value of the Britbox column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 11
	 */
	public void setBritbox(String newVal) {
		britbox = newVal;
	}

	/**
	 * returns value of the BritboxLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getBritboxlink() {
		return britboxlink;
	}

	/**
	 * sets value of the BritboxLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 54
	 */
	public void setBritboxlink(String newVal) {
		britboxlink = newVal;
	}

	/**
	 * returns value of the BufferSpace column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getBufferspace() {
		return bufferspace;
	}

	/**
	 * sets value of the BufferSpace column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 20
	 */
	public void setBufferspace(String newVal) {
		bufferspace = newVal;
	}

	/**
	 * returns value of the BufSp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getBufsp() {
		if (bufsp == null)
	    	return 0;
		return bufsp.intValue();
	}

	/**
	 * sets value of the BufSp column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setBufsp(Integer newVal) {
		bufsp = newVal;
	}

	/**
	 * returns value of the Cancelled column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCancelled() {
		return cancelled;
	}

	/**
	 * sets value of the Cancelled column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 65
	 */
	public void setCancelled(String newVal) {
		cancelled = newVal;
	}

	/**
	 * returns value of the Cbs column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCbs() {
		return cbs;
	}

	/**
	 * sets value of the Cbs column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 31
	 */
	public void setCbs(String newVal) {
		cbs = newVal;
	}

	/**
	 * returns value of the CbsLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCbslink() {
		return cbslink;
	}

	/**
	 * sets value of the CbsLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 60
	 */
	public void setCbslink(String newVal) {
		cbslink = newVal;
	}

	/**
	 * returns value of the Cc column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * sets value of the Cc column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 5
	 */
	public void setCc(String newVal) {
		cc = newVal;
	}

	/**
	 * returns value of the CcLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCclink() {
		return cclink;
	}

	/**
	 * sets value of the CcLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 42
	 */
	public void setCclink(String newVal) {
		cclink = newVal;
	}

	/**
	 * returns value of the Colg column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getColg() {
		return colg;
	}

	/**
	 * sets value of the Colg column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 65
	 */
	public void setColg(String newVal) {
		colg = newVal;
	}

	/**
	 * returns value of the Cw column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCw() {
		return cw;
	}

	/**
	 * sets value of the Cw column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6
	 */
	public void setCw(String newVal) {
		cw = newVal;
	}

	/**
	 * returns value of the CwLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCwlink() {
		return cwlink;
	}

	/**
	 * sets value of the CwLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 43
	 */
	public void setCwlink(String newVal) {
		cwlink = newVal;
	}

	/**
	 * returns value of the Diff column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getDiff() {
		return diff;
	}

	/**
	 * sets value of the Diff column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 2
	 */
	public void setDiff(String newVal) {
		diff = newVal;
	}

	/**
	 * returns value of the EpguidesShowName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpguidesshowname() {
		return epguidesshowname;
	}

	/**
	 * sets value of the EpguidesShowName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 47
	 */
	public void setEpguidesshowname(String newVal) {
		epguidesshowname = newVal;
	}

	/**
	 * returns value of the EpguidesShowNameLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpguidesshownamelink() {
		return epguidesshownamelink;
	}

	/**
	 * sets value of the EpguidesShowNameLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 60
	 */
	public void setEpguidesshownamelink(String newVal) {
		epguidesshownamelink = newVal;
	}

	/**
	 * returns value of the FreeformAbcf column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFreeformabcf() {
		return freeformabcf;
	}

	/**
	 * sets value of the FreeformAbcf column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 3
	 */
	public void setFreeformabcf(String newVal) {
		freeformabcf = newVal;
	}

	/**
	 * returns value of the FreeformAbcfLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFreeformabcflink() {
		return freeformabcflink;
	}

	/**
	 * sets value of the FreeformAbcfLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 52
	 */
	public void setFreeformabcflink(String newVal) {
		freeformabcflink = newVal;
	}

	/**
	 * returns value of the Fx column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFx() {
		return fx;
	}

	/**
	 * sets value of the Fx column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 12
	 */
	public void setFx(String newVal) {
		fx = newVal;
	}

	/**
	 * returns value of the FxLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFxlink() {
		return fxlink;
	}

	/**
	 * sets value of the FxLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 51
	 */
	public void setFxlink(String newVal) {
		fxlink = newVal;
	}

	/**
	 * returns value of the GooglePlay column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getGoogleplay() {
		return googleplay;
	}

	/**
	 * sets value of the GooglePlay column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6
	 */
	public void setGoogleplay(String newVal) {
		googleplay = newVal;
	}

	/**
	 * returns value of the GooglePlayLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getGoogleplaylink() {
		return googleplaylink;
	}

	/**
	 * sets value of the GooglePlayLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 103
	 */
	public void setGoogleplaylink(String newVal) {
		googleplaylink = newVal;
	}

	/**
	 * returns value of the Hbo column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getHbo() {
		return hbo;
	}

	/**
	 * sets value of the Hbo column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 14
	 */
	public void setHbo(String newVal) {
		hbo = newVal;
	}

	/**
	 * returns value of the HboLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getHbolink() {
		return hbolink;
	}

	/**
	 * sets value of the HboLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 65
	 */
	public void setHbolink(String newVal) {
		hbolink = newVal;
	}

	/**
	 * returns value of the HuluPlus column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getHuluplus() {
		return huluplus;
	}

	/**
	 * sets value of the HuluPlus column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 37
	 */
	public void setHuluplus(String newVal) {
		huluplus = newVal;
	}

	/**
	 * returns value of the HuluPlusLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getHulupluslink() {
		return hulupluslink;
	}

	/**
	 * sets value of the HuluPlusLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 53
	 */
	public void setHulupluslink(String newVal) {
		hulupluslink = newVal;
	}

	/**
	 * returns value of the id column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getId() {
		if (id == null)
	    	return 0;
		return id.intValue();
	}

	/**
	 * sets value of the id column of this row of data
	 * default value for this field set by the DB is null
	 * This is the primary key for this table
	 */
	public void setId(Integer newVal) {
		id = newVal;
	}

	/**
	 * returns value of the Ifc column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIfc() {
		return ifc;
	}

	/**
	 * sets value of the Ifc column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 20
	 */
	public void setIfc(String newVal) {
		ifc = newVal;
	}

	/**
	 * returns value of the IfcLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIfclink() {
		return ifclink;
	}

	/**
	 * sets value of the IfcLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 35
	 */
	public void setIfclink(String newVal) {
		ifclink = newVal;
	}

	/**
	 * returns value of the InCanceledAs column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIncanceledas() {
		return incanceledas;
	}

	/**
	 * sets value of the InCanceledAs column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 47
	 */
	public void setIncanceledas(String newVal) {
		incanceledas = newVal;
	}

	/**
	 * returns value of the InCanceledAsLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIncanceledaslink() {
		return incanceledaslink;
	}

	/**
	 * sets value of the InCanceledAsLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 70
	 */
	public void setIncanceledaslink(String newVal) {
		incanceledaslink = newVal;
	}

	/**
	 * returns value of the InTodos column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIntodos() {
		return intodos;
	}

	/**
	 * sets value of the InTodos column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 28
	 */
	public void setIntodos(String newVal) {
		intodos = newVal;
	}

	/**
	 * returns value of the Itunes column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getItunes() {
		return itunes;
	}

	/**
	 * sets value of the Itunes column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 29
	 */
	public void setItunes(String newVal) {
		itunes = newVal;
	}

	/**
	 * returns value of the ItunesLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getItuneslink() {
		return ituneslink;
	}

	/**
	 * sets value of the ItunesLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 73
	 */
	public void setItuneslink(String newVal) {
		ituneslink = newVal;
	}

	/**
	 * returns value of the LastShow column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLastshow() {
		return lastshow;
	}

	/**
	 * sets value of the LastShow column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 10
	 */
	public void setLastshow(String newVal) {
		lastshow = newVal;
	}

	/**
	 * returns value of the LatestInRoamioNpl column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLatestinroamionpl() {
		return latestinroamionpl;
	}

	/**
	 * sets value of the LatestInRoamioNpl column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 8
	 */
	public void setLatestinroamionpl(String newVal) {
		latestinroamionpl = newVal;
	}

	/**
	 * returns value of the LEp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getLep() {
		if (lep == null)
	    	return 0;
		return lep.intValue();
	}

	/**
	 * sets value of the LEp column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setLep(Integer newVal) {
		lep = newVal;
	}

	/**
	 * returns value of the LS column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLs() {
		return ls;
	}

	/**
	 * sets value of the LS column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setLs(String newVal) {
		ls = newVal;
	}

	/**
	 * returns value of the Natgeo column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNatgeo() {
		return natgeo;
	}

	/**
	 * sets value of the Natgeo column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 11
	 */
	public void setNatgeo(String newVal) {
		natgeo = newVal;
	}

	/**
	 * returns value of the NatgeoLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNatgeolink() {
		return natgeolink;
	}

	/**
	 * sets value of the NatgeoLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 55
	 */
	public void setNatgeolink(String newVal) {
		natgeolink = newVal;
	}

	/**
	 * returns value of the Nbc column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNbc() {
		return nbc;
	}

	/**
	 * sets value of the Nbc column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 21
	 */
	public void setNbc(String newVal) {
		nbc = newVal;
	}

	/**
	 * returns value of the NbcLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNbclink() {
		return nbclink;
	}

	/**
	 * sets value of the NbcLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 64
	 */
	public void setNbclink(String newVal) {
		nbclink = newVal;
	}

	/**
	 * returns value of the Netflix column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNetflix() {
		return netflix;
	}

	/**
	 * sets value of the Netflix column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 15
	 */
	public void setNetflix(String newVal) {
		netflix = newVal;
	}

	/**
	 * returns value of the NetflixLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNetflixlink() {
		return netflixlink;
	}

	/**
	 * sets value of the NetflixLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 115
	 */
	public void setNetflixlink(String newVal) {
		netflixlink = newVal;
	}

	/**
	 * returns value of the Network column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * sets value of the Network column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 14
	 */
	public void setNetwork(String newVal) {
		network = newVal;
	}

	/**
	 * returns value of the NetworkLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNetworklink() {
		return networklink;
	}

	/**
	 * sets value of the NetworkLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 306
	 */
	public void setNetworklink(String newVal) {
		networklink = newVal;
	}

	/**
	 * returns value of the OnePassChan column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOnepasschan() {
		return onepasschan;
	}

	/**
	 * sets value of the OnePassChan column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4
	 */
	public void setOnepasschan(String newVal) {
		onepasschan = newVal;
	}

	/**
	 * returns value of the Pbs column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getPbs() {
		return pbs;
	}

	/**
	 * sets value of the Pbs column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 12
	 */
	public void setPbs(String newVal) {
		pbs = newVal;
	}

	/**
	 * returns value of the PbsLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getPbslink() {
		return pbslink;
	}

	/**
	 * sets value of the PbsLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 29
	 */
	public void setPbslink(String newVal) {
		pbslink = newVal;
	}

	/**
	 * returns value of the Premiere column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getPremiere() {
		return premiere;
	}

	/**
	 * sets value of the Premiere column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 65
	 */
	public void setPremiere(String newVal) {
		premiere = newVal;
	}

	/**
	 * returns value of the PremiereDate column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getPremieredate() {
		if (premieredate == null)
	    	return 0;
		return premieredate.intValue();
	}

	/**
	 * sets value of the PremiereDate column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setPremieredate(Integer newVal) {
		premieredate = newVal;
	}

	/**
	 * returns value of the Row column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getRow() {
		if (row == null)
	    	return 0;
		return row.intValue();
	}

	/**
	 * sets value of the Row column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setRow(Integer newVal) {
		row = newVal;
	}

	/**
	 * returns value of the Science column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getScience() {
		return science;
	}

	/**
	 * sets value of the Science column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 11
	 */
	public void setScience(String newVal) {
		science = newVal;
	}

	/**
	 * returns value of the ScienceLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getSciencelink() {
		return sciencelink;
	}

	/**
	 * sets value of the ScienceLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 74
	 */
	public void setSciencelink(String newVal) {
		sciencelink = newVal;
	}

	/**
	 * returns value of the Status column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * sets value of the Status column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 65
	 */
	public void setStatus(String newVal) {
		status = newVal;
	}

	/**
	 * returns value of the Syfy column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getSyfy() {
		return syfy;
	}

	/**
	 * sets value of the Syfy column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 33
	 */
	public void setSyfy(String newVal) {
		syfy = newVal;
	}

	/**
	 * returns value of the SyfyLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getSyfylink() {
		return syfylink;
	}

	/**
	 * sets value of the SyfyLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 41
	 */
	public void setSyfylink(String newVal) {
		syfylink = newVal;
	}

	/**
	 * returns value of the Tnt column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTnt() {
		return tnt;
	}

	/**
	 * sets value of the Tnt column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6
	 */
	public void setTnt(String newVal) {
		tnt = newVal;
	}

	/**
	 * returns value of the TntLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTntlink() {
		return tntlink;
	}

	/**
	 * sets value of the TntLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 49
	 */
	public void setTntlink(String newVal) {
		tntlink = newVal;
	}

	/**
	 * returns value of the TodoDate column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTododate() {
		return tododate;
	}

	/**
	 * sets value of the TodoDate column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setTododate(String newVal) {
		tododate = newVal;
	}

	/**
	 * returns value of the TvCom column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTvcom() {
		return tvcom;
	}

	/**
	 * sets value of the TvCom column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 28
	 */
	public void setTvcom(String newVal) {
		tvcom = newVal;
	}

	/**
	 * returns value of the TvComLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTvcomlink() {
		return tvcomlink;
	}

	/**
	 * sets value of the TvComLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 69
	 */
	public void setTvcomlink(String newVal) {
		tvcomlink = newVal;
	}

	/**
	 * returns value of the TwcOnDemand column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTwcondemand() {
		return twcondemand;
	}

	/**
	 * sets value of the TwcOnDemand column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 39
	 */
	public void setTwcondemand(String newVal) {
		twcondemand = newVal;
	}

	/**
	 * returns value of the TwcOnDemandLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTwcondemandlink() {
		return twcondemandlink;
	}

	/**
	 * sets value of the TwcOnDemandLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 230
	 */
	public void setTwcondemandlink(String newVal) {
		twcondemandlink = newVal;
	}

	/**
	 * returns value of the Usa column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getUsa() {
		return usa;
	}

	/**
	 * sets value of the Usa column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 11
	 */
	public void setUsa(String newVal) {
		usa = newVal;
	}

	/**
	 * returns value of the UsaLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getUsalink() {
		return usalink;
	}

	/**
	 * sets value of the UsaLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 42
	 */
	public void setUsalink(String newVal) {
		usalink = newVal;
	}

	/**
	 * returns value of the WatchedTo column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getWatchedto() {
		return watchedto;
	}

	/**
	 * sets value of the WatchedTo column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setWatchedto(String newVal) {
		watchedto = newVal;
	}

	/**
	 * returns value of the WEp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getWep() {
		if (wep == null)
	    	return 0;
		return wep.intValue();
	}

	/**
	 * sets value of the WEp column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setWep(Integer newVal) {
		wep = newVal;
	}

	/**
	 * returns value of the WS column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getWs() {
		return ws;
	}

	/**
	 * sets value of the WS column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setWs(String newVal) {
		ws = newVal;
	}

	/**
	 * returns value of the Xbox column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getXbox() {
		return xbox;
	}

	/**
	 * sets value of the Xbox column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6
	 */
	public void setXbox(String newVal) {
		xbox = newVal;
	}

	/**
	 * returns value of the XboxLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getXboxlink() {
		return xboxlink;
	}

	/**
	 * sets value of the XboxLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 67
	 */
	public void setXboxlink(String newVal) {
		xboxlink = newVal;
	}

	/**
	 * returns value of the Youtube column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getYoutube() {
		return youtube;
	}

	/**
	 * sets value of the Youtube column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6
	 */
	public void setYoutube(String newVal) {
		youtube = newVal;
	}

	/**
	 * returns value of the YoutubeLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getYoutubelink() {
		return youtubelink;
	}

	/**
	 * sets value of the YoutubeLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 62
	 */
	public void setYoutubelink(String newVal) {
		youtubelink = newVal;
	}

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Shows [");
		builder.append("abc=").append(abc);
		builder.append(", abclink=").append(abclink);
		builder.append(", acorntv=").append(acorntv);
		builder.append(", acorntvlink=").append(acorntvlink);
		builder.append(", amazon=").append(amazon);
		builder.append(", amazonlink=").append(amazonlink);
		builder.append(", amc=").append(amc);
		builder.append(", amclink=").append(amclink);
		builder.append(", bbca=").append(bbca);
		builder.append(", bbcalink=").append(bbcalink);
		builder.append(", britbox=").append(britbox);
		builder.append(", britboxlink=").append(britboxlink);
		builder.append(", bufferspace=").append(bufferspace);
		builder.append(", bufsp=").append(bufsp);
		builder.append(", cancelled=").append(cancelled);
		builder.append(", cbs=").append(cbs);
		builder.append(", cbslink=").append(cbslink);
		builder.append(", cc=").append(cc);
		builder.append(", cclink=").append(cclink);
		builder.append(", colg=").append(colg);
		builder.append(", cw=").append(cw);
		builder.append(", cwlink=").append(cwlink);
		builder.append(", diff=").append(diff);
		builder.append(", epguidesshowname=").append(epguidesshowname);
		builder.append(", epguidesshownamelink=").append(epguidesshownamelink);
		builder.append(", freeformabcf=").append(freeformabcf);
		builder.append(", freeformabcflink=").append(freeformabcflink);
		builder.append(", fx=").append(fx);
		builder.append(", fxlink=").append(fxlink);
		builder.append(", googleplay=").append(googleplay);
		builder.append(", googleplaylink=").append(googleplaylink);
		builder.append(", hbo=").append(hbo);
		builder.append(", hbolink=").append(hbolink);
		builder.append(", huluplus=").append(huluplus);
		builder.append(", hulupluslink=").append(hulupluslink);
		builder.append(", id=").append(id);
		builder.append(", ifc=").append(ifc);
		builder.append(", ifclink=").append(ifclink);
		builder.append(", incanceledas=").append(incanceledas);
		builder.append(", incanceledaslink=").append(incanceledaslink);
		builder.append(", intodos=").append(intodos);
		builder.append(", itunes=").append(itunes);
		builder.append(", ituneslink=").append(ituneslink);
		builder.append(", lastshow=").append(lastshow);
		builder.append(", latestinroamionpl=").append(latestinroamionpl);
		builder.append(", lep=").append(lep);
		builder.append(", ls=").append(ls);
		builder.append(", natgeo=").append(natgeo);
		builder.append(", natgeolink=").append(natgeolink);
		builder.append(", nbc=").append(nbc);
		builder.append(", nbclink=").append(nbclink);
		builder.append(", netflix=").append(netflix);
		builder.append(", netflixlink=").append(netflixlink);
		builder.append(", network=").append(network);
		builder.append(", networklink=").append(networklink);
		builder.append(", onepasschan=").append(onepasschan);
		builder.append(", pbs=").append(pbs);
		builder.append(", pbslink=").append(pbslink);
		builder.append(", premiere=").append(premiere);
		builder.append(", premieredate=").append(premieredate);
		builder.append(", row=").append(row);
		builder.append(", science=").append(science);
		builder.append(", sciencelink=").append(sciencelink);
		builder.append(", status=").append(status);
		builder.append(", syfy=").append(syfy);
		builder.append(", syfylink=").append(syfylink);
		builder.append(", tnt=").append(tnt);
		builder.append(", tntlink=").append(tntlink);
		builder.append(", tododate=").append(tododate);
		builder.append(", tvcom=").append(tvcom);
		builder.append(", tvcomlink=").append(tvcomlink);
		builder.append(", twcondemand=").append(twcondemand);
		builder.append(", twcondemandlink=").append(twcondemandlink);
		builder.append(", usa=").append(usa);
		builder.append(", usalink=").append(usalink);
		builder.append(", watchedto=").append(watchedto);
		builder.append(", wep=").append(wep);
		builder.append(", ws=").append(ws);
		builder.append(", xbox=").append(xbox);
		builder.append(", xboxlink=").append(xboxlink);
		builder.append(", youtube=").append(youtube);
		builder.append(", youtubelink=").append(youtubelink);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((abc == null) ? 0 : abc.hashCode());
		result = prime * result + ((abclink == null) ? 0 : abclink.hashCode());
		result = prime * result + ((acorntv == null) ? 0 : acorntv.hashCode());
		result = prime * result + ((acorntvlink == null) ? 0 : acorntvlink.hashCode());
		result = prime * result + ((amazon == null) ? 0 : amazon.hashCode());
		result = prime * result + ((amazonlink == null) ? 0 : amazonlink.hashCode());
		result = prime * result + ((amc == null) ? 0 : amc.hashCode());
		result = prime * result + ((amclink == null) ? 0 : amclink.hashCode());
		result = prime * result + ((bbca == null) ? 0 : bbca.hashCode());
		result = prime * result + ((bbcalink == null) ? 0 : bbcalink.hashCode());
		result = prime * result + ((britbox == null) ? 0 : britbox.hashCode());
		result = prime * result + ((britboxlink == null) ? 0 : britboxlink.hashCode());
		result = prime * result + ((bufferspace == null) ? 0 : bufferspace.hashCode());
		result = prime * result + ((bufsp == null) ? 0 : bufsp.hashCode());
		result = prime * result + ((cancelled == null) ? 0 : cancelled.hashCode());
		result = prime * result + ((cbs == null) ? 0 : cbs.hashCode());
		result = prime * result + ((cbslink == null) ? 0 : cbslink.hashCode());
		result = prime * result + ((cc == null) ? 0 : cc.hashCode());
		result = prime * result + ((cclink == null) ? 0 : cclink.hashCode());
		result = prime * result + ((colg == null) ? 0 : colg.hashCode());
		result = prime * result + ((cw == null) ? 0 : cw.hashCode());
		result = prime * result + ((cwlink == null) ? 0 : cwlink.hashCode());
		result = prime * result + ((diff == null) ? 0 : diff.hashCode());
		result = prime * result + ((epguidesshowname == null) ? 0 : epguidesshowname.hashCode());
		result = prime * result + ((epguidesshownamelink == null) ? 0 : epguidesshownamelink.hashCode());
		result = prime * result + ((freeformabcf == null) ? 0 : freeformabcf.hashCode());
		result = prime * result + ((freeformabcflink == null) ? 0 : freeformabcflink.hashCode());
		result = prime * result + ((fx == null) ? 0 : fx.hashCode());
		result = prime * result + ((fxlink == null) ? 0 : fxlink.hashCode());
		result = prime * result + ((googleplay == null) ? 0 : googleplay.hashCode());
		result = prime * result + ((googleplaylink == null) ? 0 : googleplaylink.hashCode());
		result = prime * result + ((hbo == null) ? 0 : hbo.hashCode());
		result = prime * result + ((hbolink == null) ? 0 : hbolink.hashCode());
		result = prime * result + ((huluplus == null) ? 0 : huluplus.hashCode());
		result = prime * result + ((hulupluslink == null) ? 0 : hulupluslink.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ifc == null) ? 0 : ifc.hashCode());
		result = prime * result + ((ifclink == null) ? 0 : ifclink.hashCode());
		result = prime * result + ((incanceledas == null) ? 0 : incanceledas.hashCode());
		result = prime * result + ((incanceledaslink == null) ? 0 : incanceledaslink.hashCode());
		result = prime * result + ((intodos == null) ? 0 : intodos.hashCode());
		result = prime * result + ((itunes == null) ? 0 : itunes.hashCode());
		result = prime * result + ((ituneslink == null) ? 0 : ituneslink.hashCode());
		result = prime * result + ((lastshow == null) ? 0 : lastshow.hashCode());
		result = prime * result + ((latestinroamionpl == null) ? 0 : latestinroamionpl.hashCode());
		result = prime * result + ((lep == null) ? 0 : lep.hashCode());
		result = prime * result + ((ls == null) ? 0 : ls.hashCode());
		result = prime * result + ((natgeo == null) ? 0 : natgeo.hashCode());
		result = prime * result + ((natgeolink == null) ? 0 : natgeolink.hashCode());
		result = prime * result + ((nbc == null) ? 0 : nbc.hashCode());
		result = prime * result + ((nbclink == null) ? 0 : nbclink.hashCode());
		result = prime * result + ((netflix == null) ? 0 : netflix.hashCode());
		result = prime * result + ((netflixlink == null) ? 0 : netflixlink.hashCode());
		result = prime * result + ((network == null) ? 0 : network.hashCode());
		result = prime * result + ((networklink == null) ? 0 : networklink.hashCode());
		result = prime * result + ((onepasschan == null) ? 0 : onepasschan.hashCode());
		result = prime * result + ((pbs == null) ? 0 : pbs.hashCode());
		result = prime * result + ((pbslink == null) ? 0 : pbslink.hashCode());
		result = prime * result + ((premiere == null) ? 0 : premiere.hashCode());
		result = prime * result + ((premieredate == null) ? 0 : premieredate.hashCode());
		result = prime * result + ((row == null) ? 0 : row.hashCode());
		result = prime * result + ((science == null) ? 0 : science.hashCode());
		result = prime * result + ((sciencelink == null) ? 0 : sciencelink.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((syfy == null) ? 0 : syfy.hashCode());
		result = prime * result + ((syfylink == null) ? 0 : syfylink.hashCode());
		result = prime * result + ((tnt == null) ? 0 : tnt.hashCode());
		result = prime * result + ((tntlink == null) ? 0 : tntlink.hashCode());
		result = prime * result + ((tododate == null) ? 0 : tododate.hashCode());
		result = prime * result + ((tvcom == null) ? 0 : tvcom.hashCode());
		result = prime * result + ((tvcomlink == null) ? 0 : tvcomlink.hashCode());
		result = prime * result + ((twcondemand == null) ? 0 : twcondemand.hashCode());
		result = prime * result + ((twcondemandlink == null) ? 0 : twcondemandlink.hashCode());
		result = prime * result + ((usa == null) ? 0 : usa.hashCode());
		result = prime * result + ((usalink == null) ? 0 : usalink.hashCode());
		result = prime * result + ((watchedto == null) ? 0 : watchedto.hashCode());
		result = prime * result + ((wep == null) ? 0 : wep.hashCode());
		result = prime * result + ((ws == null) ? 0 : ws.hashCode());
		result = prime * result + ((xbox == null) ? 0 : xbox.hashCode());
		result = prime * result + ((xboxlink == null) ? 0 : xboxlink.hashCode());
		result = prime * result + ((youtube == null) ? 0 : youtube.hashCode());
		result = prime * result + ((youtubelink == null) ? 0 : youtubelink.hashCode());
		return result;
	}

	/**
	 * Mainly for mock testing
	 *
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shows other = (Shows) obj;

		if (getAbc() == null) {
			if (other.getAbc() != null)
				return false;
		} else if (!getAbc().equals(other.getAbc()))
			return false;

		if (getAbclink() == null) {
			if (other.getAbclink() != null)
				return false;
		} else if (!getAbclink().equals(other.getAbclink()))
			return false;

		if (getAcorntv() == null) {
			if (other.getAcorntv() != null)
				return false;
		} else if (!getAcorntv().equals(other.getAcorntv()))
			return false;

		if (getAcorntvlink() == null) {
			if (other.getAcorntvlink() != null)
				return false;
		} else if (!getAcorntvlink().equals(other.getAcorntvlink()))
			return false;

		if (getAmazon() == null) {
			if (other.getAmazon() != null)
				return false;
		} else if (!getAmazon().equals(other.getAmazon()))
			return false;

		if (getAmazonlink() == null) {
			if (other.getAmazonlink() != null)
				return false;
		} else if (!getAmazonlink().equals(other.getAmazonlink()))
			return false;

		if (getAmc() == null) {
			if (other.getAmc() != null)
				return false;
		} else if (!getAmc().equals(other.getAmc()))
			return false;

		if (getAmclink() == null) {
			if (other.getAmclink() != null)
				return false;
		} else if (!getAmclink().equals(other.getAmclink()))
			return false;

		if (getBbca() == null) {
			if (other.getBbca() != null)
				return false;
		} else if (!getBbca().equals(other.getBbca()))
			return false;

		if (getBbcalink() == null) {
			if (other.getBbcalink() != null)
				return false;
		} else if (!getBbcalink().equals(other.getBbcalink()))
			return false;

		if (getBritbox() == null) {
			if (other.getBritbox() != null)
				return false;
		} else if (!getBritbox().equals(other.getBritbox()))
			return false;

		if (getBritboxlink() == null) {
			if (other.getBritboxlink() != null)
				return false;
		} else if (!getBritboxlink().equals(other.getBritboxlink()))
			return false;

		if (getBufferspace() == null) {
			if (other.getBufferspace() != null)
				return false;
		} else if (!getBufferspace().equals(other.getBufferspace()))
			return false;

		if (getBufsp() == null) {
			if (other.getBufsp() != null)
				return false;
		} else if (!getBufsp().equals(other.getBufsp()))
			return false;

		if (getCancelled() == null) {
			if (other.getCancelled() != null)
				return false;
		} else if (!getCancelled().equals(other.getCancelled()))
			return false;

		if (getCbs() == null) {
			if (other.getCbs() != null)
				return false;
		} else if (!getCbs().equals(other.getCbs()))
			return false;

		if (getCbslink() == null) {
			if (other.getCbslink() != null)
				return false;
		} else if (!getCbslink().equals(other.getCbslink()))
			return false;

		if (getCc() == null) {
			if (other.getCc() != null)
				return false;
		} else if (!getCc().equals(other.getCc()))
			return false;

		if (getCclink() == null) {
			if (other.getCclink() != null)
				return false;
		} else if (!getCclink().equals(other.getCclink()))
			return false;

		if (getColg() == null) {
			if (other.getColg() != null)
				return false;
		} else if (!getColg().equals(other.getColg()))
			return false;

		if (getCw() == null) {
			if (other.getCw() != null)
				return false;
		} else if (!getCw().equals(other.getCw()))
			return false;

		if (getCwlink() == null) {
			if (other.getCwlink() != null)
				return false;
		} else if (!getCwlink().equals(other.getCwlink()))
			return false;

		if (getDiff() == null) {
			if (other.getDiff() != null)
				return false;
		} else if (!getDiff().equals(other.getDiff()))
			return false;

		if (getEpguidesshowname() == null) {
			if (other.getEpguidesshowname() != null)
				return false;
		} else if (!getEpguidesshowname().equals(other.getEpguidesshowname()))
			return false;

		if (getEpguidesshownamelink() == null) {
			if (other.getEpguidesshownamelink() != null)
				return false;
		} else if (!getEpguidesshownamelink().equals(other.getEpguidesshownamelink()))
			return false;

		if (getFreeformabcf() == null) {
			if (other.getFreeformabcf() != null)
				return false;
		} else if (!getFreeformabcf().equals(other.getFreeformabcf()))
			return false;

		if (getFreeformabcflink() == null) {
			if (other.getFreeformabcflink() != null)
				return false;
		} else if (!getFreeformabcflink().equals(other.getFreeformabcflink()))
			return false;

		if (getFx() == null) {
			if (other.getFx() != null)
				return false;
		} else if (!getFx().equals(other.getFx()))
			return false;

		if (getFxlink() == null) {
			if (other.getFxlink() != null)
				return false;
		} else if (!getFxlink().equals(other.getFxlink()))
			return false;

		if (getGoogleplay() == null) {
			if (other.getGoogleplay() != null)
				return false;
		} else if (!getGoogleplay().equals(other.getGoogleplay()))
			return false;

		if (getGoogleplaylink() == null) {
			if (other.getGoogleplaylink() != null)
				return false;
		} else if (!getGoogleplaylink().equals(other.getGoogleplaylink()))
			return false;

		if (getHbo() == null) {
			if (other.getHbo() != null)
				return false;
		} else if (!getHbo().equals(other.getHbo()))
			return false;

		if (getHbolink() == null) {
			if (other.getHbolink() != null)
				return false;
		} else if (!getHbolink().equals(other.getHbolink()))
			return false;

		if (getHuluplus() == null) {
			if (other.getHuluplus() != null)
				return false;
		} else if (!getHuluplus().equals(other.getHuluplus()))
			return false;

		if (getHulupluslink() == null) {
			if (other.getHulupluslink() != null)
				return false;
		} else if (!getHulupluslink().equals(other.getHulupluslink()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getIfc() == null) {
			if (other.getIfc() != null)
				return false;
		} else if (!getIfc().equals(other.getIfc()))
			return false;

		if (getIfclink() == null) {
			if (other.getIfclink() != null)
				return false;
		} else if (!getIfclink().equals(other.getIfclink()))
			return false;

		if (getIncanceledas() == null) {
			if (other.getIncanceledas() != null)
				return false;
		} else if (!getIncanceledas().equals(other.getIncanceledas()))
			return false;

		if (getIncanceledaslink() == null) {
			if (other.getIncanceledaslink() != null)
				return false;
		} else if (!getIncanceledaslink().equals(other.getIncanceledaslink()))
			return false;

		if (getIntodos() == null) {
			if (other.getIntodos() != null)
				return false;
		} else if (!getIntodos().equals(other.getIntodos()))
			return false;

		if (getItunes() == null) {
			if (other.getItunes() != null)
				return false;
		} else if (!getItunes().equals(other.getItunes()))
			return false;

		if (getItuneslink() == null) {
			if (other.getItuneslink() != null)
				return false;
		} else if (!getItuneslink().equals(other.getItuneslink()))
			return false;

		if (getLastshow() == null) {
			if (other.getLastshow() != null)
				return false;
		} else if (!getLastshow().equals(other.getLastshow()))
			return false;

		if (getLatestinroamionpl() == null) {
			if (other.getLatestinroamionpl() != null)
				return false;
		} else if (!getLatestinroamionpl().equals(other.getLatestinroamionpl()))
			return false;

		if (getLep() == null) {
			if (other.getLep() != null)
				return false;
		} else if (!getLep().equals(other.getLep()))
			return false;

		if (getLs() == null) {
			if (other.getLs() != null)
				return false;
		} else if (!getLs().equals(other.getLs()))
			return false;

		if (getNatgeo() == null) {
			if (other.getNatgeo() != null)
				return false;
		} else if (!getNatgeo().equals(other.getNatgeo()))
			return false;

		if (getNatgeolink() == null) {
			if (other.getNatgeolink() != null)
				return false;
		} else if (!getNatgeolink().equals(other.getNatgeolink()))
			return false;

		if (getNbc() == null) {
			if (other.getNbc() != null)
				return false;
		} else if (!getNbc().equals(other.getNbc()))
			return false;

		if (getNbclink() == null) {
			if (other.getNbclink() != null)
				return false;
		} else if (!getNbclink().equals(other.getNbclink()))
			return false;

		if (getNetflix() == null) {
			if (other.getNetflix() != null)
				return false;
		} else if (!getNetflix().equals(other.getNetflix()))
			return false;

		if (getNetflixlink() == null) {
			if (other.getNetflixlink() != null)
				return false;
		} else if (!getNetflixlink().equals(other.getNetflixlink()))
			return false;

		if (getNetwork() == null) {
			if (other.getNetwork() != null)
				return false;
		} else if (!getNetwork().equals(other.getNetwork()))
			return false;

		if (getNetworklink() == null) {
			if (other.getNetworklink() != null)
				return false;
		} else if (!getNetworklink().equals(other.getNetworklink()))
			return false;

		if (getOnepasschan() == null) {
			if (other.getOnepasschan() != null)
				return false;
		} else if (!getOnepasschan().equals(other.getOnepasschan()))
			return false;

		if (getPbs() == null) {
			if (other.getPbs() != null)
				return false;
		} else if (!getPbs().equals(other.getPbs()))
			return false;

		if (getPbslink() == null) {
			if (other.getPbslink() != null)
				return false;
		} else if (!getPbslink().equals(other.getPbslink()))
			return false;

		if (getPremiere() == null) {
			if (other.getPremiere() != null)
				return false;
		} else if (!getPremiere().equals(other.getPremiere()))
			return false;

		if (getPremieredate() == null) {
			if (other.getPremieredate() != null)
				return false;
		} else if (!getPremieredate().equals(other.getPremieredate()))
			return false;

		if (getRow() == null) {
			if (other.getRow() != null)
				return false;
		} else if (!getRow().equals(other.getRow()))
			return false;

		if (getScience() == null) {
			if (other.getScience() != null)
				return false;
		} else if (!getScience().equals(other.getScience()))
			return false;

		if (getSciencelink() == null) {
			if (other.getSciencelink() != null)
				return false;
		} else if (!getSciencelink().equals(other.getSciencelink()))
			return false;

		if (getStatus() == null) {
			if (other.getStatus() != null)
				return false;
		} else if (!getStatus().equals(other.getStatus()))
			return false;

		if (getSyfy() == null) {
			if (other.getSyfy() != null)
				return false;
		} else if (!getSyfy().equals(other.getSyfy()))
			return false;

		if (getSyfylink() == null) {
			if (other.getSyfylink() != null)
				return false;
		} else if (!getSyfylink().equals(other.getSyfylink()))
			return false;

		if (getTnt() == null) {
			if (other.getTnt() != null)
				return false;
		} else if (!getTnt().equals(other.getTnt()))
			return false;

		if (getTntlink() == null) {
			if (other.getTntlink() != null)
				return false;
		} else if (!getTntlink().equals(other.getTntlink()))
			return false;

		if (getTododate() == null) {
			if (other.getTododate() != null)
				return false;
		} else if (!getTododate().equals(other.getTododate()))
			return false;

		if (getTvcom() == null) {
			if (other.getTvcom() != null)
				return false;
		} else if (!getTvcom().equals(other.getTvcom()))
			return false;

		if (getTvcomlink() == null) {
			if (other.getTvcomlink() != null)
				return false;
		} else if (!getTvcomlink().equals(other.getTvcomlink()))
			return false;

		if (getTwcondemand() == null) {
			if (other.getTwcondemand() != null)
				return false;
		} else if (!getTwcondemand().equals(other.getTwcondemand()))
			return false;

		if (getTwcondemandlink() == null) {
			if (other.getTwcondemandlink() != null)
				return false;
		} else if (!getTwcondemandlink().equals(other.getTwcondemandlink()))
			return false;

		if (getUsa() == null) {
			if (other.getUsa() != null)
				return false;
		} else if (!getUsa().equals(other.getUsa()))
			return false;

		if (getUsalink() == null) {
			if (other.getUsalink() != null)
				return false;
		} else if (!getUsalink().equals(other.getUsalink()))
			return false;

		if (getWatchedto() == null) {
			if (other.getWatchedto() != null)
				return false;
		} else if (!getWatchedto().equals(other.getWatchedto()))
			return false;

		if (getWep() == null) {
			if (other.getWep() != null)
				return false;
		} else if (!getWep().equals(other.getWep()))
			return false;

		if (getWs() == null) {
			if (other.getWs() != null)
				return false;
		} else if (!getWs().equals(other.getWs()))
			return false;

		if (getXbox() == null) {
			if (other.getXbox() != null)
				return false;
		} else if (!getXbox().equals(other.getXbox()))
			return false;

		if (getXboxlink() == null) {
			if (other.getXboxlink() != null)
				return false;
		} else if (!getXboxlink().equals(other.getXboxlink()))
			return false;

		if (getYoutube() == null) {
			if (other.getYoutube() != null)
				return false;
		} else if (!getYoutube().equals(other.getYoutube()))
			return false;

		if (getYoutubelink() == null) {
			if (other.getYoutubelink() != null)
				return false;
		} else if (!getYoutubelink().equals(other.getYoutubelink()))
			return false;

		return true;
	}

}
