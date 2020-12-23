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
 * Title: ota Bean <br>
 * Description: Class for holding data from the ota table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 * Table name: ota<br>
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
 * ota => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 3 => What happens to a foreign key when the primary key is updated:<br>
 * 3 => What happens to the foreign key when primary is deleted.<br>
 *  => foreign key name (may be null) <br>
 *  => primary key name (may be null) <br>
 * 5 DEFERRABILITY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`ota`")
public class Ota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "AtticAnt")
	private Integer atticant;
	@Column(name = "Chan")
	private Integer chan;
	@Column(name = "ChannelName", length = 10)
	private String channelname;
	@Column(name = "ChannelNumber", length = 4)
	private String channelnumber;
	@Column(name = "ChannelNumberChannelNameIncluded", length = 18)
	private String channelnumberchannelnameincluded;
	@Column(name = "Comments", length = 31)
	private String comments;
	@Column(name = "Direction", length = 4)
	private String direction;
	@Column(name = "Enabled", length = 3)
	private String enabled;
	@Column(name = "FccInfo", length = 10)
	private String fccinfo;
	@Column(name = "FccInfoLink", length = 6)
	private String fccinfolink;
	@Column(name = "Freq")
	private Integer freq;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Lang", length = 2)
	private String lang;
	@Column(name = "Listed")
	private Integer listed;
	@Column(name = "MyTivoAvgStrength")
	private Integer mytivoavgstrength;
	@Column(name = "Network", length = 15)
	private String network;
	@Column(name = "Off", length = 5)
	private String off;
	@Column(name = "RecommendedAntenna", length = 41)
	private String recommendedantenna;
	@Column(name = "Rez", length = 5)
	private String rez;
	@Column(name = "Station", length = 5)
	private String station;
	@Column(name = "SubChan")
	private Integer subchan;
	@Column(name = "TvFoolChan")
	private BigDecimal tvfoolchan;
	@Column(name = "TvFoolEstSignal", length = 5)
	private String tvfoolestsignal;
	@ManyToOne
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private Account account;
	@Column(name = "WatchableTablo", length = 7)
	private String watchabletablo;
	@Column(name = "WatchableTivo", length = 4)
	private String watchabletivo;
}
