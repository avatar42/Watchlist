package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Title: cablecard Bean <br>
 * Description: Class for holding data from the cablecard table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@Entity
@Table(name = "cablecard")
public class Cablecard implements Serializable {
private static final long serialVersionUID = 1L;

	@Column(name="ChannelName", length=12)
	private String channelname;
	@Column(name="ChannelNumber")
	private Integer channelnumber;
	@Column(name="Colh")
	private Integer colh;
	@Column(name="Dt")
	private Integer dt;
	@Column(name="Hd")
	private Integer hd;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="InNpl")
	private Integer innpl;
	@Column(name="Lang", length=2)
	private String lang;
	@Column(name="Net", length=12)
	private String net;
	@Column(name="Od", length=20)
	private String od;
	@Column(name="Receiving", length=3)
	private String receiving;
	@Column(name="ShortField", length=12)
	private String shortfield;

	/**
	 * Basic constructor
	 */
	public Cablecard() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Cablecard(String channelname, Integer channelnumber, Integer colh, Integer dt, Integer hd, Integer id, Integer innpl, String lang, String net, String od, String receiving, String shortfield) {
		this.channelname = channelname;
		this.channelnumber = channelnumber;
		this.colh = colh;
		this.dt = dt;
		this.hd = hd;
		this.id = id;
		this.innpl = innpl;
		this.lang = lang;
		this.net = net;
		this.od = od;
		this.receiving = receiving;
		this.shortfield = shortfield;
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
	 * This field has a max length of 12, longer strings will be truncated
	 */
	public void setChannelname(String newVal) {
		if (channelname != null && channelname.length() > 12){
			channelname = newVal.substring(0,11);
		} else {
	    	channelname = newVal;
		}
	}

	/**
	 * returns value of the ChannelNumber column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getChannelnumber() {
		if (channelnumber== null)
	    	return 0;
		return channelnumber.intValue();
	}

	/**
	 * sets value of the ChannelNumber column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setChannelnumber(Integer newVal) {
		channelnumber = newVal;
	}

	/**
	 * returns value of the Colh column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getColh() {
		if (colh== null)
	    	return 0;
		return colh.intValue();
	}

	/**
	 * sets value of the Colh column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setColh(Integer newVal) {
		colh = newVal;
	}

	/**
	 * returns value of the Dt column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getDt() {
		if (dt== null)
	    	return 0;
		return dt.intValue();
	}

	/**
	 * sets value of the Dt column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setDt(Integer newVal) {
		dt = newVal;
	}

	/**
	 * returns value of the Hd column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getHd() {
		if (hd== null)
	    	return 0;
		return hd.intValue();
	}

	/**
	 * sets value of the Hd column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setHd(Integer newVal) {
		hd = newVal;
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
	 * returns value of the InNpl column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getInnpl() {
		if (innpl== null)
	    	return 0;
		return innpl.intValue();
	}

	/**
	 * sets value of the InNpl column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setInnpl(Integer newVal) {
		innpl = newVal;
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
	 * returns value of the Net column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNet() {
		return net;
	}

	/**
	 * sets value of the Net column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 12, longer strings will be truncated
	 */
	public void setNet(String newVal) {
		if (net != null && net.length() > 12){
			net = newVal.substring(0,11);
		} else {
	    	net = newVal;
		}
	}

	/**
	 * returns value of the Od column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOd() {
		return od;
	}

	/**
	 * sets value of the Od column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 20, longer strings will be truncated
	 */
	public void setOd(String newVal) {
		if (od != null && od.length() > 20){
			od = newVal.substring(0,19);
		} else {
	    	od = newVal;
		}
	}

	/**
	 * returns value of the Receiving column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getReceiving() {
		return receiving;
	}

	/**
	 * sets value of the Receiving column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 3, longer strings will be truncated
	 */
	public void setReceiving(String newVal) {
		if (receiving != null && receiving.length() > 3){
			receiving = newVal.substring(0,2);
		} else {
	    	receiving = newVal;
		}
	}

	/**
	 * returns value of the ShortField column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getShortfield() {
		return shortfield;
	}

	/**
	 * sets value of the ShortField column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 12, longer strings will be truncated
	 */
	public void setShortfield(String newVal) {
		if (shortfield != null && shortfield.length() > 12){
			shortfield = newVal.substring(0,11);
		} else {
	    	shortfield = newVal;
		}
	}

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("channelname= " + channelname+'\n');
		sb.append("channelnumber= " + channelnumber+'\n');
		sb.append("colh= " + colh+'\n');
		sb.append("dt= " + dt+'\n');
		sb.append("hd= " + hd+'\n');
		sb.append("id= " + id+'\n');
		sb.append("innpl= " + innpl+'\n');
		sb.append("lang= " + lang+'\n');
		sb.append("net= " + net+'\n');
		sb.append("od= " + od+'\n');
		sb.append("receiving= " + receiving+'\n');
		sb.append("shortfield= " + shortfield+'\n');
		return sb.toString();
	}


}
