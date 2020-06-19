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

import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.service.RoamiospServices;

/**
 * Title: RoamiospControllerTest <br>
 * Description: Class for testing the RoamiospController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(RoamiospController.class)
public class RoamiospControllerTest {
	@MockBean
	private RoamiospServices roamiospService;

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
	 * {@link com.dea42.watchlist.controller.RoamiospController#getAllRoamiosps(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiosps() throws Exception {
		List<Roamiosp> list = new ArrayList<>();
		Roamiosp o = new Roamiosp();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMN");
         o.setInclude("ABCDEF");
         o.setKeep("ABCDEFG");
         o.setRecord("ABCDEFGHIJKLM");
         o.setShow("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnop");
		list.add(o);

		given(roamiospService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/roamiosps").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Roamiosp List</h1>")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("End")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ABCDEF")))
				.andExpect(content().string(containsString("Include")))
				.andExpect(content().string(containsString("ABCDEFG")))
				.andExpect(content().string(containsString("Keep")))
				.andExpect(content().string(containsString("Num")))
				.andExpect(content().string(containsString("Priority")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLM")))
				.andExpect(content().string(containsString("Record")))
				.andExpect(content().string(containsString("Season")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnop")))
				.andExpect(content().string(containsString("Show")))
				.andExpect(content().string(containsString("Start")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#showNewRoamiospPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewRoamiospPage() throws Exception {
		this.mockMvc.perform(get("/roamiosps/new").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Create New Roamiosp</h1>")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("End")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("Include")))
				.andExpect(content().string(containsString("Keep")))
				.andExpect(content().string(containsString("Num")))
				.andExpect(content().string(containsString("Priority")))
				.andExpect(content().string(containsString("Record")))
				.andExpect(content().string(containsString("Season")))
				.andExpect(content().string(containsString("Show")))
				.andExpect(content().string(containsString("Start")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#saveRoamiosp(com.dea42.watchlist.entity.Roamiosp, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiospCancel() throws Exception {
		this.mockMvc.perform(post("/roamiosps/save").param("action", "cancel").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamiosps"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#saveRoamiosp(com.dea42.watchlist.entity.Roamiosp, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiospSave() throws Exception {
		this.mockMvc.perform(post("/roamiosps/save").param("action", "save").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamiosps"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#showEditRoamiospPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditRoamiospPage() throws Exception {
		Roamiosp o = new Roamiosp();
		o.setId(1);
         o.setChannel("ABCDEFGHIJKLMN");
         o.setInclude("ABCDEF");
         o.setKeep("ABCDEFG");
         o.setRecord("ABCDEFGHIJKLM");
         o.setShow("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnop");

		given(roamiospService.get(1)).willReturn(o);

		this.mockMvc.perform(get("/roamiosps/edit/1").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("Channel")))
				.andExpect(content().string(containsString("End")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ABCDEF")))
				.andExpect(content().string(containsString("Include")))
				.andExpect(content().string(containsString("ABCDEFG")))
				.andExpect(content().string(containsString("Keep")))
				.andExpect(content().string(containsString("Num")))
				.andExpect(content().string(containsString("Priority")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLM")))
				.andExpect(content().string(containsString("Record")))
				.andExpect(content().string(containsString("Season")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnop")))
				.andExpect(content().string(containsString("Show")))
				.andExpect(content().string(containsString("Start")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#deleteRoamiosp(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteRoamiosp() throws Exception {
		this.mockMvc.perform(get("/roamiosps/delete/1").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/roamiosps"));
	}

}

