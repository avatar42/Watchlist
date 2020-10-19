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
 * Title: roamiosp Bean <br>
 * Description: Class for holding data from the roamiosp table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 * Table name: roamiosp<br>
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
 * roamiosp => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`roamiosp`")
public class Roamiosp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Cancelled", length = 1)
	private String cancelled;
	@Column(name = "Channel", length = 14)
	private String channel;
	@Column(name = "Channelnum", length = 4)
	private String channelnum;
	@Column(name = "Dup")
	private Integer dup;
	@Column(name = "End")
	private Integer end;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Include", length = 6)
	private String include;
	@Column(name = "InShowsStatus", length = 44)
	private String inshowsstatus;
	@Column(name = "Keep", length = 7)
	private String keep;
	@Column(name = "Network", length = 13)
	private String network;
	@Column(name = "Num")
	private Integer num;
	@Column(name = "Ota", length = 2)
	private String ota;
	@Column(name = "Priority")
	private Integer priority;
	@Column(name = "Record", length = 13)
	private String record;
	@Column(name = "Row")
	private Integer row;
	@Column(name = "Season")
	private Integer season;
	@Column(name = "Show", length = 53)
	private String show;
	@Column(name = "Start")
	private Integer start;
	@Column(name = "Station", length = 10)
	private String station;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;
}
