package com.dea42.watchlist.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.service.NetworksServices;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.service.ShowsServices;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.service.RoamiospServices;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.service.CablecardServices;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.service.RoamionplServices;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.service.OtaServices;
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.service.RoamiotodoServices;

/**
 * Title: ApiControllerTest <br>
 * Description: Api REST Controller Test. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ApiController.class)
public class ApiControllerTest {
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

    @MockBean
    private NetworksServices networksService;
    @MockBean
    private ShowsServices showsService;
    @MockBean
    private RoamiospServices roamiospService;
    @MockBean
    private CablecardServices cablecardService;
    @MockBean
    private RoamionplServices roamionplService;
    @MockBean
    private OtaServices otaService;
    @MockBean
    private RoamiotodoServices roamiotodoService;

	@Before()
	public void setup() {
		// Init MockMvc Object and build
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

    public ApiControllerTest(){
    }

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#getAllNetworkss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworkss() throws Exception {
		List<Networks> list = new ArrayList<>();
		Networks o = new Networks();
		o.setId(1);
         o.setCommentlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setOnhulu("ABCDEFGHIJKLMN");
         o.setStandardwait("ABCDEFGHIJKLMNOPQ");
         o.setRokuapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi");
         o.setRemembersplaceinepisode("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst");
         o.setCommercialslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890");
         o.setFreewithtwcid("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst");
         o.setHasdirectbuyoptionlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqr");
         o.setFireapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi");
         o.setFireapp("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs");
         o.setTivoapp("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwz");
         o.setSitelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmno");
         o.setWebinterfacelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd");
         o.setTivoapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567");
         o.setPersistance("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setHasdirectbuyoption("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setRememberswatchedepisodes("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678");
         o.setIcanotalink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setComment("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setHaswatchlist("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi");
         o.setAndroidapp("A");
         o.setTivoshortname("ABCDEFGHIJ");
         o.setIptvservice("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setSite("ABCDEFGHIJKLMNOPQRSTUVWXYZ01");
         o.setIcanota("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz");
         o.setAndroidapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setOnhululink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setWebinterface("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs");
         o.setFreewithtwcidlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklm");
         o.setCommercials("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setRokuapp("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setIptvservicelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
		list.add(o);

		given(networksService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/networkss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("commentlink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("onhulu")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQ")))
				.andExpect(content().string(containsString("standardwait")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi")))
				.andExpect(content().string(containsString("rokuapplink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst")))
				.andExpect(content().string(containsString("remembersplaceinepisode")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890")))
				.andExpect(content().string(containsString("commercialslink")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("showsintivonpl")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst")))
				.andExpect(content().string(containsString("freewithtwcid")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqr")))
				.andExpect(content().string(containsString("hasdirectbuyoptionlink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi")))
				.andExpect(content().string(containsString("fireapplink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs")))
				.andExpect(content().string(containsString("fireapp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwz")))
				.andExpect(content().string(containsString("tivoapp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmno")))
				.andExpect(content().string(containsString("sitelink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd")))
				.andExpect(content().string(containsString("webinterfacelink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567")))
				.andExpect(content().string(containsString("tivoapplink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("persistance")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("hasdirectbuyoption")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678")))
				.andExpect(content().string(containsString("rememberswatchedepisodes")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("icanotalink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("comment")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi")))
				.andExpect(content().string(containsString("haswatchlist")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("androidapp")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("tivoshortname")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("iptvservice")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01")))
				.andExpect(content().string(containsString("site")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz")))
				.andExpect(content().string(containsString("icanota")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("androidapplink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("onhululink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs")))
				.andExpect(content().string(containsString("webinterface")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklm")))
				.andExpect(content().string(containsString("freewithtwcidlink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("commercials")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("rokuapp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")))
				.andExpect(content().string(containsString("iptvservicelink")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#getAllShowss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowss() throws Exception {
		List<Shows> list = new ArrayList<>();
		Shows o = new Shows();
		o.setId(1);
         o.setImdb("A");
         o.setCommentlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setBestexperiencelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setStatus("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setEpguidesshowname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setNetwork("ABCDEFGHIJKLMN");
         o.setLastshow("ABCDEFGHIJ");
         o.setIncanceledas("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setInshowrssaslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345");
         o.setCancelled("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setTivoname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setJustwatch("AB");
         o.setIncanceledaslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setNetworklink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setBestexperience("ABCDEFGHIJKLMNOPQ");
         o.setLastwatched("ABCDEFGHIJ");
         o.setJustwatchlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setTivonamelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234");
         o.setPremiere("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setInshowrssas("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setComment("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setImdblink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz");
         o.setInrokufeed("A");
         o.setEpguidesshownamelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvw");
         o.setOta("ABC");
		list.add(o);

		given(showsService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/showss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("imdb")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("commentlink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("bestexperiencelink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("status")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("epguidesshowname")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("network")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("lastshow")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("incanceledas")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345")))
				.andExpect(content().string(containsString("inshowrssaslink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("cancelled")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("tivoname")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("justwatch")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("incanceledaslink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("networklink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQ")))
				.andExpect(content().string(containsString("bestexperience")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("lastwatched")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("justwatchlink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234")))
				.andExpect(content().string(containsString("tivonamelink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("premiere")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("inshowrssas")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("comment")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz")))
				.andExpect(content().string(containsString("imdblink")))
				.andExpect(content().string(containsString("premieredate")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("inrokufeed")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvw")))
				.andExpect(content().string(containsString("epguidesshownamelink")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("ota")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#getAllRoamiosps(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiosps() throws Exception {
		List<Roamiosp> list = new ArrayList<>();
		Roamiosp o = new Roamiosp();
		o.setId(1);
         o.setRecord("ABCDEFGHIJKLM");
         o.setInclude("ABCDEF");
         o.setKeep("ABCDEFG");
         o.setChannel("ABCDEFGHIJKLMN");
         o.setShow("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnop");
		list.add(o);

		given(roamiospService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/roamiosps").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("ABCDEFGHIJKLM")))
				.andExpect(content().string(containsString("record")))
				.andExpect(content().string(containsString("priority")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ABCDEF")))
				.andExpect(content().string(containsString("include")))
				.andExpect(content().string(containsString("ABCDEFG")))
				.andExpect(content().string(containsString("keep")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("channel")))
				.andExpect(content().string(containsString("end")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnop")))
				.andExpect(content().string(containsString("show")))
				.andExpect(content().string(containsString("num")))
				.andExpect(content().string(containsString("season")))
				.andExpect(content().string(containsString("start")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#getAllCablecards(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllCablecards() throws Exception {
		List<Cablecard> list = new ArrayList<>();
		Cablecard o = new Cablecard();
		o.setId(1);
         o.setReceiving("ABC");
         o.setLang("AB");
         o.setOd("ABCDEFGHIJKLMNOPQRST");
         o.setChannelname("ABCDEFGHIJKL");
         o.setShortfield("ABCDEFGHIJKL");
         o.setNet("ABCDEFGHIJKL");
		list.add(o);

		given(cablecardService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/cablecards").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("receiving")))
				.andExpect(content().string(containsString("dt")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("innpl")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("lang")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRST")))
				.andExpect(content().string(containsString("od")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("channelname")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("shortfield")))
				.andExpect(content().string(containsString("channelnumber")))
				.andExpect(content().string(containsString("colh")))
				.andExpect(content().string(containsString("hd")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("net")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#getAllRoamionpls(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamionpls() throws Exception {
		List<Roamionpl> list = new ArrayList<>();
		Roamionpl o = new Roamionpl();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMNOP");
         o.setShow("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijkl");
         o.setEpisode("ABCD");
         o.setTitle("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
		list.add(o);

		given(roamionplService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/roamionpls").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("bitratembps")))
				.andExpect(content().string(containsString("date")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOP")))
				.andExpect(content().string(containsString("channel")))
				.andExpect(content().string(containsString("isnew")))
				.andExpect(content().string(containsString("sizegb")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijkl")))
				.andExpect(content().string(containsString("show")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("episode")))
				.andExpect(content().string(containsString("sortabledate")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("title")))
				.andExpect(content().string(containsString("watchedtime")))
				.andExpect(content().string(containsString("duration")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#getAllOtas(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllOtas() throws Exception {
		List<Ota> list = new ArrayList<>();
		Ota o = new Ota();
		o.setId(1);
         o.setRez("ABCDE");
         o.setNetwork("ABCDEFGH");
         o.setStation("ABCDEFGHI");
         o.setFccinfolink("ABCDEF");
         o.setComments("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234");
         o.setLang("AB");
         o.setOff("ABC");
         o.setFccinfo("ABCDEFGHI");
         o.setChannelname("ABCDEFGHI");
         o.setDirection("ABCD");
         o.setTvfoolestsignal("ABCD");
         o.setWatchable("ABCD");
         o.setRecommendedantenna("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd");
         o.setEnabled("ABC");
		list.add(o);

		given(otaService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/otas").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("subchan")))
				.andExpect(content().string(containsString("ABCDE")))
				.andExpect(content().string(containsString("rez")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("mytivoavgstrength")))
				.andExpect(content().string(containsString("ABCDEFGH")))
				.andExpect(content().string(containsString("network")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("station")))
				.andExpect(content().string(containsString("ABCDEF")))
				.andExpect(content().string(containsString("fccinfolink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234")))
				.andExpect(content().string(containsString("comments")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("lang")))
				.andExpect(content().string(containsString("chan")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("off")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("fccinfo")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("channelname")))
				.andExpect(content().string(containsString("freq")))
				.andExpect(content().string(containsString("listed")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("direction")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("tvfoolestsignal")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("watchable")))
				.andExpect(content().string(containsString("channelnumber")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd")))
				.andExpect(content().string(containsString("recommendedantenna")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("enabled")));
	}


	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#getAllRoamiotodos(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiotodos() throws Exception {
		List<Roamiotodo> list = new ArrayList<>();
		Roamiotodo o = new Roamiotodo();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMNOP");
         o.setShowtrimmed("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setEpisodename("A");
         o.setShowname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setDuration("ABCD");
		list.add(o);

		given(roamiotodoService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/api/roamiotodos").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ep")))
				.andExpect(content().string(containsString("date")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOP")))
				.andExpect(content().string(containsString("channel")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("showtrimmed")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("episodename")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("showname")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("duration")));
	}

}
