package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Ota;

import com.dea42.watchlist.entity.Account;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: ota Form <br>
 * Description: Class for holding data from the ota table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */

@Data
public class OtaForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer atticant;
	private Integer chan;
    @Length(max=9)
	private String channelname;
	private BigDecimal channelnumber;
    @Length(max=17)
	private String channelnumberchannelnameincluded;
    @Length(max=31)
	private String comments;
    @Length(max=4)
	private String direction;
    @Length(max=3)
	private String enabled;
    @Length(max=9)
	private String fccinfo;
    @Length(max=6)
	private String fccinfolink;
	private Integer freq;
	private Integer id;
    @Length(max=2)
	private String lang;
	private Integer listed;
	private Integer mytivoavgstrength;
    @Length(max=8)
	private String network;
    @Length(max=3)
	private String off;
    @Length(max=41)
	private String recommendedantenna;
    @Length(max=5)
	private String rez;
    @Length(max=20)
	private String shelfant;
    @Length(max=9)
	private String station;
	private Integer subchan;
    @Length(max=4)
	private String tvfoolestsignal;
	private Account account;
    @Length(max=4)
	private String watchable;

	/**
	 * Clones Ota obj into form
	 *
	 * @param obj
	 */
	public static OtaForm getInstance(Ota obj) {
		OtaForm form = new OtaForm();
		form.setAtticant(obj.getAtticant());
		form.setChan(obj.getChan());
		form.setChannelname(obj.getChannelname());
		form.setChannelnumber(obj.getChannelnumber());
		form.setChannelnumberchannelnameincluded(obj.getChannelnumberchannelnameincluded());
		form.setComments(obj.getComments());
		form.setDirection(obj.getDirection());
		form.setEnabled(obj.getEnabled());
		form.setFccinfo(obj.getFccinfo());
		form.setFccinfolink(obj.getFccinfolink());
		form.setFreq(obj.getFreq());
		form.setId(obj.getId());
		form.setLang(obj.getLang());
		form.setListed(obj.getListed());
		form.setMytivoavgstrength(obj.getMytivoavgstrength());
		form.setNetwork(obj.getNetwork());
		form.setOff(obj.getOff());
		form.setRecommendedantenna(obj.getRecommendedantenna());
		form.setRez(obj.getRez());
		form.setShelfant(obj.getShelfant());
		form.setStation(obj.getStation());
		form.setSubchan(obj.getSubchan());
		form.setTvfoolestsignal(obj.getTvfoolestsignal());
		form.setAccount(obj.getAccount());
		form.setWatchable(obj.getWatchable());
		return form;
	}
}
