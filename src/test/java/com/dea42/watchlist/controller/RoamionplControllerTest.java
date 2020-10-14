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
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.form.RoamionplForm;

/**
 * Title: RoamionplControllerTest <br>
 * Description: RoamionplController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.2<br>
 * @version 0.5.2<br>
 */
@Slf4j
@WebMvcTest(RoamionplController.class)
public class RoamionplControllerTest extends MockBase {
	private Roamionpl getRoamionpl(Integer id) {
		Roamionpl o = new Roamionpl();
		o.setId(id);
        o.setChan(getTestString(62));
        o.setChannel(getTestString(16));
        o.setEpisode(getTestString(4));
        o.setF(getTestString(62));
        o.setInnetworkstab(getTestString(7));
        o.setNetwork(getTestString(33));
        o.setShow(getTestString(66));
        o.setSpchannel0nosp(getTestString(1));
        o.setTitle(getTestString(69));
        o.setWatched(getTestString(6));
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
		contentContainsMarkup(ra,getTestString(62));
		contentContainsMarkup(ra,getMsg("Roamionpl.chan"));
		contentContainsMarkup(ra,getTestString(16));
		contentContainsMarkup(ra,getMsg("Roamionpl.channel"));
		contentContainsMarkup(ra,getMsg("Roamionpl.date"));
		contentContainsMarkup(ra,getMsg("Roamionpl.duration"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Roamionpl.episode"));
		contentContainsMarkup(ra,getTestString(62));
		contentContainsMarkup(ra,getMsg("Roamionpl.f"));
		contentContainsMarkup(ra,getTestString(7));
		contentContainsMarkup(ra,getMsg("Roamionpl.innetworkstab"));
		contentContainsMarkup(ra,getMsg("Roamionpl.isnew"));
		contentContainsMarkup(ra,getMsg("Roamionpl.isseries"));
		contentContainsMarkup(ra,getTestString(33));
		contentContainsMarkup(ra,getMsg("Roamionpl.network"));
		contentContainsMarkup(ra,getMsg("Roamionpl.rowinshows"));
		contentContainsMarkup(ra,getMsg("Roamionpl.seriesep"));
		contentContainsMarkup(ra,getTestString(66));
		contentContainsMarkup(ra,getMsg("Roamionpl.show"));
		contentContainsMarkup(ra,getMsg("Roamionpl.sizegb"));
		contentContainsMarkup(ra,getMsg("Roamionpl.sortabledate"));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Roamionpl.spchannel0nosp"));
		contentContainsMarkup(ra,getTestString(69));
		contentContainsMarkup(ra,getMsg("Roamionpl.title"));
		contentContainsMarkup(ra,getMsg("Roamionpl.userid"));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Roamionpl.watched"));
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
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Roamionpl") + "</legend>");
		contentContainsMarkup(ra,"Bitratembps");
		contentContainsMarkup(ra,"Chan");
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,"Episode");
		contentContainsMarkup(ra,"F");
		// TODO: confirm ignoring Roamionpl.id
		contentContainsMarkup(ra,"Innetworkstab");
		contentContainsMarkup(ra,"Isnew");
		contentContainsMarkup(ra,"Isseries");
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,"Rowinshows");
		contentContainsMarkup(ra,"Seriesep");
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Sizegb");
		contentContainsMarkup(ra,"Sortabledate");
		contentContainsMarkup(ra,"Spchannel0nosp");
		contentContainsMarkup(ra,"Title");
		contentContainsMarkup(ra,"Account");
		contentContainsMarkup(ra,"Watched");
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
		RoamionplForm form = RoamionplForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/roamionpls/save", "roamionplForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
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
		contentContainsMarkup(ra,"Bitratembps");
		contentContainsMarkup(ra,o.getChan());
		contentContainsMarkup(ra,"Chan");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Date");
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,o.getEpisode());
		contentContainsMarkup(ra,"Episode");
		contentContainsMarkup(ra,o.getF());
		contentContainsMarkup(ra,"F");
		// TODO: confirm ignoring Roamionpl.id
		contentContainsMarkup(ra,o.getInnetworkstab());
		contentContainsMarkup(ra,"Innetworkstab");
		contentContainsMarkup(ra,"Isnew");
		contentContainsMarkup(ra,"Isseries");
		contentContainsMarkup(ra,o.getNetwork());
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,"Rowinshows");
		contentContainsMarkup(ra,"Seriesep");
		contentContainsMarkup(ra,o.getShow());
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Sizegb");
		contentContainsMarkup(ra,"Sortabledate");
		contentContainsMarkup(ra,o.getSpchannel0nosp());
		contentContainsMarkup(ra,"Spchannel0nosp");
		contentContainsMarkup(ra,o.getTitle());
		contentContainsMarkup(ra,"Title");
		contentContainsMarkup(ra,"Account");
		contentContainsMarkup(ra,o.getWatched());
		contentContainsMarkup(ra,"Watched");
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

