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
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */

@Data
public class ShowsUserForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=17)
	private String bestexperience;
    @Length(max=306)
	private String bestexperiencelink;
    @Length(max=181)
	private String comment;
    @Length(max=228)
	private String commentlink;
    @Length(max=3)
	private String diff;
	private Integer id;
    @Length(max=2)
	private String imdb;
    @Length(max=63)
	private String imdblink;
    @Length(max=1)
	private String inrokufeed;
    @Length(max=47)
	private String inshowrssas;
    @Length(max=32)
	private String inshowrssaslink;
    @Length(max=1)
	private String intablo;
    @Length(max=2)
	private String justwatch;
    @Length(max=75)
	private String justwatchlink;
    @Length(max=10)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String lastwatched;
    @Length(max=1)
	private String ota;
	private Shows shows;
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
			form.setBestexperiencelink(obj.getBestexperiencelink());
			form.setComment(obj.getComment());
			form.setCommentlink(obj.getCommentlink());
			form.setDiff(obj.getDiff());
			form.setId(obj.getId());
			form.setImdb(obj.getImdb());
			form.setImdblink(obj.getImdblink());
			form.setInrokufeed(obj.getInrokufeed());
			form.setInshowrssas(obj.getInshowrssas());
			form.setInshowrssaslink(obj.getInshowrssaslink());
			form.setIntablo(obj.getIntablo());
			form.setJustwatch(obj.getJustwatch());
			form.setJustwatchlink(obj.getJustwatchlink());
			form.setLastwatched(obj.getLastwatched());
			form.setOta(obj.getOta());
			form.setShows(obj.getShows());
			form.setAccount(obj.getAccount());
		}
		return form;
	}
}
