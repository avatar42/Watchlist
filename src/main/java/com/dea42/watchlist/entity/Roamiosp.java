package com.dea42.watchlist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Title: roamiosp Bean <br>
 * Description: Class for holding data from the roamiosp table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 * Table name: roamiosp<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> * Userid => foreign key column name<br>
 * null => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Account => primary key table name being imported <br>
 * id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * roamiosp => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Entity
@Table(name = "`roamiosp`")
public class Roamiosp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Cancelled", length = 1)
	private String cancelled;
	@Column(name = "Channel", length = 14)
	private String channel;
	@Column(name = "Channelnum", length = 4)
	private String channelnum;
	@Column(name = "Dup")
	private Integer dup;
	@Column(name = "End")
	private Integer end;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Include", length = 6)
	private String include;
	@Column(name = "InShowsStatus", length = 44)
	private String inshowsstatus;
	@Column(name = "Keep", length = 7)
	private String keep;
	@Column(name = "Network", length = 13)
	private String network;
	@Column(name = "Num")
	private Integer num;
	@Column(name = "Ota", length = 2)
	private String ota;
	@Column(name = "Priority")
	private Integer priority;
	@Column(name = "Record", length = 13)
	private String record;
	@Column(name = "Row")
	private Integer row;
	@Column(name = "Season")
	private Integer season;
	@Column(name = "Show", length = 53)
	private String show;
	@Column(name = "Start")
	private Integer start;
	@Column(name = "Station", length = 10)
	private String station;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;

	/**
	 * Basic constructor
	 */
	public Roamiosp() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Roamiosp(String cancelled, String channel, String channelnum, Integer dup, Integer end, Integer id, String include, String inshowsstatus, String keep, String network, Integer num, String ota, Integer priority, String record, Integer row, Integer season, String show, Integer start, String station) {
		this.cancelled = cancelled;
		this.channel = channel;
		this.channelnum = channelnum;
		this.dup = dup;
		this.end = end;
		this.id = id;
		this.include = include;
		this.inshowsstatus = inshowsstatus;
		this.keep = keep;
		this.network = network;
		this.num = num;
		this.ota = ota;
		this.priority = priority;
		this.record = record;
		this.row = row;
		this.season = season;
		this.show = show;
		this.start = start;
		this.station = station;
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
