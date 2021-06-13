package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: RoamioNpl Form <br>
 * Description: Class for holding data from the RoamioNpl table for editing. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */

@Data
public class RoamionplForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bitratembps;
    @Length(max=16)
	private String channel;
	private BigDecimal datefield;
	private BigDecimal duration;
    @Length(max=10)
	private String episode;
	private Long id = 0l;
	private BigDecimal isnew;
	private Integer rowinshows;
    @Length(max=10)
	private String seriesep;
    @Length(max=73)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String show;
	private Integer sizegb;
	private Long sortabledate;
    @Length(max=76)
	private String title;
	private Account account;
	private Integer watchedtime;

	/**
	 * Clones Roamionpl obj into form
	 *
	 * @param obj
	 */
	public static RoamionplForm getInstance(Roamionpl obj) {
		RoamionplForm form = new RoamionplForm();
		if (obj != null) {
			form.setBitratembps(obj.getBitratembps());
			form.setChannel(obj.getChannel());
			form.setDatefield(obj.getDatefield());
			form.setDuration(obj.getDuration());
			form.setEpisode(obj.getEpisode());
			form.setId(obj.getId());
			form.setIsnew(obj.getIsnew());
			form.setRowinshows(obj.getRowinshows());
			form.setSeriesep(obj.getSeriesep());
			form.setShow(obj.getShow());
			form.setSizegb(obj.getSizegb());
			form.setSortabledate(obj.getSortabledate());
			form.setTitle(obj.getTitle());
			form.setAccount(obj.getAccount());
			form.setWatchedtime(obj.getWatchedtime());
		}
		return form;
	}
}
