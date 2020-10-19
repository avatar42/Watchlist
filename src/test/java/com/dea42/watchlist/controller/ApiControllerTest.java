package com.dea42.watchlist.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.entity.Showsuser;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.entity.Networksuser;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.entity.Roamiotodo;

/**
 * Title: ApiControllerTest <br>
 * Description: REST Api Controller Test. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ApiController.class)
public class ApiControllerTest extends MockBase {


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.AccountController#getAllAccounts(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllAccounts() throws Exception {
		List<Account> list = new ArrayList<>();
		Account o = new Account();
        o.setEmail(getTestEmailString(254));
		o.setId(1);
        o.setPassword(getTestPasswordString(30));
        o.setRole(getTestString(25));
		list.add(o);

		given(accountServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/accounts").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getEmail())))
				.andExpect(content().string(containsString("email")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getRole())))
				.andExpect(content().string(containsString("role")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#getAllNetworkss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworkss() throws Exception {
		List<Networks> list = new ArrayList<>();
		Networks o = new Networks();
        o.setAndroidapp(getTestString(1));
        o.setAndroidapplink(getTestString(74));
        o.setComment(getTestString(458));
        o.setCommentlink(getTestString(80));
        o.setCommercials(getTestString(68));
        o.setCommercialslink(getTestString(37));
        o.setFireapp(getTestString(56));
        o.setFireapplink(getTestString(46));
        o.setFreewithtwcid(getTestString(57));
        o.setFreewithtwcidlink(getTestString(50));
        o.setHasdirectbuyoption(getTestString(79));
        o.setHasdirectbuyoptionlink(getTestString(55));
        o.setHaswatchlist(getTestString(46));
        o.setIcanota(getTestString(63));
        o.setIcanotalink(getTestString(216));
		o.setId(1);
        o.setIptvservice(getTestString(214));
        o.setIptvservicelink(getTestString(36));
        o.setOnhulu(getTestString(14));
        o.setOnhululink(getTestString(118));
        o.setPersistance(getTestString(70));
        o.setRemembersplaceinepisode(getTestString(57));
        o.setRememberswatchedepisodes(getTestString(35));
        o.setRokuapp(getTestString(97));
        o.setRokuapplink(getTestString(46));
        o.setSite(getTestString(28));
        o.setSitelink(getTestString(52));
        o.setStandardwait(getTestString(17));
        o.setTivoapp(getTestString(61));
        o.setTivoapplink(getTestString(34));
        o.setTivoshortname(getTestString(10));
        o.setWebinterface(getTestString(56));
        o.setWebinterfacelink(getTestString(41));
		list.add(o);

		given(networksServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/networkss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getAndroidapp())))
				.andExpect(content().string(containsString("androidapp")))				.andExpect(content().string(containsString(o.getAndroidapplink())))
				.andExpect(content().string(containsString("androidapplink")))				.andExpect(content().string(containsString(o.getComment())))
				.andExpect(content().string(containsString("comment")))				.andExpect(content().string(containsString(o.getCommentlink())))
				.andExpect(content().string(containsString("commentlink")))				.andExpect(content().string(containsString(o.getCommercials())))
				.andExpect(content().string(containsString("commercials")))				.andExpect(content().string(containsString(o.getCommercialslink())))
				.andExpect(content().string(containsString("commercialslink")))				.andExpect(content().string(containsString(o.getFireapp())))
				.andExpect(content().string(containsString("fireapp")))				.andExpect(content().string(containsString(o.getFireapplink())))
				.andExpect(content().string(containsString("fireapplink")))				.andExpect(content().string(containsString(o.getFreewithtwcid())))
				.andExpect(content().string(containsString("freewithtwcid")))				.andExpect(content().string(containsString(o.getFreewithtwcidlink())))
				.andExpect(content().string(containsString("freewithtwcidlink")))				.andExpect(content().string(containsString(o.getHasdirectbuyoption())))
				.andExpect(content().string(containsString("hasdirectbuyoption")))				.andExpect(content().string(containsString(o.getHasdirectbuyoptionlink())))
				.andExpect(content().string(containsString("hasdirectbuyoptionlink")))				.andExpect(content().string(containsString(o.getHaswatchlist())))
				.andExpect(content().string(containsString("haswatchlist")))				.andExpect(content().string(containsString(o.getIcanota())))
				.andExpect(content().string(containsString("icanota")))				.andExpect(content().string(containsString(o.getIcanotalink())))
				.andExpect(content().string(containsString("icanotalink")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getIptvservice())))
				.andExpect(content().string(containsString("iptvservice")))				.andExpect(content().string(containsString(o.getIptvservicelink())))
				.andExpect(content().string(containsString("iptvservicelink")))				.andExpect(content().string(containsString(o.getOnhulu())))
				.andExpect(content().string(containsString("onhulu")))				.andExpect(content().string(containsString(o.getOnhululink())))
				.andExpect(content().string(containsString("onhululink")))				.andExpect(content().string(containsString(o.getPersistance())))
				.andExpect(content().string(containsString("persistance")))				.andExpect(content().string(containsString(o.getRemembersplaceinepisode())))
				.andExpect(content().string(containsString("remembersplaceinepisode")))				.andExpect(content().string(containsString(o.getRememberswatchedepisodes())))
				.andExpect(content().string(containsString("rememberswatchedepisodes")))				.andExpect(content().string(containsString(o.getRokuapp())))
				.andExpect(content().string(containsString("rokuapp")))				.andExpect(content().string(containsString(o.getRokuapplink())))
				.andExpect(content().string(containsString("rokuapplink")))				.andExpect(content().string(containsString("showsintivonpl")))				.andExpect(content().string(containsString(o.getSite())))
				.andExpect(content().string(containsString("site")))				.andExpect(content().string(containsString(o.getSitelink())))
				.andExpect(content().string(containsString("sitelink")))				.andExpect(content().string(containsString(o.getStandardwait())))
				.andExpect(content().string(containsString("standardwait")))				.andExpect(content().string(containsString(o.getTivoapp())))
				.andExpect(content().string(containsString("tivoapp")))				.andExpect(content().string(containsString(o.getTivoapplink())))
				.andExpect(content().string(containsString("tivoapplink")))				.andExpect(content().string(containsString(o.getTivoshortname())))
				.andExpect(content().string(containsString("tivoshortname")))				.andExpect(content().string(containsString(o.getWebinterface())))
				.andExpect(content().string(containsString("webinterface")))				.andExpect(content().string(containsString(o.getWebinterfacelink())))
				.andExpect(content().string(containsString("webinterfacelink")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#getAllShowss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowss() throws Exception {
		List<Shows> list = new ArrayList<>();
		Shows o = new Shows();
        o.setAbc(getTestString(16));
        o.setAbclink(getTestString(62));
        o.setAcorntv(getTestString(43));
        o.setAcorntvlink(getTestString(32));
        o.setAmazon(getTestString(35));
        o.setAmazonlink(getTestString(144));
        o.setAmc(getTestString(29));
        o.setAmclink(getTestString(70));
        o.setBbca(getTestString(29));
        o.setBbcalink(getTestString(70));
        o.setBritbox(getTestString(11));
        o.setBritboxlink(getTestString(54));
        o.setBufferspace(getTestString(20));
        o.setCancelled(getTestString(65));
        o.setCbs(getTestString(31));
        o.setCbslink(getTestString(60));
        o.setCc(getTestString(5));
        o.setCclink(getTestString(42));
        o.setColg(getTestString(65));
        o.setCw(getTestString(6));
        o.setCwlink(getTestString(43));
        o.setDiff(getTestString(1));
        o.setEpguidesshowname(getTestString(47));
        o.setEpguidesshownamelink(getTestString(60));
        o.setFreeformabcf(getTestString(3));
        o.setFreeformabcflink(getTestString(52));
        o.setFx(getTestString(12));
        o.setFxlink(getTestString(51));
        o.setGoogleplay(getTestString(6));
        o.setGoogleplaylink(getTestString(103));
        o.setHbo(getTestString(14));
        o.setHbolink(getTestString(65));
        o.setHuluplus(getTestString(37));
        o.setHulupluslink(getTestString(53));
		o.setId(1);
        o.setIfc(getTestString(20));
        o.setIfclink(getTestString(35));
        o.setIncanceledas(getTestString(47));
        o.setIncanceledaslink(getTestString(70));
        o.setIntodos(getTestString(14));
        o.setItunes(getTestString(29));
        o.setItuneslink(getTestString(73));
        o.setLastshow(getTestString(10));
        o.setLatestinroamionpl(getTestString(8));
        o.setLs(getTestString(1));
        o.setNatgeo(getTestString(11));
        o.setNatgeolink(getTestString(55));
        o.setNbc(getTestString(21));
        o.setNbclink(getTestString(64));
        o.setNetflix(getTestString(15));
        o.setNetflixlink(getTestString(115));
        o.setNetwork(getTestString(14));
        o.setNetworklink(getTestString(306));
        o.setOnepasschan(getTestString(4));
        o.setPbs(getTestString(12));
        o.setPbslink(getTestString(29));
        o.setPremiere(getTestString(65));
        o.setScience(getTestString(11));
        o.setSciencelink(getTestString(74));
        o.setStatus(getTestString(65));
        o.setSyfy(getTestString(33));
        o.setSyfylink(getTestString(41));
        o.setTnt(getTestString(6));
        o.setTntlink(getTestString(49));
        o.setTododate(getTestString(1));
        o.setTvcom(getTestString(28));
        o.setTvcomlink(getTestString(69));
        o.setTwcondemand(getTestString(39));
        o.setTwcondemandlink(getTestString(230));
        o.setUsa(getTestString(11));
        o.setUsalink(getTestString(42));
        o.setWatchedto(getTestString(1));
        o.setWs(getTestString(1));
        o.setXbox(getTestString(6));
        o.setXboxlink(getTestString(67));
        o.setYoutube(getTestString(6));
        o.setYoutubelink(getTestString(62));
		list.add(o);

		given(showsServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/showss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getAbc())))
				.andExpect(content().string(containsString("abc")))				.andExpect(content().string(containsString(o.getAbclink())))
				.andExpect(content().string(containsString("abclink")))				.andExpect(content().string(containsString(o.getAcorntv())))
				.andExpect(content().string(containsString("acorntv")))				.andExpect(content().string(containsString(o.getAcorntvlink())))
				.andExpect(content().string(containsString("acorntvlink")))				.andExpect(content().string(containsString(o.getAmazon())))
				.andExpect(content().string(containsString("amazon")))				.andExpect(content().string(containsString(o.getAmazonlink())))
				.andExpect(content().string(containsString("amazonlink")))				.andExpect(content().string(containsString(o.getAmc())))
				.andExpect(content().string(containsString("amc")))				.andExpect(content().string(containsString(o.getAmclink())))
				.andExpect(content().string(containsString("amclink")))				.andExpect(content().string(containsString(o.getBbca())))
				.andExpect(content().string(containsString("bbca")))				.andExpect(content().string(containsString(o.getBbcalink())))
				.andExpect(content().string(containsString("bbcalink")))				.andExpect(content().string(containsString(o.getBritbox())))
				.andExpect(content().string(containsString("britbox")))				.andExpect(content().string(containsString(o.getBritboxlink())))
				.andExpect(content().string(containsString("britboxlink")))				.andExpect(content().string(containsString(o.getBufferspace())))
				.andExpect(content().string(containsString("bufferspace")))				.andExpect(content().string(containsString("bufsp")))				.andExpect(content().string(containsString(o.getCancelled())))
				.andExpect(content().string(containsString("cancelled")))				.andExpect(content().string(containsString(o.getCbs())))
				.andExpect(content().string(containsString("cbs")))				.andExpect(content().string(containsString(o.getCbslink())))
				.andExpect(content().string(containsString("cbslink")))				.andExpect(content().string(containsString(o.getCc())))
				.andExpect(content().string(containsString("cc")))				.andExpect(content().string(containsString(o.getCclink())))
				.andExpect(content().string(containsString("cclink")))				.andExpect(content().string(containsString(o.getColg())))
				.andExpect(content().string(containsString("colg")))				.andExpect(content().string(containsString(o.getCw())))
				.andExpect(content().string(containsString("cw")))				.andExpect(content().string(containsString(o.getCwlink())))
				.andExpect(content().string(containsString("cwlink")))				.andExpect(content().string(containsString(o.getDiff())))
				.andExpect(content().string(containsString("diff")))				.andExpect(content().string(containsString(o.getEpguidesshowname())))
				.andExpect(content().string(containsString("epguidesshowname")))				.andExpect(content().string(containsString(o.getEpguidesshownamelink())))
				.andExpect(content().string(containsString("epguidesshownamelink")))				.andExpect(content().string(containsString(o.getFreeformabcf())))
				.andExpect(content().string(containsString("freeformabcf")))				.andExpect(content().string(containsString(o.getFreeformabcflink())))
				.andExpect(content().string(containsString("freeformabcflink")))				.andExpect(content().string(containsString(o.getFx())))
				.andExpect(content().string(containsString("fx")))				.andExpect(content().string(containsString(o.getFxlink())))
				.andExpect(content().string(containsString("fxlink")))				.andExpect(content().string(containsString(o.getGoogleplay())))
				.andExpect(content().string(containsString("googleplay")))				.andExpect(content().string(containsString(o.getGoogleplaylink())))
				.andExpect(content().string(containsString("googleplaylink")))				.andExpect(content().string(containsString(o.getHbo())))
				.andExpect(content().string(containsString("hbo")))				.andExpect(content().string(containsString(o.getHbolink())))
				.andExpect(content().string(containsString("hbolink")))				.andExpect(content().string(containsString(o.getHuluplus())))
				.andExpect(content().string(containsString("huluplus")))				.andExpect(content().string(containsString(o.getHulupluslink())))
				.andExpect(content().string(containsString("hulupluslink")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getIfc())))
				.andExpect(content().string(containsString("ifc")))				.andExpect(content().string(containsString(o.getIfclink())))
				.andExpect(content().string(containsString("ifclink")))				.andExpect(content().string(containsString(o.getIncanceledas())))
				.andExpect(content().string(containsString("incanceledas")))				.andExpect(content().string(containsString(o.getIncanceledaslink())))
				.andExpect(content().string(containsString("incanceledaslink")))				.andExpect(content().string(containsString(o.getIntodos())))
				.andExpect(content().string(containsString("intodos")))				.andExpect(content().string(containsString(o.getItunes())))
				.andExpect(content().string(containsString("itunes")))				.andExpect(content().string(containsString(o.getItuneslink())))
				.andExpect(content().string(containsString("ituneslink")))				.andExpect(content().string(containsString(o.getLastshow())))
				.andExpect(content().string(containsString("lastshow")))				.andExpect(content().string(containsString(o.getLatestinroamionpl())))
				.andExpect(content().string(containsString("latestinroamionpl")))				.andExpect(content().string(containsString("lep")))				.andExpect(content().string(containsString(o.getLs())))
				.andExpect(content().string(containsString("ls")))				.andExpect(content().string(containsString(o.getNatgeo())))
				.andExpect(content().string(containsString("natgeo")))				.andExpect(content().string(containsString(o.getNatgeolink())))
				.andExpect(content().string(containsString("natgeolink")))				.andExpect(content().string(containsString(o.getNbc())))
				.andExpect(content().string(containsString("nbc")))				.andExpect(content().string(containsString(o.getNbclink())))
				.andExpect(content().string(containsString("nbclink")))				.andExpect(content().string(containsString(o.getNetflix())))
				.andExpect(content().string(containsString("netflix")))				.andExpect(content().string(containsString(o.getNetflixlink())))
				.andExpect(content().string(containsString("netflixlink")))				.andExpect(content().string(containsString(o.getNetwork())))
				.andExpect(content().string(containsString("network")))				.andExpect(content().string(containsString(o.getNetworklink())))
				.andExpect(content().string(containsString("networklink")))				.andExpect(content().string(containsString(o.getOnepasschan())))
				.andExpect(content().string(containsString("onepasschan")))				.andExpect(content().string(containsString(o.getPbs())))
				.andExpect(content().string(containsString("pbs")))				.andExpect(content().string(containsString(o.getPbslink())))
				.andExpect(content().string(containsString("pbslink")))				.andExpect(content().string(containsString(o.getPremiere())))
				.andExpect(content().string(containsString("premiere")))				.andExpect(content().string(containsString("premieredate")))				.andExpect(content().string(containsString("row")))				.andExpect(content().string(containsString(o.getScience())))
				.andExpect(content().string(containsString("science")))				.andExpect(content().string(containsString(o.getSciencelink())))
				.andExpect(content().string(containsString("sciencelink")))				.andExpect(content().string(containsString(o.getStatus())))
				.andExpect(content().string(containsString("status")))				.andExpect(content().string(containsString(o.getSyfy())))
				.andExpect(content().string(containsString("syfy")))				.andExpect(content().string(containsString(o.getSyfylink())))
				.andExpect(content().string(containsString("syfylink")))				.andExpect(content().string(containsString(o.getTnt())))
				.andExpect(content().string(containsString("tnt")))				.andExpect(content().string(containsString(o.getTntlink())))
				.andExpect(content().string(containsString("tntlink")))				.andExpect(content().string(containsString(o.getTododate())))
				.andExpect(content().string(containsString("tododate")))				.andExpect(content().string(containsString(o.getTvcom())))
				.andExpect(content().string(containsString("tvcom")))				.andExpect(content().string(containsString(o.getTvcomlink())))
				.andExpect(content().string(containsString("tvcomlink")))				.andExpect(content().string(containsString(o.getTwcondemand())))
				.andExpect(content().string(containsString("twcondemand")))				.andExpect(content().string(containsString(o.getTwcondemandlink())))
				.andExpect(content().string(containsString("twcondemandlink")))				.andExpect(content().string(containsString(o.getUsa())))
				.andExpect(content().string(containsString("usa")))				.andExpect(content().string(containsString(o.getUsalink())))
				.andExpect(content().string(containsString("usalink")))				.andExpect(content().string(containsString(o.getWatchedto())))
				.andExpect(content().string(containsString("watchedto")))				.andExpect(content().string(containsString("wep")))				.andExpect(content().string(containsString(o.getWs())))
				.andExpect(content().string(containsString("ws")))				.andExpect(content().string(containsString(o.getXbox())))
				.andExpect(content().string(containsString("xbox")))				.andExpect(content().string(containsString(o.getXboxlink())))
				.andExpect(content().string(containsString("xboxlink")))				.andExpect(content().string(containsString(o.getYoutube())))
				.andExpect(content().string(containsString("youtube")))				.andExpect(content().string(containsString(o.getYoutubelink())))
				.andExpect(content().string(containsString("youtubelink")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#getAllRoamiosps(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiosps() throws Exception {
		List<Roamiosp> list = new ArrayList<>();
		Roamiosp o = new Roamiosp();
        o.setCancelled(getTestString(1));
        o.setChannel(getTestString(14));
        o.setChannelnum(getTestString(4));
		o.setId(1);
        o.setInclude(getTestString(6));
        o.setInshowsstatus(getTestString(44));
        o.setKeep(getTestString(7));
        o.setNetwork(getTestString(13));
        o.setOta(getTestString(2));
        o.setRecord(getTestString(13));
        o.setShow(getTestString(53));
        o.setStation(getTestString(10));
		list.add(o);

		given(roamiospServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/roamiosps").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getCancelled())))
				.andExpect(content().string(containsString("cancelled")))				.andExpect(content().string(containsString(o.getChannel())))
				.andExpect(content().string(containsString("channel")))				.andExpect(content().string(containsString(o.getChannelnum())))
				.andExpect(content().string(containsString("channelnum")))				.andExpect(content().string(containsString("dup")))				.andExpect(content().string(containsString("end")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getInclude())))
				.andExpect(content().string(containsString("include")))				.andExpect(content().string(containsString(o.getInshowsstatus())))
				.andExpect(content().string(containsString("inshowsstatus")))				.andExpect(content().string(containsString(o.getKeep())))
				.andExpect(content().string(containsString("keep")))				.andExpect(content().string(containsString(o.getNetwork())))
				.andExpect(content().string(containsString("network")))				.andExpect(content().string(containsString("num")))				.andExpect(content().string(containsString(o.getOta())))
				.andExpect(content().string(containsString("ota")))				.andExpect(content().string(containsString("priority")))				.andExpect(content().string(containsString(o.getRecord())))
				.andExpect(content().string(containsString("record")))				.andExpect(content().string(containsString("row")))				.andExpect(content().string(containsString("season")))				.andExpect(content().string(containsString(o.getShow())))
				.andExpect(content().string(containsString("show")))				.andExpect(content().string(containsString("start")))				.andExpect(content().string(containsString(o.getStation())))
				.andExpect(content().string(containsString("station")))				.andExpect(content().string(containsString("account")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsuserController#getAllShowsusers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowsusers() throws Exception {
		List<Showsuser> list = new ArrayList<>();
		Showsuser o = new Showsuser();
        o.setBestexperience(getTestString(17));
        o.setBestexperiencelink(getTestString(306));
        o.setComment(getTestString(181));
        o.setCommentlink(getTestString(228));
		o.setId(1);
        o.setImdb(getTestString(1));
        o.setImdblink(getTestString(63));
        o.setInrokufeed(getTestString(1));
        o.setInshowrssas(getTestString(47));
        o.setInshowrssaslink(getTestString(32));
        o.setJustwatch(getTestString(2));
        o.setJustwatchlink(getTestString(75));
        o.setLastwatched(getTestString(10));
        o.setOta(getTestString(3));
        o.setTivoname(getTestString(47));
        o.setTivonamelink(getTestString(31));
		list.add(o);

		given(showsuserServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/showsusers").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getBestexperience())))
				.andExpect(content().string(containsString("bestexperience")))				.andExpect(content().string(containsString(o.getBestexperiencelink())))
				.andExpect(content().string(containsString("bestexperiencelink")))				.andExpect(content().string(containsString(o.getComment())))
				.andExpect(content().string(containsString("comment")))				.andExpect(content().string(containsString(o.getCommentlink())))
				.andExpect(content().string(containsString("commentlink")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getImdb())))
				.andExpect(content().string(containsString("imdb")))				.andExpect(content().string(containsString(o.getImdblink())))
				.andExpect(content().string(containsString("imdblink")))				.andExpect(content().string(containsString(o.getInrokufeed())))
				.andExpect(content().string(containsString("inrokufeed")))				.andExpect(content().string(containsString(o.getInshowrssas())))
				.andExpect(content().string(containsString("inshowrssas")))				.andExpect(content().string(containsString(o.getInshowrssaslink())))
				.andExpect(content().string(containsString("inshowrssaslink")))				.andExpect(content().string(containsString(o.getJustwatch())))
				.andExpect(content().string(containsString("justwatch")))				.andExpect(content().string(containsString(o.getJustwatchlink())))
				.andExpect(content().string(containsString("justwatchlink")))				.andExpect(content().string(containsString(o.getLastwatched())))
				.andExpect(content().string(containsString("lastwatched")))				.andExpect(content().string(containsString(o.getOta())))
				.andExpect(content().string(containsString("ota")))				.andExpect(content().string(containsString("shows")))				.andExpect(content().string(containsString(o.getTivoname())))
				.andExpect(content().string(containsString("tivoname")))				.andExpect(content().string(containsString(o.getTivonamelink())))
				.andExpect(content().string(containsString("tivonamelink")))				.andExpect(content().string(containsString("account")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#getAllCablecards(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllCablecards() throws Exception {
		List<Cablecard> list = new ArrayList<>();
		Cablecard o = new Cablecard();
        o.setChannelname(getTestString(12));
		o.setId(1);
        o.setLang(getTestString(2));
        o.setNet(getTestString(12));
        o.setOd(getTestString(20));
        o.setReceiving(getTestString(3));
        o.setShortfield(getTestString(12));
		list.add(o);

		given(cablecardServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/cablecards").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getChannelname())))
				.andExpect(content().string(containsString("channelname")))				.andExpect(content().string(containsString("channelnumber")))				.andExpect(content().string(containsString("colh")))				.andExpect(content().string(containsString("dt")))				.andExpect(content().string(containsString("hd")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString("innpl")))				.andExpect(content().string(containsString(o.getLang())))
				.andExpect(content().string(containsString("lang")))				.andExpect(content().string(containsString(o.getNet())))
				.andExpect(content().string(containsString("net")))				.andExpect(content().string(containsString(o.getOd())))
				.andExpect(content().string(containsString("od")))				.andExpect(content().string(containsString(o.getReceiving())))
				.andExpect(content().string(containsString("receiving")))				.andExpect(content().string(containsString(o.getShortfield())))
				.andExpect(content().string(containsString("shortfield")))				.andExpect(content().string(containsString("account")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksuserController#getAllNetworksusers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworksusers() throws Exception {
		List<Networksuser> list = new ArrayList<>();
		Networksuser o = new Networksuser();
		o.setId(1);
        o.setIusefreefreewithcablepayforhuluinstead(getTestString(1));
		list.add(o);

		given(networksuserServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/networksusers").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getIusefreefreewithcablepayforhuluinstead())))
				.andExpect(content().string(containsString("iusefreefreewithcablepayforhuluinstead")))				.andExpect(content().string(containsString("networks")))				.andExpect(content().string(containsString("account")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#getAllRoamionpls(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamionpls() throws Exception {
		List<Roamionpl> list = new ArrayList<>();
		Roamionpl o = new Roamionpl();
        o.setChan(getTestString(62));
        o.setChannel(getTestString(16));
        o.setEpisode(getTestString(4));
        o.setF(getTestString(62));
		o.setId(1);
        o.setInnetworkstab(getTestString(7));
        o.setNetwork(getTestString(33));
        o.setShow(getTestString(52));
        o.setSpchannel0nosp(getTestString(1));
        o.setTitle(getTestString(69));
        o.setWatched(getTestString(6));
		list.add(o);

		given(roamionplServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/roamionpls").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("bitratembps")))				.andExpect(content().string(containsString(o.getChan())))
				.andExpect(content().string(containsString("chan")))				.andExpect(content().string(containsString(o.getChannel())))
				.andExpect(content().string(containsString("channel")))				.andExpect(content().string(containsString("date")))				.andExpect(content().string(containsString("duration")))				.andExpect(content().string(containsString(o.getEpisode())))
				.andExpect(content().string(containsString("episode")))				.andExpect(content().string(containsString(o.getF())))
				.andExpect(content().string(containsString("f")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getInnetworkstab())))
				.andExpect(content().string(containsString("innetworkstab")))				.andExpect(content().string(containsString("isnew")))				.andExpect(content().string(containsString("isseries")))				.andExpect(content().string(containsString(o.getNetwork())))
				.andExpect(content().string(containsString("network")))				.andExpect(content().string(containsString("rowinshows")))				.andExpect(content().string(containsString("seriesep")))				.andExpect(content().string(containsString(o.getShow())))
				.andExpect(content().string(containsString("show")))				.andExpect(content().string(containsString("sizegb")))				.andExpect(content().string(containsString("sortabledate")))				.andExpect(content().string(containsString(o.getSpchannel0nosp())))
				.andExpect(content().string(containsString("spchannel0nosp")))				.andExpect(content().string(containsString(o.getTitle())))
				.andExpect(content().string(containsString("title")))				.andExpect(content().string(containsString("account")))				.andExpect(content().string(containsString(o.getWatched())))
				.andExpect(content().string(containsString("watched")))				.andExpect(content().string(containsString("watchedtime")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#getAllOtas(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllOtas() throws Exception {
		List<Ota> list = new ArrayList<>();
		Ota o = new Ota();
        o.setChannelname(getTestString(9));
        o.setChannelnumberchannelnameincluded(getTestString(17));
        o.setComments(getTestString(31));
        o.setDirection(getTestString(4));
        o.setEnabled(getTestString(3));
        o.setFccinfo(getTestString(9));
        o.setFccinfolink(getTestString(6));
		o.setId(1);
        o.setLang(getTestString(2));
        o.setNetwork(getTestString(8));
        o.setOff(getTestString(3));
        o.setRecommendedantenna(getTestString(41));
        o.setRez(getTestString(5));
        o.setShelfant(getTestString(20));
        o.setStation(getTestString(9));
        o.setTvfoolestsignal(getTestString(4));
        o.setWatchable(getTestString(4));
		list.add(o);

		given(otaServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/otas").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("atticant")))				.andExpect(content().string(containsString("chan")))				.andExpect(content().string(containsString(o.getChannelname())))
				.andExpect(content().string(containsString("channelname")))				.andExpect(content().string(containsString("channelnumber")))				.andExpect(content().string(containsString(o.getChannelnumberchannelnameincluded())))
				.andExpect(content().string(containsString("channelnumberchannelnameincluded")))				.andExpect(content().string(containsString(o.getComments())))
				.andExpect(content().string(containsString("comments")))				.andExpect(content().string(containsString(o.getDirection())))
				.andExpect(content().string(containsString("direction")))				.andExpect(content().string(containsString(o.getEnabled())))
				.andExpect(content().string(containsString("enabled")))				.andExpect(content().string(containsString(o.getFccinfo())))
				.andExpect(content().string(containsString("fccinfo")))				.andExpect(content().string(containsString(o.getFccinfolink())))
				.andExpect(content().string(containsString("fccinfolink")))				.andExpect(content().string(containsString("freq")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getLang())))
				.andExpect(content().string(containsString("lang")))				.andExpect(content().string(containsString("listed")))				.andExpect(content().string(containsString("mytivoavgstrength")))				.andExpect(content().string(containsString(o.getNetwork())))
				.andExpect(content().string(containsString("network")))				.andExpect(content().string(containsString(o.getOff())))
				.andExpect(content().string(containsString("off")))				.andExpect(content().string(containsString(o.getRecommendedantenna())))
				.andExpect(content().string(containsString("recommendedantenna")))				.andExpect(content().string(containsString(o.getRez())))
				.andExpect(content().string(containsString("rez")))				.andExpect(content().string(containsString(o.getShelfant())))
				.andExpect(content().string(containsString("shelfant")))				.andExpect(content().string(containsString(o.getStation())))
				.andExpect(content().string(containsString("station")))				.andExpect(content().string(containsString("subchan")))				.andExpect(content().string(containsString(o.getTvfoolestsignal())))
				.andExpect(content().string(containsString("tvfoolestsignal")))				.andExpect(content().string(containsString("account")))				.andExpect(content().string(containsString(o.getWatchable())))
				.andExpect(content().string(containsString("watchable")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#getAllRoamiotodos(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiotodos() throws Exception {
		List<Roamiotodo> list = new ArrayList<>();
		Roamiotodo o = new Roamiotodo();
        o.setChannel(getTestString(16));
        o.setColi(getTestString(28));
        o.setDuration(getTestString(4));
        o.setEpisode(getTestString(50));
        o.setEpisodename(getTestString(2));
        o.setEpname2(getTestString(1));
        o.setEpnum(getTestString(20));
		o.setId(1);
        o.setShow(getTestString(141));
        o.setShowname(getTestString(78));
        o.setShowtrimmed(getTestString(78));
		list.add(o);

		given(roamiotodoServices.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/roamiotodos").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getChannel())))
				.andExpect(content().string(containsString("channel")))				.andExpect(content().string(containsString(o.getColi())))
				.andExpect(content().string(containsString("coli")))				.andExpect(content().string(containsString("date")))				.andExpect(content().string(containsString(o.getDuration())))
				.andExpect(content().string(containsString("duration")))				.andExpect(content().string(containsString("ep")))				.andExpect(content().string(containsString("epdate")))				.andExpect(content().string(containsString(o.getEpisode())))
				.andExpect(content().string(containsString("episode")))				.andExpect(content().string(containsString(o.getEpisodename())))
				.andExpect(content().string(containsString("episodename")))				.andExpect(content().string(containsString(o.getEpname2())))
				.andExpect(content().string(containsString("epname2")))				.andExpect(content().string(containsString("epname3")))				.andExpect(content().string(containsString(o.getEpnum())))
				.andExpect(content().string(containsString("epnum")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getShow())))
				.andExpect(content().string(containsString("show")))				.andExpect(content().string(containsString(o.getShowname())))
				.andExpect(content().string(containsString("showname")))				.andExpect(content().string(containsString(o.getShowtrimmed())))
				.andExpect(content().string(containsString("showtrimmed")))				.andExpect(content().string(containsString("sortabledate")))				.andExpect(content().string(containsString("account")));
	}

}
