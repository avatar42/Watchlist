package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;
import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Roamiosp;

/**
 * Title: RoamiospControllerTest <br>
 * Description: Class for testing the RoamiospController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
@WebMvcTest(RoamiospController.class)
public class RoamiospControllerTest extends MockBase {
	private Roamiosp getRoamiosp(Integer id) {
		Roamiosp o = new Roamiosp();
		o.setId(id);
        o.setChannel(getTestString(14));
        o.setInclude(getTestString(6));
        o.setKeep(getTestString(7));
        o.setRecord(getTestString(13));
        o.setShow(getTestString(53));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#getAllRoamiosps(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiosps() throws Exception {
		List<Roamiosp> list = new ArrayList<>();
		Roamiosp o = getRoamiosp(1);
		list.add(o);

		given(roamiospServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/roamiosps");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Roamiosp") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"End");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,"Include");
		contentContainsMarkup(ra,getTestString(7));
		contentContainsMarkup(ra,"Keep");
		contentContainsMarkup(ra,"Num");
		contentContainsMarkup(ra,"Priority");
		contentContainsMarkup(ra,getTestString(13));
		contentContainsMarkup(ra,"Record");
		contentContainsMarkup(ra,"Season");
		contentContainsMarkup(ra,getTestString(53));
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Start");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#showNewRoamiospPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewRoamiospPage() throws Exception {
		ResultActions ra = getAsAdmin("/roamiosps/new");
		contentContainsMarkup(ra,"<h1>" + getMsg("edit.new") + " " + getMsg("class.Roamiosp") + "</h1>");
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"End");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"Include");
		contentContainsMarkup(ra,"Keep");
		contentContainsMarkup(ra,"Num");
		contentContainsMarkup(ra,"Priority");
		contentContainsMarkup(ra,"Record");
		contentContainsMarkup(ra,"Season");
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Start");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#saveRoamiosp(com.dea42.watchlist.entity.Roamiosp, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiospCancel() throws Exception {
		Roamiosp o = getRoamiosp(1);

		send(SEND_POST, "/roamiosps/save", "roamiosp", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/roamiosps");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#saveRoamiosp(com.dea42.watchlist.entity.Roamiosp, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiospSave() throws Exception {
		Roamiosp o = getRoamiosp(0);

		send(SEND_POST, "/roamiosps/save", "roamiosp", o, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/roamiosps");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#showEditRoamiospPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditRoamiospPage() throws Exception {
		Roamiosp o = getRoamiosp(1);

		given(roamiospServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/roamiosps/edit/1");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"End");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,o.getInclude());
		contentContainsMarkup(ra,"Include");
		contentContainsMarkup(ra,o.getKeep());
		contentContainsMarkup(ra,"Keep");
		contentContainsMarkup(ra,"Num");
		contentContainsMarkup(ra,"Priority");
		contentContainsMarkup(ra,o.getRecord());
		contentContainsMarkup(ra,"Record");
		contentContainsMarkup(ra,"Season");
		contentContainsMarkup(ra,o.getShow());
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Start");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#deleteRoamiosp(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteRoamiosp() throws Exception {
		getAsAdminRedirectExpected("/roamiosps/delete/1","/roamiosps");
	}

}

