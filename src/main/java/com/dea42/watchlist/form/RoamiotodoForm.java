package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Roamiotodo;

import com.dea42.watchlist.entity.Account;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: roamiotodo Form <br>
 * Description: Class for holding data from the roamiotodo table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */

@Data
public class RoamiotodoForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=16)
	private String channel;
    @Length(max=30)
	private String coli;
	private Integer date;
    @Length(max=4)
	private String duration;
	private Integer ep;
	private Integer epdate;
    @Length(max=31)
	private String episode;
    @Length(max=2)
	private String episodename;
    @Length(max=2)
	private String epname2;
    @Length(max=4)
	private String epname3;
    @Length(max=20)
	private String epnum;
	private Integer id;
    @Length(max=96)
	private String show;
    @Length(max=67)
	private String showname;
    @Length(max=66)
	private String showtrimmed;
	private Integer sortabledate;
	private Account account;

	/**
	 * Clones Roamiotodo obj into form
	 *
	 * @param obj
	 */
	public static RoamiotodoForm getInstance(Roamiotodo obj) {
		RoamiotodoForm form = new RoamiotodoForm();
		form.setChannel(obj.getChannel());
		form.setColi(obj.getColi());
		form.setDate(obj.getDate());
		form.setDuration(obj.getDuration());
		form.setEp(obj.getEp());
		form.setEpdate(obj.getEpdate());
		form.setEpisode(obj.getEpisode());
		form.setEpisodename(obj.getEpisodename());
		form.setEpname2(obj.getEpname2());
		form.setEpname3(obj.getEpname3());
		form.setEpnum(obj.getEpnum());
		form.setId(obj.getId());
		form.setShow(obj.getShow());
		form.setShowname(obj.getShowname());
		form.setShowtrimmed(obj.getShowtrimmed());
		form.setSortabledate(obj.getSortabledate());
		form.setAccount(obj.getAccount());
		return form;
	}
}
