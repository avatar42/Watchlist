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
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.form.OtaForm;
import com.dea42.watchlist.search.OtaSearchForm;

/**
 * Title: OtaControllerTest <br>
 * Description: OtaController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@WebMvcTest(OtaController.class)
public class OtaControllerTest extends MockBase {
	private Ota getOta(Integer id) {
		Ota o = new Ota();
		o.setId(id);
        o.setChannelname(getTestString(10));
        o.setChannelnumber(getTestString(4));
        o.setChannelnumberchannelnameincluded(getTestString(18));
        o.setComments(getTestString(31));
        o.setDirection(getTestString(4));
        o.setEnabled(getTestString(3));
        o.setFccinfo(getTestString(10));
        o.setFccinfolink(getTestString(6));
        o.setLang(getTestString(2));
        o.setNetwork(getTestString(15));
        o.setOff(getTestString(5));
        o.setRecommendedantenna(getTestString(41));
        o.setRez(getTestString(5));
        o.setStation(getTestString(5));
        o.setTvfoolestsignal(getTestString(5));
        o.setWatchabletablo(getTestString(7));
        o.setWatchabletivo(getTestString(4));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#getAllOtas(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllOtas() throws Exception {
		List<Ota> list = new ArrayList<>();
		Ota o = getOta(1);
		list.add(o);

		Page<Ota> p = getPage(list);
		given(otaServices.listAll(new OtaSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/otas");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Ota") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getMsg("Ota.atticant"));
		contentContainsMarkup(ra,getMsg("Ota.chan"));
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,getMsg("Ota.channelname"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Ota.channelnumber"));
		contentContainsMarkup(ra,getTestString(18));
		contentContainsMarkup(ra,getMsg("Ota.channelnumberchannelnameincluded"));
		contentContainsMarkup(ra,getTestString(31));
		contentContainsMarkup(ra,getMsg("Ota.comments"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Ota.direction"));
		contentContainsMarkup(ra,getTestString(3));
		contentContainsMarkup(ra,getMsg("Ota.enabled"));
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,getMsg("Ota.fccinfo"));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Ota.freq"));
		contentContainsMarkup(ra,getTestString(2));
		contentContainsMarkup(ra,getMsg("Ota.lang"));
		contentContainsMarkup(ra,getMsg("Ota.listed"));
		contentContainsMarkup(ra,getMsg("Ota.mytivoavgstrength"));
		contentContainsMarkup(ra,getTestString(15));
		contentContainsMarkup(ra,getMsg("Ota.network"));
		contentContainsMarkup(ra,getTestString(5));
		contentContainsMarkup(ra,getMsg("Ota.off"));
		contentContainsMarkup(ra,getTestString(41));
		contentContainsMarkup(ra,getMsg("Ota.recommendedantenna"));
		contentContainsMarkup(ra,getTestString(5));
		contentContainsMarkup(ra,getMsg("Ota.rez"));
		contentContainsMarkup(ra,getTestString(5));
		contentContainsMarkup(ra,getMsg("Ota.station"));
		contentContainsMarkup(ra,getMsg("Ota.subchan"));
		contentContainsMarkup(ra,getMsg("Ota.tvfoolchan"));
		contentContainsMarkup(ra,getTestString(5));
		contentContainsMarkup(ra,getMsg("Ota.tvfoolestsignal"));
		contentContainsMarkup(ra,getMsg("Ota.userid"));
		contentContainsMarkup(ra,getTestString(7));
		contentContainsMarkup(ra,getMsg("Ota.watchabletablo"));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Ota.watchabletivo"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#showNewOtaPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewOtaPage() throws Exception {
		ResultActions ra = getAsAdmin("/otas/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Ota") + "</legend>");
		contentContainsMarkup(ra,"Atticant");
		contentContainsMarkup(ra,"Chan");
		contentContainsMarkup(ra,"Channelname");
		contentContainsMarkup(ra,"Channelnumber");
		contentContainsMarkup(ra,"Channelnumberchannelnameincluded");
		contentContainsMarkup(ra,"Comments");
		contentContainsMarkup(ra,"Direction");
		contentContainsMarkup(ra,"Enabled");
		contentContainsMarkup(ra,"Fccinfo");
		contentContainsMarkup(ra,"Fccinfolink");
		contentContainsMarkup(ra,"Freq");
		// TODO: confirm ignoring Ota.id
		contentContainsMarkup(ra,"Lang");
		contentContainsMarkup(ra,"Listed");
		contentContainsMarkup(ra,"Mytivoavgstrength");
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,"Off");
		contentContainsMarkup(ra,"Recommendedantenna");
		contentContainsMarkup(ra,"Rez");
		contentContainsMarkup(ra,"Station");
		contentContainsMarkup(ra,"Subchan");
		contentContainsMarkup(ra,"Tvfoolchan");
		contentContainsMarkup(ra,"Tvfoolestsignal");
		contentContainsMarkup(ra,"Account");
		contentContainsMarkup(ra,"Watchabletablo");
		contentContainsMarkup(ra,"Watchabletivo");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#saveOta(com.dea42.watchlist.entity.Ota, java.lang.String)}.
	 */
	@Test
	public void testSaveOtaCancel() throws Exception {
		Ota o = getOta(1);

		send(SEND_POST, "/otas/save", "ota", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/otas");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#saveOta(com.dea42.watchlist.entity.Ota, java.lang.String)}.
	 */
	@Test
	public void testSaveOtaSave() throws Exception {
		Ota o = getOta(0);
		OtaForm form = OtaForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/otas/save", "otaForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/otas");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#showEditOtaPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditOtaPage() throws Exception {
		Ota o = getOta(1);

		given(otaServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/otas/edit/1");
		contentContainsMarkup(ra,"Atticant");
		contentContainsMarkup(ra,"Chan");
		contentContainsMarkup(ra,o.getChannelname());
		contentContainsMarkup(ra,"Channelname");
		contentContainsMarkup(ra,o.getChannelnumber());
		contentContainsMarkup(ra,"Channelnumber");
		contentContainsMarkup(ra,o.getChannelnumberchannelnameincluded());
		contentContainsMarkup(ra,"Channelnumberchannelnameincluded");
		contentContainsMarkup(ra,o.getComments());
		contentContainsMarkup(ra,"Comments");
		contentContainsMarkup(ra,o.getDirection());
		contentContainsMarkup(ra,"Direction");
		contentContainsMarkup(ra,o.getEnabled());
		contentContainsMarkup(ra,"Enabled");
		contentContainsMarkup(ra,o.getFccinfo());
		contentContainsMarkup(ra,"Fccinfo");
		contentContainsMarkup(ra,o.getFccinfolink());
		contentContainsMarkup(ra,"Fccinfolink");
		contentContainsMarkup(ra,"Freq");
		// TODO: confirm ignoring Ota.id
		contentContainsMarkup(ra,o.getLang());
		contentContainsMarkup(ra,"Lang");
		contentContainsMarkup(ra,"Listed");
		contentContainsMarkup(ra,"Mytivoavgstrength");
		contentContainsMarkup(ra,o.getNetwork());
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,o.getOff());
		contentContainsMarkup(ra,"Off");
		contentContainsMarkup(ra,o.getRecommendedantenna());
		contentContainsMarkup(ra,"Recommendedantenna");
		contentContainsMarkup(ra,o.getRez());
		contentContainsMarkup(ra,"Rez");
		contentContainsMarkup(ra,o.getStation());
		contentContainsMarkup(ra,"Station");
		contentContainsMarkup(ra,"Subchan");
		contentContainsMarkup(ra,"Tvfoolchan");
		contentContainsMarkup(ra,o.getTvfoolestsignal());
		contentContainsMarkup(ra,"Tvfoolestsignal");
		contentContainsMarkup(ra,"Account");
		contentContainsMarkup(ra,o.getWatchabletablo());
		contentContainsMarkup(ra,"Watchabletablo");
		contentContainsMarkup(ra,o.getWatchabletivo());
		contentContainsMarkup(ra,"Watchabletivo");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.OtaController#deleteOta(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteOta() throws Exception {
		getAsAdminRedirectExpected("/otas/delete/1","/otas");
	}

}

