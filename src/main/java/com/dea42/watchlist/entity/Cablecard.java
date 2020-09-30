package com.dea42.watchlist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Title: cablecard Bean <br>
 * Description: Class for holding data from the cablecard table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 * Table name: cablecard<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> * Userid => foreign key column name<br>
 * null => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Account => primary key table name being imported <br>
 * id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * cablecard => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Entity
@Table(name = "`cablecard`")
public class Cablecard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ChannelName", length = 12)
	private String channelname;
	@Column(name = "ChannelNumber")
	private Integer channelnumber;
	@Column(name = "Colh")
	private Integer colh;
	@Column(name = "Dt")
	private Integer dt;
	@Column(name = "Hd")
	private Integer hd;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "InNpl")
	private Integer innpl;
	@Column(name = "Lang", length = 2)
	private String lang;
	@Column(name = "Net", length = 12)
	private String net;
	@Column(name = "Od", length = 20)
	private String od;
	@Column(name = "Receiving", length = 3)
	private String receiving;
	@Column(name = "ShortField", length = 12)
	private String shortfield;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;

	/**
	 * Basic constructor
	 */
	public Cablecard() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Cablecard(String channelname, Integer channelnumber, Integer colh, Integer dt, Integer hd, Integer id, Integer innpl, String lang, String net, String od, String receiving, String shortfield) {
		this.channelname = channelname;
		this.channelnumber = channelnumber;
		this.colh = colh;
		this.dt = dt;
		this.hd = hd;
		this.id = id;
		this.innpl = innpl;
		this.lang = lang;
		this.net = net;
		this.od = od;
		this.receiving = receiving;
		this.shortfield = shortfield;
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
