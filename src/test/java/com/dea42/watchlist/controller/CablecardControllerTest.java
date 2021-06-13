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
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.form.CablecardForm;
import com.dea42.watchlist.search.CablecardSearchForm;

/**
 * Title: CablecardControllerTest <br>
 * Description: CablecardController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@WebMvcTest(CablecardController.class)
public class CablecardControllerTest extends MockBase {
	private Cablecard getCablecard(Long id) {
		Cablecard o = new Cablecard();
		o.setId(id);
        o.setChannelname(getTestString(12));
        o.setLangfield(getTestString(2));
        o.setNet(getTestString(12));
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
		Cablecard o = getCablecard(1l);
		list.add(o);

		Page<Cablecard> p = getPage(list);
		given(cablecardServices.listAll(new CablecardSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/cablecards");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Cablecard") + " " + getMsg("edit.list") + "</h1>");
//		contentContainsMarkup(ra,getTestString(12));
//		contentContainsMarkup(ra,getMsg("Cablecard.channelname"));
//		contentContainsMarkup(ra,getMsg("Cablecard.channelnumber"));
//		contentContainsMarkup(ra,getMsg("Cablecard.dt"));
//		contentContainsMarkup(ra,getMsg("Cablecard.hd"));
//		contentContainsMarkup(ra,getMsg("Cablecard.innpl"));
//		contentContainsMarkup(ra,getTestString(2));
//		contentContainsMarkup(ra,getMsg("Cablecard.langfield"));
//		contentContainsMarkup(ra,getTestString(12));
//		contentContainsMarkup(ra,getMsg("Cablecard.net"));
//		contentContainsMarkup(ra,getTestString(3));
//		contentContainsMarkup(ra,getMsg("Cablecard.receiving"));
//		contentContainsMarkup(ra,getTestString(12));
//		contentContainsMarkup(ra,getMsg("Cablecard.shortfield"));
//		contentContainsMarkup(ra,getMsg("Cablecard.userid"));
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
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Cablecard") + "</legend>");
		contentContainsMarkup(ra,getMsg("Cablecard.channelname"));
		contentContainsMarkup(ra,getMsg("Cablecard.channelnumber"));
		contentContainsMarkup(ra,getMsg("Cablecard.dt"));
		contentContainsMarkup(ra,getMsg("Cablecard.hd"));
		// TODO: confirm ignoring Cablecard.id
		contentContainsMarkup(ra,getMsg("Cablecard.innpl"));
		contentContainsMarkup(ra,getMsg("Cablecard.langfield"));
		contentContainsMarkup(ra,getMsg("Cablecard.net"));
		contentContainsMarkup(ra,getMsg("Cablecard.receiving"));
		contentContainsMarkup(ra,getMsg("Cablecard.shortfield"));
		contentContainsMarkup(ra,getMsg("Cablecard.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#saveCablecard(com.dea42.watchlist.entity.Cablecard, java.lang.String)}.
	 */
	@Test
	public void testSaveCablecardCancel() throws Exception {
		Cablecard o = getCablecard(1l);

		send(SEND_POST, "/cablecards/save", "cablecard", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/cablecards");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.CablecardController#saveCablecard(com.dea42.watchlist.entity.Cablecard, java.lang.String)}.
	 */
	@Test
	public void testSaveCablecardSave() throws Exception {
		Cablecard o = getCablecard(0l);
		CablecardForm form = CablecardForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/cablecards/save", "cablecardForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
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
		Cablecard o = getCablecard(1l);

		given(cablecardServices.get(1l)).willReturn(o);

		ResultActions ra = getAsAdmin("/cablecards/edit/1");
		contentContainsMarkup(ra,o.getChannelname());
		contentContainsMarkup(ra,"Channelname");
		contentContainsMarkup(ra,"Channelnumber");
		contentContainsMarkup(ra,"Dt");
		contentContainsMarkup(ra,"Hd");
		// TODO: confirm ignoring Cablecard.id
		contentContainsMarkup(ra,"Innpl");
		contentContainsMarkup(ra,o.getLangfield());
		contentContainsMarkup(ra,"Langfield");
		contentContainsMarkup(ra,o.getNet());
		contentContainsMarkup(ra,"Net");
		contentContainsMarkup(ra,o.getReceiving());
		contentContainsMarkup(ra,"Receiving");
		contentContainsMarkup(ra,o.getShortfield());
		contentContainsMarkup(ra,"Shortfield");
		contentContainsMarkup(ra,"Account");
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

