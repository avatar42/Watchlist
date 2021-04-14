package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 * Title: showsuser Bean <br>
 * Description: Class for holding data from the showsuser table. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 * Table name: showsuser<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> * ShowsId => foreign key column name<br>
 * null => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Shows => primary key table name being imported <br>
 * Id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * showsuser => foreign key table name <br>
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
 * Id => primary key column name being imported<br>
 * null => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * showsuser => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`showsuser`")
public class ShowsUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BestExperience", length = 17)
	private String bestexperience;
	@Column(name = "Comment", length = 187)
	private String comment;
	@Column(name = "Diff", length = 3)
	private String diff;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Imdb", length = 2)
	private String imdb;
	@Column(name = "InRokuFeed", length = 1)
	private String inrokufeed;
	@Column(name = "InShowRssAs", length = 47)
	private String inshowrssas;
	@Column(name = "JustWatch", length = 2)
	private String justwatch;
	@Column(name = "LastWatched", nullable = false, length = 10)
	private String lastwatched;
	@Column(name = "Ota", length = 1)
	private String ota;
	@ManyToOne
	@JoinColumn(name = "ShowsId", referencedColumnName = "Id")
	private Shows shows;
	@Column(name = "TabloLink", length = 6)
	private String tablolink;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "Id")
	private Account account;
}
