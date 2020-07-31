package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Roamionpl;

/**
 * Title: RoamionplControllerTest <br>
 * Description: RoamionplController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@WebMvcTest(RoamionplController.class)
public class RoamionplControllerTest extends MockBase {
	private Roamionpl getRoamionpl(Integer id) {
		Roamionpl o = new Roamionpl();
		o.setId(id);
        o.setChannel(getTestString(16));
        o.setEpisode(getTestString(4));
        o.setShow(getTestString(49));
        o.setTitle(getTestString(71));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#getAllRoamionpls(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamionpls() throws Exception {
		List<Roamionpl> list = new ArrayList<>();
		Roamionpl o = getRoamionpl(1);
		list.add(o);

		given(roamionplServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/roamionpls");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Roamionpl") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getMsg("Roamionpl.bitratembps"));
		contentContainsMarkup(ra,getTestString(16));
		contentContainsMarkup(ra,getMsg("Roamionpl.channel"));
		contentContainsMarkup(ra,getMsg("Roamionpl.date"));
		contentContainsMarkup(ra,getMsg("Roamionpl.duration"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Roamionpl.episode"));
		contentContainsMarkup(ra,getMsg("Roamionpl.id"));
		contentContainsMarkup(ra,getMsg("Roamionpl.isnew"));
		contentContainsMarkup(ra,getTestString(49));
		contentContainsMarkup(ra,getMsg("Roamionpl.show"));
		contentContainsMarkup(ra,getMsg("Roamionpl.sizegb"));
		contentContainsMarkup(ra,getMsg("Roamionpl.sortabledate"));
		contentContainsMarkup(ra,getTestString(71));
		contentContainsMarkup(ra,getMsg("Roamionpl.title"));
		contentContainsMarkup(ra,getMsg("Roamionpl.watchedtime"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#showNewRoamionplPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewRoamionplPage() throws Exception {
		ResultActions ra = getAsAdmin("/roamionpls/new");
		contentContainsMarkup(ra,"<h1>" + getMsg("edit.new") + " " + getMsg("class.Roamionpl") + "</h1>");
		contentContainsMarkup(ra,"BitrateMbps");
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,"Episode");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"Isnew");
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"SizeGb");
		contentContainsMarkup(ra,"SortableDate");
		contentContainsMarkup(ra,"Title");
		contentContainsMarkup(ra,"Watchedtime");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#saveRoamionpl(com.dea42.watchlist.entity.Roamionpl, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamionplCancel() throws Exception {
		Roamionpl o = getRoamionpl(1);

		send(SEND_POST, "/roamionpls/save", "roamionpl", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/roamionpls");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#saveRoamionpl(com.dea42.watchlist.entity.Roamionpl, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamionplSave() throws Exception {
		Roamionpl o = getRoamionpl(0);

		send(SEND_POST, "/roamionpls/save", "roamionpl", o, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/roamionpls");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#showEditRoamionplPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditRoamionplPage() throws Exception {
		Roamionpl o = getRoamionpl(1);

		given(roamionplServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/roamionpls/edit/1");
		contentContainsMarkup(ra,"BitrateMbps");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,o.getEpisode());
		contentContainsMarkup(ra,"Episode");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"Isnew");
		contentContainsMarkup(ra,o.getShow());
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"SizeGb");
		contentContainsMarkup(ra,"SortableDate");
		contentContainsMarkup(ra,o.getTitle());
		contentContainsMarkup(ra,"Title");
		contentContainsMarkup(ra,"Watchedtime");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#deleteRoamionpl(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteRoamionpl() throws Exception {
		getAsAdminRedirectExpected("/roamionpls/delete/1","/roamionpls");
	}

}

