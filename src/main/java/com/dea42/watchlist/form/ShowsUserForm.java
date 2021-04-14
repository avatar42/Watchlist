package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: showsuser Form <br>
 * Description: Class for holding data from the showsuser table for editing. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */

@Data
public class ShowsUserForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=17)
	private String bestexperience;
    @Length(max=187)
	private String comment;
    @Length(max=3)
	private String diff;
	private Integer id;
    @Length(max=2)
	private String imdb;
    @Length(max=1)
	private String inrokufeed;
    @Length(max=47)
	private String inshowrssas;
    @Length(max=2)
	private String justwatch;
    @Length(max=10)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String lastwatched;
    @Length(max=1)
	private String ota;
	private Shows shows;
    @Length(max=6)
	private String tablolink;
	private Account account;

	/**
	 * Clones ShowsUser obj into form
	 *
	 * @param obj
	 */
	public static ShowsUserForm getInstance(ShowsUser obj) {
		ShowsUserForm form = new ShowsUserForm();
		if (obj != null) {
			form.setBestexperience(obj.getBestexperience());
			form.setComment(obj.getComment());
			form.setDiff(obj.getDiff());
			form.setId(obj.getId());
			form.setImdb(obj.getImdb());
			form.setInrokufeed(obj.getInrokufeed());
			form.setInshowrssas(obj.getInshowrssas());
			form.setJustwatch(obj.getJustwatch());
			form.setLastwatched(obj.getLastwatched());
			form.setOta(obj.getOta());
			form.setShows(obj.getShows());
			form.setTablolink(obj.getTablolink());
			form.setAccount(obj.getAccount());
		}
		return form;
	}
}
