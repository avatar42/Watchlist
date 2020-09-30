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
 * Title: networksuser Bean <br>
 * Description: Class for holding data from the networksuser table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 * Table name: networksuser<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> * NetworksId => foreign key column name<br>
 * null => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Networks => primary key table name being imported <br>
 * id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * networksuser => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> * Userid => foreign key column name<br>
 * null => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Account => primary key table name being imported <br>
 * id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * networksuser => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Entity
@Table(name = "`networksuser`")
public class Networksuser implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "IUseFReeFreeWithCAblePAyForHUluInstead", length = 1)
	private String iusefreefreewithcablepayforhuluinstead;
	@ManyToOne
	@JoinColumn(name = "NetworksId", referencedColumnName = "id")
	private Networks networks;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;

	/**
	 * Basic constructor
	 */
	public Networksuser() {
	}

	/**
	 * Full constructor
	 *
	 */
	public Networksuser(Integer id, String iusefreefreewithcablepayforhuluinstead) {
		this.id = id;
		this.iusefreefreewithcablepayforhuluinstead = iusefreefreewithcablepayforhuluinstead;
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