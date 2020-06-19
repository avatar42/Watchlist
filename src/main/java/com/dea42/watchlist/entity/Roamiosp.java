package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Title: roamiosp Bean <br>
 * Description: Class for holding data from the roamiosp table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@Entity
@Table(name = "roamiosp")
public class Roamiosp implements Serializable {
private static final long serialVersionUID = 1L;

	@Column(name="Channel", length=14)
private String channel;
	@Column(name="End")
private Integer end;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
private Integer id;
	@Column(name="Include", length=6)
private String include;
	@Column(name="Keep", length=7)
private String keep;
	@Column(name="Num")
private Integer num;
	@Column(name="Priority")
private Integer priority;
	@Column(name="Record", length=13)
private String record;
	@Column(name="Season")
private Integer season;
	@Column(name="Show", length=53)
private String show;
	@Column(name="Start")
private Integer start;

/**
 * Basic constructor
 */
public Roamiosp() {
}

/**
 * Full constructor
 *
 */
	public Roamiosp(String channel, Integer end, Integer id, String include, String keep, Integer num, Integer priority, String record, Integer season, String show, Integer start) {
		this.channel = channel;
		this.end = end;
		this.id = id;
		this.include = include;
		this.keep = keep;
		this.num = num;
		this.priority = priority;
		this.record = record;
		this.season = season;
		this.show = show;
		this.start = start;
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
	 * This field has a max length of 14, longer strings will be truncated
	 */
	public void setChannel(String newVal) {
		if (channel != null && channel.length() > 14){
	    channel = newVal.substring(0,13);
	} else {
	    channel = newVal;
	}
	}

	/**
	 * returns value of the End column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getEnd() {
	if (end== null)
	    return 0;
	return end.intValue();
	}

	/**
	 * sets value of the End column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setEnd(Integer newVal) {
	end = newVal;
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
	 * returns value of the Include column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getInclude() {
	return include;
	}

	/**
	 * sets value of the Include column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6, longer strings will be truncated
	 */
	public void setInclude(String newVal) {
		if (include != null && include.length() > 6){
	    include = newVal.substring(0,5);
	} else {
	    include = newVal;
	}
	}

	/**
	 * returns value of the Keep column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getKeep() {
	return keep;
	}

	/**
	 * sets value of the Keep column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 7, longer strings will be truncated
	 */
	public void setKeep(String newVal) {
		if (keep != null && keep.length() > 7){
	    keep = newVal.substring(0,6);
	} else {
	    keep = newVal;
	}
	}

	/**
	 * returns value of the Num column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getNum() {
	if (num== null)
	    return 0;
	return num.intValue();
	}

	/**
	 * sets value of the Num column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setNum(Integer newVal) {
	num = newVal;
	}

	/**
	 * returns value of the Priority column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getPriority() {
	if (priority== null)
	    return 0;
	return priority.intValue();
	}

	/**
	 * sets value of the Priority column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setPriority(Integer newVal) {
	priority = newVal;
	}

	/**
	 * returns value of the Record column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRecord() {
	return record;
	}

	/**
	 * sets value of the Record column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 13, longer strings will be truncated
	 */
	public void setRecord(String newVal) {
		if (record != null && record.length() > 13){
	    record = newVal.substring(0,12);
	} else {
	    record = newVal;
	}
	}

	/**
	 * returns value of the Season column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSeason() {
	if (season== null)
	    return 0;
	return season.intValue();
	}

	/**
	 * sets value of the Season column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setSeason(Integer newVal) {
	season = newVal;
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
	 * This field has a max length of 53, longer strings will be truncated
	 */
	public void setShow(String newVal) {
		if (show != null && show.length() > 53){
	    show = newVal.substring(0,52);
	} else {
	    show = newVal;
	}
	}

	/**
	 * returns value of the Start column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getStart() {
	if (start== null)
	    return 0;
	return start.intValue();
	}

	/**
	 * sets value of the Start column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setStart(Integer newVal) {
	start = newVal;
	}


}
