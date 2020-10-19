package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Roamionpl;

import com.dea42.watchlist.entity.Account;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: roamionpl Form <br>
 * Description: Class for holding data from the roamionpl table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */

@Data
public class RoamionplForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bitratembps;
    @Length(max=62)
	private String chan;
    @Length(max=16)
	private String channel;
	private Integer date;
	private Integer duration;
    @Length(max=4)
	private String episode;
    @Length(max=62)
	private String f;
	private Integer id;
    @Length(max=7)
	private String innetworkstab;
	private Integer isnew;
	private Integer isseries;
    @Length(max=33)
	private String network;
	private Integer rowinshows;
	private Integer seriesep;
    @Length(max=52)
	private String show;
	private Integer sizegb;
	private Integer sortabledate;
    @Length(max=1)
	private String spchannel0nosp;
    @Length(max=69)
	private String title;
	private Account account;
    @Length(max=6)
	private String watched;
	private Integer watchedtime;

	/**
	 * Clones Roamionpl obj into form
	 *
	 * @param obj
	 */
	public static RoamionplForm getInstance(Roamionpl obj) {
		RoamionplForm form = new RoamionplForm();
		form.setBitratembps(obj.getBitratembps());
		form.setChan(obj.getChan());
		form.setChannel(obj.getChannel());
		form.setDate(obj.getDate());
		form.setDuration(obj.getDuration());
		form.setEpisode(obj.getEpisode());
		form.setF(obj.getF());
		form.setId(obj.getId());
		form.setInnetworkstab(obj.getInnetworkstab());
		form.setIsnew(obj.getIsnew());
		form.setIsseries(obj.getIsseries());
		form.setNetwork(obj.getNetwork());
		form.setRowinshows(obj.getRowinshows());
		form.setSeriesep(obj.getSeriesep());
		form.setShow(obj.getShow());
		form.setSizegb(obj.getSizegb());
		form.setSortabledate(obj.getSortabledate());
		form.setSpchannel0nosp(obj.getSpchannel0nosp());
		form.setTitle(obj.getTitle());
		form.setAccount(obj.getAccount());
		form.setWatched(obj.getWatched());
		form.setWatchedtime(obj.getWatchedtime());
		return form;
	}
}
