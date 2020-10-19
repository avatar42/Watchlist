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
 * Title: shows Bean <br>
 * Description: Class for holding data from the shows table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 * Table name: shows<br>
 * Column name: id<br>
 * Catalog name: null<br>
 * Primary key sequence: 0<br>
 * Primary key name: null<br>
 *  <br> */
@Data
@Entity
@Table(name = "`shows`")
public class Shows implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Abc", length = 16)
	private String abc;
	@Column(name = "AbcLink", length = 62)
	private String abclink;
	@Column(name = "AcornTv", length = 43)
	private String acorntv;
	@Column(name = "AcornTvLink", length = 32)
	private String acorntvlink;
	@Column(name = "Amazon", length = 35)
	private String amazon;
	@Column(name = "AmazonLink", length = 144)
	private String amazonlink;
	@Column(name = "Amc", length = 29)
	private String amc;
	@Column(name = "AmcLink", length = 70)
	private String amclink;
	@Column(name = "Bbca", length = 29)
	private String bbca;
	@Column(name = "BbcaLink", length = 70)
	private String bbcalink;
	@Column(name = "Britbox", length = 11)
	private String britbox;
	@Column(name = "BritboxLink", length = 54)
	private String britboxlink;
	@Column(name = "BufferSpace", length = 20)
	private String bufferspace;
	@Column(name = "BufSp")
	private Integer bufsp;
	@Column(name = "Cancelled", length = 65)
	private String cancelled;
	@Column(name = "Cbs", length = 31)
	private String cbs;
	@Column(name = "CbsLink", length = 60)
	private String cbslink;
	@Column(name = "Cc", length = 5)
	private String cc;
	@Column(name = "CcLink", length = 42)
	private String cclink;
	@Column(name = "Colg", length = 65)
	private String colg;
	@Column(name = "Cw", length = 6)
	private String cw;
	@Column(name = "CwLink", length = 43)
	private String cwlink;
	@Column(name = "Diff", length = 1)
	private String diff;
	@Column(name = "EpguidesShowName", nullable = false, length = 47)
	private String epguidesshowname;
	@Column(name = "EpguidesShowNameLink", length = 60)
	private String epguidesshownamelink;
	@Column(name = "FreeformAbcf", length = 3)
	private String freeformabcf;
	@Column(name = "FreeformAbcfLink", length = 52)
	private String freeformabcflink;
	@Column(name = "Fx", length = 12)
	private String fx;
	@Column(name = "FxLink", length = 51)
	private String fxlink;
	@Column(name = "GooglePlay", length = 6)
	private String googleplay;
	@Column(name = "GooglePlayLink", length = 103)
	private String googleplaylink;
	@Column(name = "Hbo", length = 14)
	private String hbo;
	@Column(name = "HboLink", length = 65)
	private String hbolink;
	@Column(name = "HuluPlus", length = 37)
	private String huluplus;
	@Column(name = "HuluPlusLink", length = 53)
	private String hulupluslink;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Ifc", length = 20)
	private String ifc;
	@Column(name = "IfcLink", length = 35)
	private String ifclink;
	@Column(name = "InCanceledAs", length = 47)
	private String incanceledas;
	@Column(name = "InCanceledAsLink", length = 70)
	private String incanceledaslink;
	@Column(name = "InTodos", length = 14)
	private String intodos;
	@Column(name = "Itunes", length = 29)
	private String itunes;
	@Column(name = "ItunesLink", length = 73)
	private String ituneslink;
	@Column(name = "LastShow", length = 10)
	private String lastshow;
	@Column(name = "LatestInRoamioNpl", length = 8)
	private String latestinroamionpl;
	@Column(name = "LEp")
	private Integer lep;
	@Column(name = "LS", length = 1)
	private String ls;
	@Column(name = "Natgeo", length = 11)
	private String natgeo;
	@Column(name = "NatgeoLink", length = 55)
	private String natgeolink;
	@Column(name = "Nbc", length = 21)
	private String nbc;
	@Column(name = "NbcLink", length = 64)
	private String nbclink;
	@Column(name = "Netflix", length = 15)
	private String netflix;
	@Column(name = "NetflixLink", length = 115)
	private String netflixlink;
	@Column(name = "Network", length = 14)
	private String network;
	@Column(name = "NetworkLink", length = 306)
	private String networklink;
	@Column(name = "OnePassChan", length = 4)
	private String onepasschan;
	@Column(name = "Pbs", length = 12)
	private String pbs;
	@Column(name = "PbsLink", length = 29)
	private String pbslink;
	@Column(name = "Premiere", length = 65)
	private String premiere;
	@Column(name = "PremiereDate")
	private Integer premieredate;
	@Column(name = "Row")
	private Integer row;
	@Column(name = "Science", length = 11)
	private String science;
	@Column(name = "ScienceLink", length = 74)
	private String sciencelink;
	@Column(name = "Status", length = 65)
	private String status;
	@Column(name = "Syfy", length = 33)
	private String syfy;
	@Column(name = "SyfyLink", length = 41)
	private String syfylink;
	@Column(name = "Tnt", length = 6)
	private String tnt;
	@Column(name = "TntLink", length = 49)
	private String tntlink;
	@Column(name = "TodoDate", length = 1)
	private String tododate;
	@Column(name = "TvCom", length = 28)
	private String tvcom;
	@Column(name = "TvComLink", length = 69)
	private String tvcomlink;
	@Column(name = "TwcOnDemand", length = 39)
	private String twcondemand;
	@Column(name = "TwcOnDemandLink", length = 230)
	private String twcondemandlink;
	@Column(name = "Usa", length = 11)
	private String usa;
	@Column(name = "UsaLink", length = 42)
	private String usalink;
	@Column(name = "WatchedTo", length = 1)
	private String watchedto;
	@Column(name = "WEp")
	private Integer wep;
	@Column(name = "WS", length = 1)
	private String ws;
	@Column(name = "Xbox", length = 6)
	private String xbox;
	@Column(name = "XboxLink", length = 67)
	private String xboxlink;
	@Column(name = "Youtube", length = 6)
	private String youtube;
	@Column(name = "YoutubeLink", length = 62)
	private String youtubelink;
}
