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
 * Title: roamiotodo Bean <br>
 * Description: Class for holding data from the roamiotodo table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 * Table name: roamiotodo<br>
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
 * roamiotodo => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Entity
@Table(name = "`roamiotodo`")
public class Roamiotodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Channel", length = 16)
	private String channel;
	@Column(name = "Coli", length = 1)
	private String coli;
	@Column(name = "Date")
	private Integer date;
	@Column(name = "Duration", length = 4)
	private String duration;
	@Column(name = "Ep")
	private Integer ep;
	@Column(name = "EpDate")
	private Integer epdate;
	@Column(name = "Episode", length = 24)
	private String episode;
	@Column(name = "EpisodeName", length = 21)
	private String episodename;
	@Column(name = "Epname2", length = 2)
	private String epname2;
	@Column(name = "Epname3", length = 4)
	private String epname3;
	@Column(name = "EpNum", length = 20)
	private String epnum;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Show", length = 102)
	private String show;
	@Column(name = "ShowName", length = 78)
	private String showname;
	@Column(name = "ShowTrimmed", length = 78)
	private String showtrimmed;
	@Column(name = "SortableDate")
	private Integer sortabledate;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;

	/**
	 * Basic constructor
	 */
	public Roamiotodo() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Roamiotodo(String channel, String coli, Integer date, String duration, Integer ep, Integer epdate, String episode, String episodename, String epname2, String epname3, String epnum, Integer id, String show, String showname, String showtrimmed, Integer sortabledate) {
		this.channel = channel;
		this.coli = coli;
		this.date = date;
		this.duration = duration;
		this.ep = ep;
		this.epdate = epdate;
		this.episode = episode;
		this.episodename = episodename;
		this.epname2 = epname2;
		this.epname3 = epname3;
		this.epnum = epnum;
		this.id = id;
		this.show = show;
		this.showname = showname;
		this.showtrimmed = showtrimmed;
		this.sortabledate = sortabledate;
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
	 * This field has a max length of 16
	 */
	public void setChannel(String newVal) {
		channel = newVal;
	}

	/**
	 * returns value of the Coli column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getColi() {
		return coli;
	}

	/**
	 * sets value of the Coli column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setColi(String newVal) {
		coli = newVal;
	}

	/**
	 * returns value of the Date column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getDate() {
		if (date == null)
	    	return 0;
		return date.intValue();
	}

	/**
	 * sets value of the Date column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setDate(Integer newVal) {
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
	 * This field has a max length of 4
	 */
	public void setDuration(String newVal) {
		duration = newVal;
	}

	/**
	 * returns value of the Ep column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getEp() {
		if (ep == null)
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
	 * returns value of the EpDate column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getEpdate() {
		if (epdate == null)
	    	return 0;
		return epdate.intValue();
	}

	/**
	 * sets value of the EpDate column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setEpdate(Integer newVal) {
		epdate = newVal;
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
	 * This field has a max length of 24
	 */
	public void setEpisode(String newVal) {
		episode = newVal;
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
	 * This field has a max length of 21
	 */
	public void setEpisodename(String newVal) {
		episodename = newVal;
	}

	/**
	 * returns value of the Epname2 column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpname2() {
		return epname2;
	}

	/**
	 * sets value of the Epname2 column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 2
	 */
	public void setEpname2(String newVal) {
		epname2 = newVal;
	}

	/**
	 * returns value of the Epname3 column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpname3() {
		return epname3;
	}

	/**
	 * sets value of the Epname3 column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4
	 */
	public void setEpname3(String newVal) {
		epname3 = newVal;
	}

	/**
	 * returns value of the EpNum column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpnum() {
		return epnum;
	}

	/**
	 * sets value of the EpNum column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 20
	 */
	public void setEpnum(String newVal) {
		epnum = newVal;
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
	 * This field has a max length of 102
	 */
	public void setShow(String newVal) {
		show = newVal;
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
	 * This field has a max length of 78
	 */
	public void setShowname(String newVal) {
		showname = newVal;
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
	 * This field has a max length of 78
	 */
	public void setShowtrimmed(String newVal) {
		showtrimmed = newVal;
	}

	/**
	 * returns value of the SortableDate column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSortabledate() {
		if (sortabledate == null)
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
		builder.append("Roamiotodo [");
		builder.append("channel=").append(channel);
		builder.append(", coli=").append(coli);
		builder.append(", date=").append(date);
		builder.append(", duration=").append(duration);
		builder.append(", ep=").append(ep);
		builder.append(", epdate=").append(epdate);
		builder.append(", episode=").append(episode);
		builder.append(", episodename=").append(episodename);
		builder.append(", epname2=").append(epname2);
		builder.append(", epname3=").append(epname3);
		builder.append(", epnum=").append(epnum);
		builder.append(", id=").append(id);
		builder.append(", show=").append(show);
		builder.append(", showname=").append(showname);
		builder.append(", showtrimmed=").append(showtrimmed);
		builder.append(", sortabledate=").append(sortabledate);
		builder.append(", account=").append(account);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((channel == null) ? 0 : channel.hashCode());
		result = prime * result + ((coli == null) ? 0 : coli.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((ep == null) ? 0 : ep.hashCode());
		result = prime * result + ((epdate == null) ? 0 : epdate.hashCode());
		result = prime * result + ((episode == null) ? 0 : episode.hashCode());
		result = prime * result + ((episodename == null) ? 0 : episodename.hashCode());
		result = prime * result + ((epname2 == null) ? 0 : epname2.hashCode());
		result = prime * result + ((epname3 == null) ? 0 : epname3.hashCode());
		result = prime * result + ((epnum == null) ? 0 : epnum.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((show == null) ? 0 : show.hashCode());
		result = prime * result + ((showname == null) ? 0 : showname.hashCode());
		result = prime * result + ((showtrimmed == null) ? 0 : showtrimmed.hashCode());
		result = prime * result + ((sortabledate == null) ? 0 : sortabledate.hashCode());
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
		Roamiotodo other = (Roamiotodo) obj;

		if (getChannel() == null) {
			if (other.getChannel() != null)
				return false;
		} else if (!getChannel().equals(other.getChannel()))
			return false;

		if (getColi() == null) {
			if (other.getColi() != null)
				return false;
		} else if (!getColi().equals(other.getColi()))
			return false;

		if (getDate() == null) {
			if (other.getDate() != null)
				return false;
		} else if (!getDate().equals(other.getDate()))
			return false;

		if (getDuration() == null) {
			if (other.getDuration() != null)
				return false;
		} else if (!getDuration().equals(other.getDuration()))
			return false;

		if (getEp() == null) {
			if (other.getEp() != null)
				return false;
		} else if (!getEp().equals(other.getEp()))
			return false;

		if (getEpdate() == null) {
			if (other.getEpdate() != null)
				return false;
		} else if (!getEpdate().equals(other.getEpdate()))
			return false;

		if (getEpisode() == null) {
			if (other.getEpisode() != null)
				return false;
		} else if (!getEpisode().equals(other.getEpisode()))
			return false;

		if (getEpisodename() == null) {
			if (other.getEpisodename() != null)
				return false;
		} else if (!getEpisodename().equals(other.getEpisodename()))
			return false;

		if (getEpname2() == null) {
			if (other.getEpname2() != null)
				return false;
		} else if (!getEpname2().equals(other.getEpname2()))
			return false;

		if (getEpname3() == null) {
			if (other.getEpname3() != null)
				return false;
		} else if (!getEpname3().equals(other.getEpname3()))
			return false;

		if (getEpnum() == null) {
			if (other.getEpnum() != null)
				return false;
		} else if (!getEpnum().equals(other.getEpnum()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getShow() == null) {
			if (other.getShow() != null)
				return false;
		} else if (!getShow().equals(other.getShow()))
			return false;

		if (getShowname() == null) {
			if (other.getShowname() != null)
				return false;
		} else if (!getShowname().equals(other.getShowname()))
			return false;

		if (getShowtrimmed() == null) {
			if (other.getShowtrimmed() != null)
				return false;
		} else if (!getShowtrimmed().equals(other.getShowtrimmed()))
			return false;

		if (getSortabledate() == null) {
			if (other.getSortabledate() != null)
				return false;
		} else if (!getSortabledate().equals(other.getSortabledate()))
			return false;

		if (getAccount() == null) {
			if (other.getAccount() != null)
				return false;
		} else if (!getAccount().equals(other.getAccount()))
			return false;

		return true;
	}

}
