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
 * Title: showsuser Bean <br>
 * Description: Class for holding data from the showsuser table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 * Table name: showsuser<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> * ShowsId => foreign key column name<br>
 * null => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Shows => primary key table name being imported <br>
 * id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * showsuser => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> * Userid => foreign key column name<br>
 * null => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Account => primary key table name being imported <br>
 * id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * showsuser => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Entity
@Table(name = "`showsuser`")
public class Showsuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BestExperience", length = 17)
	private String bestexperience;
	@Column(name = "BestExperienceLink", length = 306)
	private String bestexperiencelink;
	@Column(name = "Comment", length = 181)
	private String comment;
	@Column(name = "CommentLink", length = 228)
	private String commentlink;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Imdb", length = 1)
	private String imdb;
	@Column(name = "ImdbLink", length = 63)
	private String imdblink;
	@Column(name = "InRokuFeed", length = 1)
	private String inrokufeed;
	@Column(name = "InShowRssAs", length = 47)
	private String inshowrssas;
	@Column(name = "InShowRssAsLink", length = 32)
	private String inshowrssaslink;
	@Column(name = "JustWatch", length = 2)
	private String justwatch;
	@Column(name = "JustWatchLink", length = 75)
	private String justwatchlink;
	@Column(name = "LastWatched", nullable = false, length = 10)
	private String lastwatched;
	@Column(name = "Ota", length = 3)
	private String ota;
	@ManyToOne
	@JoinColumn(name = "ShowsId", referencedColumnName = "id")
	private Shows shows;
	@Column(name = "TivoName", length = 47)
	private String tivoname;
	@Column(name = "TivoNameLink", length = 31)
	private String tivonamelink;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;

	/**
	 * Basic constructor
	 */
	public Showsuser() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Showsuser(String bestexperience, String bestexperiencelink, String comment, String commentlink, Integer id, String imdb, String imdblink, String inrokufeed, String inshowrssas, String inshowrssaslink, String justwatch, String justwatchlink, String lastwatched, String ota, String tivoname, String tivonamelink) {
		this.bestexperience = bestexperience;
		this.bestexperiencelink = bestexperiencelink;
		this.comment = comment;
		this.commentlink = commentlink;
		this.id = id;
		this.imdb = imdb;
		this.imdblink = imdblink;
		this.inrokufeed = inrokufeed;
		this.inshowrssas = inshowrssas;
		this.inshowrssaslink = inshowrssaslink;
		this.justwatch = justwatch;
		this.justwatchlink = justwatchlink;
		this.lastwatched = lastwatched;
		this.ota = ota;
		this.tivoname = tivoname;
		this.tivonamelink = tivonamelink;
	}
	/**
	 * returns value of the BestExperience column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getBestexperience() {
		return bestexperience;
	}

	/**
	 * sets value of the BestExperience column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 17
	 */
	public void setBestexperience(String newVal) {
		bestexperience = newVal;
	}

	/**
	 * returns value of the BestExperienceLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getBestexperiencelink() {
		return bestexperiencelink;
	}

	/**
	 * sets value of the BestExperienceLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 306
	 */
	public void setBestexperiencelink(String newVal) {
		bestexperiencelink = newVal;
	}

	/**
	 * returns value of the Comment column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * sets value of the Comment column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 181
	 */
	public void setComment(String newVal) {
		comment = newVal;
	}

	/**
	 * returns value of the CommentLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCommentlink() {
		return commentlink;
	}

	/**
	 * sets value of the CommentLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 228
	 */
	public void setCommentlink(String newVal) {
		commentlink = newVal;
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
	 * returns value of the Imdb column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getImdb() {
		return imdb;
	}

	/**
	 * sets value of the Imdb column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setImdb(String newVal) {
		imdb = newVal;
	}

	/**
	 * returns value of the ImdbLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getImdblink() {
		return imdblink;
	}

	/**
	 * sets value of the ImdbLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 63
	 */
	public void setImdblink(String newVal) {
		imdblink = newVal;
	}

	/**
	 * returns value of the InRokuFeed column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getInrokufeed() {
		return inrokufeed;
	}

	/**
	 * sets value of the InRokuFeed column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setInrokufeed(String newVal) {
		inrokufeed = newVal;
	}

	/**
	 * returns value of the InShowRssAs column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getInshowrssas() {
		return inshowrssas;
	}

	/**
	 * sets value of the InShowRssAs column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 47
	 */
	public void setInshowrssas(String newVal) {
		inshowrssas = newVal;
	}

	/**
	 * returns value of the InShowRssAsLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getInshowrssaslink() {
		return inshowrssaslink;
	}

	/**
	 * sets value of the InShowRssAsLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 32
	 */
	public void setInshowrssaslink(String newVal) {
		inshowrssaslink = newVal;
	}

	/**
	 * returns value of the JustWatch column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getJustwatch() {
		return justwatch;
	}

	/**
	 * sets value of the JustWatch column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 2
	 */
	public void setJustwatch(String newVal) {
		justwatch = newVal;
	}

	/**
	 * returns value of the JustWatchLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getJustwatchlink() {
		return justwatchlink;
	}

	/**
	 * sets value of the JustWatchLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 75
	 */
	public void setJustwatchlink(String newVal) {
		justwatchlink = newVal;
	}

	/**
	 * returns value of the LastWatched column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLastwatched() {
		return lastwatched;
	}

	/**
	 * sets value of the LastWatched column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 10
	 */
	public void setLastwatched(String newVal) {
		lastwatched = newVal;
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
	 * This field has a max length of 3
	 */
	public void setOta(String newVal) {
		ota = newVal;
	}

	/**
	 * returns value of the ShowsId column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Shows getShows() {
		return shows;
	}

	/**
	 * sets value of the ShowsId column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setShows(Shows newVal) {
		shows = newVal;
	}

	/**
	 * returns value of the TivoName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTivoname() {
		return tivoname;
	}

	/**
	 * sets value of the TivoName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 47
	 */
	public void setTivoname(String newVal) {
		tivoname = newVal;
	}

	/**
	 * returns value of the TivoNameLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTivonamelink() {
		return tivonamelink;
	}

	/**
	 * sets value of the TivoNameLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 31
	 */
	public void setTivonamelink(String newVal) {
		tivonamelink = newVal;
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
		builder.append("Showsuser [");
		builder.append("bestexperience=").append(bestexperience);
		builder.append(", bestexperiencelink=").append(bestexperiencelink);
		builder.append(", comment=").append(comment);
		builder.append(", commentlink=").append(commentlink);
		builder.append(", id=").append(id);
		builder.append(", imdb=").append(imdb);
		builder.append(", imdblink=").append(imdblink);
		builder.append(", inrokufeed=").append(inrokufeed);
		builder.append(", inshowrssas=").append(inshowrssas);
		builder.append(", inshowrssaslink=").append(inshowrssaslink);
		builder.append(", justwatch=").append(justwatch);
		builder.append(", justwatchlink=").append(justwatchlink);
		builder.append(", lastwatched=").append(lastwatched);
		builder.append(", ota=").append(ota);
		builder.append(", shows=").append(shows);
		builder.append(", tivoname=").append(tivoname);
		builder.append(", tivonamelink=").append(tivonamelink);
		builder.append(", account=").append(account);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((bestexperience == null) ? 0 : bestexperience.hashCode());
		result = prime * result + ((bestexperiencelink == null) ? 0 : bestexperiencelink.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((commentlink == null) ? 0 : commentlink.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imdb == null) ? 0 : imdb.hashCode());
		result = prime * result + ((imdblink == null) ? 0 : imdblink.hashCode());
		result = prime * result + ((inrokufeed == null) ? 0 : inrokufeed.hashCode());
		result = prime * result + ((inshowrssas == null) ? 0 : inshowrssas.hashCode());
		result = prime * result + ((inshowrssaslink == null) ? 0 : inshowrssaslink.hashCode());
		result = prime * result + ((justwatch == null) ? 0 : justwatch.hashCode());
		result = prime * result + ((justwatchlink == null) ? 0 : justwatchlink.hashCode());
		result = prime * result + ((lastwatched == null) ? 0 : lastwatched.hashCode());
		result = prime * result + ((ota == null) ? 0 : ota.hashCode());
		result = prime * result + ((shows == null) ? 0 : shows.hashCode());
		result = prime * result + ((tivoname == null) ? 0 : tivoname.hashCode());
		result = prime * result + ((tivonamelink == null) ? 0 : tivonamelink.hashCode());
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
		Showsuser other = (Showsuser) obj;

		if (getBestexperience() == null) {
			if (other.getBestexperience() != null)
				return false;
		} else if (!getBestexperience().equals(other.getBestexperience()))
			return false;

		if (getBestexperiencelink() == null) {
			if (other.getBestexperiencelink() != null)
				return false;
		} else if (!getBestexperiencelink().equals(other.getBestexperiencelink()))
			return false;

		if (getComment() == null) {
			if (other.getComment() != null)
				return false;
		} else if (!getComment().equals(other.getComment()))
			return false;

		if (getCommentlink() == null) {
			if (other.getCommentlink() != null)
				return false;
		} else if (!getCommentlink().equals(other.getCommentlink()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getImdb() == null) {
			if (other.getImdb() != null)
				return false;
		} else if (!getImdb().equals(other.getImdb()))
			return false;

		if (getImdblink() == null) {
			if (other.getImdblink() != null)
				return false;
		} else if (!getImdblink().equals(other.getImdblink()))
			return false;

		if (getInrokufeed() == null) {
			if (other.getInrokufeed() != null)
				return false;
		} else if (!getInrokufeed().equals(other.getInrokufeed()))
			return false;

		if (getInshowrssas() == null) {
			if (other.getInshowrssas() != null)
				return false;
		} else if (!getInshowrssas().equals(other.getInshowrssas()))
			return false;

		if (getInshowrssaslink() == null) {
			if (other.getInshowrssaslink() != null)
				return false;
		} else if (!getInshowrssaslink().equals(other.getInshowrssaslink()))
			return false;

		if (getJustwatch() == null) {
			if (other.getJustwatch() != null)
				return false;
		} else if (!getJustwatch().equals(other.getJustwatch()))
			return false;

		if (getJustwatchlink() == null) {
			if (other.getJustwatchlink() != null)
				return false;
		} else if (!getJustwatchlink().equals(other.getJustwatchlink()))
			return false;

		if (getLastwatched() == null) {
			if (other.getLastwatched() != null)
				return false;
		} else if (!getLastwatched().equals(other.getLastwatched()))
			return false;

		if (getOta() == null) {
			if (other.getOta() != null)
				return false;
		} else if (!getOta().equals(other.getOta()))
			return false;

		if (getShows() == null) {
			if (other.getShows() != null)
				return false;
		} else if (!getShows().equals(other.getShows()))
			return false;

		if (getTivoname() == null) {
			if (other.getTivoname() != null)
				return false;
		} else if (!getTivoname().equals(other.getTivoname()))
			return false;

		if (getTivonamelink() == null) {
			if (other.getTivonamelink() != null)
				return false;
		} else if (!getTivonamelink().equals(other.getTivonamelink()))
			return false;

		if (getAccount() == null) {
			if (other.getAccount() != null)
				return false;
		} else if (!getAccount().equals(other.getAccount()))
			return false;

		return true;
	}

}