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
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.form.RoamiospForm;
import com.dea42.watchlist.search.RoamiospSearchForm;

/**
 * Title: RoamiospControllerTest <br>
 * Description: RoamiospController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@WebMvcTest(RoamiospController.class)
public class RoamiospControllerTest extends MockBase {
	private Roamiosp getRoamiosp(Long id) {
		Roamiosp o = new Roamiosp();
		o.setId(id);
        o.setChannel(getTestString(14));
        o.setInclude(getTestString(8));
        o.setKeep(getTestString(7));
        o.setRecord(getTestString(13));
        o.setShow(getTestString(60));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#getAllRoamiosps(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamiosps() throws Exception {
		List<Roamiosp> list = new ArrayList<>();
		Roamiosp o = getRoamiosp(1l);
		list.add(o);

		Page<Roamiosp> p = getPage(list);
		given(roamiospServices.listAll(new RoamiospSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/roamiosps");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Roamiosp") + " " + getMsg("edit.list") + "</h1>");
//		contentContainsMarkup(ra,getTestString(14));
//		contentContainsMarkup(ra,getMsg("Roamiosp.channel"));
//		contentContainsMarkup(ra,getMsg("Roamiosp.end"));
//		contentContainsMarkup(ra,getTestString(8));
//		contentContainsMarkup(ra,getMsg("Roamiosp.include"));
//		contentContainsMarkup(ra,getTestString(7));
//		contentContainsMarkup(ra,getMsg("Roamiosp.keep"));
//		contentContainsMarkup(ra,getMsg("Roamiosp.num"));
//		contentContainsMarkup(ra,getMsg("Roamiosp.priority"));
//		contentContainsMarkup(ra,getTestString(13));
//		contentContainsMarkup(ra,getMsg("Roamiosp.record"));
//		contentContainsMarkup(ra,getMsg("Roamiosp.season"));
//		contentContainsMarkup(ra,getTestString(60));
//		contentContainsMarkup(ra,getMsg("Roamiosp.show"));
//		contentContainsMarkup(ra,getMsg("Roamiosp.start"));
//		contentContainsMarkup(ra,getMsg("Roamiosp.userid"));
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
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Roamiosp") + "</legend>");
		contentContainsMarkup(ra,getMsg("Roamiosp.channel"));
		contentContainsMarkup(ra,getMsg("Roamiosp.end"));
		// TODO: confirm ignoring Roamiosp.id
		contentContainsMarkup(ra,getMsg("Roamiosp.include"));
		contentContainsMarkup(ra,getMsg("Roamiosp.keep"));
		contentContainsMarkup(ra,getMsg("Roamiosp.num"));
		contentContainsMarkup(ra,getMsg("Roamiosp.priority"));
		contentContainsMarkup(ra,getMsg("Roamiosp.record"));
		contentContainsMarkup(ra,getMsg("Roamiosp.season"));
		contentContainsMarkup(ra,getMsg("Roamiosp.show"));
		contentContainsMarkup(ra,getMsg("Roamiosp.start"));
		contentContainsMarkup(ra,getMsg("Roamiosp.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#saveRoamiosp(com.dea42.watchlist.entity.Roamiosp, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiospCancel() throws Exception {
		Roamiosp o = getRoamiosp(1l);

		send(SEND_POST, "/roamiosps/save", "roamiosp", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/roamiosps");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamiospController#saveRoamiosp(com.dea42.watchlist.entity.Roamiosp, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamiospSave() throws Exception {
		Roamiosp o = getRoamiosp(0l);
		RoamiospForm form = RoamiospForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/roamiosps/save", "roamiospForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
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
		Roamiosp o = getRoamiosp(1l);

		given(roamiospServices.get(1l)).willReturn(o);

		ResultActions ra = getAsAdmin("/roamiosps/edit/1");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"End");
		// TODO: confirm ignoring Roamiosp.id
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
		contentContainsMarkup(ra,"Account");
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

