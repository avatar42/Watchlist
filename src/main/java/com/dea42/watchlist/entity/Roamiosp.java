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
 * Title: RoamioSp Bean <br>
 * Description: Class for holding data from the RoamioSp table. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: RoamioSp<br>
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
 * RoamioSp => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 1 => What happens to a foreign key when the primary key is updated:<br>
 * 1 => What happens to the foreign key when primary is deleted.<br>
 * FK_RoamioSp_Userid => foreign key name (may be null) <br>
 * null => primary key name (may be null) <br>
 * 7 DEFERRABILITY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`RoamioSp`")
public class Roamiosp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Channel", length = 14)
	private String channel;
	@Column(name = "End")
	private Integer end;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "Include", length = 8)
	private String include;
	@Column(name = "Keep", length = 7)
	private String keep;
	@Column(name = "Num")
	private Integer num;
	@Column(name = "Priority", nullable = false)
	private Integer priority;
	@Column(name = "Record", length = 13)
	private String record;
	@Column(name = "Season")
	private Integer season;
	@Column(name = "Show", length = 60)
	private String show;
	@Column(name = "Start")
	private Integer start;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;
}
