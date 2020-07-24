package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Title: roamiotodo Bean <br>
 * Description: Class for holding data from the roamiotodo table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
@Entity
@Table(name = "roamiotodo")
public class Roamiotodo implements Serializable {
private static final long serialVersionUID = 1L;

	@Column(name="Channel", length=16)
	private String channel;
	@Column(name="Date")
	private String date;
	@Column(name="Duration", length=4)
	private String duration;
	@Column(name="Ep")
	private Integer ep;
	@Column(name="EpisodeName", length=1)
	private String episodename;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="ShowName", length=67)
	private String showname;
	@Column(name="ShowTrimmed", length=66)
	private String showtrimmed;

	/**
	 * Basic constructor
	 */
	public Roamiotodo() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Roamiotodo(String channel, String date, String duration, Integer ep, String episodename, Integer id, String showname, String showtrimmed) {
		this.channel = channel;
		this.date = date;
		this.duration = duration;
		this.ep = ep;
		this.episodename = episodename;
		this.id = id;
		this.showname = showname;
		this.showtrimmed = showtrimmed;
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
	 * This field has a max length of 4, longer strings will be truncated
	 */
	public void setDuration(String newVal) {
		if (duration != null && duration.length() > 4){
			duration = newVal.substring(0,3);
		} else {
	    	duration = newVal;
		}
	}

	/**
	 * returns value of the Ep column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getEp() {
		if (ep== null)
	    	return 0;
		return ep.intValue();
	}

	/**
	 * sets value of the Ep column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setEp(Integer newVal) {
		ep = newVal;
	}

	/**
	 * returns value of the EpisodeName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpisodename() {
		return episodename;
	}

	/**
	 * sets value of the EpisodeName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1, longer strings will be truncated
	 */
	public void setEpisodename(String newVal) {
		if (episodename != null && episodename.length() > 1){
			episodename = newVal.substring(0,0);
		} else {
	    	episodename = newVal;
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
	 * returns value of the ShowName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getShowname() {
		return showname;
	}

	/**
	 * sets value of the ShowName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 67, longer strings will be truncated
	 */
	public void setShowname(String newVal) {
		if (showname != null && showname.length() > 67){
			showname = newVal.substring(0,66);
		} else {
	    	showname = newVal;
		}
	}

	/**
	 * returns value of the ShowTrimmed column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getShowtrimmed() {
		return showtrimmed;
	}

	/**
	 * sets value of the ShowTrimmed column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 66, longer strings will be truncated
	 */
	public void setShowtrimmed(String newVal) {
		if (showtrimmed != null && showtrimmed.length() > 66){
			showtrimmed = newVal.substring(0,65);
		} else {
	    	showtrimmed = newVal;
		}
	}



}
