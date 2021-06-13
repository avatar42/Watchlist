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
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.form.RoamionplForm;
import com.dea42.watchlist.search.RoamionplSearchForm;

/**
 * Title: RoamionplControllerTest <br>
 * Description: RoamionplController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@WebMvcTest(RoamionplController.class)
public class RoamionplControllerTest extends MockBase {
	private Roamionpl getRoamionpl(Long id) {
		Roamionpl o = new Roamionpl();
		o.setId(id);
        o.setChannel(getTestString(16));
        o.setEpisode(getTestString(10));
        o.setSeriesep(getTestString(10));
        o.setShow(getTestString(73));
        o.setTitle(getTestString(76));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#getAllRoamionpls(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllRoamionpls() throws Exception {
		List<Roamionpl> list = new ArrayList<>();
		Roamionpl o = getRoamionpl(1l);
		list.add(o);

		Page<Roamionpl> p = getPage(list);
		given(roamionplServices.listAll(new RoamionplSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/roamionpls");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Roamionpl") + " " + getMsg("edit.list") + "</h1>");
//		contentContainsMarkup(ra,getMsg("Roamionpl.bitratembps"));
//		contentContainsMarkup(ra,getTestString(16));
//		contentContainsMarkup(ra,getMsg("Roamionpl.channel"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.datefield"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.duration"));
//		contentContainsMarkup(ra,getTestString(10));
//		contentContainsMarkup(ra,getMsg("Roamionpl.episode"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.isnew"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.rowinshows"));
//		contentContainsMarkup(ra,getTestString(10));
//		contentContainsMarkup(ra,getMsg("Roamionpl.seriesep"));
//		contentContainsMarkup(ra,getTestString(73));
//		contentContainsMarkup(ra,getMsg("Roamionpl.show"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.sizegb"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.sortabledate"));
//		contentContainsMarkup(ra,getTestString(76));
//		contentContainsMarkup(ra,getMsg("Roamionpl.title"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.userid"));
//		contentContainsMarkup(ra,getMsg("Roamionpl.watchedtime"));
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
		contentContainsMarkup(ra,getMsg("Roamionpl.bitratembps"));
		contentContainsMarkup(ra,getMsg("Roamionpl.channel"));
		contentContainsMarkup(ra,getMsg("Roamionpl.datefield"));
		contentContainsMarkup(ra,getMsg("Roamionpl.duration"));
		contentContainsMarkup(ra,getMsg("Roamionpl.episode"));
		// TODO: confirm ignoring Roamionpl.id
		contentContainsMarkup(ra,getMsg("Roamionpl.isnew"));
		contentContainsMarkup(ra,getMsg("Roamionpl.rowinshows"));
		contentContainsMarkup(ra,getMsg("Roamionpl.seriesep"));
		contentContainsMarkup(ra,getMsg("Roamionpl.show"));
		contentContainsMarkup(ra,getMsg("Roamionpl.sizegb"));
		contentContainsMarkup(ra,getMsg("Roamionpl.sortabledate"));
		contentContainsMarkup(ra,getMsg("Roamionpl.title"));
		contentContainsMarkup(ra,getMsg("Roamionpl.userid"));
		contentContainsMarkup(ra,getMsg("Roamionpl.watchedtime"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#saveRoamionpl(com.dea42.watchlist.entity.Roamionpl, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamionplCancel() throws Exception {
		Roamionpl o = getRoamionpl(1l);

		send(SEND_POST, "/roamionpls/save", "roamionpl", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/roamionpls");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.RoamionplController#saveRoamionpl(com.dea42.watchlist.entity.Roamionpl, java.lang.String)}.
	 */
	@Test
	public void testSaveRoamionplSave() throws Exception {
		Roamionpl o = getRoamionpl(0l);
		RoamionplForm form = RoamionplForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/roamionpls/save", "roamionplForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
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
		Roamionpl o = getRoamionpl(1l);

		given(roamionplServices.get(1l)).willReturn(o);

		ResultActions ra = getAsAdmin("/roamionpls/edit/1");
		contentContainsMarkup(ra,"Bitratembps");
		contentContainsMarkup(ra,o.getChannel());
		contentContainsMarkup(ra,"Channel");
		contentContainsMarkup(ra,"Datefield");
		contentContainsMarkup(ra,"Duration");
		contentContainsMarkup(ra,o.getEpisode());
		contentContainsMarkup(ra,"Episode");
		// TODO: confirm ignoring Roamionpl.id
		contentContainsMarkup(ra,"Isnew");
		contentContainsMarkup(ra,"Rowinshows");
		contentContainsMarkup(ra,o.getSeriesep());
		contentContainsMarkup(ra,"Seriesep");
		contentContainsMarkup(ra,o.getShow());
		contentContainsMarkup(ra,"Show");
		contentContainsMarkup(ra,"Sizegb");
		contentContainsMarkup(ra,"Sortabledate");
		contentContainsMarkup(ra,o.getTitle());
		contentContainsMarkup(ra,"Title");
		contentContainsMarkup(ra,"Account");
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

