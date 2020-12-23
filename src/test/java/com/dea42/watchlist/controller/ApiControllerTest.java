package com.dea42.watchlist.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.entity.Roamiotodo;

/**
 * Title: ApiControllerTest <br>
 * Description: REST Api Controller Test. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
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
		Page<Account> p = getPage(list);
		given(accountServices.listAll(null)).willReturn(p);

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
        o.setHasdirectbuyoption(getTestString(82));
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
		Page<Networks> p = getPage(list);
		given(networksServices.listAll(null)).willReturn(p);

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
        o.setCancelled(getTestString(65));
        o.setEpguidesshowname(getTestString(47));
        o.setEpguidesshownamelink(getTestString(60));
		o.setId(1);
        o.setIncanceledas(getTestString(47));
        o.setIncanceledaslink(getTestString(70));
        o.setLastshow(getTestString(10));
        o.setNetwork(getTestString(14));
        o.setNetworklink(getTestString(306));
        o.setPremiere(getTestString(65));
        o.setStatus(getTestString(65));
        o.setTivoname(getTestString(47));
        o.setTivonamelink(getTestString(31));
		list.add(o);
		Page<Shows> p = getPage(list);
		given(showsServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/showss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getCancelled())))
				.andExpect(content().string(containsString("cancelled")))				.andExpect(content().string(containsString(o.getEpguidesshowname())))
				.andExpect(content().string(containsString("epguidesshowname")))				.andExpect(content().string(containsString(o.getEpguidesshownamelink())))
				.andExpect(content().string(containsString("epguidesshownamelink")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getIncanceledas())))
				.andExpect(content().string(containsString("incanceledas")))				.andExpect(content().string(containsString(o.getIncanceledaslink())))
				.andExpect(content().string(containsString("incanceledaslink")))				.andExpect(content().string(containsString(o.getLastshow())))
				.andExpect(content().string(containsString("lastshow")))				.andExpect(content().string(containsString(o.getNetwork())))
				.andExpect(content().string(containsString("network")))				.andExpect(content().string(containsString(o.getNetworklink())))
				.andExpect(content().string(containsString("networklink")))				.andExpect(content().string(containsString(o.getPremiere())))
				.andExpect(content().string(containsString("premiere")))				.andExpect(content().string(containsString("premieredate")))				.andExpect(content().string(containsString(o.getStatus())))
				.andExpect(content().string(containsString("status")))				.andExpect(content().string(containsString(o.getTivoname())))
				.andExpect(content().string(containsString("tivoname")))				.andExpect(content().string(containsString(o.getTivonamelink())))
				.andExpect(content().string(containsString("tivonamelink")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#getAllRoamiosps(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiosps() throws Exception {
		List<Roamiosp> list = new ArrayList<>();
		Roamiosp o = new Roamiosp();
        o.setChannel(getTestString(14));
		o.setId(1);
        o.setInclude(getTestString(8));
        o.setKeep(getTestString(7));
        o.setRecord(getTestString(13));
        o.setShow(getTestString(60));
		list.add(o);
		Page<Roamiosp> p = getPage(list);
		given(roamiospServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/roamiosps").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getChannel())))
				.andExpect(content().string(containsString("channel")))				.andExpect(content().string(containsString("end")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getInclude())))
				.andExpect(content().string(containsString("include")))				.andExpect(content().string(containsString(o.getKeep())))
				.andExpect(content().string(containsString("keep")))				.andExpect(content().string(containsString("num")))				.andExpect(content().string(containsString("priority")))				.andExpect(content().string(containsString(o.getRecord())))
				.andExpect(content().string(containsString("record")))				.andExpect(content().string(containsString("season")))				.andExpect(content().string(containsString(o.getShow())))
				.andExpect(content().string(containsString("show")))				.andExpect(content().string(containsString("start")))				.andExpect(content().string(containsString("account")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#getAllShowsUsers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowsUsers() throws Exception {
		List<ShowsUser> list = new ArrayList<>();
		ShowsUser o = new ShowsUser();
        o.setBestexperience(getTestString(17));
        o.setBestexperiencelink(getTestString(306));
        o.setComment(getTestString(181));
        o.setCommentlink(getTestString(228));
        o.setDiff(getTestString(3));
		o.setId(1);
        o.setImdb(getTestString(2));
        o.setImdblink(getTestString(63));
        o.setInrokufeed(getTestString(1));
        o.setInshowrssas(getTestString(47));
        o.setInshowrssaslink(getTestString(32));
        o.setIntablo(getTestString(1));
        o.setJustwatch(getTestString(2));
        o.setJustwatchlink(getTestString(75));
        o.setLastwatched(getTestString(10));
        o.setOta(getTestString(1));
		list.add(o);
		Page<ShowsUser> p = getPage(list);
		given(showsUserServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/showsUsers").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getBestexperience())))
				.andExpect(content().string(containsString("bestexperience")))				.andExpect(content().string(containsString(o.getBestexperiencelink())))
				.andExpect(content().string(containsString("bestexperiencelink")))				.andExpect(content().string(containsString(o.getComment())))
				.andExpect(content().string(containsString("comment")))				.andExpect(content().string(containsString(o.getCommentlink())))
				.andExpect(content().string(containsString("commentlink")))				.andExpect(content().string(containsString(o.getDiff())))
				.andExpect(content().string(containsString("diff")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getImdb())))
				.andExpect(content().string(containsString("imdb")))				.andExpect(content().string(containsString(o.getImdblink())))
				.andExpect(content().string(containsString("imdblink")))				.andExpect(content().string(containsString(o.getInrokufeed())))
				.andExpect(content().string(containsString("inrokufeed")))				.andExpect(content().string(containsString(o.getInshowrssas())))
				.andExpect(content().string(containsString("inshowrssas")))				.andExpect(content().string(containsString(o.getInshowrssaslink())))
				.andExpect(content().string(containsString("inshowrssaslink")))				.andExpect(content().string(containsString(o.getIntablo())))
				.andExpect(content().string(containsString("intablo")))				.andExpect(content().string(containsString(o.getJustwatch())))
				.andExpect(content().string(containsString("justwatch")))				.andExpect(content().string(containsString(o.getJustwatchlink())))
				.andExpect(content().string(containsString("justwatchlink")))				.andExpect(content().string(containsString(o.getLastwatched())))
				.andExpect(content().string(containsString("lastwatched")))				.andExpect(content().string(containsString(o.getOta())))
				.andExpect(content().string(containsString("ota")))				.andExpect(content().string(containsString("shows")))				.andExpect(content().string(containsString("account")));
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
        o.setReceiving(getTestString(3));
        o.setShortfield(getTestString(12));
		list.add(o);
		Page<Cablecard> p = getPage(list);
		given(cablecardServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/cablecards").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getChannelname())))
				.andExpect(content().string(containsString("channelname")))				.andExpect(content().string(containsString("channelnumber")))				.andExpect(content().string(containsString("dt")))				.andExpect(content().string(containsString("hd")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString("innpl")))				.andExpect(content().string(containsString(o.getLang())))
				.andExpect(content().string(containsString("lang")))				.andExpect(content().string(containsString(o.getNet())))
				.andExpect(content().string(containsString("net")))				.andExpect(content().string(containsString(o.getReceiving())))
				.andExpect(content().string(containsString("receiving")))				.andExpect(content().string(containsString(o.getShortfield())))
				.andExpect(content().string(containsString("shortfield")))				.andExpect(content().string(containsString("account")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#getAllOtas(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllOtas() throws Exception {
		List<Ota> list = new ArrayList<>();
		Ota o = new Ota();
        o.setChannelname(getTestString(10));
        o.setChannelnumber(getTestString(4));
        o.setChannelnumberchannelnameincluded(getTestString(18));
        o.setComments(getTestString(31));
        o.setDirection(getTestString(4));
        o.setEnabled(getTestString(3));
        o.setFccinfo(getTestString(10));
        o.setFccinfolink(getTestString(6));
		o.setId(1);
        o.setLang(getTestString(2));
        o.setNetwork(getTestString(15));
        o.setOff(getTestString(5));
        o.setRecommendedantenna(getTestString(41));
        o.setRez(getTestString(5));
        o.setStation(getTestString(5));
        o.setTvfoolestsignal(getTestString(5));
        o.setWatchabletablo(getTestString(7));
        o.setWatchabletivo(getTestString(4));
		list.add(o);
		Page<Ota> p = getPage(list);
		given(otaServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/otas").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("atticant")))				.andExpect(content().string(containsString("chan")))				.andExpect(content().string(containsString(o.getChannelname())))
				.andExpect(content().string(containsString("channelname")))				.andExpect(content().string(containsString(o.getChannelnumber())))
				.andExpect(content().string(containsString("channelnumber")))				.andExpect(content().string(containsString(o.getChannelnumberchannelnameincluded())))
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
				.andExpect(content().string(containsString("rez")))				.andExpect(content().string(containsString(o.getStation())))
				.andExpect(content().string(containsString("station")))				.andExpect(content().string(containsString("subchan")))				.andExpect(content().string(containsString("tvfoolchan")))				.andExpect(content().string(containsString(o.getTvfoolestsignal())))
				.andExpect(content().string(containsString("tvfoolestsignal")))				.andExpect(content().string(containsString("account")))				.andExpect(content().string(containsString(o.getWatchabletablo())))
				.andExpect(content().string(containsString("watchabletablo")))				.andExpect(content().string(containsString(o.getWatchabletivo())))
				.andExpect(content().string(containsString("watchabletivo")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#getAllRoamionpls(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamionpls() throws Exception {
		List<Roamionpl> list = new ArrayList<>();
		Roamionpl o = new Roamionpl();
        o.setChannel(getTestString(16));
        o.setEpisode(getTestString(10));
		o.setId(1);
        o.setSeriesep(getTestString(10));
        o.setShow(getTestString(73));
        o.setTitle(getTestString(76));
		list.add(o);
		Page<Roamionpl> p = getPage(list);
		given(roamionplServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/roamionpls").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("bitratembps")))				.andExpect(content().string(containsString(o.getChannel())))
				.andExpect(content().string(containsString("channel")))				.andExpect(content().string(containsString("date")))				.andExpect(content().string(containsString("duration")))				.andExpect(content().string(containsString(o.getEpisode())))
				.andExpect(content().string(containsString("episode")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString("isnew")))				.andExpect(content().string(containsString("rowinshows")))				.andExpect(content().string(containsString(o.getSeriesep())))
				.andExpect(content().string(containsString("seriesep")))				.andExpect(content().string(containsString(o.getShow())))
				.andExpect(content().string(containsString("show")))				.andExpect(content().string(containsString("sizegb")))				.andExpect(content().string(containsString("sortabledate")))				.andExpect(content().string(containsString(o.getTitle())))
				.andExpect(content().string(containsString("title")))				.andExpect(content().string(containsString("account")))				.andExpect(content().string(containsString("watchedtime")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksUserController#getAllNetworksUsers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworksUsers() throws Exception {
		List<NetworksUser> list = new ArrayList<>();
		NetworksUser o = new NetworksUser();
		o.setId(1);
        o.setIusefreefreewithcablepayforhuluinstead(getTestString(1));
		list.add(o);
		Page<NetworksUser> p = getPage(list);
		given(networksUserServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/networksUsers").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getIusefreefreewithcablepayforhuluinstead())))
				.andExpect(content().string(containsString("iusefreefreewithcablepayforhuluinstead")))				.andExpect(content().string(containsString("networks")))				.andExpect(content().string(containsString("account")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#getAllRoamiotodos(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiotodos() throws Exception {
		List<Roamiotodo> list = new ArrayList<>();
		Roamiotodo o = new Roamiotodo();
        o.setChannel(getTestString(15));
        o.setDuration(getTestString(4));
        o.setEp(getTestString(50));
        o.setEpisodename(getTestString(59));
		o.setId(1);
        o.setShowname(getTestString(48));
        o.setShowtrimmed(getTestString(47));
		list.add(o);
		Page<Roamiotodo> p = getPage(list);
		given(roamiotodoServices.listAll(null)).willReturn(p);

		this.mockMvc.perform(get("/api/roamiotodos").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString(o.getChannel())))
				.andExpect(content().string(containsString("channel")))				.andExpect(content().string(containsString("date")))				.andExpect(content().string(containsString(o.getDuration())))
				.andExpect(content().string(containsString("duration")))				.andExpect(content().string(containsString(o.getEp())))
				.andExpect(content().string(containsString("ep")))				.andExpect(content().string(containsString(o.getEpisodename())))
				.andExpect(content().string(containsString("episodename")))				.andExpect(content().string(containsString("id")))				.andExpect(content().string(containsString(o.getShowname())))
				.andExpect(content().string(containsString("showname")))				.andExpect(content().string(containsString(o.getShowtrimmed())))
				.andExpect(content().string(containsString("showtrimmed")))				.andExpect(content().string(containsString("account")));
	}

}
