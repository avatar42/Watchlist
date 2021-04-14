package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: ota Form <br>
 * Description: Class for holding data from the ota table for editing. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */

@Data
public class OtaForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer atticant;
	private Integer chan;
    @Length(max=10)
	private String channelname;
    @Length(max=4)
	private String channelnumber;
    @Length(max=18)
	private String channelnumberchannelnameincluded;
    @Length(max=31)
	private String comments;
    @Length(max=4)
	private String direction;
    @Length(max=3)
	private String enabled;
    @Length(max=10)
	private String fccinfo;
	private Integer freq;
	private Integer id;
    @Length(max=2)
	private String langfield;
	private Integer listed;
	private Integer mytivoavgstrength;
    @Length(max=15)
	private String network;
    @Length(max=5)
	private String off;
    @Length(max=41)
	private String recommendedantenna;
    @Length(max=5)
	private String rez;
    @Length(max=5)
	private String station;
	private Integer subchan;
	private BigDecimal tvfoolchan;
    @Length(max=5)
	private String tvfoolestsignal;
	private Account account;
    @Length(max=7)
	private String watchabletablo;
    @Length(max=4)
	private String watchabletivo;

	/**
	 * Clones Ota obj into form
	 *
	 * @param obj
	 */
	public static OtaForm getInstance(Ota obj) {
		OtaForm form = new OtaForm();
		if (obj != null) {
			form.setAtticant(obj.getAtticant());
			form.setChan(obj.getChan());
			form.setChannelname(obj.getChannelname());
			form.setChannelnumber(obj.getChannelnumber());
			form.setChannelnumberchannelnameincluded(obj.getChannelnumberchannelnameincluded());
			form.setComments(obj.getComments());
			form.setDirection(obj.getDirection());
			form.setEnabled(obj.getEnabled());
			form.setFccinfo(obj.getFccinfo());
			form.setFreq(obj.getFreq());
			form.setId(obj.getId());
			form.setLangfield(obj.getLangfield());
			form.setListed(obj.getListed());
			form.setMytivoavgstrength(obj.getMytivoavgstrength());
			form.setNetwork(obj.getNetwork());
			form.setOff(obj.getOff());
			form.setRecommendedantenna(obj.getRecommendedantenna());
			form.setRez(obj.getRez());
			form.setStation(obj.getStation());
			form.setSubchan(obj.getSubchan());
			form.setTvfoolchan(obj.getTvfoolchan());
			form.setTvfoolestsignal(obj.getTvfoolestsignal());
			form.setAccount(obj.getAccount());
			form.setWatchabletablo(obj.getWatchabletablo());
			form.setWatchabletivo(obj.getWatchabletivo());
		}
		return form;
	}
}
