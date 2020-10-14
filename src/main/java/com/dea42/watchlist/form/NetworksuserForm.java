package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Networksuser;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Networks;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: networksuser Form <br>
 * Description: Class for holding data from the networksuser table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.2<br>
 * @version 0.5.2<br>
 */

@Data
public class NetworksuserForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
    @Length(max=1)
	private String iusefreefreewithcablepayforhuluinstead;
	private Networks networks;
	private Account account;

	/**
	 * Clones Networksuser obj into form
	 *
	 * @param obj
	 */
	public static NetworksuserForm getInstance(Networksuser obj) {
		NetworksuserForm form = new NetworksuserForm();
		form.setId(obj.getId());
		form.setIusefreefreewithcablepayforhuluinstead(obj.getIusefreefreewithcablepayforhuluinstead());
		form.setNetworks(obj.getNetworks());
		form.setAccount(obj.getAccount());
		return form;
	}
}
