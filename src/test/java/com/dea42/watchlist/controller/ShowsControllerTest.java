package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.domain.Page;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.form.ShowsForm;
import com.dea42.watchlist.search.ShowsSearchForm;

/**
 * Title: ShowsControllerTest <br>
 * Description: ShowsController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@WebMvcTest(ShowsController.class)
public class ShowsControllerTest extends MockBase {
	private Shows getShows(Integer id) {
		Shows o = new Shows();
		o.setId(id);
        o.setCancelled(getTestString(56));
        o.setEpguidesshowname(getTestString(47));
        o.setIncanceledas(getTestString(47));
        o.setLastshow(getTestString(10));
        o.setNetwork(getTestString(14));
        o.setPremiere(getTestString(43));
        o.setStatus(getTestString(56));
        o.setTivoname(getTestString(47));
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

		Page<Shows> p = getPage(list);
		given(showsServices.listAll(new ShowsSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/showss");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Shows") + " " + getMsg("edit.list") + "</h1>");
//		contentContainsMarkup(ra,getTestString(56));
//		contentContainsMarkup(ra,getMsg("Shows.cancelled"));
//		contentContainsMarkup(ra,getTestString(47));
//		contentContainsMarkup(ra,getMsg("Shows.epguidesshowname"));
//		contentContainsMarkup(ra,getTestString(47));
//		contentContainsMarkup(ra,getMsg("Shows.incanceledas"));
//		contentContainsMarkup(ra,getTestString(10));
//		contentContainsMarkup(ra,getMsg("Shows.lastshow"));
//		contentContainsMarkup(ra,getTestString(14));
//		contentContainsMarkup(ra,getMsg("Shows.network"));
//		contentContainsMarkup(ra,getTestString(43));
//		contentContainsMarkup(ra,getMsg("Shows.premiere"));
//		contentContainsMarkup(ra,getMsg("Shows.premieredate"));
//		contentContainsMarkup(ra,getTestString(56));
//		contentContainsMarkup(ra,getMsg("Shows.status"));
//		contentContainsMarkup(ra,getTestString(47));
//		contentContainsMarkup(ra,getMsg("Shows.tivoname"));
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
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Shows") + "</legend>");
		contentContainsMarkup(ra,getMsg("Shows.cancelled"));
		contentContainsMarkup(ra,getMsg("Shows.epguidesshowname"));
		// TODO: confirm ignoring Shows.id
		contentContainsMarkup(ra,getMsg("Shows.incanceledas"));
		contentContainsMarkup(ra,getMsg("Shows.lastshow"));
		contentContainsMarkup(ra,getMsg("Shows.network"));
		contentContainsMarkup(ra,getMsg("Shows.premiere"));
		contentContainsMarkup(ra,getMsg("Shows.premieredate"));
		contentContainsMarkup(ra,getMsg("Shows.status"));
		contentContainsMarkup(ra,getMsg("Shows.tivoname"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsCancel() throws Exception {
		Shows o = getShows(1);

		send(SEND_POST, "/showss/save", "shows", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/showss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsSave() throws Exception {
		Shows o = getShows(0);
		ShowsForm form = ShowsForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/showss/save", "showsForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
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
		contentContainsMarkup(ra,o.getCancelled());
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,o.getEpguidesshowname());
		contentContainsMarkup(ra,"Epguidesshowname");
		// TODO: confirm ignoring Shows.id
		contentContainsMarkup(ra,o.getIncanceledas());
		contentContainsMarkup(ra,"Incanceledas");
		contentContainsMarkup(ra,o.getLastshow());
		contentContainsMarkup(ra,"Lastshow");
		contentContainsMarkup(ra,o.getNetwork());
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,o.getPremiere());
		contentContainsMarkup(ra,"Premiere");
		contentContainsMarkup(ra,"Premieredate");
		contentContainsMarkup(ra,o.getStatus());
		contentContainsMarkup(ra,"Status");
		contentContainsMarkup(ra,o.getTivoname());
		contentContainsMarkup(ra,"Tivoname");
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

