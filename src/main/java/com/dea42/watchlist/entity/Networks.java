package com.dea42.watchlist.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Title: Networks Bean <br>
 * Description: Class for holding data from the Networks table. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 * Table name: Networks<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br> */
@Data
@Entity
@Table(name = "`Networks`")
public class Networks implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "AndroidApp", length = 1)
	private String androidapp;
	@Column(name = "Comment", length = 458)
	private String comment;
	@Column(name = "Commercials", length = 68)
	private String commercials;
	@Column(name = "FireApp", length = 56)
	private String fireapp;
	@Column(name = "FreeWithTwcId", length = 57)
	private String freewithtwcid;
	@Column(name = "HasDirectBuyOption", length = 82)
	private String hasdirectbuyoption;
	@Column(name = "HasWatchList", length = 46)
	private String haswatchlist;
	@Column(name = "ICanOta", length = 63)
	private String icanota;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "IptvService", length = 214)
	private String iptvservice;
	@Column(name = "OnHulu", length = 14)
	private String onhulu;
	@Column(name = "Persistance", length = 70)
	private String persistance;
	@Column(name = "RemembersPlaceInEpisode", length = 57)
	private String remembersplaceinepisode;
	@Column(name = "RemembersWatchedEpisodes", length = 35)
	private String rememberswatchedepisodes;
	@Column(name = "RokuApp", length = 97)
	private String rokuapp;
	@Column(name = "ShowsInTivoNpl")
	private Integer showsintivonpl;
	@Column(name = "Site", nullable = false, length = 28)
	private String site;
	@Column(name = "StandardWait", length = 17)
	private String standardwait;
	@Column(name = "TivoApp", length = 61)
	private String tivoapp;
	@Column(name = "TivoShortName", length = 10)
	private String tivoshortname;
	@Column(name = "WebInterface", length = 56)
	private String webinterface;
}
