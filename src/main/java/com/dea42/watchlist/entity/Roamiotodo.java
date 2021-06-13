package com.dea42.watchlist.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Title: RoamioTodo Bean <br>
 * Description: Class for holding data from the RoamioTodo table. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: RoamioTodo<br>
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
 * RoamioTodo => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 1 => What happens to a foreign key when the primary key is updated:<br>
 * 1 => What happens to the foreign key when primary is deleted.<br>
 * FK_RoamioTodo_Userid => foreign key name (may be null) <br>
 * null => primary key name (may be null) <br>
 * 7 DEFERRABILITY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`RoamioTodo`")
public class Roamiotodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Channel", length = 15)
	private String channel;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "DateField", nullable = false)
	private Date datefield;
	@Column(name = "Duration", length = 4)
	private String duration;
	@Column(name = "Ep", length = 50)
	private String ep;
	@Column(name = "EpisodeName", length = 59)
	private String episodename;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "ShowName", length = 48)
	private String showname;
	@Column(name = "ShowTrimmed", length = 47)
	private String showtrimmed;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;
}
