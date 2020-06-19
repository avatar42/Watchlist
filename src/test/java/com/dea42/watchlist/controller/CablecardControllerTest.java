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

import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.service.CablecardServices;

/**
 * Title: CablecardControllerTest <br>
 * Description: Class for testing the CablecardController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(CablecardController.class)
public class CablecardControllerTest {
	@MockBean
	private CablecardServices cablecardService;

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
	 * {@link com.dea42.watchlist.controller.CablecardController#getAllCablecards(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllCablecards() throws Exception {
		List<Cablecard> list = new ArrayList<>();
		Cablecard o = new Cablecard();
		o.setId(1);
         o.setChannelname("ABCDEFGHIJKL");
         o.setLang("AB");
         o.setNet("ABCDEFGHIJKL");
         o.setOd("ABCDEFGHIJKLMNOPQRST");
         o.setReceiving("ABC");
         o.setShortfield("ABCDEFGHIJKL");
		list.add(o);

		given(cablecardService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/cablecards").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Cablecard List</h1>")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("ChannelName")))
				.andExpect(content().string(containsString("ChannelNumber")))
				.andExpect(content().string(containsString("Colh")))
				.andExpect(content().string(containsString("Dt")))
				.andExpect(content().string(containsString("Hd")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("InNpl")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("Lang")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("Net")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRST")))
				.andExpect(content().string(containsString("Od")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Receiving")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("ShortField")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#showNewCablecardPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewCablecardPage() throws Exception {
		this.mockMvc.perform(get("/cablecards/new").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Create New Cablecard</h1>")))
				.andExpect(content().string(containsString("ChannelName")))
				.andExpect(content().string(containsString("ChannelNumber")))
				.andExpect(content().string(containsString("Colh")))
				.andExpect(content().string(containsString("Dt")))
				.andExpect(content().string(containsString("Hd")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("InNpl")))
				.andExpect(content().string(containsString("Lang")))
				.andExpect(content().string(containsString("Net")))
				.andExpect(content().string(containsString("Od")))
				.andExpect(content().string(containsString("Receiving")))
				.andExpect(content().string(containsString("ShortField")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#saveCablecard(com.dea42.watchlist.entity.Cablecard, java.lang.String)}.
	 */
	@Test
	public void testSaveCablecardCancel() throws Exception {
		this.mockMvc.perform(post("/cablecards/save").param("action", "cancel").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/cablecards"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#saveCablecard(com.dea42.watchlist.entity.Cablecard, java.lang.String)}.
	 */
	@Test
	public void testSaveCablecardSave() throws Exception {
		this.mockMvc.perform(post("/cablecards/save").param("action", "save").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/cablecards"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#showEditCablecardPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditCablecardPage() throws Exception {
		Cablecard o = new Cablecard();
		o.setId(1);
         o.setChannelname("ABCDEFGHIJKL");
         o.setLang("AB");
         o.setNet("ABCDEFGHIJKL");
         o.setOd("ABCDEFGHIJKLMNOPQRST");
         o.setReceiving("ABC");
         o.setShortfield("ABCDEFGHIJKL");

		given(cablecardService.get(1)).willReturn(o);

		this.mockMvc.perform(get("/cablecards/edit/1").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("ChannelName")))
				.andExpect(content().string(containsString("ChannelNumber")))
				.andExpect(content().string(containsString("Colh")))
				.andExpect(content().string(containsString("Dt")))
				.andExpect(content().string(containsString("Hd")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("InNpl")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("Lang")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("Net")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRST")))
				.andExpect(content().string(containsString("Od")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Receiving")))
				.andExpect(content().string(containsString("ABCDEFGHIJKL")))
				.andExpect(content().string(containsString("ShortField")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#deleteCablecard(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteCablecard() throws Exception {
		this.mockMvc.perform(get("/cablecards/delete/1").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/cablecards"));
	}

}

