package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;
import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Shows;

/**
 * Title: ShowsControllerTest <br>
 * Description: Class for testing the ShowsController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@WebMvcTest(ShowsController.class)
public class ShowsControllerTest extends MockBase {
	private Shows getShows(Integer id) {
		Shows o = new Shows();
		o.setId(id);
        o.setBestexperience(getTestString(17));
        o.setBestexperiencelink(getTestString(306));
        o.setCancelled(getTestString(65));
        o.setComment(getTestString(181));
        o.setCommentlink(getTestString(228));
        o.setEpguidesshowname(getTestString(47));
        o.setEpguidesshownamelink(getTestString(60));
        o.setImdb(getTestString(1));
        o.setImdblink(getTestString(63));
        o.setIncanceledas(getTestString(47));
        o.setIncanceledaslink(getTestString(70));
        o.setInrokufeed(getTestString(1));
        o.setInshowrssas(getTestString(47));
        o.setInshowrssaslink(getTestString(32));
        o.setJustwatch(getTestString(2));
        o.setJustwatchlink(getTestString(75));
        o.setLastshow(getTestString(10));
        o.setLastwatched(getTestString(10));
        o.setNetwork(getTestString(14));
        o.setNetworklink(getTestString(306));
        o.setOta(getTestString(3));
        o.setPremiere(getTestString(65));
        o.setStatus(getTestString(65));
        o.setTivoname(getTestString(47));
        o.setTivonamelink(getTestString(31));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#getAllShowss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowss() throws Exception {
		List<Shows> list = new ArrayList<>();
		Shows o = getShows(1);
		list.add(o);

		given(showsServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/showss");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Shows") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(17));
		contentContainsMarkup(ra,"BestExperience");
		contentContainsMarkup(ra,getTestString(306));
		contentContainsMarkup(ra,"BestExperienceLink");
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,getTestString(181));
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,getTestString(228));
		contentContainsMarkup(ra,"CommentLink");
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,"EpguidesShowName");
		contentContainsMarkup(ra,getTestString(60));
		contentContainsMarkup(ra,"EpguidesShowNameLink");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,"Imdb");
		contentContainsMarkup(ra,getTestString(63));
		contentContainsMarkup(ra,"ImdbLink");
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,"InCanceledAs");
		contentContainsMarkup(ra,getTestString(70));
		contentContainsMarkup(ra,"InCanceledAsLink");
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,"InRokuFeed");
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,"InShowRssAs");
		contentContainsMarkup(ra,getTestString(32));
		contentContainsMarkup(ra,"InShowRssAsLink");
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,"JustWatch");
		contentContainsMarkup(ra,getTestString(75));
		contentContainsMarkup(ra,"JustWatchLink");
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,"LastShow");
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,"LastWatched");
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,getTestString(306));
		contentContainsMarkup(ra,"NetworkLink");
		contentContainsMarkup(ra,getTestString(3));
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,"Premiere");
		contentContainsMarkup(ra,"PremiereDate");
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,"Status");
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,"TivoName");
		contentContainsMarkup(ra,getTestString(31));
		contentContainsMarkup(ra,"TivoNameLink");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#showNewShowsPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewShowsPage() throws Exception {
		ResultActions ra = getAsAdmin("/showss/new");
		contentContainsMarkup(ra,"<h1>" + getMsg("edit.new") + " " + getMsg("class.Shows") + "</h1>");
		contentContainsMarkup(ra,"BestExperience");
		contentContainsMarkup(ra,"BestExperienceLink");
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,"CommentLink");
		contentContainsMarkup(ra,"EpguidesShowName");
		contentContainsMarkup(ra,"EpguidesShowNameLink");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"Imdb");
		contentContainsMarkup(ra,"ImdbLink");
		contentContainsMarkup(ra,"InCanceledAs");
		contentContainsMarkup(ra,"InCanceledAsLink");
		contentContainsMarkup(ra,"InRokuFeed");
		contentContainsMarkup(ra,"InShowRssAs");
		contentContainsMarkup(ra,"InShowRssAsLink");
		contentContainsMarkup(ra,"JustWatch");
		contentContainsMarkup(ra,"JustWatchLink");
		contentContainsMarkup(ra,"LastShow");
		contentContainsMarkup(ra,"LastWatched");
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,"NetworkLink");
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Premiere");
		contentContainsMarkup(ra,"PremiereDate");
		contentContainsMarkup(ra,"Status");
		contentContainsMarkup(ra,"TivoName");
		contentContainsMarkup(ra,"TivoNameLink");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsCancel() throws Exception {
		Shows o = getShows(1);

		send(SEND_POST, "/showss/save", "shows", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/showss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsSave() throws Exception {
		Shows o = getShows(0);

		send(SEND_POST, "/showss/save", "shows", o, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/showss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#showEditShowsPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditShowsPage() throws Exception {
		Shows o = getShows(1);

		given(showsServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/showss/edit/1");
		contentContainsMarkup(ra,o.getBestexperience());
		contentContainsMarkup(ra,"BestExperience");
		contentContainsMarkup(ra,o.getBestexperiencelink());
		contentContainsMarkup(ra,"BestExperienceLink");
		contentContainsMarkup(ra,o.getCancelled());
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,o.getCommentlink());
		contentContainsMarkup(ra,"CommentLink");
		contentContainsMarkup(ra,o.getEpguidesshowname());
		contentContainsMarkup(ra,"EpguidesShowName");
		contentContainsMarkup(ra,o.getEpguidesshownamelink());
		contentContainsMarkup(ra,"EpguidesShowNameLink");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,o.getImdb());
		contentContainsMarkup(ra,"Imdb");
		contentContainsMarkup(ra,o.getImdblink());
		contentContainsMarkup(ra,"ImdbLink");
		contentContainsMarkup(ra,o.getIncanceledas());
		contentContainsMarkup(ra,"InCanceledAs");
		contentContainsMarkup(ra,o.getIncanceledaslink());
		contentContainsMarkup(ra,"InCanceledAsLink");
		contentContainsMarkup(ra,o.getInrokufeed());
		contentContainsMarkup(ra,"InRokuFeed");
		contentContainsMarkup(ra,o.getInshowrssas());
		contentContainsMarkup(ra,"InShowRssAs");
		contentContainsMarkup(ra,o.getInshowrssaslink());
		contentContainsMarkup(ra,"InShowRssAsLink");
		contentContainsMarkup(ra,o.getJustwatch());
		contentContainsMarkup(ra,"JustWatch");
		contentContainsMarkup(ra,o.getJustwatchlink());
		contentContainsMarkup(ra,"JustWatchLink");
		contentContainsMarkup(ra,o.getLastshow());
		contentContainsMarkup(ra,"LastShow");
		contentContainsMarkup(ra,o.getLastwatched());
		contentContainsMarkup(ra,"LastWatched");
		contentContainsMarkup(ra,o.getNetwork());
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,o.getNetworklink());
		contentContainsMarkup(ra,"NetworkLink");
		contentContainsMarkup(ra,o.getOta());
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,o.getPremiere());
		contentContainsMarkup(ra,"Premiere");
		contentContainsMarkup(ra,"PremiereDate");
		contentContainsMarkup(ra,o.getStatus());
		contentContainsMarkup(ra,"Status");
		contentContainsMarkup(ra,o.getTivoname());
		contentContainsMarkup(ra,"TivoName");
		contentContainsMarkup(ra,o.getTivonamelink());
		contentContainsMarkup(ra,"TivoNameLink");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#deleteShows(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteShows() throws Exception {
		getAsAdminRedirectExpected("/showss/delete/1","/showss");
	}

}

