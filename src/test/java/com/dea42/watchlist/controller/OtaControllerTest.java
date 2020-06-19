package com.dea42.watchlist.controller;
import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
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

import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.service.OtaServices;

/**
 * Title: OtaControllerTest <br>
 * Description: Class for testing the OtaController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(OtaController.class)
public class OtaControllerTest {
	@MockBean
	private OtaServices otaService;

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before()
	public void setup() {
		// Init MockMvc Object and build
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
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
         o.setChannelname("ABCDEFGHI");
         o.setComments("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234");
         o.setDirection("ABCD");
         o.setEnabled("ABC");
         o.setFccinfo("ABCDEFGHI");
         o.setFccinfolink("ABCDEF");
         o.setLang("AB");
         o.setNetwork("ABCDEFGH");
         o.setOff("ABC");
         o.setRecommendedantenna("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd");
         o.setRez("ABCDE");
         o.setStation("ABCDEFGHI");
         o.setTvfoolestsignal("ABCD");
         o.setWatchable("ABCD");
		list.add(o);

		given(otaService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/otas").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Ota List</h1>")))
				.andExpect(content().string(containsString("Chan")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("ChannelName")))
				.andExpect(content().string(containsString("ChannelNumber")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234")))
				.andExpect(content().string(containsString("Comments")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Direction")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Enabled")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("FccInfo")))
				.andExpect(content().string(containsString("ABCDEF")))
				.andExpect(content().string(containsString("FccInfoLink")))
				.andExpect(content().string(containsString("Freq")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("Lang")))
				.andExpect(content().string(containsString("Listed")))
				.andExpect(content().string(containsString("MyTivoAvgStrength")))
				.andExpect(content().string(containsString("ABCDEFGH")))
				.andExpect(content().string(containsString("Network")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Off")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd")))
				.andExpect(content().string(containsString("RecommendedAntenna")))
				.andExpect(content().string(containsString("ABCDE")))
				.andExpect(content().string(containsString("Rez")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("Station")))
				.andExpect(content().string(containsString("SubChan")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("TvFoolEstSignal")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Watchable")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#showNewOtaPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewOtaPage() throws Exception {
		this.mockMvc.perform(get("/otas/new").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Create New Ota</h1>")))
				.andExpect(content().string(containsString("Chan")))
				.andExpect(content().string(containsString("ChannelName")))
				.andExpect(content().string(containsString("ChannelNumber")))
				.andExpect(content().string(containsString("Comments")))
				.andExpect(content().string(containsString("Direction")))
				.andExpect(content().string(containsString("Enabled")))
				.andExpect(content().string(containsString("FccInfo")))
				.andExpect(content().string(containsString("FccInfoLink")))
				.andExpect(content().string(containsString("Freq")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("Lang")))
				.andExpect(content().string(containsString("Listed")))
				.andExpect(content().string(containsString("MyTivoAvgStrength")))
				.andExpect(content().string(containsString("Network")))
				.andExpect(content().string(containsString("Off")))
				.andExpect(content().string(containsString("RecommendedAntenna")))
				.andExpect(content().string(containsString("Rez")))
				.andExpect(content().string(containsString("Station")))
				.andExpect(content().string(containsString("SubChan")))
				.andExpect(content().string(containsString("TvFoolEstSignal")))
				.andExpect(content().string(containsString("Watchable")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#saveOta(com.dea42.watchlist.entity.Ota, java.lang.String)}.
	 */
	@Test
	public void testSaveOtaCancel() throws Exception {
		this.mockMvc.perform(post("/otas/save").param("action", "cancel").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/otas"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#saveOta(com.dea42.watchlist.entity.Ota, java.lang.String)}.
	 */
	@Test
	public void testSaveOtaSave() throws Exception {
		this.mockMvc.perform(post("/otas/save").param("action", "save").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/otas"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#showEditOtaPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditOtaPage() throws Exception {
		Ota o = new Ota();
		o.setId(1);
         o.setChannelname("ABCDEFGHI");
         o.setComments("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234");
         o.setDirection("ABCD");
         o.setEnabled("ABC");
         o.setFccinfo("ABCDEFGHI");
         o.setFccinfolink("ABCDEF");
         o.setLang("AB");
         o.setNetwork("ABCDEFGH");
         o.setOff("ABC");
         o.setRecommendedantenna("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd");
         o.setRez("ABCDE");
         o.setStation("ABCDEFGHI");
         o.setTvfoolestsignal("ABCD");
         o.setWatchable("ABCD");

		given(otaService.get(1)).willReturn(o);

		this.mockMvc.perform(get("/otas/edit/1").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("Chan")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("ChannelName")))
				.andExpect(content().string(containsString("ChannelNumber")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234")))
				.andExpect(content().string(containsString("Comments")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Direction")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Enabled")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("FccInfo")))
				.andExpect(content().string(containsString("ABCDEF")))
				.andExpect(content().string(containsString("FccInfoLink")))
				.andExpect(content().string(containsString("Freq")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("Lang")))
				.andExpect(content().string(containsString("Listed")))
				.andExpect(content().string(containsString("MyTivoAvgStrength")))
				.andExpect(content().string(containsString("ABCDEFGH")))
				.andExpect(content().string(containsString("Network")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Off")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd")))
				.andExpect(content().string(containsString("RecommendedAntenna")))
				.andExpect(content().string(containsString("ABCDE")))
				.andExpect(content().string(containsString("Rez")))
				.andExpect(content().string(containsString("ABCDEFGHI")))
				.andExpect(content().string(containsString("Station")))
				.andExpect(content().string(containsString("SubChan")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("TvFoolEstSignal")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Watchable")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#deleteOta(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteOta() throws Exception {
		this.mockMvc.perform(get("/otas/delete/1").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/otas"));
	}

}

