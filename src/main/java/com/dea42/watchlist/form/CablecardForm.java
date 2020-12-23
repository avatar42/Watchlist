package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: cablecard Form <br>
 * Description: Class for holding data from the cablecard table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */

@Data
public class CablecardForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=12)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String channelname;
	private Integer channelnumber;
	private Integer dt;
	private Integer hd;
	private Integer id;
	private Integer innpl;
    @Length(max=2)
	private String lang;
    @Length(max=12)
	private String net;
    @Length(max=3)
	private String receiving;
    @Length(max=12)
	private String shortfield;
	private Account account;

	/**
	 * Clones Cablecard obj into form
	 *
	 * @param obj
	 */
	public static CablecardForm getInstance(Cablecard obj) {
		CablecardForm form = new CablecardForm();
		if (obj != null) {
			form.setChannelname(obj.getChannelname());
			form.setChannelnumber(obj.getChannelnumber());
			form.setDt(obj.getDt());
			form.setHd(obj.getHd());
			form.setId(obj.getId());
			form.setInnpl(obj.getInnpl());
			form.setLang(obj.getLang());
			form.setNet(obj.getNet());
			form.setReceiving(obj.getReceiving());
			form.setShortfield(obj.getShortfield());
			form.setAccount(obj.getAccount());
		}
		return form;
	}
}
