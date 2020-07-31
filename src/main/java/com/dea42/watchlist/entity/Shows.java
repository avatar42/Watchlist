package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Title: shows Bean <br>
 * Description: Class for holding data from the shows table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@Entity
@Table(name = "shows")
public class Shows implements Serializable {
private static final long serialVersionUID = 1L;

	@Column(name="BestExperience", length=17)
	private String bestexperience;
	@Column(name="BestExperienceLink", length=306)
	private String bestexperiencelink;
	@Column(name="Cancelled", length=65)
	private String cancelled;
	@Column(name="Comment", length=181)
	private String comment;
	@Column(name="CommentLink", length=228)
	private String commentlink;
	@Column(name="EpguidesShowName", length=47)
	private String epguidesshowname;
	@Column(name="EpguidesShowNameLink", length=60)
	private String epguidesshownamelink;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="Imdb", length=1)
	private String imdb;
	@Column(name="ImdbLink", length=63)
	private String imdblink;
	@Column(name="InCanceledAs", length=47)
	private String incanceledas;
	@Column(name="InCanceledAsLink", length=70)
	private String incanceledaslink;
	@Column(name="InRokuFeed", length=1)
	private String inrokufeed;
	@Column(name="InShowRssAs", length=47)
	private String inshowrssas;
	@Column(name="InShowRssAsLink", length=32)
	private String inshowrssaslink;
	@Column(name="JustWatch", length=2)
	private String justwatch;
	@Column(name="JustWatchLink", length=75)
	private String justwatchlink;
	@Column(name="LastShow", length=10)
	private String lastshow;
	@Column(name="LastWatched", length=10)
	private String lastwatched;
	@Column(name="Network", length=14)
	private String network;
	@Column(name="NetworkLink", length=306)
	private String networklink;
	@Column(name="Ota", length=3)
	private String ota;
	@Column(name="Premiere", length=65)
	private String premiere;
	@Column(name="PremiereDate")
	private String premieredate;
	@Column(name="Status", length=65)
	private String status;
	@Column(name="TivoName", length=47)
	private String tivoname;
	@Column(name="TivoNameLink", length=31)
	private String tivonamelink;

	/**
	 * Basic constructor
	 */
	public Shows() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Shows(String bestexperience, String bestexperiencelink, String cancelled, String comment, String commentlink, String epguidesshowname, String epguidesshownamelink, Integer id, String imdb, String imdblink, String incanceledas, String incanceledaslink, String inrokufeed, String inshowrssas, String inshowrssaslink, String justwatch, String justwatchlink, String lastshow, String lastwatched, String network, String networklink, String ota, String premiere, String premieredate, String status, String tivoname, String tivonamelink) {
		this.bestexperience = bestexperience;
		this.bestexperiencelink = bestexperiencelink;
		this.cancelled = cancelled;
		this.comment = comment;
		this.commentlink = commentlink;
		this.epguidesshowname = epguidesshowname;
		this.epguidesshownamelink = epguidesshownamelink;
		this.id = id;
		this.imdb = imdb;
		this.imdblink = imdblink;
		this.incanceledas = incanceledas;
		this.incanceledaslink = incanceledaslink;
		this.inrokufeed = inrokufeed;
		this.inshowrssas = inshowrssas;
		this.inshowrssaslink = inshowrssaslink;
		this.justwatch = justwatch;
		this.justwatchlink = justwatchlink;
		this.lastshow = lastshow;
		this.lastwatched = lastwatched;
		this.network = network;
		this.networklink = networklink;
		this.ota = ota;
		this.premiere = premiere;
		this.premieredate = premieredate;
		this.status = status;
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
	 * This field has a max length of 17, longer strings will be truncated
	 */
	public void setBestexperience(String newVal) {
		if (bestexperience != null && bestexperience.length() > 17){
			bestexperience = newVal.substring(0,16);
		} else {
	    	bestexperience = newVal;
		}
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
	 * This field has a max length of 306, longer strings will be truncated
	 */
	public void setBestexperiencelink(String newVal) {
		if (bestexperiencelink != null && bestexperiencelink.length() > 306){
			bestexperiencelink = newVal.substring(0,305);
		} else {
	    	bestexperiencelink = newVal;
		}
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
	 * This field has a max length of 65, longer strings will be truncated
	 */
	public void setCancelled(String newVal) {
		if (cancelled != null && cancelled.length() > 65){
			cancelled = newVal.substring(0,64);
		} else {
	    	cancelled = newVal;
		}
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
	 * This field has a max length of 181, longer strings will be truncated
	 */
	public void setComment(String newVal) {
		if (comment != null && comment.length() > 181){
			comment = newVal.substring(0,180);
		} else {
	    	comment = newVal;
		}
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
	 * This field has a max length of 228, longer strings will be truncated
	 */
	public void setCommentlink(String newVal) {
		if (commentlink != null && commentlink.length() > 228){
			commentlink = newVal.substring(0,227);
		} else {
	    	commentlink = newVal;
		}
	}

	/**
	 * returns value of the EpguidesShowName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpguidesshowname() {
		return epguidesshowname;
	}

	/**
	 * sets value of the EpguidesShowName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 47, longer strings will be truncated
	 */
	public void setEpguidesshowname(String newVal) {
		if (epguidesshowname != null && epguidesshowname.length() > 47){
			epguidesshowname = newVal.substring(0,46);
		} else {
	    	epguidesshowname = newVal;
		}
	}

	/**
	 * returns value of the EpguidesShowNameLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEpguidesshownamelink() {
		return epguidesshownamelink;
	}

	/**
	 * sets value of the EpguidesShowNameLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 60, longer strings will be truncated
	 */
	public void setEpguidesshownamelink(String newVal) {
		if (epguidesshownamelink != null && epguidesshownamelink.length() > 60){
			epguidesshownamelink = newVal.substring(0,59);
		} else {
	    	epguidesshownamelink = newVal;
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
	 * This field has a max length of 1, longer strings will be truncated
	 */
	public void setImdb(String newVal) {
		if (imdb != null && imdb.length() > 1){
			imdb = newVal.substring(0,0);
		} else {
	    	imdb = newVal;
		}
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
	 * This field has a max length of 63, longer strings will be truncated
	 */
	public void setImdblink(String newVal) {
		if (imdblink != null && imdblink.length() > 63){
			imdblink = newVal.substring(0,62);
		} else {
	    	imdblink = newVal;
		}
	}

	/**
	 * returns value of the InCanceledAs column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIncanceledas() {
		return incanceledas;
	}

	/**
	 * sets value of the InCanceledAs column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 47, longer strings will be truncated
	 */
	public void setIncanceledas(String newVal) {
		if (incanceledas != null && incanceledas.length() > 47){
			incanceledas = newVal.substring(0,46);
		} else {
	    	incanceledas = newVal;
		}
	}

	/**
	 * returns value of the InCanceledAsLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIncanceledaslink() {
		return incanceledaslink;
	}

	/**
	 * sets value of the InCanceledAsLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 70, longer strings will be truncated
	 */
	public void setIncanceledaslink(String newVal) {
		if (incanceledaslink != null && incanceledaslink.length() > 70){
			incanceledaslink = newVal.substring(0,69);
		} else {
	    	incanceledaslink = newVal;
		}
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
	 * This field has a max length of 1, longer strings will be truncated
	 */
	public void setInrokufeed(String newVal) {
		if (inrokufeed != null && inrokufeed.length() > 1){
			inrokufeed = newVal.substring(0,0);
		} else {
	    	inrokufeed = newVal;
		}
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
	 * This field has a max length of 47, longer strings will be truncated
	 */
	public void setInshowrssas(String newVal) {
		if (inshowrssas != null && inshowrssas.length() > 47){
			inshowrssas = newVal.substring(0,46);
		} else {
	    	inshowrssas = newVal;
		}
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
	 * This field has a max length of 32, longer strings will be truncated
	 */
	public void setInshowrssaslink(String newVal) {
		if (inshowrssaslink != null && inshowrssaslink.length() > 32){
			inshowrssaslink = newVal.substring(0,31);
		} else {
	    	inshowrssaslink = newVal;
		}
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
	 * This field has a max length of 2, longer strings will be truncated
	 */
	public void setJustwatch(String newVal) {
		if (justwatch != null && justwatch.length() > 2){
			justwatch = newVal.substring(0,1);
		} else {
	    	justwatch = newVal;
		}
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
	 * This field has a max length of 75, longer strings will be truncated
	 */
	public void setJustwatchlink(String newVal) {
		if (justwatchlink != null && justwatchlink.length() > 75){
			justwatchlink = newVal.substring(0,74);
		} else {
	    	justwatchlink = newVal;
		}
	}

	/**
	 * returns value of the LastShow column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLastshow() {
		return lastshow;
	}

	/**
	 * sets value of the LastShow column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 10, longer strings will be truncated
	 */
	public void setLastshow(String newVal) {
		if (lastshow != null && lastshow.length() > 10){
			lastshow = newVal.substring(0,9);
		} else {
	    	lastshow = newVal;
		}
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
	 * This field has a max length of 10, longer strings will be truncated
	 */
	public void setLastwatched(String newVal) {
		if (lastwatched != null && lastwatched.length() > 10){
			lastwatched = newVal.substring(0,9);
		} else {
	    	lastwatched = newVal;
		}
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
	 * This field has a max length of 14, longer strings will be truncated
	 */
	public void setNetwork(String newVal) {
		if (network != null && network.length() > 14){
			network = newVal.substring(0,13);
		} else {
	    	network = newVal;
		}
	}

	/**
	 * returns value of the NetworkLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNetworklink() {
		return networklink;
	}

	/**
	 * sets value of the NetworkLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 306, longer strings will be truncated
	 */
	public void setNetworklink(String newVal) {
		if (networklink != null && networklink.length() > 306){
			networklink = newVal.substring(0,305);
		} else {
	    	networklink = newVal;
		}
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
	 * This field has a max length of 3, longer strings will be truncated
	 */
	public void setOta(String newVal) {
		if (ota != null && ota.length() > 3){
			ota = newVal.substring(0,2);
		} else {
	    	ota = newVal;
		}
	}

	/**
	 * returns value of the Premiere column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getPremiere() {
		return premiere;
	}

	/**
	 * sets value of the Premiere column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 65, longer strings will be truncated
	 */
	public void setPremiere(String newVal) {
		if (premiere != null && premiere.length() > 65){
			premiere = newVal.substring(0,64);
		} else {
	    	premiere = newVal;
		}
	}

	/**
	 * returns value of the PremiereDate column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getPremieredate() {
		return premieredate;
	}

	/**
	 * sets value of the PremiereDate column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setPremieredate(String newVal) {
		premieredate = newVal;
	}

	/**
	 * returns value of the Status column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * sets value of the Status column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 65, longer strings will be truncated
	 */
	public void setStatus(String newVal) {
		if (status != null && status.length() > 65){
			status = newVal.substring(0,64);
		} else {
	    	status = newVal;
		}
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
	 * This field has a max length of 47, longer strings will be truncated
	 */
	public void setTivoname(String newVal) {
		if (tivoname != null && tivoname.length() > 47){
			tivoname = newVal.substring(0,46);
		} else {
	    	tivoname = newVal;
		}
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
	 * This field has a max length of 31, longer strings will be truncated
	 */
	public void setTivonamelink(String newVal) {
		if (tivonamelink != null && tivonamelink.length() > 31){
			tivonamelink = newVal.substring(0,30);
		} else {
	    	tivonamelink = newVal;
		}
	}

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("bestexperience= " + bestexperience+'\n');
		sb.append("bestexperiencelink= " + bestexperiencelink+'\n');
		sb.append("cancelled= " + cancelled+'\n');
		sb.append("comment= " + comment+'\n');
		sb.append("commentlink= " + commentlink+'\n');
		sb.append("epguidesshowname= " + epguidesshowname+'\n');
		sb.append("epguidesshownamelink= " + epguidesshownamelink+'\n');
		sb.append("id= " + id+'\n');
		sb.append("imdb= " + imdb+'\n');
		sb.append("imdblink= " + imdblink+'\n');
		sb.append("incanceledas= " + incanceledas+'\n');
		sb.append("incanceledaslink= " + incanceledaslink+'\n');
		sb.append("inrokufeed= " + inrokufeed+'\n');
		sb.append("inshowrssas= " + inshowrssas+'\n');
		sb.append("inshowrssaslink= " + inshowrssaslink+'\n');
		sb.append("justwatch= " + justwatch+'\n');
		sb.append("justwatchlink= " + justwatchlink+'\n');
		sb.append("lastshow= " + lastshow+'\n');
		sb.append("lastwatched= " + lastwatched+'\n');
		sb.append("network= " + network+'\n');
		sb.append("networklink= " + networklink+'\n');
		sb.append("ota= " + ota+'\n');
		sb.append("premiere= " + premiere+'\n');
		sb.append("premieredate= " + premieredate+'\n');
		sb.append("status= " + status+'\n');
		sb.append("tivoname= " + tivoname+'\n');
		sb.append("tivonamelink= " + tivonamelink+'\n');
		return sb.toString();
	}


}
