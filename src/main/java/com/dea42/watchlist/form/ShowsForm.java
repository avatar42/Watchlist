package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Shows;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: shows Form <br>
 * Description: Class for holding data from the shows table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */

@Data
public class ShowsForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=16)
	private String abc;
    @Length(max=62)
	private String abclink;
    @Length(max=43)
	private String acorntv;
    @Length(max=32)
	private String acorntvlink;
    @Length(max=35)
	private String amazon;
    @Length(max=144)
	private String amazonlink;
    @Length(max=29)
	private String amc;
    @Length(max=70)
	private String amclink;
    @Length(max=29)
	private String bbca;
    @Length(max=70)
	private String bbcalink;
    @Length(max=11)
	private String britbox;
    @Length(max=54)
	private String britboxlink;
    @Length(max=20)
	private String bufferspace;
	private Integer bufsp;
    @Length(max=65)
	private String cancelled;
    @Length(max=31)
	private String cbs;
    @Length(max=60)
	private String cbslink;
    @Length(max=5)
	private String cc;
    @Length(max=42)
	private String cclink;
    @Length(max=65)
	private String colg;
    @Length(max=6)
	private String cw;
    @Length(max=43)
	private String cwlink;
    @Length(max=1)
	private String diff;
    @Length(max=47)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String epguidesshowname;
    @Length(max=60)
	private String epguidesshownamelink;
    @Length(max=3)
	private String freeformabcf;
    @Length(max=52)
	private String freeformabcflink;
    @Length(max=12)
	private String fx;
    @Length(max=51)
	private String fxlink;
    @Length(max=6)
	private String googleplay;
    @Length(max=103)
	private String googleplaylink;
    @Length(max=14)
	private String hbo;
    @Length(max=65)
	private String hbolink;
    @Length(max=37)
	private String huluplus;
    @Length(max=53)
	private String hulupluslink;
	private Integer id;
    @Length(max=20)
	private String ifc;
    @Length(max=35)
	private String ifclink;
    @Length(max=47)
	private String incanceledas;
    @Length(max=70)
	private String incanceledaslink;
    @Length(max=19)
	private String intodos;
    @Length(max=29)
	private String itunes;
    @Length(max=73)
	private String ituneslink;
    @Length(max=10)
	private String lastshow;
    @Length(max=8)
	private String latestinroamionpl;
	private Integer lep;
    @Length(max=1)
	private String ls;
    @Length(max=11)
	private String natgeo;
    @Length(max=55)
	private String natgeolink;
    @Length(max=21)
	private String nbc;
    @Length(max=64)
	private String nbclink;
    @Length(max=15)
	private String netflix;
    @Length(max=115)
	private String netflixlink;
    @Length(max=14)
	private String network;
    @Length(max=306)
	private String networklink;
    @Length(max=4)
	private String onepasschan;
    @Length(max=12)
	private String pbs;
    @Length(max=29)
	private String pbslink;
    @Length(max=65)
	private String premiere;
	private Integer premieredate;
	private Integer row;
    @Length(max=11)
	private String science;
    @Length(max=74)
	private String sciencelink;
    @Length(max=65)
	private String status;
    @Length(max=33)
	private String syfy;
    @Length(max=41)
	private String syfylink;
    @Length(max=6)
	private String tnt;
    @Length(max=49)
	private String tntlink;
    @Length(max=1)
	private String tododate;
    @Length(max=28)
	private String tvcom;
    @Length(max=69)
	private String tvcomlink;
    @Length(max=39)
	private String twcondemand;
    @Length(max=230)
	private String twcondemandlink;
    @Length(max=11)
	private String usa;
    @Length(max=42)
	private String usalink;
    @Length(max=1)
	private String watchedto;
	private Integer wep;
    @Length(max=1)
	private String ws;
    @Length(max=6)
	private String xbox;
    @Length(max=67)
	private String xboxlink;
    @Length(max=6)
	private String youtube;
    @Length(max=62)
	private String youtubelink;

	/**
	 * Clones Shows obj into form
	 *
	 * @param obj
	 */
	public static ShowsForm getInstance(Shows obj) {
		ShowsForm form = new ShowsForm();
		form.setAbc(obj.getAbc());
		form.setAbclink(obj.getAbclink());
		form.setAcorntv(obj.getAcorntv());
		form.setAcorntvlink(obj.getAcorntvlink());
		form.setAmazon(obj.getAmazon());
		form.setAmazonlink(obj.getAmazonlink());
		form.setAmc(obj.getAmc());
		form.setAmclink(obj.getAmclink());
		form.setBbca(obj.getBbca());
		form.setBbcalink(obj.getBbcalink());
		form.setBritbox(obj.getBritbox());
		form.setBritboxlink(obj.getBritboxlink());
		form.setBufferspace(obj.getBufferspace());
		form.setBufsp(obj.getBufsp());
		form.setCancelled(obj.getCancelled());
		form.setCbs(obj.getCbs());
		form.setCbslink(obj.getCbslink());
		form.setCc(obj.getCc());
		form.setCclink(obj.getCclink());
		form.setColg(obj.getColg());
		form.setCw(obj.getCw());
		form.setCwlink(obj.getCwlink());
		form.setDiff(obj.getDiff());
		form.setEpguidesshowname(obj.getEpguidesshowname());
		form.setEpguidesshownamelink(obj.getEpguidesshownamelink());
		form.setFreeformabcf(obj.getFreeformabcf());
		form.setFreeformabcflink(obj.getFreeformabcflink());
		form.setFx(obj.getFx());
		form.setFxlink(obj.getFxlink());
		form.setGoogleplay(obj.getGoogleplay());
		form.setGoogleplaylink(obj.getGoogleplaylink());
		form.setHbo(obj.getHbo());
		form.setHbolink(obj.getHbolink());
		form.setHuluplus(obj.getHuluplus());
		form.setHulupluslink(obj.getHulupluslink());
		form.setId(obj.getId());
		form.setIfc(obj.getIfc());
		form.setIfclink(obj.getIfclink());
		form.setIncanceledas(obj.getIncanceledas());
		form.setIncanceledaslink(obj.getIncanceledaslink());
		form.setIntodos(obj.getIntodos());
		form.setItunes(obj.getItunes());
		form.setItuneslink(obj.getItuneslink());
		form.setLastshow(obj.getLastshow());
		form.setLatestinroamionpl(obj.getLatestinroamionpl());
		form.setLep(obj.getLep());
		form.setLs(obj.getLs());
		form.setNatgeo(obj.getNatgeo());
		form.setNatgeolink(obj.getNatgeolink());
		form.setNbc(obj.getNbc());
		form.setNbclink(obj.getNbclink());
		form.setNetflix(obj.getNetflix());
		form.setNetflixlink(obj.getNetflixlink());
		form.setNetwork(obj.getNetwork());
		form.setNetworklink(obj.getNetworklink());
		form.setOnepasschan(obj.getOnepasschan());
		form.setPbs(obj.getPbs());
		form.setPbslink(obj.getPbslink());
		form.setPremiere(obj.getPremiere());
		form.setPremieredate(obj.getPremieredate());
		form.setRow(obj.getRow());
		form.setScience(obj.getScience());
		form.setSciencelink(obj.getSciencelink());
		form.setStatus(obj.getStatus());
		form.setSyfy(obj.getSyfy());
		form.setSyfylink(obj.getSyfylink());
		form.setTnt(obj.getTnt());
		form.setTntlink(obj.getTntlink());
		form.setTododate(obj.getTododate());
		form.setTvcom(obj.getTvcom());
		form.setTvcomlink(obj.getTvcomlink());
		form.setTwcondemand(obj.getTwcondemand());
		form.setTwcondemandlink(obj.getTwcondemandlink());
		form.setUsa(obj.getUsa());
		form.setUsalink(obj.getUsalink());
		form.setWatchedto(obj.getWatchedto());
		form.setWep(obj.getWep());
		form.setWs(obj.getWs());
		form.setXbox(obj.getXbox());
		form.setXboxlink(obj.getXboxlink());
		form.setYoutube(obj.getYoutube());
		form.setYoutubelink(obj.getYoutubelink());
		return form;
	}
}
