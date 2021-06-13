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
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.form.RoamiotodoForm;
import com.dea42.watchlist.search.RoamiotodoSearchForm;

/**
 * Title: RoamiotodoControllerTest <br>
 * Description: RoamiotodoController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@WebMvcTest(RoamiotodoController.class)
public class RoamiotodoControllerTest extends MockBase {
	private Roamiotodo getRoamiotodo(Long id) {
		Roamiotodo o = new Roamiotodo();
		o.setId(id);
        o.setChannel(getTestString(15));
        o.setDuration(getTestString(4));
        o.setEp(getTestString(50));
        o.setEpisodename(getTestString(59));
        o.setShowname(getTestString(48));
        o.setShowtrimmed(getTestString(47));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#getAllRoamiotodos(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiotodos() throws Exception {
		List<Roamiotodo> list = new ArrayList<>();
		Roamiotodo o = getRoamiotodo(1l);
		list.add(o);

		Page<Roamiotodo> p = getPage(list);
		given(roamiotodoServices.listAll(new RoamiotodoSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/roamiotodos");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Roamiotodo") + " " + getMsg("edit.list") + "</h1>");
//		contentContainsMarkup(ra,getTestString(15));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.channel"));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.datefield"));
//		contentContainsMarkup(ra,getTestString(4));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.duration"));
//		contentContainsMarkup(ra,getTestString(50));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.ep"));
//		contentContainsMarkup(ra,getTestString(59));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.episodename"));
//		contentContainsMarkup(ra,getTestString(48));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.showname"));
//		contentContainsMarkup(ra,getTestString(47));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.showtrimmed"));
//		contentContainsMarkup(ra,getMsg("Roamiotodo.userid"));
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
		contentContainsMarkup(ra,getMsg("Roamiotodo.channel"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.datefield"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.duration"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.ep"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.episodename"));
		// TODO: confirm ignoring Roamiotodo.id
		contentContainsMarkup(ra,getMsg("Roamiotodo.showname"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.showtrimmed"));
		contentContainsMarkup(ra,getMsg("Roamiotodo.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#saveRoamiotodo(com.dea42.watchlist.entity.Roamiotodo, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiotodoCancel() throws Exception {
		Roamiotodo o = getRoamiotodo(1l);

		send(SEND_POST, "/roamiotodos/save", "roamiotodo", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/roamiotodos");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiotodoController#saveRoamiotodo(com.dea42.watchlist.entity.Roamiotodo, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiotodoSave() throws Exception {
		Roamiotodo o = getRoamiotodo(0l);
		RoamiotodoForm form = RoamiotodoForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/roamiotodos/save", "roamiotodoForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
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
		Roamiotodo o = getRoamiotodo(1l);

		given(roamiotodoServices.get(1l)).willReturn(o);

		ResultActions ra = getAsAdmin("/roamiotodos/edit/1");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Datefield");
		contentContainsMarkup(ra,o.getDuration());
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,o.getEp());
		contentContainsMarkup(ra,"Ep");
		contentContainsMarkup(ra,o.getEpisodename());
		contentContainsMarkup(ra,"Episodename");
		// TODO: confirm ignoring Roamiotodo.id
		contentContainsMarkup(ra,o.getShowname());
		contentContainsMarkup(ra,"Showname");
		contentContainsMarkup(ra,o.getShowtrimmed());
		contentContainsMarkup(ra,"Showtrimmed");
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

