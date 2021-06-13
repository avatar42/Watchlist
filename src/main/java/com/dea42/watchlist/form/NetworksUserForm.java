package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * Title: NetworksUser Form <br>
 * Description: Class for holding data from the NetworksUser table for editing. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */

@Data
public class NetworksUserForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id = 0l;
    @Length(max=1)
	private String iusefreefreewithcablepayforhuluinstead;
	private Networks networks;
	private Account account;

	/**
	 * Clones NetworksUser obj into form
	 *
	 * @param obj
	 */
	public static NetworksUserForm getInstance(NetworksUser obj) {
		NetworksUserForm form = new NetworksUserForm();
		if (obj != null) {
			form.setId(obj.getId());
			form.setIusefreefreewithcablepayforhuluinstead(obj.getIusefreefreewithcablepayforhuluinstead());
			form.setNetworks(obj.getNetworks());
			form.setAccount(obj.getAccount());
		}
		return form;
	}
}
