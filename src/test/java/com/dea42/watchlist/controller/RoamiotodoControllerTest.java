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

import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.service.RoamiotodoServices;

/**
 * Title: RoamiotodoControllerTest <br>
 * Description: Class for testing the RoamiotodoController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(RoamiotodoController.class)
public class RoamiotodoControllerTest {
	@MockBean
	private RoamiotodoServices roamiotodoService;

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
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#getAllRoamiotodos(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiotodos() throws Exception {
		List<Roamiotodo> list = new ArrayList<>();
		Roamiotodo o = new Roamiotodo();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMNOP");
         o.setDuration("ABCD");
         o.setEpisodename("A");
         o.setShowname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setShowtrimmed("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
		list.add(o);

		given(roamiotodoService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/roamiotodos").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Roamiotodo List</h1>")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOP")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("Date")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Duration")))
				.andExpect(content().string(containsString("Ep")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("EpisodeName")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("ShowName")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("ShowTrimmed")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#showNewRoamiotodoPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewRoamiotodoPage() throws Exception {
		this.mockMvc.perform(get("/roamiotodos/new").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Create New Roamiotodo</h1>")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("Date")))
				.andExpect(content().string(containsString("Duration")))
				.andExpect(content().string(containsString("Ep")))
				.andExpect(content().string(containsString("EpisodeName")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ShowName")))
				.andExpect(content().string(containsString("ShowTrimmed")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#saveRoamiotodo(com.dea42.watchlist.entity.Roamiotodo, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiotodoCancel() throws Exception {
		this.mockMvc.perform(post("/roamiotodos/save").param("action", "cancel").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamiotodos"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#saveRoamiotodo(com.dea42.watchlist.entity.Roamiotodo, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiotodoSave() throws Exception {
		this.mockMvc.perform(post("/roamiotodos/save").param("action", "save").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamiotodos"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#showEditRoamiotodoPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditRoamiotodoPage() throws Exception {
		Roamiotodo o = new Roamiotodo();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMNOP");
         o.setDuration("ABCD");
         o.setEpisodename("A");
         o.setShowname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setShowtrimmed("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");

		given(roamiotodoService.get(1)).willReturn(o);

		this.mockMvc.perform(get("/roamiotodos/edit/1").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOP")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("Date")))
				.andExpect(content().string(containsString("ABCD")))
				.andExpect(content().string(containsString("Duration")))
				.andExpect(content().string(containsString("Ep")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("EpisodeName")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("ShowName")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("ShowTrimmed")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#deleteRoamiotodo(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteRoamiotodo() throws Exception {
		this.mockMvc.perform(get("/roamiotodos/delete/1").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamiotodos"));
	}

}

