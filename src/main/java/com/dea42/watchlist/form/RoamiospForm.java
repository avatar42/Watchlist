package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Roamiosp;

import com.dea42.watchlist.entity.Account;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: roamiosp Form <br>
 * Description: Class for holding data from the roamiosp table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */

@Data
public class RoamiospForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=1)
	private String cancelled;
    @Length(max=14)
	private String channel;
    @Length(max=4)
	private String channelnum;
	private Integer dup;
	private Integer end;
	private Integer id;
    @Length(max=6)
	private String include;
    @Length(max=44)
	private String inshowsstatus;
    @Length(max=7)
	private String keep;
    @Length(max=13)
	private String network;
	private Integer num;
    @Length(max=2)
	private String ota;
	private Integer priority;
    @Length(max=13)
	private String record;
	private Integer row;
	private Integer season;
    @Length(max=53)
	private String show;
	private Integer start;
    @Length(max=10)
	private String station;
	private Account account;

	/**
	 * Clones Roamiosp obj into form
	 *
	 * @param obj
	 */
	public static RoamiospForm getInstance(Roamiosp obj) {
		RoamiospForm form = new RoamiospForm();
		form.setCancelled(obj.getCancelled());
		form.setChannel(obj.getChannel());
		form.setChannelnum(obj.getChannelnum());
		form.setDup(obj.getDup());
		form.setEnd(obj.getEnd());
		form.setId(obj.getId());
		form.setInclude(obj.getInclude());
		form.setInshowsstatus(obj.getInshowsstatus());
		form.setKeep(obj.getKeep());
		form.setNetwork(obj.getNetwork());
		form.setNum(obj.getNum());
		form.setOta(obj.getOta());
		form.setPriority(obj.getPriority());
		form.setRecord(obj.getRecord());
		form.setRow(obj.getRow());
		form.setSeason(obj.getSeason());
		form.setShow(obj.getShow());
		form.setStart(obj.getStart());
		form.setStation(obj.getStation());
		form.setAccount(obj.getAccount());
		return form;
	}
}
