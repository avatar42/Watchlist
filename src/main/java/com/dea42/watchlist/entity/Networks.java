package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Title: networks Bean <br>
 * Description: Class for holding data from the networks table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@Entity
@Table(name = "networks")
public class Networks implements Serializable {
private static final long serialVersionUID = 1L;

	@Column(name="AndroidApp", length=1)
private String androidapp;
	@Column(name="AndroidAppLink", length=74)
private String androidapplink;
	@Column(name="Comment", length=458)
private String comment;
	@Column(name="CommentLink", length=80)
private String commentlink;
	@Column(name="Commercials", length=68)
private String commercials;
	@Column(name="CommercialsLink", length=37)
private String commercialslink;
	@Column(name="FireApp", length=56)
private String fireapp;
	@Column(name="FireAppLink", length=46)
private String fireapplink;
	@Column(name="FreeWithTwcId", length=57)
private String freewithtwcid;
	@Column(name="FreeWithTwcIdLink", length=50)
private String freewithtwcidlink;
	@Column(name="HasDirectBuyOption", length=79)
private String hasdirectbuyoption;
	@Column(name="HasDirectBuyOptionLink", length=55)
private String hasdirectbuyoptionlink;
	@Column(name="HasWatchList", length=46)
private String haswatchlist;
	@Column(name="ICanOta", length=63)
private String icanota;
	@Column(name="ICanOtaLink", length=216)
private String icanotalink;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
private Integer id;
	@Column(name="IptvService", length=214)
private String iptvservice;
	@Column(name="IptvServiceLink", length=36)
private String iptvservicelink;
	@Column(name="OnHulu", length=14)
private String onhulu;
	@Column(name="OnHuluLink", length=118)
private String onhululink;
	@Column(name="Persistance", length=70)
private String persistance;
	@Column(name="RemembersPlaceInEpisode", length=57)
private String remembersplaceinepisode;
	@Column(name="RemembersWatchedEpisodes", length=35)
private String rememberswatchedepisodes;
	@Column(name="RokuApp", length=97)
private String rokuapp;
	@Column(name="RokuAppLink", length=46)
private String rokuapplink;
	@Column(name="ShowsInTivoNpl")
private Integer showsintivonpl;
	@Column(name="Site", length=28)
private String site;
	@Column(name="SiteLink", length=52)
private String sitelink;
	@Column(name="StandardWait", length=17)
private String standardwait;
	@Column(name="TivoApp", length=61)
private String tivoapp;
	@Column(name="TivoAppLink", length=34)
private String tivoapplink;
	@Column(name="TivoShortName", length=10)
private String tivoshortname;
	@Column(name="WebInterface", length=56)
private String webinterface;
	@Column(name="WebInterfaceLink", length=41)
private String webinterfacelink;

/**
 * Basic constructor
 */
public Networks() {
}

/**
 * Full constructor
 *
 */
	public Networks(String androidapp, String androidapplink, String comment, String commentlink, String commercials, String commercialslink, String fireapp, String fireapplink, String freewithtwcid, String freewithtwcidlink, String hasdirectbuyoption, String hasdirectbuyoptionlink, String haswatchlist, String icanota, String icanotalink, Integer id, String iptvservice, String iptvservicelink, String onhulu, String onhululink, String persistance, String remembersplaceinepisode, String rememberswatchedepisodes, String rokuapp, String rokuapplink, Integer showsintivonpl, String site, String sitelink, String standardwait, String tivoapp, String tivoapplink, String tivoshortname, String webinterface, String webinterfacelink) {
		this.androidapp = androidapp;
		this.androidapplink = androidapplink;
		this.comment = comment;
		this.commentlink = commentlink;
		this.commercials = commercials;
		this.commercialslink = commercialslink;
		this.fireapp = fireapp;
		this.fireapplink = fireapplink;
		this.freewithtwcid = freewithtwcid;
		this.freewithtwcidlink = freewithtwcidlink;
		this.hasdirectbuyoption = hasdirectbuyoption;
		this.hasdirectbuyoptionlink = hasdirectbuyoptionlink;
		this.haswatchlist = haswatchlist;
		this.icanota = icanota;
		this.icanotalink = icanotalink;
		this.id = id;
		this.iptvservice = iptvservice;
		this.iptvservicelink = iptvservicelink;
		this.onhulu = onhulu;
		this.onhululink = onhululink;
		this.persistance = persistance;
		this.remembersplaceinepisode = remembersplaceinepisode;
		this.rememberswatchedepisodes = rememberswatchedepisodes;
		this.rokuapp = rokuapp;
		this.rokuapplink = rokuapplink;
		this.showsintivonpl = showsintivonpl;
		this.site = site;
		this.sitelink = sitelink;
		this.standardwait = standardwait;
		this.tivoapp = tivoapp;
		this.tivoapplink = tivoapplink;
		this.tivoshortname = tivoshortname;
		this.webinterface = webinterface;
		this.webinterfacelink = webinterfacelink;
	}
	/**
	 * returns value of the AndroidApp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAndroidapp() {
	return androidapp;
	}

	/**
	 * sets value of the AndroidApp column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1, longer strings will be truncated
	 */
	public void setAndroidapp(String newVal) {
		if (androidapp != null && androidapp.length() > 1){
	    androidapp = newVal.substring(0,0);
	} else {
	    androidapp = newVal;
	}
	}

