package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Showsuser;
import com.dea42.watchlist.form.ShowsuserForm;

/**
 * Title: ShowsuserControllerTest <br>
 * Description: ShowsuserController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */
@WebMvcTest(ShowsuserController.class)
public class ShowsuserControllerTest extends MockBase {
	private Showsuser getShowsuser(Integer id) {
		Showsuser o = new Showsuser();
		o.setId(id);
        o.setBestexperience(getTestString(17));
        o.setBestexperiencelink(getTestString(306));
        o.setComment(getTestString(181));
        o.setCommentlink(getTestString(228));
        o.setImdb(getTestString(1));
        o.setImdblink(getTestString(63));
        o.setInrokufeed(getTestString(1));
        o.setInshowrssas(getTestString(47));
        o.setInshowrssaslink(getTestString(32));
        o.setJustwatch(getTestString(2));
        o.setJustwatchlink(getTestString(75));
        o.setLastwatched(getTestString(10));
        o.setOta(getTestString(3));
        o.setTivoname(getTestString(47));
        o.setTivonamelink(getTestString(31));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsuserController#getAllShowsusers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowsusers() throws Exception {
		List<Showsuser> list = new ArrayList<>();
		Showsuser o = getShowsuser(1);
		list.add(o);

		given(showsuserServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/showsusers");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Showsuser") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(17));
		contentContainsMarkup(ra,getMsg("Showsuser.bestexperience"));
		contentContainsMarkup(ra,getTestString(306));
		contentContainsMarkup(ra,getTestString(181));
		contentContainsMarkup(ra,getMsg("Showsuser.comment"));
		contentContainsMarkup(ra,getTestString(228));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Showsuser.imdb"));
		contentContainsMarkup(ra,getTestString(63));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Showsuser.inrokufeed"));
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,getMsg("Showsuser.inshowrssas"));
		contentContainsMarkup(ra,getTestString(32));
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,getMsg("Showsuser.justwatch"));
		contentContainsMarkup(ra,getTestString(75));
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,getMsg("Showsuser.lastwatched"));
		contentContainsMarkup(ra,getTestString(3));
		contentContainsMarkup(ra,getMsg("Showsuser.ota"));
		contentContainsMarkup(ra,getMsg("Showsuser.showsid"));
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,getMsg("Showsuser.tivoname"));
		contentContainsMarkup(ra,getTestString(31));
		contentContainsMarkup(ra,getMsg("Showsuser.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsuserController#showNewShowsuserPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewShowsuserPage() throws Exception {
		ResultActions ra = getAsAdmin("/showsusers/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Showsuser") + "</legend>");
		contentContainsMarkup(ra,"Bestexperience");
		contentContainsMarkup(ra,"Bestexperiencelink");
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,"Commentlink");
		// TODO: confirm ignoring Showsuser.id
		contentContainsMarkup(ra,"Imdb");
		contentContainsMarkup(ra,"Imdblink");
		contentContainsMarkup(ra,"Inrokufeed");
		contentContainsMarkup(ra,"Inshowrssas");
		contentContainsMarkup(ra,"Inshowrssaslink");
		contentContainsMarkup(ra,"Justwatch");
		contentContainsMarkup(ra,"Justwatchlink");
		contentContainsMarkup(ra,"Lastwatched");
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Shows");
		contentContainsMarkup(ra,"Tivoname");
		contentContainsMarkup(ra,"Tivonamelink");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsuserController#saveShowsuser(com.dea42.watchlist.entity.Showsuser, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsuserCancel() throws Exception {
		Showsuser o = getShowsuser(1);

		send(SEND_POST, "/showsusers/save", "showsuser", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/showsusers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsuserController#saveShowsuser(com.dea42.watchlist.entity.Showsuser, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsuserSave() throws Exception {
		Showsuser o = getShowsuser(0);
		ShowsuserForm form = ShowsuserForm.getInstance(o);
		LOGGER.debug(form.toString());

		send(SEND_POST, "/showsusers/save", "showsuserForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/showsusers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsuserController#showEditShowsuserPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditShowsuserPage() throws Exception {
		Showsuser o = getShowsuser(1);

		given(showsuserServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/showsusers/edit/1");
		contentContainsMarkup(ra,o.getBestexperience());
		contentContainsMarkup(ra,"Bestexperience");
		contentContainsMarkup(ra,o.getBestexperiencelink());
		contentContainsMarkup(ra,"Bestexperiencelink");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,o.getCommentlink());
		contentContainsMarkup(ra,"Commentlink");
		// TODO: confirm ignoring Showsuser.id
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
		contentContainsMarkup(ra,o.getJustwatch());
		contentContainsMarkup(ra,"Justwatch");
		contentContainsMarkup(ra,o.getJustwatchlink());
		contentContainsMarkup(ra,"Justwatchlink");
		contentContainsMarkup(ra,o.getLastwatched());
		contentContainsMarkup(ra,"Lastwatched");
		contentContainsMarkup(ra,o.getOta());
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Shows");
		contentContainsMarkup(ra,o.getTivoname());
		contentContainsMarkup(ra,"Tivoname");
		contentContainsMarkup(ra,o.getTivonamelink());
		contentContainsMarkup(ra,"Tivonamelink");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsuserController#deleteShowsuser(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteShowsuser() throws Exception {
		getAsAdminRedirectExpected("/showsusers/delete/1","/showsusers");
	}

}

