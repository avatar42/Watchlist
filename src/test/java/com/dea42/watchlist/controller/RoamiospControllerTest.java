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
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.form.RoamiospForm;

/**
 * Title: RoamiospControllerTest <br>
 * Description: RoamiospController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@WebMvcTest(RoamiospController.class)
public class RoamiospControllerTest extends MockBase {
	private Roamiosp getRoamiosp(Integer id) {
		Roamiosp o = new Roamiosp();
		o.setId(id);
        o.setCancelled(getTestString(1));
        o.setChannel(getTestString(14));
        o.setChannelnum(getTestString(4));
        o.setInclude(getTestString(6));
        o.setInshowsstatus(getTestString(44));
        o.setKeep(getTestString(7));
        o.setNetwork(getTestString(13));
        o.setOta(getTestString(2));
        o.setRecord(getTestString(13));
        o.setShow(getTestString(53));
        o.setStation(getTestString(10));
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
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Roamiosp.cancelled"));
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,getMsg("Roamiosp.channel"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Roamiosp.channelnum"));
		contentContainsMarkup(ra,getMsg("Roamiosp.dup"));
		contentContainsMarkup(ra,getMsg("Roamiosp.end"));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Roamiosp.include"));
		contentContainsMarkup(ra,getTestString(44));
		contentContainsMarkup(ra,getMsg("Roamiosp.inshowsstatus"));
		contentContainsMarkup(ra,getTestString(7));
		contentContainsMarkup(ra,getMsg("Roamiosp.keep"));
		contentContainsMarkup(ra,getTestString(13));
		contentContainsMarkup(ra,getMsg("Roamiosp.network"));
		contentContainsMarkup(ra,getMsg("Roamiosp.num"));
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,getMsg("Roamiosp.ota"));
		contentContainsMarkup(ra,getMsg("Roamiosp.priority"));
		contentContainsMarkup(ra,getTestString(13));
		contentContainsMarkup(ra,getMsg("Roamiosp.record"));
		contentContainsMarkup(ra,getMsg("Roamiosp.row"));
		contentContainsMarkup(ra,getMsg("Roamiosp.season"));
		contentContainsMarkup(ra,getTestString(53));
		contentContainsMarkup(ra,getMsg("Roamiosp.show"));
		contentContainsMarkup(ra,getMsg("Roamiosp.start"));
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,getMsg("Roamiosp.station"));
		contentContainsMarkup(ra,getMsg("Roamiosp.userid"));
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
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Channelnum");
		contentContainsMarkup(ra,"Dup");
		contentContainsMarkup(ra,"End");
		// TODO: confirm ignoring Roamiosp.id
		contentContainsMarkup(ra,"Include");
		contentContainsMarkup(ra,"Inshowsstatus");
		contentContainsMarkup(ra,"Keep");
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,"Num");
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Priority");
		contentContainsMarkup(ra,"Record");
		contentContainsMarkup(ra,"Row");
		contentContainsMarkup(ra,"Season");
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Start");
		contentContainsMarkup(ra,"Station");
		contentContainsMarkup(ra,"Account");
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
		RoamiospForm form = RoamiospForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/roamiosps/save", "roamiospForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
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
		contentContainsMarkup(ra,o.getCancelled());
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,o.getChannelnum());
		contentContainsMarkup(ra,"Channelnum");
		contentContainsMarkup(ra,"Dup");
		contentContainsMarkup(ra,"End");
		// TODO: confirm ignoring Roamiosp.id
		contentContainsMarkup(ra,o.getInclude());
		contentContainsMarkup(ra,"Include");
		contentContainsMarkup(ra,o.getInshowsstatus());
		contentContainsMarkup(ra,"Inshowsstatus");
		contentContainsMarkup(ra,o.getKeep());
		contentContainsMarkup(ra,"Keep");
		contentContainsMarkup(ra,o.getNetwork());
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,"Num");
		contentContainsMarkup(ra,o.getOta());
		contentContainsMarkup(ra,"Ota");
		contentContainsMarkup(ra,"Priority");
		contentContainsMarkup(ra,o.getRecord());
		contentContainsMarkup(ra,"Record");
		contentContainsMarkup(ra,"Row");
		contentContainsMarkup(ra,"Season");
		contentContainsMarkup(ra,o.getShow());
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Start");
		contentContainsMarkup(ra,o.getStation());
		contentContainsMarkup(ra,"Station");
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

