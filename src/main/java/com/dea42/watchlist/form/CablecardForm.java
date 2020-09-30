package com.dea42.watchlist.form;

import java.io.Serializable;


import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Cablecard;

import com.dea42.watchlist.entity.Account;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: cablecard Form <br>
 * Description: Class for holding data from the cablecard table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */

public class CablecardForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=12)
	private String channelname;
	private Integer channelnumber;
	private Integer colh;
	private Integer dt;
	private Integer hd;
	private Integer id;
	private Integer innpl;
    @Length(max=2)
	private String lang;
    @Length(max=12)
	private String net;
    @Length(max=20)
	private String od;
    @Length(max=3)
	private String receiving;
    @Length(max=12)
	private String shortfield;
	private Account account;

	/**
	 * Basic constructor
	 */
	public CablecardForm() {
	}

	/**
	 * Clones Cablecard obj into form
	 *
	 * @param obj
	 */
	public static CablecardForm getInstance(Cablecard obj) {
		CablecardForm form = new CablecardForm();
		form.setChannelname(obj.getChannelname());
		form.setChannelnumber(obj.getChannelnumber());
		form.setColh(obj.getColh());
		form.setDt(obj.getDt());
		form.setHd(obj.getHd());
		form.setId(obj.getId());
		form.setInnpl(obj.getInnpl());
		form.setLang(obj.getLang());
		form.setNet(obj.getNet());
		form.setOd(obj.getOd());
		form.setReceiving(obj.getReceiving());
		form.setShortfield(obj.getShortfield());
		form.setAccount(obj.getAccount());
		return form;
	}
	/**
	 * returns value of the ChannelName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getChannelname() {
		return channelname;
	}

	/**
	 * sets value of the ChannelName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 12
	 */
	public void setChannelname(String newVal) {
		channelname = newVal;
	}

	/**
	 * returns value of the ChannelNumber column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getChannelnumber() {
		if (channelnumber == null)
	    	return 0;
		return channelnumber.intValue();
	}

	/**
	 * sets value of the ChannelNumber column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setChannelnumber(Integer newVal) {
		channelnumber = newVal;
	}

	/**
	 * returns value of the Colh column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getColh() {
		if (colh == null)
	    	return 0;
		return colh.intValue();
	}

	/**
	 * sets value of the Colh column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setColh(Integer newVal) {
		colh = newVal;
	}

	/**
	 * returns value of the Dt column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getDt() {
		if (dt == null)
	    	return 0;
		return dt.intValue();
	}

	/**
	 * sets value of the Dt column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setDt(Integer newVal) {
		dt = newVal;
	}

	/**
	 * returns value of the Hd column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getHd() {
		if (hd == null)
	    	return 0;
		return hd.intValue();
	}

	/**
	 * sets value of the Hd column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setHd(Integer newVal) {
		hd = newVal;
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
	 * returns value of the InNpl column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getInnpl() {
		if (innpl == null)
	    	return 0;
		return innpl.intValue();
	}

	/**
	 * sets value of the InNpl column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setInnpl(Integer newVal) {
		innpl = newVal;
	}

	/**
	 * returns value of the Lang column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * sets value of the Lang column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 2
	 */
	public void setLang(String newVal) {
		lang = newVal;
	}

	/**
	 * returns value of the Net column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNet() {
		return net;
	}

	/**
	 * sets value of the Net column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 12
	 */
	public void setNet(String newVal) {
		net = newVal;
	}

	/**
	 * returns value of the Od column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOd() {
		return od;
	}

	/**
	 * sets value of the Od column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 20
	 */
	public void setOd(String newVal) {
		od = newVal;
	}

	/**
	 * returns value of the Receiving column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getReceiving() {
		return receiving;
	}

	/**
	 * sets value of the Receiving column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 3
	 */
	public void setReceiving(String newVal) {
		receiving = newVal;
	}

	/**
	 * returns value of the ShortField column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getShortfield() {
		return shortfield;
	}

	/**
	 * sets value of the ShortField column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 12
	 */
	public void setShortfield(String newVal) {
		shortfield = newVal;
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
		builder.append("Cablecard [");
		builder.append("channelname=").append(channelname);
		builder.append(", channelnumber=").append(channelnumber);
		builder.append(", colh=").append(colh);
		builder.append(", dt=").append(dt);
		builder.append(", hd=").append(hd);
		builder.append(", id=").append(id);
		builder.append(", innpl=").append(innpl);
		builder.append(", lang=").append(lang);
		builder.append(", net=").append(net);
		builder.append(", od=").append(od);
		builder.append(", receiving=").append(receiving);
		builder.append(", shortfield=").append(shortfield);
		builder.append(", account=").append(account);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((channelname == null) ? 0 : channelname.hashCode());
		result = prime * result + ((channelnumber == null) ? 0 : channelnumber.hashCode());
		result = prime * result + ((colh == null) ? 0 : colh.hashCode());
		result = prime * result + ((dt == null) ? 0 : dt.hashCode());
		result = prime * result + ((hd == null) ? 0 : hd.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((innpl == null) ? 0 : innpl.hashCode());
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((net == null) ? 0 : net.hashCode());
		result = prime * result + ((od == null) ? 0 : od.hashCode());
		result = prime * result + ((receiving == null) ? 0 : receiving.hashCode());
		result = prime * result + ((shortfield == null) ? 0 : shortfield.hashCode());
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
		Cablecard other = (Cablecard) obj;

		if (getChannelname() == null) {
			if (other.getChannelname() != null)
				return false;
		} else if (!getChannelname().equals(other.getChannelname()))
			return false;

		if (getChannelnumber() == null) {
			if (other.getChannelnumber() != null)
				return false;
		} else if (!getChannelnumber().equals(other.getChannelnumber()))
			return false;

		if (getColh() == null) {
			if (other.getColh() != null)
				return false;
		} else if (!getColh().equals(other.getColh()))
			return false;

		if (getDt() == null) {
			if (other.getDt() != null)
				return false;
		} else if (!getDt().equals(other.getDt()))
			return false;

		if (getHd() == null) {
			if (other.getHd() != null)
				return false;
		} else if (!getHd().equals(other.getHd()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getInnpl() == null) {
			if (other.getInnpl() != null)
				return false;
		} else if (!getInnpl().equals(other.getInnpl()))
			return false;

		if (getLang() == null) {
			if (other.getLang() != null)
				return false;
		} else if (!getLang().equals(other.getLang()))
			return false;

		if (getNet() == null) {
			if (other.getNet() != null)
				return false;
		} else if (!getNet().equals(other.getNet()))
			return false;

		if (getOd() == null) {
			if (other.getOd() != null)
				return false;
		} else if (!getOd().equals(other.getOd()))
			return false;

		if (getReceiving() == null) {
			if (other.getReceiving() != null)
				return false;
		} else if (!getReceiving().equals(other.getReceiving()))
			return false;

		if (getShortfield() == null) {
			if (other.getShortfield() != null)
				return false;
		} else if (!getShortfield().equals(other.getShortfield()))
			return false;

		if (getAccount() == null) {
			if (other.getAccount() != null)
				return false;
		} else if (!getAccount().equals(other.getAccount()))
			return false;

		return true;
	}

}
