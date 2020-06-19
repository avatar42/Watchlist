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

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.service.NetworksServices;

/**
 * Title: NetworksControllerTest <br>
 * Description: Class for testing the NetworksController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(NetworksController.class)
public class NetworksControllerTest {
	@MockBean
	private NetworksServices networksService;

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
	 * {@link com.dea42.watchlist.controller.NetworksController#getAllNetworkss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworkss() throws Exception {
		List<Networks> list = new ArrayList<>();
		Networks o = new Networks();
		o.setId(1);
         o.setRokuapp("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setSite("ABCDEFGHIJKLMNOPQRSTUVWXYZ01");
         o.setCommercials("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setPersistance("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setOnhulu("ABCDEFGHIJKLMN");
         o.setStandardwait("ABCDEFGHIJKLMNOPQ");
		list.add(o);

		given(networksService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/networkss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Networks List</h1>")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("RokuApp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01")))
				.andExpect(content().string(containsString("Site")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Commercials")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Persistance")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("OnHulu")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQ")))
				.andExpect(content().string(containsString("StandardWait")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#showNewNetworksPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewNetworksPage() throws Exception {
		this.mockMvc.perform(get("/networkss/new").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Create New Networks</h1>")))
				.andExpect(content().string(containsString("AndroidApp")))
				.andExpect(content().string(containsString("AndroidAppLink")))
				.andExpect(content().string(containsString("Comment")))
				.andExpect(content().string(containsString("CommentLink")))
				.andExpect(content().string(containsString("Commercials")))
				.andExpect(content().string(containsString("CommercialsLink")))
				.andExpect(content().string(containsString("FireApp")))
				.andExpect(content().string(containsString("FireAppLink")))
				.andExpect(content().string(containsString("FreeWithTwcId")))
				.andExpect(content().string(containsString("FreeWithTwcIdLink")))
				.andExpect(content().string(containsString("HasDirectBuyOption")))
				.andExpect(content().string(containsString("HasDirectBuyOptionLink")))
				.andExpect(content().string(containsString("HasWatchList")))
				.andExpect(content().string(containsString("ICanOta")))
				.andExpect(content().string(containsString("ICanOtaLink")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("IptvService")))
				.andExpect(content().string(containsString("IptvServiceLink")))
				.andExpect(content().string(containsString("OnHulu")))
				.andExpect(content().string(containsString("OnHuluLink")))
				.andExpect(content().string(containsString("Persistance")))
				.andExpect(content().string(containsString("RemembersPlaceInEpisode")))
				.andExpect(content().string(containsString("RemembersWatchedEpisodes")))
				.andExpect(content().string(containsString("RokuApp")))
				.andExpect(content().string(containsString("RokuAppLink")))
				.andExpect(content().string(containsString("ShowsInTivoNpl")))
				.andExpect(content().string(containsString("Site")))
				.andExpect(content().string(containsString("SiteLink")))
				.andExpect(content().string(containsString("StandardWait")))
				.andExpect(content().string(containsString("TivoApp")))
				.andExpect(content().string(containsString("TivoAppLink")))
				.andExpect(content().string(containsString("TivoShortName")))
				.andExpect(content().string(containsString("WebInterface")))
				.andExpect(content().string(containsString("WebInterfaceLink")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#saveNetworks(com.dea42.watchlist.entity.Networks, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksCancel() throws Exception {
		this.mockMvc.perform(post("/networkss/save").param("action", "cancel").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/networkss"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#saveNetworks(com.dea42.watchlist.entity.Networks, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksSave() throws Exception {
		this.mockMvc.perform(post("/networkss/save").param("action", "save").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/networkss"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#showEditNetworksPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditNetworksPage() throws Exception {
		Networks o = new Networks();
		o.setId(1);
         o.setAndroidapp("A");
         o.setAndroidapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setComment("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setCommentlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setCommercials("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setCommercialslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890");
         o.setFireapp("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs");
         o.setFireapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi");
         o.setFreewithtwcid("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst");
         o.setFreewithtwcidlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklm");
         o.setHasdirectbuyoption("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setHasdirectbuyoptionlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqr");
         o.setHaswatchlist("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi");
         o.setIcanota("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz");
         o.setIcanotalink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setIptvservice("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setIptvservicelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
         o.setOnhulu("ABCDEFGHIJKLMN");
         o.setOnhululink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setPersistance("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setRemembersplaceinepisode("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst");
         o.setRememberswatchedepisodes("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678");
         o.setRokuapp("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setRokuapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi");
         o.setSite("ABCDEFGHIJKLMNOPQRSTUVWXYZ01");
         o.setSitelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmno");
         o.setStandardwait("ABCDEFGHIJKLMNOPQ");
         o.setTivoapp("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwz");
         o.setTivoapplink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567");
         o.setTivoshortname("ABCDEFGHIJ");
         o.setWebinterface("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs");
         o.setWebinterfacelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd");

		given(networksService.get(1)).willReturn(o);

		this.mockMvc.perform(get("/networkss/edit/1").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("AndroidApp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("AndroidAppLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Comment")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("CommentLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Commercials")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890")))
				.andExpect(content().string(containsString("CommercialsLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs")))
				.andExpect(content().string(containsString("FireApp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi")))
				.andExpect(content().string(containsString("FireAppLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst")))
				.andExpect(content().string(containsString("FreeWithTwcId")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklm")))
				.andExpect(content().string(containsString("FreeWithTwcIdLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("HasDirectBuyOption")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqr")))
				.andExpect(content().string(containsString("HasDirectBuyOptionLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi")))
				.andExpect(content().string(containsString("HasWatchList")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz")))
				.andExpect(content().string(containsString("ICanOta")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("ICanOtaLink")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("IptvService")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")))
				.andExpect(content().string(containsString("IptvServiceLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("OnHulu")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("OnHuluLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Persistance")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrst")))
				.andExpect(content().string(containsString("RemembersPlaceInEpisode")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678")))
				.andExpect(content().string(containsString("RemembersWatchedEpisodes")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("RokuApp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghi")))
				.andExpect(content().string(containsString("RokuAppLink")))
				.andExpect(content().string(containsString("ShowsInTivoNpl")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01")))
				.andExpect(content().string(containsString("Site")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmno")))
				.andExpect(content().string(containsString("SiteLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQ")))
				.andExpect(content().string(containsString("StandardWait")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwz")))
				.andExpect(content().string(containsString("TivoApp")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567")))
				.andExpect(content().string(containsString("TivoAppLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("TivoShortName")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrs")))
				.andExpect(content().string(containsString("WebInterface")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcd")))
				.andExpect(content().string(containsString("WebInterfaceLink")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#deleteNetworks(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteNetworks() throws Exception {
		this.mockMvc.perform(get("/networkss/delete/1").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/networkss"));
	}

}

