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
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@WebMvcTest(ShowsUserController.class)
public class ShowsUserControllerTest extends MockBase {
	private ShowsUser getShowsUser(Integer id) {
		ShowsUser o = new ShowsUser();
		o.setId(id);
        o.setBestexperience(getTestString(17));
        o.setBestexperiencelink(getTestString(306));
        o.setComment(getTestString(181));
        o.setCommentlink(getTestString(228));
        o.setDiff(getTestString(3));
        o.setImdb(getTestString(2));
        o.setImdblink(getTestString(63));
        o.setInrokufeed(getTestString(1));
        o.setInshowrssas(getTestString(47));
        o.setInshowrssaslink(getTestString(32));
        o.setIntablo(getTestString(1));
        o.setJustwatch(getTestString(2));
        o.setJustwatchlink(getTestString(75));
        o.setLastwatched(getTestString(10));
        o.setOta(getTestString(1));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#getAllShowsUsers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowsUsers() throws Exception {
		List<ShowsUser> list = new ArrayList<>();
		ShowsUser o = getShowsUser(1);
		list.add(o);

		Page<ShowsUser> p = getPage(list);
		given(showsUserServices.listAll(new ShowsUserSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/showsUsers");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.ShowsUser") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(17));
		contentContainsMarkup(ra,getMsg("ShowsUser.bestexperience"));
		contentContainsMarkup(ra,getTestString(306));
		contentContainsMarkup(ra,getTestString(181));
		contentContainsMarkup(ra,getMsg("ShowsUser.comment"));
		contentContainsMarkup(ra,getTestString(228));
		contentContainsMarkup(ra,getTestString(3));
		contentContainsMarkup(ra,getMsg("ShowsUser.diff"));
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,getMsg("ShowsUser.imdb"));
		contentContainsMarkup(ra,getTestString(63));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("ShowsUser.inrokufeed"));
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,getMsg("ShowsUser.inshowrssas"));
		contentContainsMarkup(ra,getTestString(32));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("ShowsUser.intablo"));
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,getMsg("ShowsUser.justwatch"));
		contentContainsMarkup(ra,getTestString(75));
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,getMsg("ShowsUser.lastwatched"));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("ShowsUser.ota"));
		contentContainsMarkup(ra,getMsg("ShowsUser.showsid"));
		contentContainsMarkup(ra,getMsg("ShowsUser.userid"));
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
		contentContainsMarkup(ra,"Bestexperience");
		contentContainsMarkup(ra,"Bestexperiencelink");
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,"Commentlink");
		contentContainsMarkup(ra,"Diff");
		// TODO: confirm ignoring ShowsUser.id
		contentContainsMarkup(ra,"Imdb");
		contentContainsMarkup(ra,"Imdblink");
		contentContainsMarkup(ra,"Inrokufeed");
		contentContainsMarkup(ra,"Inshowrssas");
		contentContainsMarkup(ra,"Inshowrssaslink");
		contentContainsMarkup(ra,"Intablo");
		contentContainsMarkup(ra,"Justwatch");
		contentContainsMarkup(ra,"Justwatchlink");
		contentContainsMarkup(ra,"Lastwatched");
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Shows");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#saveShowsUser(com.dea42.watchlist.entity.ShowsUser, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsUserCancel() throws Exception {
		ShowsUser o = getShowsUser(1);

		send(SEND_POST, "/showsUsers/save", "showsUser", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/showsUsers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsUserController#saveShowsUser(com.dea42.watchlist.entity.ShowsUser, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsUserSave() throws Exception {
		ShowsUser o = getShowsUser(0);
		ShowsUserForm form = ShowsUserForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/showsUsers/save", "showsUserForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
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
		ShowsUser o = getShowsUser(1);

		given(showsUserServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/showsUsers/edit/1");
		contentContainsMarkup(ra,o.getBestexperience());
		contentContainsMarkup(ra,"Bestexperience");
		contentContainsMarkup(ra,o.getBestexperiencelink());
		contentContainsMarkup(ra,"Bestexperiencelink");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,o.getCommentlink());
		contentContainsMarkup(ra,"Commentlink");
		contentContainsMarkup(ra,o.getDiff());
		contentContainsMarkup(ra,"Diff");
		// TODO: confirm ignoring ShowsUser.id
		contentContainsMarkup(ra,o.getImdb());
		contentContainsMarkup(ra,"Imdb");
		contentContainsMarkup(ra,o.getImdblink());
		contentContainsMarkup(ra,"Imdblink");
		contentContainsMarkup(ra,o.getInrokufeed());
		contentContainsMarkup(ra,"Inrokufeed");
		contentContainsMarkup(ra,o.getInshowrssas());
		contentContainsMarkup(ra,"Inshowrssas");
		contentContainsMarkup(ra,o.getInshowrssaslink());
		contentContainsMarkup(ra,"Inshowrssaslink");
		contentContainsMarkup(ra,o.getIntablo());
		contentContainsMarkup(ra,"Intablo");
		contentContainsMarkup(ra,o.getJustwatch());
		contentContainsMarkup(ra,"Justwatch");
		contentContainsMarkup(ra,o.getJustwatchlink());
		contentContainsMarkup(ra,"Justwatchlink");
		contentContainsMarkup(ra,o.getLastwatched());
		contentContainsMarkup(ra,"Lastwatched");
		contentContainsMarkup(ra,o.getOta());
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Shows");
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

