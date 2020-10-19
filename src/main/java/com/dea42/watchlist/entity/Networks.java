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
 * Title: networks Bean <br>
 * Description: Class for holding data from the networks table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 * Table name: networks<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> */
@Data
@Entity
@Table(name = "`networks`")
public class Networks implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "AndroidApp", length = 1)
	private String androidapp;
	@Column(name = "AndroidAppLink", length = 74)
	private String androidapplink;
	@Column(name = "Comment", length = 458)
	private String comment;
	@Column(name = "CommentLink", length = 80)
	private String commentlink;
	@Column(name = "Commercials", length = 68)
	private String commercials;
	@Column(name = "CommercialsLink", length = 37)
	private String commercialslink;
	@Column(name = "FireApp", length = 56)
	private String fireapp;
	@Column(name = "FireAppLink", length = 46)
	private String fireapplink;
	@Column(name = "FreeWithTwcId", length = 57)
	private String freewithtwcid;
	@Column(name = "FreeWithTwcIdLink", length = 50)
	private String freewithtwcidlink;
	@Column(name = "HasDirectBuyOption", length = 79)
	private String hasdirectbuyoption;
	@Column(name = "HasDirectBuyOptionLink", length = 55)
	private String hasdirectbuyoptionlink;
	@Column(name = "HasWatchList", length = 46)
	private String haswatchlist;
	@Column(name = "ICanOta", length = 63)
	private String icanota;
	@Column(name = "ICanOtaLink", length = 216)
	private String icanotalink;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "IptvService", length = 214)
	private String iptvservice;
	@Column(name = "IptvServiceLink", length = 36)
	private String iptvservicelink;
	@Column(name = "OnHulu", length = 14)
	private String onhulu;
	@Column(name = "OnHuluLink", length = 118)
	private String onhululink;
	@Column(name = "Persistance", length = 70)
	private String persistance;
	@Column(name = "RemembersPlaceInEpisode", length = 57)
	private String remembersplaceinepisode;
	@Column(name = "RemembersWatchedEpisodes", length = 35)
	private String rememberswatchedepisodes;
	@Column(name = "RokuApp", length = 97)
	private String rokuapp;
	@Column(name = "RokuAppLink", length = 46)
	private String rokuapplink;
	@Column(name = "ShowsInTivoNpl")
	private Integer showsintivonpl;
	@Column(name = "Site", nullable = false, length = 28)
	private String site;
	@Column(name = "SiteLink", length = 52)
	private String sitelink;
	@Column(name = "StandardWait", length = 17)
	private String standardwait;
	@Column(name = "TivoApp", length = 61)
	private String tivoapp;
	@Column(name = "TivoAppLink", length = 34)
	private String tivoapplink;
	@Column(name = "TivoShortName", length = 10)
	private String tivoshortname;
	@Column(name = "WebInterface", length = 56)
	private String webinterface;
	@Column(name = "WebInterfaceLink", length = 41)
	private String webinterfacelink;
}
