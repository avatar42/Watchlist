package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.form.RoamiotodoForm;

/**
 * Title: RoamiotodoControllerTest <br>
 * Description: RoamiotodoController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.2<br>
 * @version 0.5.2<br>
 */
@Slf4j
@WebMvcTest(RoamiotodoController.class)
public class RoamiotodoControllerTest extends MockBase {
	private Roamiotodo getRoamiotodo(Integer id) {
		Roamiotodo o = new Roamiotodo();
		o.setId(id);
        o.setChannel(getTestString(16));
        o.setColi(getTestString(27));
        o.setDuration(getTestString(4));
        o.setEpisode(getTestString(31));
        o.setEpisodename(getTestString(2));
        o.setEpname2(getTestString(1));
        o.setEpname3(getTestString(4));
        o.setEpnum(getTestString(20));
        o.setShow(getTestString(141));
        o.setShowname(getTestString(79));
        o.setShowtrimmed(getTestString(79));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#getAllRoamiotodos(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiotodos() throws Exception {
		List<Roamiotodo> list = new ArrayList<>();
		Roamiotodo o = getRoamiotodo(1);
		list.add(o);

		given(roamiotodoServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/roamiotodos");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Roamiotodo") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(16));
		contentContainsMarkup(ra,getMsg("Roamiotodo.channel"));
		contentContainsMarkup(ra,getTestString(27));
		contentContainsMarkup(ra,getMsg("Roamiotodo.coli"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.date"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Roamiotodo.duration"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.ep"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.epdate"));
		contentContainsMarkup(ra,getTestString(31));
		contentContainsMarkup(ra,getMsg("Roamiotodo.episode"));
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,getMsg("Roamiotodo.episodename"));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Roamiotodo.epname2"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Roamiotodo.epname3"));
		contentContainsMarkup(ra,getTestString(20));
		contentContainsMarkup(ra,getMsg("Roamiotodo.epnum"));
		contentContainsMarkup(ra,getTestString(141));
		contentContainsMarkup(ra,getMsg("Roamiotodo.show"));
		contentContainsMarkup(ra,getTestString(79));
		contentContainsMarkup(ra,getMsg("Roamiotodo.showname"));
		contentContainsMarkup(ra,getTestString(79));
		contentContainsMarkup(ra,getMsg("Roamiotodo.showtrimmed"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.sortabledate"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#showNewRoamiotodoPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewRoamiotodoPage() throws Exception {
		ResultActions ra = getAsAdmin("/roamiotodos/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Roamiotodo") + "</legend>");
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Coli");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,"Ep");
		contentContainsMarkup(ra,"Epdate");
		contentContainsMarkup(ra,"Episode");
		contentContainsMarkup(ra,"Episodename");
		contentContainsMarkup(ra,"Epname2");
		contentContainsMarkup(ra,"Epname3");
		contentContainsMarkup(ra,"Epnum");
		// TODO: confirm ignoring Roamiotodo.id
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Showname");
		contentContainsMarkup(ra,"Showtrimmed");
		contentContainsMarkup(ra,"Sortabledate");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#saveRoamiotodo(com.dea42.watchlist.entity.Roamiotodo, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiotodoCancel() throws Exception {
		Roamiotodo o = getRoamiotodo(1);

		send(SEND_POST, "/roamiotodos/save", "roamiotodo", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/roamiotodos");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#saveRoamiotodo(com.dea42.watchlist.entity.Roamiotodo, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiotodoSave() throws Exception {
		Roamiotodo o = getRoamiotodo(0);
		RoamiotodoForm form = RoamiotodoForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/roamiotodos/save", "roamiotodoForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/roamiotodos");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#showEditRoamiotodoPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditRoamiotodoPage() throws Exception {
		Roamiotodo o = getRoamiotodo(1);

		given(roamiotodoServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/roamiotodos/edit/1");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,o.getColi());
		contentContainsMarkup(ra,"Coli");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,o.getDuration());
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,"Ep");
		contentContainsMarkup(ra,"Epdate");
		contentContainsMarkup(ra,o.getEpisode());
		contentContainsMarkup(ra,"Episode");
		contentContainsMarkup(ra,o.getEpisodename());
		contentContainsMarkup(ra,"Episodename");
		contentContainsMarkup(ra,o.getEpname2());
		contentContainsMarkup(ra,"Epname2");
		contentContainsMarkup(ra,o.getEpname3());
		contentContainsMarkup(ra,"Epname3");
		contentContainsMarkup(ra,o.getEpnum());
		contentContainsMarkup(ra,"Epnum");
		// TODO: confirm ignoring Roamiotodo.id
		contentContainsMarkup(ra,o.getShow());
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,o.getShowname());
		contentContainsMarkup(ra,"Showname");
		contentContainsMarkup(ra,o.getShowtrimmed());
		contentContainsMarkup(ra,"Showtrimmed");
		contentContainsMarkup(ra,"Sortabledate");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#deleteRoamiotodo(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteRoamiotodo() throws Exception {
		getAsAdminRedirectExpected("/roamiotodos/delete/1","/roamiotodos");
	}

}