	/**
	 * returns value of the AndroidAppLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getAndroidapplink() {
	return androidapplink;
	}

	/**
	 * sets value of the AndroidAppLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 74, longer strings will be truncated
	 */
	public void setAndroidapplink(String newVal) {
		if (androidapplink != null && androidapplink.length() > 74){
	    androidapplink = newVal.substring(0,73);
	} else {
	    androidapplink = newVal;
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
	 * This field has a max length of 458, longer strings will be truncated
	 */
	public void setComment(String newVal) {
		if (comment != null && comment.length() > 458){
	    comment = newVal.substring(0,457);
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
	 * This field has a max length of 80, longer strings will be truncated
	 */
	public void setCommentlink(String newVal) {
		if (commentlink != null && commentlink.length() > 80){
	    commentlink = newVal.substring(0,79);
	} else {
	    commentlink = newVal;
	}
	}

	/**
	 * returns value of the Commercials column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCommercials() {
	return commercials;
	}

	/**
	 * sets value of the Commercials column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 68, longer strings will be truncated
	 */
	public void setCommercials(String newVal) {
		if (commercials != null && commercials.length() > 68){
	    commercials = newVal.substring(0,67);
	} else {
	    commercials = newVal;
	}
	}

	/**
	 * returns value of the CommercialsLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getCommercialslink() {
	return commercialslink;
	}

	/**
	 * sets value of the CommercialsLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 37, longer strings will be truncated
	 */
	public void setCommercialslink(String newVal) {
		if (commercialslink != null && commercialslink.length() > 37){
	    commercialslink = newVal.substring(0,36);
	} else {
	    commercialslink = newVal;
	}
	}

	/**
	 * returns value of the FireApp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFireapp() {
	return fireapp;
	}

	/**
	 * sets value of the FireApp column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 56, longer strings will be truncated
	 */
	public void setFireapp(String newVal) {
		if (fireapp != null && fireapp.length() > 56){
	    fireapp = newVal.substring(0,55);
	} else {
	    fireapp = newVal;
	}
	}

	/**
	 * returns value of the FireAppLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFireapplink() {
	return fireapplink;
	}

	/**
	 * sets value of the FireAppLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 46, longer strings will be truncated
	 */
	public void setFireapplink(String newVal) {
		if (fireapplink != null && fireapplink.length() > 46){
	    fireapplink = newVal.substring(0,45);
	} else {
	    fireapplink = newVal;
	}
	}

	/**
	 * returns value of the FreeWithTwcId column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFreewithtwcid() {
	return freewithtwcid;
	}

	/**
	 * sets value of the FreeWithTwcId column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 57, longer strings will be truncated
	 */
	public void setFreewithtwcid(String newVal) {
		if (freewithtwcid != null && freewithtwcid.length() > 57){
	    freewithtwcid = newVal.substring(0,56);
	} else {
	    freewithtwcid = newVal;
	}
	}

	/**
	 * returns value of the FreeWithTwcIdLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFreewithtwcidlink() {
	return freewithtwcidlink;
	}

	/**
	 * sets value of the FreeWithTwcIdLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 50, longer strings will be truncated
	 */
	public void setFreewithtwcidlink(String newVal) {
		if (freewithtwcidlink != null && freewithtwcidlink.length() > 50){
	    freewithtwcidlink = newVal.substring(0,49);
	} else {
	    freewithtwcidlink = newVal;
	}
	}

	/**
	 * returns value of the HasDirectBuyOption column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getHasdirectbuyoption() {
	return hasdirectbuyoption;
	}

	/**
	 * sets value of the HasDirectBuyOption column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 79, longer strings will be truncated
	 */
	public void setHasdirectbuyoption(String newVal) {
		if (hasdirectbuyoption != null && hasdirectbuyoption.length() > 79){
	    hasdirectbuyoption = newVal.substring(0,78);
	} else {
	    hasdirectbuyoption = newVal;
	}
	}

	/**
	 * returns value of the HasDirectBuyOptionLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getHasdirectbuyoptionlink() {
	return hasdirectbuyoptionlink;
	}

	/**
	 * sets value of the HasDirectBuyOptionLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 55, longer strings will be truncated
	 */
	public void setHasdirectbuyoptionlink(String newVal) {
		if (hasdirectbuyoptionlink != null && hasdirectbuyoptionlink.length() > 55){
	    hasdirectbuyoptionlink = newVal.substring(0,54);
	} else {
	    hasdirectbuyoptionlink = newVal;
	}
	}

	/**
	 * returns value of the HasWatchList column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getHaswatchlist() {
	return haswatchlist;
	}

	/**
	 * sets value of the HasWatchList column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 46, longer strings will be truncated
	 */
	public void setHaswatchlist(String newVal) {
		if (haswatchlist != null && haswatchlist.length() > 46){
	    haswatchlist = newVal.substring(0,45);
	} else {
	    haswatchlist = newVal;
	}
	}

	/**
	 * returns value of the ICanOta column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIcanota() {
	return icanota;
	}

	/**
	 * sets value of the ICanOta column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 63, longer strings will be truncated
	 */
	public void setIcanota(String newVal) {
		if (icanota != null && icanota.length() > 63){
	    icanota = newVal.substring(0,62);
	} else {
	    icanota = newVal;
	}
	}

	/**
	 * returns value of the ICanOtaLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIcanotalink() {
	return icanotalink;
	}

	/**
	 * sets value of the ICanOtaLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 216, longer strings will be truncated
	 */
	public void setIcanotalink(String newVal) {
		if (icanotalink != null && icanotalink.length() > 216){
	    icanotalink = newVal.substring(0,215);
	} else {
	    icanotalink = newVal;
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
	 * returns value of the IptvService column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIptvservice() {
	return iptvservice;
	}

	/**
	 * sets value of the IptvService column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 214, longer strings will be truncated
	 */
	public void setIptvservice(String newVal) {
		if (iptvservice != null && iptvservice.length() > 214){
	    iptvservice = newVal.substring(0,213);
	} else {
	    iptvservice = newVal;
	}
	}

	/**
	 * returns value of the IptvServiceLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIptvservicelink() {
	return iptvservicelink;
	}

	/**
	 * sets value of the IptvServiceLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 36, longer strings will be truncated
	 */
	public void setIptvservicelink(String newVal) {
		if (iptvservicelink != null && iptvservicelink.length() > 36){
	    iptvservicelink = newVal.substring(0,35);
	} else {
	    iptvservicelink = newVal;
	}
	}

	/**
	 * returns value of the OnHulu column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOnhulu() {
	return onhulu;
	}

	/**
	 * sets value of the OnHulu column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 14, longer strings will be truncated
	 */
	public void setOnhulu(String newVal) {
		if (onhulu != null && onhulu.length() > 14){
	    onhulu = newVal.substring(0,13);
	} else {
	    onhulu = newVal;
	}
	}

	/**
	 * returns value of the OnHuluLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOnhululink() {
	return onhululink;
	}

	/**
	 * sets value of the OnHuluLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 118, longer strings will be truncated
	 */
	public void setOnhululink(String newVal) {
		if (onhululink != null && onhululink.length() > 118){
	    onhululink = newVal.substring(0,117);
	} else {
	    onhululink = newVal;
	}
	}

	/**
	 * returns value of the Persistance column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getPersistance() {
	return persistance;
	}

	/**
	 * sets value of the Persistance column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 70, longer strings will be truncated
	 */
	public void setPersistance(String newVal) {
		if (persistance != null && persistance.length() > 70){
	    persistance = newVal.substring(0,69);
	} else {
	    persistance = newVal;
	}
	}

	/**
	 * returns value of the RemembersPlaceInEpisode column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRemembersplaceinepisode() {
	return remembersplaceinepisode;
	}

	/**
	 * sets value of the RemembersPlaceInEpisode column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 57, longer strings will be truncated
	 */
	public void setRemembersplaceinepisode(String newVal) {
		if (remembersplaceinepisode != null && remembersplaceinepisode.length() > 57){
	    remembersplaceinepisode = newVal.substring(0,56);
	} else {
	    remembersplaceinepisode = newVal;
	}
	}

	/**
	 * returns value of the RemembersWatchedEpisodes column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRememberswatchedepisodes() {
	return rememberswatchedepisodes;
	}

	/**
	 * sets value of the RemembersWatchedEpisodes column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 35, longer strings will be truncated
	 */
	public void setRememberswatchedepisodes(String newVal) {
		if (rememberswatchedepisodes != null && rememberswatchedepisodes.length() > 35){
	    rememberswatchedepisodes = newVal.substring(0,34);
	} else {
	    rememberswatchedepisodes = newVal;
	}
	}

	/**
	 * returns value of the RokuApp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRokuapp() {
	return rokuapp;
	}

	/**
	 * sets value of the RokuApp column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 97, longer strings will be truncated
	 */
	public void setRokuapp(String newVal) {
		if (rokuapp != null && rokuapp.length() > 97){
	    rokuapp = newVal.substring(0,96);
	} else {
	    rokuapp = newVal;
	}
	}

	/**
	 * returns value of the RokuAppLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRokuapplink() {
	return rokuapplink;
	}

	/**
	 * sets value of the RokuAppLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 46, longer strings will be truncated
	 */
	public void setRokuapplink(String newVal) {
		if (rokuapplink != null && rokuapplink.length() > 46){
	    rokuapplink = newVal.substring(0,45);
	} else {
	    rokuapplink = newVal;
	}
	}

	/**
	 * returns value of the ShowsInTivoNpl column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getShowsintivonpl() {
	if (showsintivonpl== null)
	    return 0;
	return showsintivonpl.intValue();
	}

	/**
	 * sets value of the ShowsInTivoNpl column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setShowsintivonpl(Integer newVal) {
	showsintivonpl = newVal;
	}

	/**
	 * returns value of the Site column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getSite() {
	return site;
	}

	/**
	 * sets value of the Site column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 28, longer strings will be truncated
	 */
	public void setSite(String newVal) {
		if (site != null && site.length() > 28){
	    site = newVal.substring(0,27);
	} else {
	    site = newVal;
	}
	}

	/**
	 * returns value of the SiteLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getSitelink() {
	return sitelink;
	}

	/**
	 * sets value of the SiteLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 52, longer strings will be truncated
	 */
	public void setSitelink(String newVal) {
		if (sitelink != null && sitelink.length() > 52){
	    sitelink = newVal.substring(0,51);
	} else {
	    sitelink = newVal;
	}
	}

	/**
	 * returns value of the StandardWait column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getStandardwait() {
	return standardwait;
	}

	/**
	 * sets value of the StandardWait column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 17, longer strings will be truncated
	 */
	public void setStandardwait(String newVal) {
		if (standardwait != null && standardwait.length() > 17){
	    standardwait = newVal.substring(0,16);
	} else {
	    standardwait = newVal;
	}
	}

	/**
	 * returns value of the TivoApp column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTivoapp() {
	return tivoapp;
	}

	/**
	 * sets value of the TivoApp column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 61, longer strings will be truncated
	 */
	public void setTivoapp(String newVal) {
		if (tivoapp != null && tivoapp.length() > 61){
	    tivoapp = newVal.substring(0,60);
	} else {
	    tivoapp = newVal;
	}
	}

	/**
	 * returns value of the TivoAppLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTivoapplink() {
	return tivoapplink;
	}

	/**
	 * sets value of the TivoAppLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 34, longer strings will be truncated
	 */
	public void setTivoapplink(String newVal) {
		if (tivoapplink != null && tivoapplink.length() > 34){
	    tivoapplink = newVal.substring(0,33);
	} else {
	    tivoapplink = newVal;
	}
	}

	/**
	 * returns value of the TivoShortName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTivoshortname() {
	return tivoshortname;
	}

	/**
	 * sets value of the TivoShortName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 10, longer strings will be truncated
	 */
	public void setTivoshortname(String newVal) {
		if (tivoshortname != null && tivoshortname.length() > 10){
	    tivoshortname = newVal.substring(0,9);
	} else {
	    tivoshortname = newVal;
	}
	}

	/**
	 * returns value of the WebInterface column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getWebinterface() {
	return webinterface;
	}

	/**
	 * sets value of the WebInterface column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 56, longer strings will be truncated
	 */
	public void setWebinterface(String newVal) {
		if (webinterface != null && webinterface.length() > 56){
	    webinterface = newVal.substring(0,55);
	} else {
	    webinterface = newVal;
	}
	}

	/**
	 * returns value of the WebInterfaceLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getWebinterfacelink() {
	return webinterfacelink;
	}

	/**
	 * sets value of the WebInterfaceLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 41, longer strings will be truncated
	 */
	public void setWebinterfacelink(String newVal) {
		if (webinterfacelink != null && webinterfacelink.length() > 41){
	    webinterfacelink = newVal.substring(0,40);
	} else {
	    webinterfacelink = newVal;
	}
	}


}
