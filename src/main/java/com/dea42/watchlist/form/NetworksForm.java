package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Networks;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: networks Form <br>
 * Description: Class for holding data from the networks table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */

@Data
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
}
