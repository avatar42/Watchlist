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
import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.form.ShowsUserForm;
import com.dea42.watchlist.search.ShowsUserSearchForm;

/**
 * Title: ShowsUserControllerTest <br>
 * Description: ShowsUserController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@WebMvcTest(ShowsUserController.class)
public class ShowsUserControllerTest extends MockBase {
	private ShowsUser getShowsUser(Long id) {
		ShowsUser o = new ShowsUser();
		o.setId(id);
        o.setBestexperience(getTestString(17));
        o.setComment(getTestString(187));
        o.setImdb(getTestString(2));
        o.setInrokufeed(getTestString(1));
        o.setInshowrssas(getTestString(47));
        o.setJustwatch(getTestString(2));
        o.setLastwatched(getTestString(10));
        o.setN67(getTestString(3));
        o.setOta(getTestString(1));
        o.setTablolink(getTestString(6));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#getAllShowsUsers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowsUsers() throws Exception {
		List<ShowsUser> list = new ArrayList<>();
		ShowsUser o = getShowsUser(1l);
		list.add(o);

		Page<ShowsUser> p = getPage(list);
		given(showsUserServices.listAll(new ShowsUserSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/showsUsers");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.ShowsUser") + " " + getMsg("edit.list") + "</h1>");
//		contentContainsMarkup(ra,getTestString(17));
//		contentContainsMarkup(ra,getMsg("ShowsUser.bestexperience"));
//		contentContainsMarkup(ra,getTestString(187));
//		contentContainsMarkup(ra,getMsg("ShowsUser.comment"));
//		contentContainsMarkup(ra,getTestString(2));
//		contentContainsMarkup(ra,getMsg("ShowsUser.imdb"));
//		contentContainsMarkup(ra,getTestString(1));
//		contentContainsMarkup(ra,getMsg("ShowsUser.inrokufeed"));
//		contentContainsMarkup(ra,getTestString(47));
//		contentContainsMarkup(ra,getMsg("ShowsUser.inshowrssas"));
//		contentContainsMarkup(ra,getTestString(2));
//		contentContainsMarkup(ra,getMsg("ShowsUser.justwatch"));
//		contentContainsMarkup(ra,getTestString(10));
//		contentContainsMarkup(ra,getMsg("ShowsUser.lastwatched"));
//		contentContainsMarkup(ra,getTestString(3));
//		contentContainsMarkup(ra,getMsg("ShowsUser.n67"));
//		contentContainsMarkup(ra,getTestString(1));
//		contentContainsMarkup(ra,getMsg("ShowsUser.ota"));
//		contentContainsMarkup(ra,getMsg("ShowsUser.showsid"));
//		contentContainsMarkup(ra,getTestString(6));
//		contentContainsMarkup(ra,getMsg("ShowsUser.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#showNewShowsUserPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewShowsUserPage() throws Exception {
		ResultActions ra = getAsAdmin("/showsUsers/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.ShowsUser") + "</legend>");
		contentContainsMarkup(ra,getMsg("ShowsUser.bestexperience"));
		contentContainsMarkup(ra,getMsg("ShowsUser.comment"));
		// TODO: confirm ignoring ShowsUser.id
		contentContainsMarkup(ra,getMsg("ShowsUser.imdb"));
		contentContainsMarkup(ra,getMsg("ShowsUser.inrokufeed"));
		contentContainsMarkup(ra,getMsg("ShowsUser.inshowrssas"));
		contentContainsMarkup(ra,getMsg("ShowsUser.justwatch"));
		contentContainsMarkup(ra,getMsg("ShowsUser.lastwatched"));
		contentContainsMarkup(ra,getMsg("ShowsUser.n67"));
		contentContainsMarkup(ra,getMsg("ShowsUser.ota"));
		contentContainsMarkup(ra,getMsg("ShowsUser.showsid"));
		contentContainsMarkup(ra,getMsg("ShowsUser.tablolink"));
		contentContainsMarkup(ra,getMsg("ShowsUser.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#saveShowsUser(com.dea42.watchlist.entity.ShowsUser, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsUserCancel() throws Exception {
		ShowsUser o = getShowsUser(1l);

		send(SEND_POST, "/showsUsers/save", "showsUser", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/showsUsers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#saveShowsUser(com.dea42.watchlist.entity.ShowsUser, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsUserSave() throws Exception {
		ShowsUser o = getShowsUser(0l);
		ShowsUserForm form = ShowsUserForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/showsUsers/save", "showsUserForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
				"/showsUsers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#showEditShowsUserPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditShowsUserPage() throws Exception {
		ShowsUser o = getShowsUser(1l);

		given(showsUserServices.get(1l)).willReturn(o);

		ResultActions ra = getAsAdmin("/showsUsers/edit/1");
		contentContainsMarkup(ra,o.getBestexperience());
		contentContainsMarkup(ra,"Bestexperience");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		// TODO: confirm ignoring ShowsUser.id
		contentContainsMarkup(ra,o.getImdb());
		contentContainsMarkup(ra,"Imdb");
		contentContainsMarkup(ra,o.getInrokufeed());
		contentContainsMarkup(ra,"Inrokufeed");
		contentContainsMarkup(ra,o.getInshowrssas());
		contentContainsMarkup(ra,"Inshowrssas");
		contentContainsMarkup(ra,o.getJustwatch());
		contentContainsMarkup(ra,"Justwatch");
		contentContainsMarkup(ra,o.getLastwatched());
		contentContainsMarkup(ra,"Lastwatched");
		contentContainsMarkup(ra,o.getN67());
		contentContainsMarkup(ra,"N67");
		contentContainsMarkup(ra,o.getOta());
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Shows");
		contentContainsMarkup(ra,o.getTablolink());
		contentContainsMarkup(ra,"Tablolink");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#deleteShowsUser(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteShowsUser() throws Exception {
		getAsAdminRedirectExpected("/showsUsers/delete/1","/showsUsers");
	}

}

