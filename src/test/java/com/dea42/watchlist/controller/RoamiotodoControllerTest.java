package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;
import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Roamiotodo;

/**
 * Title: RoamiotodoControllerTest <br>
 * Description: Class for testing the RoamiotodoController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@WebMvcTest(RoamiotodoController.class)
public class RoamiotodoControllerTest extends MockBase {
	private Roamiotodo getRoamiotodo(Integer id) {
		Roamiotodo o = new Roamiotodo();
		o.setId(id);
        o.setChannel(getTestString(16));
        o.setDuration(getTestString(4));
        o.setEpisodename(getTestString(1));
        o.setShowname(getTestString(67));
        o.setShowtrimmed(getTestString(66));
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
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,"Ep");
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,"EpisodeName");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,getTestString(67));
		contentContainsMarkup(ra,"ShowName");
		contentContainsMarkup(ra,getTestString(66));
		contentContainsMarkup(ra,"ShowTrimmed");
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
		contentContainsMarkup(ra,"<h1>" + getMsg("edit.new") + " " + getMsg("class.Roamiotodo") + "</h1>");
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,"Ep");
		contentContainsMarkup(ra,"EpisodeName");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"ShowName");
		contentContainsMarkup(ra,"ShowTrimmed");
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

		send(SEND_POST, "/roamiotodos/save", "roamiotodo", o, ImmutableMap.of("action", "save"), ADMIN_USER,
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
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,o.getDuration());
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,"Ep");
		contentContainsMarkup(ra,o.getEpisodename());
		contentContainsMarkup(ra,"EpisodeName");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,o.getShowname());
		contentContainsMarkup(ra,"ShowName");
		contentContainsMarkup(ra,o.getShowtrimmed());
		contentContainsMarkup(ra,"ShowTrimmed");
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

