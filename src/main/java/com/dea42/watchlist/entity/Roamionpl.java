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
 * Title: roamionpl Bean <br>
 * Description: Class for holding data from the roamionpl table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 * Table name: roamionpl<br>
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
 * roamionpl => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Entity
@Table(name = "`roamionpl`")
public class Roamionpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BitrateMbps")
	private Integer bitratembps;
	@Column(name = "Chan", length = 62)
	private String chan;
	@Column(name = "Channel", length = 16)
	private String channel;
	@Column(name = "Date")
	private Integer date;
	@Column(name = "Duration")
	private Integer duration;
	@Column(name = "Episode", length = 4)
	private String episode;
	@Column(name = "F", length = 62)
	private String f;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "InNetworksTab", length = 7)
	private String innetworkstab;
	@Column(name = "Isnew")
	private Integer isnew;
	@Column(name = "IsSeries")
	private Integer isseries;
	@Column(name = "Network", length = 33)
	private String network;
	@Column(name = "RowInShows")
	private Integer rowinshows;
	@Column(name = "Seriesep")
	private Integer seriesep;
	@Column(name = "Show", length = 53)
	private String show;
	@Column(name = "SizeGb")
	private Integer sizegb;
	@Column(name = "SortableDate")
	private Integer sortabledate;
	@Column(name = "SpChannel0NoSp", length = 1)
	private String spchannel0nosp;
	@Column(name = "Title", length = 69)
	private String title;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;
	@Column(name = "Watched", length = 6)
	private String watched;
	@Column(name = "Watchedtime")
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
	public Roamionpl(Integer bitratembps, String chan, String channel, Integer date, Integer duration, String episode, String f, Integer id, String innetworkstab, Integer isnew, Integer isseries, String network, Integer rowinshows, Integer seriesep, String show, Integer sizegb, Integer sortabledate, String spchannel0nosp, String title, String watched, Integer watchedtime) {
		this.bitratembps = bitratembps;
		this.chan = chan;
		this.channel = channel;
		this.date = date;
		this.duration = duration;
		this.episode = episode;
		this.f = f;
		this.id = id;
		this.innetworkstab = innetworkstab;
		this.isnew = isnew;
		this.isseries = isseries;
		this.network = network;
		this.rowinshows = rowinshows;
		this.seriesep = seriesep;
		this.show = show;
		this.sizegb = sizegb;
		this.sortabledate = sortabledate;
		this.spchannel0nosp = spchannel0nosp;
		this.title = title;
		this.watched = watched;
		this.watchedtime = watchedtime;
	}
	/**
	 * returns value of the BitrateMbps column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getBitratembps() {
		if (bitratembps == null)
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
	 * returns value of the Chan column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getChan() {
		return chan;
	}

	/**
	 * sets value of the Chan column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 62
	 */
	public void setChan(String newVal) {
		chan = newVal;
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
	public Integer getDuration() {
		if (duration == null)
	    	return 0;
		return duration.intValue();
	}

	/**
	 * sets value of the Duration column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setDuration(Integer newVal) {
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
	 * This field has a max length of 4
	 */
	public void setEpisode(String newVal) {
		episode = newVal;
	}

	/**
	 * returns value of the F column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getF() {
		return f;
	}

	/**
	 * sets value of the F column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 62
	 */
	public void setF(String newVal) {
		f = newVal;
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
	 * returns value of the InNetworksTab column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getInnetworkstab() {
		return innetworkstab;
	}

	/**
	 * sets value of the InNetworksTab column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 7
	 */
	public void setInnetworkstab(String newVal) {
		innetworkstab = newVal;
	}

	/**
	 * returns value of the Isnew column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getIsnew() {
		if (isnew == null)
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
	 * returns value of the IsSeries column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getIsseries() {
		if (isseries == null)
	    	return 0;
		return isseries.intValue();
	}

	/**
	 * sets value of the IsSeries column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setIsseries(Integer newVal) {
		isseries = newVal;
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
	 * This field has a max length of 33
	 */
	public void setNetwork(String newVal) {
		network = newVal;
	}

	/**
	 * returns value of the RowInShows column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getRowinshows() {
		if (rowinshows == null)
	    	return 0;
		return rowinshows.intValue();
	}

	/**
	 * sets value of the RowInShows column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setRowinshows(Integer newVal) {
		rowinshows = newVal;
	}

	/**
	 * returns value of the Seriesep column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSeriesep() {
		if (seriesep == null)
	    	return 0;
		return seriesep.intValue();
	}

	/**
	 * sets value of the Seriesep column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setSeriesep(Integer newVal) {
		seriesep = newVal;
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
	 * returns value of the SizeGb column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSizegb() {
		if (sizegb == null)
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
	 * returns value of the SpChannel0NoSp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getSpchannel0nosp() {
		return spchannel0nosp;
	}

	/**
	 * sets value of the SpChannel0NoSp column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setSpchannel0nosp(String newVal) {
		spchannel0nosp = newVal;
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
	 * This field has a max length of 69
	 */
	public void setTitle(String newVal) {
		title = newVal;
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
	 * returns value of the Watched column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getWatched() {
		return watched;
	}

	/**
	 * sets value of the Watched column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6
	 */
	public void setWatched(String newVal) {
		watched = newVal;
	}

	/**
	 * returns value of the Watchedtime column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getWatchedtime() {
		if (watchedtime == null)
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

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Roamionpl [");
		builder.append("bitratembps=").append(bitratembps);
		builder.append(", chan=").append(chan);
		builder.append(", channel=").append(channel);
		builder.append(", date=").append(date);
		builder.append(", duration=").append(duration);
		builder.append(", episode=").append(episode);
		builder.append(", f=").append(f);
		builder.append(", id=").append(id);
		builder.append(", innetworkstab=").append(innetworkstab);
		builder.append(", isnew=").append(isnew);
		builder.append(", isseries=").append(isseries);
		builder.append(", network=").append(network);
		builder.append(", rowinshows=").append(rowinshows);
		builder.append(", seriesep=").append(seriesep);
		builder.append(", show=").append(show);
		builder.append(", sizegb=").append(sizegb);
		builder.append(", sortabledate=").append(sortabledate);
		builder.append(", spchannel0nosp=").append(spchannel0nosp);
		builder.append(", title=").append(title);
		builder.append(", account=").append(account);
		builder.append(", watched=").append(watched);
		builder.append(", watchedtime=").append(watchedtime);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((bitratembps == null) ? 0 : bitratembps.hashCode());
		result = prime * result + ((chan == null) ? 0 : chan.hashCode());
		result = prime * result + ((channel == null) ? 0 : channel.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((episode == null) ? 0 : episode.hashCode());
		result = prime * result + ((f == null) ? 0 : f.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((innetworkstab == null) ? 0 : innetworkstab.hashCode());
		result = prime * result + ((isnew == null) ? 0 : isnew.hashCode());
		result = prime * result + ((isseries == null) ? 0 : isseries.hashCode());
		result = prime * result + ((network == null) ? 0 : network.hashCode());
		result = prime * result + ((rowinshows == null) ? 0 : rowinshows.hashCode());
		result = prime * result + ((seriesep == null) ? 0 : seriesep.hashCode());
		result = prime * result + ((show == null) ? 0 : show.hashCode());
		result = prime * result + ((sizegb == null) ? 0 : sizegb.hashCode());
		result = prime * result + ((sortabledate == null) ? 0 : sortabledate.hashCode());
		result = prime * result + ((spchannel0nosp == null) ? 0 : spchannel0nosp.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((watched == null) ? 0 : watched.hashCode());
		result = prime * result + ((watchedtime == null) ? 0 : watchedtime.hashCode());
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
		Roamionpl other = (Roamionpl) obj;

		if (getBitratembps() == null) {
			if (other.getBitratembps() != null)
				return false;
		} else if (!getBitratembps().equals(other.getBitratembps()))
			return false;

		if (getChan() == null) {
			if (other.getChan() != null)
				return false;
		} else if (!getChan().equals(other.getChan()))
			return false;

		if (getChannel() == null) {
			if (other.getChannel() != null)
				return false;
		} else if (!getChannel().equals(other.getChannel()))
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

		if (getEpisode() == null) {
			if (other.getEpisode() != null)
				return false;
		} else if (!getEpisode().equals(other.getEpisode()))
			return false;

		if (getF() == null) {
			if (other.getF() != null)
				return false;
		} else if (!getF().equals(other.getF()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getInnetworkstab() == null) {
			if (other.getInnetworkstab() != null)
				return false;
		} else if (!getInnetworkstab().equals(other.getInnetworkstab()))
			return false;

		if (getIsnew() == null) {
			if (other.getIsnew() != null)
				return false;
		} else if (!getIsnew().equals(other.getIsnew()))
			return false;

		if (getIsseries() == null) {
			if (other.getIsseries() != null)
				return false;
		} else if (!getIsseries().equals(other.getIsseries()))
			return false;

		if (getNetwork() == null) {
			if (other.getNetwork() != null)
				return false;
		} else if (!getNetwork().equals(other.getNetwork()))
			return false;

		if (getRowinshows() == null) {
			if (other.getRowinshows() != null)
				return false;
		} else if (!getRowinshows().equals(other.getRowinshows()))
			return false;

		if (getSeriesep() == null) {
			if (other.getSeriesep() != null)
				return false;
		} else if (!getSeriesep().equals(other.getSeriesep()))
			return false;

		if (getShow() == null) {
			if (other.getShow() != null)
				return false;
		} else if (!getShow().equals(other.getShow()))
			return false;

		if (getSizegb() == null) {
			if (other.getSizegb() != null)
				return false;
		} else if (!getSizegb().equals(other.getSizegb()))
			return false;

		if (getSortabledate() == null) {
			if (other.getSortabledate() != null)
				return false;
		} else if (!getSortabledate().equals(other.getSortabledate()))
			return false;

		if (getSpchannel0nosp() == null) {
			if (other.getSpchannel0nosp() != null)
				return false;
		} else if (!getSpchannel0nosp().equals(other.getSpchannel0nosp()))
			return false;

		if (getTitle() == null) {
			if (other.getTitle() != null)
				return false;
		} else if (!getTitle().equals(other.getTitle()))
			return false;

		if (getAccount() == null) {
			if (other.getAccount() != null)
				return false;
		} else if (!getAccount().equals(other.getAccount()))
			return false;

		if (getWatched() == null) {
			if (other.getWatched() != null)
				return false;
		} else if (!getWatched().equals(other.getWatched()))
			return false;

		if (getWatchedtime() == null) {
			if (other.getWatchedtime() != null)
				return false;
		} else if (!getWatchedtime().equals(other.getWatchedtime()))
			return false;

		return true;
	}

}
