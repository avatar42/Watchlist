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
 * Title: Ota Bean <br>
 * Description: Class for holding data from the Ota table. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: Ota<br>
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
 * Ota => foreign key table name <br>
 * 1 => sequence number within a foreign key( a valueof 1 represents the first column of the foreign key, a value of 2 would represent the second column within the foreign key).<br>
 * 1 => What happens to a foreign key when the primary key is updated:<br>
 * 1 => What happens to the foreign key when primary is deleted.<br>
 * FK_Ota_Userid => foreign key name (may be null) <br>
 * null => primary key name (may be null) <br>
 * 7 DEFERRABILITY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`Ota`")
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
	@Column(name = "Freq")
	private Integer freq;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "LangField", length = 2)
	private String langfield;
	@Column(name = "Listed")
	private Boolean listed;
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
