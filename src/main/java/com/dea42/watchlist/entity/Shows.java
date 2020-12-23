package com.dea42.watchlist.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Title: shows Bean <br>
 * Description: Class for holding data from the shows table. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
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

	@Column(name = "Cancelled", length = 65)
	private String cancelled;
	@Column(name = "EpguidesShowName", nullable = false, length = 47)
	private String epguidesshowname;
	@Column(name = "EpguidesShowNameLink", length = 60)
	private String epguidesshownamelink;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "InCanceledAs", length = 47)
	private String incanceledas;
	@Column(name = "InCanceledAsLink", length = 70)
	private String incanceledaslink;
	@Column(name = "LastShow", length = 10)
	private String lastshow;
	@Column(name = "Network", length = 14)
	private String network;
	@Column(name = "NetworkLink", length = 306)
	private String networklink;
	@Column(name = "Premiere", length = 65)
	private String premiere;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "PremiereDate")
	private Date premieredate;
	@Column(name = "Status", length = 65)
	private String status;
	@Column(name = "TivoName", length = 47)
	private String tivoname;
	@Column(name = "TivoNameLink", length = 31)
	private String tivonamelink;
}
