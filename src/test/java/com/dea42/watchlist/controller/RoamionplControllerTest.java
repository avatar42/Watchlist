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

import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.service.RoamionplServices;

/**
 * Title: RoamionplControllerTest <br>
 * Description: Class for testing the RoamionplController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(RoamionplController.class)
public class RoamionplControllerTest {
	@MockBean
	private RoamionplServices roamionplService;

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
	 * {@link com.dea42.watchlist.controller.RoamionplController#getAllRoamionpls(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamionpls() throws Exception {
		List<Roamionpl> list = new ArrayList<>();
		Roamionpl o = new Roamionpl();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMNOP");
         o.setEpisode("ABCD");
         o.setShow("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijkl");
         o.setTitle("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
		list.add(o);

		given(roamionplService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/roamionpls").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Roamionpl List</h1>")))
				.andExpect(content().string(containsString("BitrateMbps")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOP")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("Date")))
				.andExpect(content().string(containsString("Duration")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Episode")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("Isnew")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijkl")))
				.andExpect(content().string(containsString("Show")))
				.andExpect(content().string(containsString("SizeGb")))
				.andExpect(content().string(containsString("SortableDate")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Title")))
				.andExpect(content().string(containsString("Watchedtime")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#showNewRoamionplPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewRoamionplPage() throws Exception {
		this.mockMvc.perform(get("/roamionpls/new").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Create New Roamionpl</h1>")))
				.andExpect(content().string(containsString("BitrateMbps")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("Date")))
				.andExpect(content().string(containsString("Duration")))
				.andExpect(content().string(containsString("Episode")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("Isnew")))
				.andExpect(content().string(containsString("Show")))
				.andExpect(content().string(containsString("SizeGb")))
				.andExpect(content().string(containsString("SortableDate")))
				.andExpect(content().string(containsString("Title")))
				.andExpect(content().string(containsString("Watchedtime")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#saveRoamionpl(com.dea42.watchlist.entity.Roamionpl, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamionplCancel() throws Exception {
		this.mockMvc.perform(post("/roamionpls/save").param("action", "cancel").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamionpls"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#saveRoamionpl(com.dea42.watchlist.entity.Roamionpl, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamionplSave() throws Exception {
		this.mockMvc.perform(post("/roamionpls/save").param("action", "save").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamionpls"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#showEditRoamionplPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditRoamionplPage() throws Exception {
		Roamionpl o = new Roamionpl();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMNOP");
         o.setEpisode("ABCD");
         o.setShow("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijkl");
         o.setTitle("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");

		given(roamionplService.get(1)).willReturn(o);

		this.mockMvc.perform(get("/roamionpls/edit/1").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("BitrateMbps")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOP")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("Date")))
				.andExpect(content().string(containsString("Duration")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Episode")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("Isnew")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijkl")))
				.andExpect(content().string(containsString("Show")))
				.andExpect(content().string(containsString("SizeGb")))
				.andExpect(content().string(containsString("SortableDate")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Title")))
				.andExpect(content().string(containsString("Watchedtime")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#deleteRoamionpl(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteRoamionpl() throws Exception {
		this.mockMvc.perform(get("/roamionpls/delete/1").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamionpls"));
	}

}

