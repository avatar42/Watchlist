package com.dea42.watchlist.form;

import java.io.Serializable;


import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Roamiosp;

import com.dea42.watchlist.entity.Account;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: roamiosp Form <br>
 * Description: Class for holding data from the roamiosp table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */

public class RoamiospForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=1)
	private String cancelled;
    @Length(max=14)
	private String channel;
    @Length(max=4)
	private String channelnum;
	private Integer dup;
	private Integer end;
	private Integer id;
    @Length(max=6)
	private String include;
    @Length(max=44)
	private String inshowsstatus;
    @Length(max=7)
	private String keep;
    @Length(max=13)
	private String network;
	private Integer num;
    @Length(max=2)
	private String ota;
	private Integer priority;
    @Length(max=13)
	private String record;
	private Integer row;
	private Integer season;
    @Length(max=53)
	private String show;
	private Integer start;
    @Length(max=10)
	private String station;
	private Account account;

	/**
	 * Basic constructor
	 */
	public RoamiospForm() {
	}

	/**
	 * Clones Roamiosp obj into form
	 *
	 * @param obj
	 */
	public static RoamiospForm getInstance(Roamiosp obj) {
		RoamiospForm form = new RoamiospForm();
		form.setCancelled(obj.getCancelled());
		form.setChannel(obj.getChannel());
		form.setChannelnum(obj.getChannelnum());
		form.setDup(obj.getDup());
		form.setEnd(obj.getEnd());
		form.setId(obj.getId());
		form.setInclude(obj.getInclude());
		form.setInshowsstatus(obj.getInshowsstatus());
		form.setKeep(obj.getKeep());
		form.setNetwork(obj.getNetwork());
		form.setNum(obj.getNum());
		form.setOta(obj.getOta());
		form.setPriority(obj.getPriority());
		form.setRecord(obj.getRecord());
		form.setRow(obj.getRow());
		form.setSeason(obj.getSeason());
		form.setShow(obj.getShow());
		form.setStart(obj.getStart());
		form.setStation(obj.getStation());
		form.setAccount(obj.getAccount());
		return form;
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
	 * This field has a max length of 1
	 */
	public void setCancelled(String newVal) {
		cancelled = newVal;
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
	 * This field has a max length of 14
	 */
	public void setChannel(String newVal) {
		channel = newVal;
	}

	/**
	 * returns value of the Channelnum column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getChannelnum() {
		return channelnum;
	}

	/**
	 * sets value of the Channelnum column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4
	 */
	public void setChannelnum(String newVal) {
		channelnum = newVal;
	}

	/**
	 * returns value of the Dup column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getDup() {
		if (dup == null)
	    	return 0;
		return dup.intValue();
	}

	/**
	 * sets value of the Dup column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setDup(Integer newVal) {
		dup = newVal;
	}

	/**
	 * returns value of the End column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getEnd() {
		if (end == null)
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
	 * This field has a max length of 6
	 */
	public void setInclude(String newVal) {
		include = newVal;
	}

	/**
	 * returns value of the InShowsStatus column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getInshowsstatus() {
		return inshowsstatus;
	}

	/**
	 * sets value of the InShowsStatus column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 44
	 */
	public void setInshowsstatus(String newVal) {
		inshowsstatus = newVal;
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
	 * This field has a max length of 7
	 */
	public void setKeep(String newVal) {
		keep = newVal;
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
	 * This field has a max length of 13
	 */
	public void setNetwork(String newVal) {
		network = newVal;
	}

	/**
	 * returns value of the Num column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getNum() {
		if (num == null)
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
	 * returns value of the Ota column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOta() {
		return ota;
	}

	/**
	 * sets value of the Ota column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 2
	 */
	public void setOta(String newVal) {
		ota = newVal;
	}

	/**
	 * returns value of the Priority column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getPriority() {
		if (priority == null)
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
	 * This field has a max length of 13
	 */
	public void setRecord(String newVal) {
		record = newVal;
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
	 * returns value of the Season column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSeason() {
		if (season == null)
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
	 * This field has a max length of 53
	 */
	public void setShow(String newVal) {
		show = newVal;
	}

	/**
	 * returns value of the Start column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getStart() {
		if (start == null)
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
	 * This field has a max length of 10
	 */
	public void setStation(String newVal) {
		station = newVal;
	}

	/**
	 * returns value of the Userid column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * sets value of the Userid column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setAccount(Account newVal) {
		account = newVal;
	}

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Roamiosp [");
		builder.append("cancelled=").append(cancelled);
		builder.append(", channel=").append(channel);
		builder.append(", channelnum=").append(channelnum);
		builder.append(", dup=").append(dup);
		builder.append(", end=").append(end);
		builder.append(", id=").append(id);
		builder.append(", include=").append(include);
		builder.append(", inshowsstatus=").append(inshowsstatus);
		builder.append(", keep=").append(keep);
		builder.append(", network=").append(network);
		builder.append(", num=").append(num);
		builder.append(", ota=").append(ota);
		builder.append(", priority=").append(priority);
		builder.append(", record=").append(record);
		builder.append(", row=").append(row);
		builder.append(", season=").append(season);
		builder.append(", show=").append(show);
		builder.append(", start=").append(start);
		builder.append(", station=").append(station);
		builder.append(", account=").append(account);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((cancelled == null) ? 0 : cancelled.hashCode());
		result = prime * result + ((channel == null) ? 0 : channel.hashCode());
		result = prime * result + ((channelnum == null) ? 0 : channelnum.hashCode());
		result = prime * result + ((dup == null) ? 0 : dup.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((include == null) ? 0 : include.hashCode());
		result = prime * result + ((inshowsstatus == null) ? 0 : inshowsstatus.hashCode());
		result = prime * result + ((keep == null) ? 0 : keep.hashCode());
		result = prime * result + ((network == null) ? 0 : network.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		result = prime * result + ((ota == null) ? 0 : ota.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((record == null) ? 0 : record.hashCode());
		result = prime * result + ((row == null) ? 0 : row.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + ((show == null) ? 0 : show.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((station == null) ? 0 : station.hashCode());
		result = prime * result + ((account == null) ? 0 : account.hashCode());
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
		Roamiosp other = (Roamiosp) obj;

		if (getCancelled() == null) {
			if (other.getCancelled() != null)
				return false;
		} else if (!getCancelled().equals(other.getCancelled()))
			return false;

		if (getChannel() == null) {
			if (other.getChannel() != null)
				return false;
		} else if (!getChannel().equals(other.getChannel()))
			return false;

		if (getChannelnum() == null) {
			if (other.getChannelnum() != null)
				return false;
		} else if (!getChannelnum().equals(other.getChannelnum()))
			return false;

		if (getDup() == null) {
			if (other.getDup() != null)
				return false;
		} else if (!getDup().equals(other.getDup()))
			return false;

		if (getEnd() == null) {
			if (other.getEnd() != null)
				return false;
		} else if (!getEnd().equals(other.getEnd()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getInclude() == null) {
			if (other.getInclude() != null)
				return false;
		} else if (!getInclude().equals(other.getInclude()))
			return false;

		if (getInshowsstatus() == null) {
			if (other.getInshowsstatus() != null)
				return false;
		} else if (!getInshowsstatus().equals(other.getInshowsstatus()))
			return false;

		if (getKeep() == null) {
			if (other.getKeep() != null)
				return false;
		} else if (!getKeep().equals(other.getKeep()))
			return false;

		if (getNetwork() == null) {
			if (other.getNetwork() != null)
				return false;
		} else if (!getNetwork().equals(other.getNetwork()))
			return false;

		if (getNum() == null) {
			if (other.getNum() != null)
				return false;
		} else if (!getNum().equals(other.getNum()))
			return false;

		if (getOta() == null) {
			if (other.getOta() != null)
				return false;
		} else if (!getOta().equals(other.getOta()))
			return false;

		if (getPriority() == null) {
			if (other.getPriority() != null)
				return false;
		} else if (!getPriority().equals(other.getPriority()))
			return false;

		if (getRecord() == null) {
			if (other.getRecord() != null)
				return false;
		} else if (!getRecord().equals(other.getRecord()))
			return false;

		if (getRow() == null) {
			if (other.getRow() != null)
				return false;
		} else if (!getRow().equals(other.getRow()))
			return false;

		if (getSeason() == null) {
			if (other.getSeason() != null)
				return false;
		} else if (!getSeason().equals(other.getSeason()))
			return false;

		if (getShow() == null) {
			if (other.getShow() != null)
				return false;
		} else if (!getShow().equals(other.getShow()))
			return false;

		if (getStart() == null) {
			if (other.getStart() != null)
				return false;
		} else if (!getStart().equals(other.getStart()))
			return false;

		if (getStation() == null) {
			if (other.getStation() != null)
				return false;
		} else if (!getStation().equals(other.getStation()))
			return false;

		if (getAccount() == null) {
			if (other.getAccount() != null)
				return false;
		} else if (!getAccount().equals(other.getAccount()))
			return false;

		return true;
	}

}
