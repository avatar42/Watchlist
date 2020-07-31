package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Cablecard;

/**
 * Title: CablecardControllerTest <br>
 * Description: CablecardController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@WebMvcTest(CablecardController.class)
public class CablecardControllerTest extends MockBase {
	private Cablecard getCablecard(Integer id) {
		Cablecard o = new Cablecard();
		o.setId(id);
        o.setChannelname(getTestString(12));
        o.setLang(getTestString(2));
        o.setNet(getTestString(12));
        o.setOd(getTestString(20));
        o.setReceiving(getTestString(3));
        o.setShortfield(getTestString(12));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#getAllCablecards(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllCablecards() throws Exception {
		List<Cablecard> list = new ArrayList<>();
		Cablecard o = getCablecard(1);
		list.add(o);

		given(cablecardServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/cablecards");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Cablecard") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(12));
		contentContainsMarkup(ra,getMsg("Cablecard.channelname"));
		contentContainsMarkup(ra,getMsg("Cablecard.channelnumber"));
		contentContainsMarkup(ra,getMsg("Cablecard.colh"));
		contentContainsMarkup(ra,getMsg("Cablecard.dt"));
		contentContainsMarkup(ra,getMsg("Cablecard.hd"));
		contentContainsMarkup(ra,getMsg("Cablecard.id"));
		contentContainsMarkup(ra,getMsg("Cablecard.innpl"));
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,getMsg("Cablecard.lang"));
		contentContainsMarkup(ra,getTestString(12));
		contentContainsMarkup(ra,getMsg("Cablecard.net"));
		contentContainsMarkup(ra,getTestString(20));
		contentContainsMarkup(ra,getMsg("Cablecard.od"));
		contentContainsMarkup(ra,getTestString(3));
		contentContainsMarkup(ra,getMsg("Cablecard.receiving"));
		contentContainsMarkup(ra,getTestString(12));
		contentContainsMarkup(ra,getMsg("Cablecard.shortfield"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#showNewCablecardPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewCablecardPage() throws Exception {
		ResultActions ra = getAsAdmin("/cablecards/new");
		contentContainsMarkup(ra,"<h1>" + getMsg("edit.new") + " " + getMsg("class.Cablecard") + "</h1>");
		contentContainsMarkup(ra,"ChannelName");
		contentContainsMarkup(ra,"ChannelNumber");
		contentContainsMarkup(ra,"Colh");
		contentContainsMarkup(ra,"Dt");
		contentContainsMarkup(ra,"Hd");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"InNpl");
		contentContainsMarkup(ra,"Lang");
		contentContainsMarkup(ra,"Net");
		contentContainsMarkup(ra,"Od");
		contentContainsMarkup(ra,"Receiving");
		contentContainsMarkup(ra,"ShortField");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#saveCablecard(com.dea42.watchlist.entity.Cablecard, java.lang.String)}.
	 */
	@Test
	public void testSaveCablecardCancel() throws Exception {
		Cablecard o = getCablecard(1);

		send(SEND_POST, "/cablecards/save", "cablecard", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/cablecards");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#saveCablecard(com.dea42.watchlist.entity.Cablecard, java.lang.String)}.
	 */
	@Test
	public void testSaveCablecardSave() throws Exception {
		Cablecard o = getCablecard(0);

		send(SEND_POST, "/cablecards/save", "cablecard", o, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/cablecards");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#showEditCablecardPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditCablecardPage() throws Exception {
		Cablecard o = getCablecard(1);

		given(cablecardServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/cablecards/edit/1");
		contentContainsMarkup(ra,o.getChannelname());
		contentContainsMarkup(ra,"ChannelName");
		contentContainsMarkup(ra,"ChannelNumber");
		contentContainsMarkup(ra,"Colh");
		contentContainsMarkup(ra,"Dt");
		contentContainsMarkup(ra,"Hd");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"InNpl");
		contentContainsMarkup(ra,o.getLang());
		contentContainsMarkup(ra,"Lang");
		contentContainsMarkup(ra,o.getNet());
		contentContainsMarkup(ra,"Net");
		contentContainsMarkup(ra,o.getOd());
		contentContainsMarkup(ra,"Od");
		contentContainsMarkup(ra,o.getReceiving());
		contentContainsMarkup(ra,"Receiving");
		contentContainsMarkup(ra,o.getShortfield());
		contentContainsMarkup(ra,"ShortField");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#deleteCablecard(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteCablecard() throws Exception {
		getAsAdminRedirectExpected("/cablecards/delete/1","/cablecards");
	}

}

