package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: roamiosp Form <br>
 * Description: Class for holding data from the roamiosp table for editing. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */

@Data
public class RoamiospForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=14)
	private String channel;
	private Integer end;
	private Integer id;
    @Length(max=8)
	private String include;
    @Length(max=7)
	private String keep;
	private Integer num;
	private Integer priority;
    @Length(max=13)
	private String record;
	private Integer season;
    @Length(max=60)
	private String show;
	private Integer start;
	private Account account;

	/**
	 * Clones Roamiosp obj into form
	 *
	 * @param obj
	 */
	public static RoamiospForm getInstance(Roamiosp obj) {
		RoamiospForm form = new RoamiospForm();
		if (obj != null) {
			form.setChannel(obj.getChannel());
			form.setEnd(obj.getEnd());
			form.setId(obj.getId());
			form.setInclude(obj.getInclude());
			form.setKeep(obj.getKeep());
			form.setNum(obj.getNum());
			form.setPriority(obj.getPriority());
			form.setRecord(obj.getRecord());
			form.setSeason(obj.getSeason());
			form.setShow(obj.getShow());
			form.setStart(obj.getStart());
			form.setAccount(obj.getAccount());
		}
		return form;
	}
}
