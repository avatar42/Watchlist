package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Title: roamionpl Bean <br>
 * Description: Class for holding data from the roamionpl table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
@Entity
@Table(name = "roamionpl")
public class Roamionpl implements Serializable {
private static final long serialVersionUID = 1L;

	@Column(name="BitrateMbps")
	private Integer bitratembps;
	@Column(name="Channel", length=16)
	private String channel;
	@Column(name="Date")
	private String date;
	@Column(name="Duration")
	private String duration;
	@Column(name="Episode", length=4)
	private String episode;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="Isnew")
	private Integer isnew;
	@Column(name="Show", length=49)
	private String show;
	@Column(name="SizeGb")
	private Integer sizegb;
	@Column(name="SortableDate")
	private Integer sortabledate;
	@Column(name="Title", length=71)
	private String title;
	@Column(name="Watchedtime")
	private Integer watchedtime;

	/**
	 * Basic constructor
	 */
	public Roamionpl() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Roamionpl(Integer bitratembps, String channel, String date, String duration, String episode, Integer id, Integer isnew, String show, Integer sizegb, Integer sortabledate, String title, Integer watchedtime) {
		this.bitratembps = bitratembps;
		this.channel = channel;
		this.date = date;
		this.duration = duration;
		this.episode = episode;
		this.id = id;
		this.isnew = isnew;
		this.show = show;
		this.sizegb = sizegb;
		this.sortabledate = sortabledate;
		this.title = title;
		this.watchedtime = watchedtime;
	}
	/**
	 * returns value of the BitrateMbps column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getBitratembps() {
		if (bitratembps== null)
	    	return 0;
		return bitratembps.intValue();
	}

	/**
	 * sets value of the BitrateMbps column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setBitratembps(Integer newVal) {
		bitratembps = newVal;
	}

	/**
	 * returns value of the Channel column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * sets value of the Channel column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 16, longer strings will be truncated
	 */
	public void setChannel(String newVal) {
		if (channel != null && channel.length() > 16){
			channel = newVal.substring(0,15);
		} else {
	    	channel = newVal;
		}
	}

	/**
	 * returns value of the Date column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getDate() {
		return date;
	}

	/**
	 * sets value of the Date column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setDate(String newVal) {
		date = newVal;
	}

	/**
	 * returns value of the Duration column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * sets value of the Duration column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setDuration(String newVal) {
		duration = newVal;
	}

	/**
	 * returns value of the Episode column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpisode() {
		return episode;
	}

	/**
	 * sets value of the Episode column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4, longer strings will be truncated
	 */
	public void setEpisode(String newVal) {
		if (episode != null && episode.length() > 4){
			episode = newVal.substring(0,3);
		} else {
	    	episode = newVal;
		}
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
	 * returns value of the Isnew column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getIsnew() {
		if (isnew== null)
	    	return 0;
		return isnew.intValue();
	}

	/**
	 * sets value of the Isnew column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setIsnew(Integer newVal) {
		isnew = newVal;
	}

	/**
	 * returns value of the Show column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getShow() {
		return show;
	}

	/**
	 * sets value of the Show column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 49, longer strings will be truncated
	 */
	public void setShow(String newVal) {
		if (show != null && show.length() > 49){
			show = newVal.substring(0,48);
		} else {
	    	show = newVal;
		}
	}

	/**
	 * returns value of the SizeGb column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSizegb() {
		if (sizegb== null)
	    	return 0;
		return sizegb.intValue();
	}

	/**
	 * sets value of the SizeGb column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setSizegb(Integer newVal) {
		sizegb = newVal;
	}

	/**
	 * returns value of the SortableDate column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSortabledate() {
		if (sortabledate== null)
	    	return 0;
		return sortabledate.intValue();
	}

	/**
	 * sets value of the SortableDate column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setSortabledate(Integer newVal) {
		sortabledate = newVal;
	}

	/**
	 * returns value of the Title column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * sets value of the Title column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 71, longer strings will be truncated
	 */
	public void setTitle(String newVal) {
		if (title != null && title.length() > 71){
			title = newVal.substring(0,70);
		} else {
	    	title = newVal;
		}
	}

	/**
	 * returns value of the Watchedtime column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getWatchedtime() {
		if (watchedtime== null)
	    	return 0;
		return watchedtime.intValue();
	}

	/**
	 * sets value of the Watchedtime column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setWatchedtime(Integer newVal) {
		watchedtime = newVal;
	}



}
