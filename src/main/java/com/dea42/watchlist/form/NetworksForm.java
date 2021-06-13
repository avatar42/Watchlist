package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: Networks Form <br>
 * Description: Class for holding data from the Networks table for editing. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */

@Data
public class NetworksForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=1)
	private String androidapp;
    @Length(max=458)
	private String comment;
    @Length(max=68)
	private String commercials;
    @Length(max=56)
	private String fireapp;
    @Length(max=57)
	private String freewithtwcid;
    @Length(max=82)
	private String hasdirectbuyoption;
    @Length(max=46)
	private String haswatchlist;
    @Length(max=63)
	private String icanota;
	private Long id = 0l;
    @Length(max=214)
	private String iptvservice;
    @Length(max=14)
	private String onhulu;
    @Length(max=70)
	private String persistance;
    @Length(max=57)
	private String remembersplaceinepisode;
    @Length(max=35)
	private String rememberswatchedepisodes;
    @Length(max=97)
	private String rokuapp;
	private Integer showsintivonpl;
    @Length(max=28)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String site;
    @Length(max=17)
	private String standardwait;
    @Length(max=61)
	private String tivoapp;
    @Length(max=10)
	private String tivoshortname;
    @Length(max=56)
	private String webinterface;

	/**
	 * Clones Networks obj into form
	 *
	 * @param obj
	 */
	public static NetworksForm getInstance(Networks obj) {
		NetworksForm form = new NetworksForm();
		if (obj != null) {
			form.setAndroidapp(obj.getAndroidapp());
			form.setComment(obj.getComment());
			form.setCommercials(obj.getCommercials());
			form.setFireapp(obj.getFireapp());
			form.setFreewithtwcid(obj.getFreewithtwcid());
			form.setHasdirectbuyoption(obj.getHasdirectbuyoption());
			form.setHaswatchlist(obj.getHaswatchlist());
			form.setIcanota(obj.getIcanota());
			form.setId(obj.getId());
			form.setIptvservice(obj.getIptvservice());
			form.setOnhulu(obj.getOnhulu());
			form.setPersistance(obj.getPersistance());
			form.setRemembersplaceinepisode(obj.getRemembersplaceinepisode());
			form.setRememberswatchedepisodes(obj.getRememberswatchedepisodes());
			form.setRokuapp(obj.getRokuapp());
			form.setShowsintivonpl(obj.getShowsintivonpl());
			form.setSite(obj.getSite());
			form.setStandardwait(obj.getStandardwait());
			form.setTivoapp(obj.getTivoapp());
			form.setTivoshortname(obj.getTivoshortname());
			form.setWebinterface(obj.getWebinterface());
		}
		return form;
	}
}
