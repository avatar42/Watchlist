package com.dea42.watchlist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Title: cablecard Bean <br>
 * Description: Class for holding data from the cablecard table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
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
@Data
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
}
