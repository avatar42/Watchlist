package com.dea42.watchlist.form;

import java.io.Serializable;


import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Networks;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: networks Form <br>
 * Description: Class for holding data from the networks table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */

public class NetworksForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=1)
	private String androidapp;
    @Length(max=74)
	private String androidapplink;
    @Length(max=458)
	private String comment;
    @Length(max=80)
	private String commentlink;
    @Length(max=68)
	private String commercials;
    @Length(max=37)
	private String commercialslink;
    @Length(max=56)
	private String fireapp;
    @Length(max=46)
	private String fireapplink;
    @Length(max=57)
	private String freewithtwcid;
    @Length(max=50)
	private String freewithtwcidlink;
    @Length(max=79)
	private String hasdirectbuyoption;
    @Length(max=55)
	private String hasdirectbuyoptionlink;
    @Length(max=46)
	private String haswatchlist;
    @Length(max=63)
	private String icanota;
    @Length(max=216)
	private String icanotalink;
	private Integer id;
    @Length(max=214)
	private String iptvservice;
    @Length(max=36)
	private String iptvservicelink;
    @Length(max=14)
	private String onhulu;
    @Length(max=118)
	private String onhululink;
    @Length(max=70)
	private String persistance;
    @Length(max=57)
	private String remembersplaceinepisode;
    @Length(max=35)
	private String rememberswatchedepisodes;
    @Length(max=97)
	private String rokuapp;
    @Length(max=46)
	private String rokuapplink;
	private Integer showsintivonpl;
    @Length(max=28)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String site;
    @Length(max=52)
	private String sitelink;
    @Length(max=17)
	private String standardwait;
    @Length(max=61)
	private String tivoapp;
    @Length(max=34)
	private String tivoapplink;
    @Length(max=10)
	private String tivoshortname;
    @Length(max=56)
	private String webinterface;
    @Length(max=41)
	private String webinterfacelink;

	/**
	 * Basic constructor
	 */
	public NetworksForm() {
	}

	/**
	 * Clones Networks obj into form
	 *
	 * @param obj
	 */
	public static NetworksForm getInstance(Networks obj) {
		NetworksForm form = new NetworksForm();
		form.setAndroidapp(obj.getAndroidapp());
		form.setAndroidapplink(obj.getAndroidapplink());
		form.setComment(obj.getComment());
		form.setCommentlink(obj.getCommentlink());
		form.setCommercials(obj.getCommercials());
		form.setCommercialslink(obj.getCommercialslink());
		form.setFireapp(obj.getFireapp());
		form.setFireapplink(obj.getFireapplink());
		form.setFreewithtwcid(obj.getFreewithtwcid());
		form.setFreewithtwcidlink(obj.getFreewithtwcidlink());
		form.setHasdirectbuyoption(obj.getHasdirectbuyoption());
		form.setHasdirectbuyoptionlink(obj.getHasdirectbuyoptionlink());
		form.setHaswatchlist(obj.getHaswatchlist());
		form.setIcanota(obj.getIcanota());
		form.setIcanotalink(obj.getIcanotalink());
		form.setId(obj.getId());
		form.setIptvservice(obj.getIptvservice());
		form.setIptvservicelink(obj.getIptvservicelink());
		form.setOnhulu(obj.getOnhulu());
		form.setOnhululink(obj.getOnhululink());
		form.setPersistance(obj.getPersistance());
		form.setRemembersplaceinepisode(obj.getRemembersplaceinepisode());
		form.setRememberswatchedepisodes(obj.getRememberswatchedepisodes());
		form.setRokuapp(obj.getRokuapp());
		form.setRokuapplink(obj.getRokuapplink());
		form.setShowsintivonpl(obj.getShowsintivonpl());
		form.setSite(obj.getSite());
		form.setSitelink(obj.getSitelink());
		form.setStandardwait(obj.getStandardwait());
		form.setTivoapp(obj.getTivoapp());
		form.setTivoapplink(obj.getTivoapplink());
		form.setTivoshortname(obj.getTivoshortname());
		form.setWebinterface(obj.getWebinterface());
		form.setWebinterfacelink(obj.getWebinterfacelink());
		return form;
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
	 * This field has a max length of 1
	 */
	public void setAndroidapp(String newVal) {
		androidapp = newVal;
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
	 * This field has a max length of 74
	 */
	public void setAndroidapplink(String newVal) {
		androidapplink = newVal;
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
	 * This field has a max length of 458
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
	 * This field has a max length of 80
	 */
	public void setCommentlink(String newVal) {
		commentlink = newVal;
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
	 * This field has a max length of 68
	 */
	public void setCommercials(String newVal) {
		commercials = newVal;
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
	 * This field has a max length of 37
	 */
	public void setCommercialslink(String newVal) {
		commercialslink = newVal;
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
	 * This field has a max length of 56
	 */
	public void setFireapp(String newVal) {
		fireapp = newVal;
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
	 * This field has a max length of 46
	 */
	public void setFireapplink(String newVal) {
		fireapplink = newVal;
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
	 * This field has a max length of 57
	 */
	public void setFreewithtwcid(String newVal) {
		freewithtwcid = newVal;
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
	 * This field has a max length of 50
	 */
	public void setFreewithtwcidlink(String newVal) {
		freewithtwcidlink = newVal;
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
	 * This field has a max length of 79
	 */
	public void setHasdirectbuyoption(String newVal) {
		hasdirectbuyoption = newVal;
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
	 * This field has a max length of 55
	 */
	public void setHasdirectbuyoptionlink(String newVal) {
		hasdirectbuyoptionlink = newVal;
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
	 * This field has a max length of 46
	 */
	public void setHaswatchlist(String newVal) {
		haswatchlist = newVal;
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
	 * This field has a max length of 63
	 */
	public void setIcanota(String newVal) {
		icanota = newVal;
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
	 * This field has a max length of 216
	 */
	public void setIcanotalink(String newVal) {
		icanotalink = newVal;
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
	 * This field has a max length of 214
	 */
	public void setIptvservice(String newVal) {
		iptvservice = newVal;
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
	 * This field has a max length of 36
	 */
	public void setIptvservicelink(String newVal) {
		iptvservicelink = newVal;
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
	 * This field has a max length of 14
	 */
	public void setOnhulu(String newVal) {
		onhulu = newVal;
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
	 * This field has a max length of 118
	 */
	public void setOnhululink(String newVal) {
		onhululink = newVal;
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
	 * This field has a max length of 70
	 */
	public void setPersistance(String newVal) {
		persistance = newVal;
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
	 * This field has a max length of 57
	 */
	public void setRemembersplaceinepisode(String newVal) {
		remembersplaceinepisode = newVal;
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
	 * This field has a max length of 35
	 */
	public void setRememberswatchedepisodes(String newVal) {
		rememberswatchedepisodes = newVal;
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
	 * This field has a max length of 97
	 */
	public void setRokuapp(String newVal) {
		rokuapp = newVal;
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
	 * This field has a max length of 46
	 */
	public void setRokuapplink(String newVal) {
		rokuapplink = newVal;
	}

	/**
	 * returns value of the ShowsInTivoNpl column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getShowsintivonpl() {
		if (showsintivonpl == null)
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
	 * This field has a max length of 28
	 */
	public void setSite(String newVal) {
		site = newVal;
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
	 * This field has a max length of 52
	 */
	public void setSitelink(String newVal) {
		sitelink = newVal;
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
	 * This field has a max length of 17
	 */
	public void setStandardwait(String newVal) {
		standardwait = newVal;
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
	 * This field has a max length of 61
	 */
	public void setTivoapp(String newVal) {
		tivoapp = newVal;
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
	 * This field has a max length of 34
	 */
	public void setTivoapplink(String newVal) {
		tivoapplink = newVal;
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
	 * This field has a max length of 10
	 */
	public void setTivoshortname(String newVal) {
		tivoshortname = newVal;
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
	 * This field has a max length of 56
	 */
	public void setWebinterface(String newVal) {
		webinterface = newVal;
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
	 * This field has a max length of 41
	 */
	public void setWebinterfacelink(String newVal) {
		webinterfacelink = newVal;
	}

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Networks [");
		builder.append("androidapp=").append(androidapp);
		builder.append(", androidapplink=").append(androidapplink);
		builder.append(", comment=").append(comment);
		builder.append(", commentlink=").append(commentlink);
		builder.append(", commercials=").append(commercials);
		builder.append(", commercialslink=").append(commercialslink);
		builder.append(", fireapp=").append(fireapp);
		builder.append(", fireapplink=").append(fireapplink);
		builder.append(", freewithtwcid=").append(freewithtwcid);
		builder.append(", freewithtwcidlink=").append(freewithtwcidlink);
		builder.append(", hasdirectbuyoption=").append(hasdirectbuyoption);
		builder.append(", hasdirectbuyoptionlink=").append(hasdirectbuyoptionlink);
		builder.append(", haswatchlist=").append(haswatchlist);
		builder.append(", icanota=").append(icanota);
		builder.append(", icanotalink=").append(icanotalink);
		builder.append(", id=").append(id);
		builder.append(", iptvservice=").append(iptvservice);
		builder.append(", iptvservicelink=").append(iptvservicelink);
		builder.append(", onhulu=").append(onhulu);
		builder.append(", onhululink=").append(onhululink);
		builder.append(", persistance=").append(persistance);
		builder.append(", remembersplaceinepisode=").append(remembersplaceinepisode);
		builder.append(", rememberswatchedepisodes=").append(rememberswatchedepisodes);
		builder.append(", rokuapp=").append(rokuapp);
		builder.append(", rokuapplink=").append(rokuapplink);
		builder.append(", showsintivonpl=").append(showsintivonpl);
		builder.append(", site=").append(site);
		builder.append(", sitelink=").append(sitelink);
		builder.append(", standardwait=").append(standardwait);
		builder.append(", tivoapp=").append(tivoapp);
		builder.append(", tivoapplink=").append(tivoapplink);
		builder.append(", tivoshortname=").append(tivoshortname);
		builder.append(", webinterface=").append(webinterface);
		builder.append(", webinterfacelink=").append(webinterfacelink);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((androidapp == null) ? 0 : androidapp.hashCode());
		result = prime * result + ((androidapplink == null) ? 0 : androidapplink.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((commentlink == null) ? 0 : commentlink.hashCode());
		result = prime * result + ((commercials == null) ? 0 : commercials.hashCode());
		result = prime * result + ((commercialslink == null) ? 0 : commercialslink.hashCode());
		result = prime * result + ((fireapp == null) ? 0 : fireapp.hashCode());
		result = prime * result + ((fireapplink == null) ? 0 : fireapplink.hashCode());
		result = prime * result + ((freewithtwcid == null) ? 0 : freewithtwcid.hashCode());
		result = prime * result + ((freewithtwcidlink == null) ? 0 : freewithtwcidlink.hashCode());
		result = prime * result + ((hasdirectbuyoption == null) ? 0 : hasdirectbuyoption.hashCode());
		result = prime * result + ((hasdirectbuyoptionlink == null) ? 0 : hasdirectbuyoptionlink.hashCode());
		result = prime * result + ((haswatchlist == null) ? 0 : haswatchlist.hashCode());
		result = prime * result + ((icanota == null) ? 0 : icanota.hashCode());
		result = prime * result + ((icanotalink == null) ? 0 : icanotalink.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iptvservice == null) ? 0 : iptvservice.hashCode());
		result = prime * result + ((iptvservicelink == null) ? 0 : iptvservicelink.hashCode());
		result = prime * result + ((onhulu == null) ? 0 : onhulu.hashCode());
		result = prime * result + ((onhululink == null) ? 0 : onhululink.hashCode());
		result = prime * result + ((persistance == null) ? 0 : persistance.hashCode());
		result = prime * result + ((remembersplaceinepisode == null) ? 0 : remembersplaceinepisode.hashCode());
		result = prime * result + ((rememberswatchedepisodes == null) ? 0 : rememberswatchedepisodes.hashCode());
		result = prime * result + ((rokuapp == null) ? 0 : rokuapp.hashCode());
		result = prime * result + ((rokuapplink == null) ? 0 : rokuapplink.hashCode());
		result = prime * result + ((showsintivonpl == null) ? 0 : showsintivonpl.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
		result = prime * result + ((sitelink == null) ? 0 : sitelink.hashCode());
		result = prime * result + ((standardwait == null) ? 0 : standardwait.hashCode());
		result = prime * result + ((tivoapp == null) ? 0 : tivoapp.hashCode());
		result = prime * result + ((tivoapplink == null) ? 0 : tivoapplink.hashCode());
		result = prime * result + ((tivoshortname == null) ? 0 : tivoshortname.hashCode());
		result = prime * result + ((webinterface == null) ? 0 : webinterface.hashCode());
		result = prime * result + ((webinterfacelink == null) ? 0 : webinterfacelink.hashCode());
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
		Networks other = (Networks) obj;

		if (getAndroidapp() == null) {
			if (other.getAndroidapp() != null)
				return false;
		} else if (!getAndroidapp().equals(other.getAndroidapp()))
			return false;

		if (getAndroidapplink() == null) {
			if (other.getAndroidapplink() != null)
				return false;
		} else if (!getAndroidapplink().equals(other.getAndroidapplink()))
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

		if (getCommercials() == null) {
			if (other.getCommercials() != null)
				return false;
		} else if (!getCommercials().equals(other.getCommercials()))
			return false;

		if (getCommercialslink() == null) {
			if (other.getCommercialslink() != null)
				return false;
		} else if (!getCommercialslink().equals(other.getCommercialslink()))
			return false;

		if (getFireapp() == null) {
			if (other.getFireapp() != null)
				return false;
		} else if (!getFireapp().equals(other.getFireapp()))
			return false;

		if (getFireapplink() == null) {
			if (other.getFireapplink() != null)
				return false;
		} else if (!getFireapplink().equals(other.getFireapplink()))
			return false;

		if (getFreewithtwcid() == null) {
			if (other.getFreewithtwcid() != null)
				return false;
		} else if (!getFreewithtwcid().equals(other.getFreewithtwcid()))
			return false;

		if (getFreewithtwcidlink() == null) {
			if (other.getFreewithtwcidlink() != null)
				return false;
		} else if (!getFreewithtwcidlink().equals(other.getFreewithtwcidlink()))
			return false;

		if (getHasdirectbuyoption() == null) {
			if (other.getHasdirectbuyoption() != null)
				return false;
		} else if (!getHasdirectbuyoption().equals(other.getHasdirectbuyoption()))
			return false;

		if (getHasdirectbuyoptionlink() == null) {
			if (other.getHasdirectbuyoptionlink() != null)
				return false;
		} else if (!getHasdirectbuyoptionlink().equals(other.getHasdirectbuyoptionlink()))
			return false;

		if (getHaswatchlist() == null) {
			if (other.getHaswatchlist() != null)
				return false;
		} else if (!getHaswatchlist().equals(other.getHaswatchlist()))
			return false;

		if (getIcanota() == null) {
			if (other.getIcanota() != null)
				return false;
		} else if (!getIcanota().equals(other.getIcanota()))
			return false;

		if (getIcanotalink() == null) {
			if (other.getIcanotalink() != null)
				return false;
		} else if (!getIcanotalink().equals(other.getIcanotalink()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getIptvservice() == null) {
			if (other.getIptvservice() != null)
				return false;
		} else if (!getIptvservice().equals(other.getIptvservice()))
			return false;

		if (getIptvservicelink() == null) {
			if (other.getIptvservicelink() != null)
				return false;
		} else if (!getIptvservicelink().equals(other.getIptvservicelink()))
			return false;

		if (getOnhulu() == null) {
			if (other.getOnhulu() != null)
				return false;
		} else if (!getOnhulu().equals(other.getOnhulu()))
			return false;

		if (getOnhululink() == null) {
			if (other.getOnhululink() != null)
				return false;
		} else if (!getOnhululink().equals(other.getOnhululink()))
			return false;

		if (getPersistance() == null) {
			if (other.getPersistance() != null)
				return false;
		} else if (!getPersistance().equals(other.getPersistance()))
			return false;

		if (getRemembersplaceinepisode() == null) {
			if (other.getRemembersplaceinepisode() != null)
				return false;
		} else if (!getRemembersplaceinepisode().equals(other.getRemembersplaceinepisode()))
			return false;

		if (getRememberswatchedepisodes() == null) {
			if (other.getRememberswatchedepisodes() != null)
				return false;
		} else if (!getRememberswatchedepisodes().equals(other.getRememberswatchedepisodes()))
			return false;

		if (getRokuapp() == null) {
			if (other.getRokuapp() != null)
				return false;
		} else if (!getRokuapp().equals(other.getRokuapp()))
			return false;

		if (getRokuapplink() == null) {
			if (other.getRokuapplink() != null)
				return false;
		} else if (!getRokuapplink().equals(other.getRokuapplink()))
			return false;

		if (getShowsintivonpl() == null) {
			if (other.getShowsintivonpl() != null)
				return false;
		} else if (!getShowsintivonpl().equals(other.getShowsintivonpl()))
			return false;

		if (getSite() == null) {
			if (other.getSite() != null)
				return false;
		} else if (!getSite().equals(other.getSite()))
			return false;

		if (getSitelink() == null) {
			if (other.getSitelink() != null)
				return false;
		} else if (!getSitelink().equals(other.getSitelink()))
			return false;

		if (getStandardwait() == null) {
			if (other.getStandardwait() != null)
				return false;
		} else if (!getStandardwait().equals(other.getStandardwait()))
			return false;

		if (getTivoapp() == null) {
			if (other.getTivoapp() != null)
				return false;
		} else if (!getTivoapp().equals(other.getTivoapp()))
			return false;

		if (getTivoapplink() == null) {
			if (other.getTivoapplink() != null)
				return false;
		} else if (!getTivoapplink().equals(other.getTivoapplink()))
			return false;

		if (getTivoshortname() == null) {
			if (other.getTivoshortname() != null)
				return false;
		} else if (!getTivoshortname().equals(other.getTivoshortname()))
			return false;

		if (getWebinterface() == null) {
			if (other.getWebinterface() != null)
				return false;
		} else if (!getWebinterface().equals(other.getWebinterface()))
			return false;

		if (getWebinterfacelink() == null) {
			if (other.getWebinterfacelink() != null)
				return false;
		} else if (!getWebinterfacelink().equals(other.getWebinterfacelink()))
			return false;

		return true;
	}

}
