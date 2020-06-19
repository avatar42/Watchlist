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

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.service.ShowsServices;

/**
 * Title: ShowsControllerTest <br>
 * Description: Class for testing the ShowsController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ShowsController.class)
public class ShowsControllerTest {
	@MockBean
	private ShowsServices showsService;

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
	 * {@link com.dea42.watchlist.controller.ShowsController#getAllShowss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowss() throws Exception {
		List<Shows> list = new ArrayList<>();
		Shows o = new Shows();
		o.setId(1);
         o.setBestexperience("ABCDEFGHIJKLMNOPQ");
         o.setBestexperiencelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setCancelled("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setComment("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setCommentlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setEpguidesshowname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setEpguidesshownamelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvw");
         o.setImdb("A");
         o.setImdblink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz");
         o.setIncanceledas("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setIncanceledaslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setInrokufeed("A");
         o.setInshowrssas("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setInshowrssaslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345");
         o.setJustwatch("AB");
         o.setJustwatchlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setLastshow("ABCDEFGHIJ");
         o.setLastwatched("ABCDEFGHIJ");
         o.setNetwork("ABCDEFGHIJKLMN");
         o.setNetworklink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setOta("ABC");
         o.setPremiere("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setStatus("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setTivoname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setTivonamelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234");
		list.add(o);

		given(showsService.listAll()).willReturn(list);

		this.mockMvc.perform(get("/showss").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Shows List</h1>")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQ")))
				.andExpect(content().string(containsString("BestExperience")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("BestExperienceLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Cancelled")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Comment")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("CommentLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("EpguidesShowName")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvw")))
				.andExpect(content().string(containsString("EpguidesShowNameLink")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("Imdb")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz")))
				.andExpect(content().string(containsString("ImdbLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("InCanceledAs")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("InCanceledAsLink")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("InRokuFeed")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("InShowRssAs")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345")))
				.andExpect(content().string(containsString("InShowRssAsLink")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("JustWatch")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("JustWatchLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("LastShow")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("LastWatched")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("Network")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("NetworkLink")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Ota")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Premiere")))
				.andExpect(content().string(containsString("PremiereDate")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Status")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("TivoName")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234")))
				.andExpect(content().string(containsString("TivoNameLink")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#showNewShowsPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewShowsPage() throws Exception {
		this.mockMvc.perform(get("/showss/new").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("<h1>Create New Shows</h1>")))
				.andExpect(content().string(containsString("BestExperience")))
				.andExpect(content().string(containsString("BestExperienceLink")))
				.andExpect(content().string(containsString("Cancelled")))
				.andExpect(content().string(containsString("Comment")))
				.andExpect(content().string(containsString("CommentLink")))
				.andExpect(content().string(containsString("EpguidesShowName")))
				.andExpect(content().string(containsString("EpguidesShowNameLink")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("Imdb")))
				.andExpect(content().string(containsString("ImdbLink")))
				.andExpect(content().string(containsString("InCanceledAs")))
				.andExpect(content().string(containsString("InCanceledAsLink")))
				.andExpect(content().string(containsString("InRokuFeed")))
				.andExpect(content().string(containsString("InShowRssAs")))
				.andExpect(content().string(containsString("InShowRssAsLink")))
				.andExpect(content().string(containsString("JustWatch")))
				.andExpect(content().string(containsString("JustWatchLink")))
				.andExpect(content().string(containsString("LastShow")))
				.andExpect(content().string(containsString("LastWatched")))
				.andExpect(content().string(containsString("Network")))
				.andExpect(content().string(containsString("NetworkLink")))
				.andExpect(content().string(containsString("Ota")))
				.andExpect(content().string(containsString("Premiere")))
				.andExpect(content().string(containsString("PremiereDate")))
				.andExpect(content().string(containsString("Status")))
				.andExpect(content().string(containsString("TivoName")))
				.andExpect(content().string(containsString("TivoNameLink")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsCancel() throws Exception {
		this.mockMvc.perform(post("/showss/save").param("action", "cancel").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/showss"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsSave() throws Exception {
		this.mockMvc.perform(post("/showss/save").param("action", "save").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/showss"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#showEditShowsPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditShowsPage() throws Exception {
		Shows o = new Shows();
		o.setId(1);
         o.setBestexperience("ABCDEFGHIJKLMNOPQ");
         o.setBestexperiencelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setCancelled("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setComment("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setCommentlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setEpguidesshowname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setEpguidesshownamelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvw");
         o.setImdb("A");
         o.setImdblink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz");
         o.setIncanceledas("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setIncanceledaslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setInrokufeed("A");
         o.setInshowrssas("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setInshowrssaslink("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345");
         o.setJustwatch("AB");
         o.setJustwatchlink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setLastshow("ABCDEFGHIJ");
         o.setLastwatched("ABCDEFGHIJ");
         o.setNetwork("ABCDEFGHIJKLMN");
         o.setNetworklink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setOta("ABC");
         o.setPremiere("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setStatus("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy");
         o.setTivoname("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij");
         o.setTivonamelink("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234");

		given(showsService.get(1)).willReturn(o);

		this.mockMvc.perform(get("/showss/edit/1").with(user("user").roles("ADMIN"))).andExpect(status().isOk())
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQ")))
				.andExpect(content().string(containsString("BestExperience")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("BestExperienceLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Cancelled")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Comment")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("CommentLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("EpguidesShowName")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvw")))
				.andExpect(content().string(containsString("EpguidesShowNameLink")))
				.andExpect(content().string(containsString("id")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("Imdb")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzyz")))
				.andExpect(content().string(containsString("ImdbLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("InCanceledAs")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("InCanceledAsLink")))
				.andExpect(content().string(containsString("A")))
				.andExpect(content().string(containsString("InRokuFeed")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("InShowRssAs")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ012345")))
				.andExpect(content().string(containsString("InShowRssAsLink")))
				.andExpect(content().string(containsString("AB")))
				.andExpect(content().string(containsString("JustWatch")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("JustWatchLink")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("LastShow")))
				.andExpect(content().string(containsString("ABCDEFGHIJ")))
				.andExpect(content().string(containsString("LastWatched")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMN")))
				.andExpect(content().string(containsString("Network")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("NetworkLink")))
				.andExpect(content().string(containsString("ABC")))
				.andExpect(content().string(containsString("Ota")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Premiere")))
				.andExpect(content().string(containsString("PremiereDate")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwzy")))
				.andExpect(content().string(containsString("Status")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghij")))
				.andExpect(content().string(containsString("TivoName")))
				.andExpect(content().string(containsString("ABCDEFGHIJKLMNOPQRSTUVWXYZ01234")))
				.andExpect(content().string(containsString("TivoNameLink")));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#deleteShows(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteShows() throws Exception {
		this.mockMvc.perform(get("/showss/delete/1").with(user("user").roles("ADMIN")))
				.andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/showss"));
	}

}

