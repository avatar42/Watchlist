package com.dea42.watchlist.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Title: RoamioNpl Bean <br>
 * Description: Class for holding data from the RoamioNpl table. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: RoamioNpl<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br> * Userid => foreign key column name<br>
 * Watchlist => primary key table catalog being imported (may be null)<br>
 * null => primary key table schema being imported (may be null) <br>
 * Account => primary key table name being imported <br>
 * id => primary key column name being imported<br>
 * Watchlist => foreign key table catalog (may be null)<br>
 * null => foreign key table schema (may be null)<br>
 * RoamioNpl => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 1 => What happens to a foreign key when the primary key is updated:<br>
 * 1 => What happens to the foreign key when primary is deleted.<br>
 * FK_RoamioNpl_Userid => foreign key name (may be null) <br>
 * null => primary key name (may be null) <br>
 * 7 DEFERRABILITY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`RoamioNpl`")
public class Roamionpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BitrateMbps")
	private Integer bitratembps;
	@Column(name = "Channel", length = 16)
	private String channel;
	@Column(name = "DateField")
	private BigDecimal datefield;
	@Column(name = "Duration")
	private BigDecimal duration;
	@Column(name = "Episode", length = 10)
	private String episode;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "Isnew")
	private BigDecimal isnew;
	@Column(name = "RowInShows")
	private Integer rowinshows;
	@Column(name = "Seriesep", length = 10)
	private String seriesep;
	@Column(name = "Show", nullable = false, length = 73)
	private String show;
	@Column(name = "SizeGb")
	private Integer sizegb;
	@Column(name = "SortableDate")
	private Long sortabledate;
	@Column(name = "Title", length = 76)
	private String title;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;
	@Column(name = "Watchedtime")
	private Integer watchedtime;
}
