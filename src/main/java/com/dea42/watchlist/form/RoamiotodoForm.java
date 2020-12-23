package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Title: roamiotodo Form <br>
 * Description: Class for holding data from the roamiotodo table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */

@Data
public class RoamiotodoForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=15)
	private String channel;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date date;
    @Length(max=4)
	private String duration;
    @Length(max=50)
	private String ep;
    @Length(max=59)
	private String episodename;
	private Integer id;
    @Length(max=48)
	private String showname;
    @Length(max=47)
	private String showtrimmed;
	private Account account;

	/**
	 * Clones Roamiotodo obj into form
	 *
	 * @param obj
	 */
	public static RoamiotodoForm getInstance(Roamiotodo obj) {
		RoamiotodoForm form = new RoamiotodoForm();
		if (obj != null) {
			form.setChannel(obj.getChannel());
			form.setDate(obj.getDate());
			form.setDuration(obj.getDuration());
			form.setEp(obj.getEp());
			form.setEpisodename(obj.getEpisodename());
			form.setId(obj.getId());
			form.setShowname(obj.getShowname());
			form.setShowtrimmed(obj.getShowtrimmed());
			form.setAccount(obj.getAccount());
		}
		return form;
	}
}
