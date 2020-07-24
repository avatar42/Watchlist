package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Title: ota Bean <br>
 * Description: Class for holding data from the ota table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
@Entity
@Table(name = "ota")
public class Ota implements Serializable {
private static final long serialVersionUID = 1L;

	@Column(name="Chan")
	private Integer chan;
	@Column(name="ChannelName", length=9)
	private String channelname;
	@Column(name="ChannelNumber")
	private Float channelnumber;
	@Column(name="Comments", length=31)
	private String comments;
	@Column(name="Direction", length=4)
	private String direction;
	@Column(name="Enabled", length=3)
	private String enabled;
	@Column(name="FccInfo", length=9)
	private String fccinfo;
	@Column(name="FccInfoLink", length=6)
	private String fccinfolink;
	@Column(name="Freq")
	private Integer freq;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="Lang", length=2)
	private String lang;
	@Column(name="Listed")
	private Integer listed;
	@Column(name="MyTivoAvgStrength")
	private Integer mytivoavgstrength;
	@Column(name="Network", length=8)
	private String network;
	@Column(name="Off", length=3)
	private String off;
	@Column(name="RecommendedAntenna", length=41)
	private String recommendedantenna;
	@Column(name="Rez", length=5)
	private String rez;
	@Column(name="Station", length=9)
	private String station;
	@Column(name="SubChan")
	private Integer subchan;
	@Column(name="TvFoolEstSignal", length=4)
	private String tvfoolestsignal;
	@Column(name="Watchable", length=4)
	private String watchable;

	/**
	 * Basic constructor
	 */
	public Ota() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Ota(Integer chan, String channelname, Float channelnumber, String comments, String direction, String enabled, String fccinfo, String fccinfolink, Integer freq, Integer id, String lang, Integer listed, Integer mytivoavgstrength, String network, String off, String recommendedantenna, String rez, String station, Integer subchan, String tvfoolestsignal, String watchable) {
		this.chan = chan;
		this.channelname = channelname;
		this.channelnumber = channelnumber;
		this.comments = comments;
		this.direction = direction;
		this.enabled = enabled;
		this.fccinfo = fccinfo;
		this.fccinfolink = fccinfolink;
		this.freq = freq;
		this.id = id;
		this.lang = lang;
		this.listed = listed;
		this.mytivoavgstrength = mytivoavgstrength;
		this.network = network;
		this.off = off;
		this.recommendedantenna = recommendedantenna;
		this.rez = rez;
		this.station = station;
		this.subchan = subchan;
		this.tvfoolestsignal = tvfoolestsignal;
		this.watchable = watchable;
	}
	/**
	 * returns value of the Chan column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getChan() {
		if (chan== null)
	    	return 0;
		return chan.intValue();
	}

	/**
	 * sets value of the Chan column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setChan(Integer newVal) {
		chan = newVal;
	}

	/**
	 * returns value of the ChannelName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getChannelname() {
		return channelname;
	}

	/**
	 * sets value of the ChannelName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 9, longer strings will be truncated
	 */
	public void setChannelname(String newVal) {
		if (channelname != null && channelname.length() > 9){
			channelname = newVal.substring(0,8);
		} else {
	    	channelname = newVal;
		}
	}

	/**
	 * returns value of the ChannelNumber column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Float getChannelnumber() {
		if (channelnumber== null)
	    	return 0.0f;
		return channelnumber.floatValue();
	}

	/**
	 * sets value of the ChannelNumber column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setChannelnumber(Float newVal) {
		channelnumber = newVal;
	}

	/**
	 * returns value of the Comments column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * sets value of the Comments column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 31, longer strings will be truncated
	 */
	public void setComments(String newVal) {
		if (comments != null && comments.length() > 31){
			comments = newVal.substring(0,30);
		} else {
	    	comments = newVal;
		}
	}

	/**
	 * returns value of the Direction column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * sets value of the Direction column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4, longer strings will be truncated
	 */
	public void setDirection(String newVal) {
		if (direction != null && direction.length() > 4){
			direction = newVal.substring(0,3);
		} else {
	    	direction = newVal;
		}
	}

	/**
	 * returns value of the Enabled column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEnabled() {
		return enabled;
	}

	/**
	 * sets value of the Enabled column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 3, longer strings will be truncated
	 */
	public void setEnabled(String newVal) {
		if (enabled != null && enabled.length() > 3){
			enabled = newVal.substring(0,2);
		} else {
	    	enabled = newVal;
		}
	}

	/**
	 * returns value of the FccInfo column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFccinfo() {
		return fccinfo;
	}

	/**
	 * sets value of the FccInfo column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 9, longer strings will be truncated
	 */
	public void setFccinfo(String newVal) {
		if (fccinfo != null && fccinfo.length() > 9){
			fccinfo = newVal.substring(0,8);
		} else {
	    	fccinfo = newVal;
		}
	}

	/**
	 * returns value of the FccInfoLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFccinfolink() {
		return fccinfolink;
	}

	/**
	 * sets value of the FccInfoLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6, longer strings will be truncated
	 */
	public void setFccinfolink(String newVal) {
		if (fccinfolink != null && fccinfolink.length() > 6){
			fccinfolink = newVal.substring(0,5);
		} else {
	    	fccinfolink = newVal;
		}
	}

	/**
	 * returns value of the Freq column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getFreq() {
		if (freq== null)
	    	return 0;
		return freq.intValue();
	}

	/**
	 * sets value of the Freq column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setFreq(Integer newVal) {
		freq = newVal;
	}

	/**
	 * returns value of the id column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getId() {
		if (id== null)
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
	 * returns value of the Lang column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * sets value of the Lang column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 2, longer strings will be truncated
	 */
	public void setLang(String newVal) {
		if (lang != null && lang.length() > 2){
			lang = newVal.substring(0,1);
		} else {
	    	lang = newVal;
		}
	}

	/**
	 * returns value of the Listed column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getListed() {
		if (listed== null)
	    	return 0;
		return listed.intValue();
	}

	/**
	 * sets value of the Listed column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setListed(Integer newVal) {
		listed = newVal;
	}

	/**
	 * returns value of the MyTivoAvgStrength column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getMytivoavgstrength() {
		if (mytivoavgstrength== null)
	    	return 0;
		return mytivoavgstrength.intValue();
	}

	/**
	 * sets value of the MyTivoAvgStrength column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setMytivoavgstrength(Integer newVal) {
		mytivoavgstrength = newVal;
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
	 * This field has a max length of 8, longer strings will be truncated
	 */
	public void setNetwork(String newVal) {
		if (network != null && network.length() > 8){
			network = newVal.substring(0,7);
		} else {
	    	network = newVal;
		}
	}

	/**
	 * returns value of the Off column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOff() {
		return off;
	}

	/**
	 * sets value of the Off column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 3, longer strings will be truncated
	 */
	public void setOff(String newVal) {
		if (off != null && off.length() > 3){
			off = newVal.substring(0,2);
		} else {
	    	off = newVal;
		}
	}

	/**
	 * returns value of the RecommendedAntenna column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRecommendedantenna() {
		return recommendedantenna;
	}

	/**
	 * sets value of the RecommendedAntenna column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 41, longer strings will be truncated
	 */
	public void setRecommendedantenna(String newVal) {
		if (recommendedantenna != null && recommendedantenna.length() > 41){
			recommendedantenna = newVal.substring(0,40);
		} else {
	    	recommendedantenna = newVal;
		}
	}

	/**
	 * returns value of the Rez column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRez() {
		return rez;
	}

	/**
	 * sets value of the Rez column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 5, longer strings will be truncated
	 */
	public void setRez(String newVal) {
		if (rez != null && rez.length() > 5){
			rez = newVal.substring(0,4);
		} else {
	    	rez = newVal;
		}
	}

	/**
	 * returns value of the Station column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getStation() {
		return station;
	}

	/**
	 * sets value of the Station column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 9, longer strings will be truncated
	 */
	public void setStation(String newVal) {
		if (station != null && station.length() > 9){
			station = newVal.substring(0,8);
		} else {
	    	station = newVal;
		}
	}

	/**
	 * returns value of the SubChan column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSubchan() {
		if (subchan== null)
	    	return 0;
		return subchan.intValue();
	}

	/**
	 * sets value of the SubChan column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setSubchan(Integer newVal) {
		subchan = newVal;
	}

	/**
	 * returns value of the TvFoolEstSignal column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTvfoolestsignal() {
		return tvfoolestsignal;
	}

	/**
	 * sets value of the TvFoolEstSignal column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4, longer strings will be truncated
	 */
	public void setTvfoolestsignal(String newVal) {
		if (tvfoolestsignal != null && tvfoolestsignal.length() > 4){
			tvfoolestsignal = newVal.substring(0,3);
		} else {
	    	tvfoolestsignal = newVal;
		}
	}

	/**
	 * returns value of the Watchable column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getWatchable() {
		return watchable;
	}

	/**
	 * sets value of the Watchable column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4, longer strings will be truncated
	 */
	public void setWatchable(String newVal) {
		if (watchable != null && watchable.length() > 4){
			watchable = newVal.substring(0,3);
		} else {
	    	watchable = newVal;
		}
	}



}
