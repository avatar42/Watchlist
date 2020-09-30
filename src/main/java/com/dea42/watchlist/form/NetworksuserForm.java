package com.dea42.watchlist.form;

import java.io.Serializable;


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
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */

public class NetworksuserForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
    @Length(max=1)
	private String iusefreefreewithcablepayforhuluinstead;
	private Networks networks;
	private Account account;

	/**
	 * Basic constructor
	 */
	public NetworksuserForm() {
	}

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
	/**
	 * returns value of the id column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getId() {
		if (id == null)
	    	return 0;
		return id.intValue();
	}

	/**
	 * sets value of the id column of this row of data
	 * default value for this field set by the DB is null
	 * This is the primary key for this table
	 */
	public void setId(Integer newVal) {
		id = newVal;
	}

	/**
	 * returns value of the IUseFReeFreeWithCAblePAyForHUluInstead column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getIusefreefreewithcablepayforhuluinstead() {
		return iusefreefreewithcablepayforhuluinstead;
	}

	/**
	 * sets value of the IUseFReeFreeWithCAblePAyForHUluInstead column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 1
	 */
	public void setIusefreefreewithcablepayforhuluinstead(String newVal) {
		iusefreefreewithcablepayforhuluinstead = newVal;
	}

	/**
	 * returns value of the NetworksId column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Networks getNetworks() {
		return networks;
	}

	/**
	 * sets value of the NetworksId column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setNetworks(Networks newVal) {
		networks = newVal;
	}

	/**
	 * returns value of the Userid column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * sets value of the Userid column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setAccount(Account newVal) {
		account = newVal;
	}

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Networksuser [");
		builder.append("id=").append(id);
		builder.append(", iusefreefreewithcablepayforhuluinstead=").append(iusefreefreewithcablepayforhuluinstead);
		builder.append(", networks=").append(networks);
		builder.append(", account=").append(account);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iusefreefreewithcablepayforhuluinstead == null) ? 0 : iusefreefreewithcablepayforhuluinstead.hashCode());
		result = prime * result + ((networks == null) ? 0 : networks.hashCode());
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		return result;
	}

	/**
	 * Mainly for mock testing
	 *
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Networksuser other = (Networksuser) obj;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getIusefreefreewithcablepayforhuluinstead() == null) {
			if (other.getIusefreefreewithcablepayforhuluinstead() != null)
				return false;
		} else if (!getIusefreefreewithcablepayforhuluinstead().equals(other.getIusefreefreewithcablepayforhuluinstead()))
			return false;

		if (getNetworks() == null) {
			if (other.getNetworks() != null)
				return false;
		} else if (!getNetworks().equals(other.getNetworks()))
			return false;

		if (getAccount() == null) {
			if (other.getAccount() != null)
				return false;
		} else if (!getAccount().equals(other.getAccount()))
			return false;

		return true;
	}

}
