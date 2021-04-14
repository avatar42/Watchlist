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
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.form.NetworksForm;
import com.dea42.watchlist.search.NetworksSearchForm;

/**
 * Title: NetworksControllerTest <br>
 * Description: NetworksController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@WebMvcTest(NetworksController.class)
public class NetworksControllerTest extends MockBase {
	private Networks getNetworks(Integer id) {
		Networks o = new Networks();
		o.setId(id);
		// TODO: confirm ignoring Networks.androidapp
		// TODO: confirm ignoring Networks.comment
        o.setCommercials(getTestString(68));
		// TODO: confirm ignoring Networks.fireapp
		// TODO: confirm ignoring Networks.freewithtwcid
		// TODO: confirm ignoring Networks.hasdirectbuyoption
		// TODO: confirm ignoring Networks.haswatchlist
		// TODO: confirm ignoring Networks.icanota
		// TODO: confirm ignoring Networks.iptvservice
        o.setOnhulu(getTestString(14));
        o.setPersistance(getTestString(70));
		// TODO: confirm ignoring Networks.remembersplaceinepisode
		// TODO: confirm ignoring Networks.rememberswatchedepisodes
        o.setRokuapp(getTestString(97));
		// TODO: confirm ignoring Networks.showsintivonpl
        o.setSite(getTestString(28));
        o.setStandardwait(getTestString(17));
		// TODO: confirm ignoring Networks.tivoapp
		// TODO: confirm ignoring Networks.tivoshortname
		// TODO: confirm ignoring Networks.webinterface
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#getAllNetworkss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworkss() throws Exception {
		List<Networks> list = new ArrayList<>();
		Networks o = getNetworks(1);
		list.add(o);

		Page<Networks> p = getPage(list);
		given(networksServices.listAll(new NetworksSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/networkss");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Networks") + " " + getMsg("edit.list") + "</h1>");
		// TODO: confirm ignoring Networks.androidapp
		// TODO: confirm ignoring Networks.comment
//		contentContainsMarkup(ra,getTestString(68));
//		contentContainsMarkup(ra,getMsg("Networks.commercials"));
		// TODO: confirm ignoring Networks.fireapp
		// TODO: confirm ignoring Networks.freewithtwcid
		// TODO: confirm ignoring Networks.hasdirectbuyoption
		// TODO: confirm ignoring Networks.haswatchlist
		// TODO: confirm ignoring Networks.icanota
		// TODO: confirm ignoring Networks.iptvservice
//		contentContainsMarkup(ra,getTestString(14));
//		contentContainsMarkup(ra,getMsg("Networks.onhulu"));
//		contentContainsMarkup(ra,getTestString(70));
//		contentContainsMarkup(ra,getMsg("Networks.persistance"));
		// TODO: confirm ignoring Networks.remembersplaceinepisode
		// TODO: confirm ignoring Networks.rememberswatchedepisodes
//		contentContainsMarkup(ra,getTestString(97));
//		contentContainsMarkup(ra,getMsg("Networks.rokuapp"));
		// TODO: confirm ignoring Networks.showsintivonpl
//		contentContainsMarkup(ra,getTestString(28));
//		contentContainsMarkup(ra,getMsg("Networks.site"));
//		contentContainsMarkup(ra,getTestString(17));
//		contentContainsMarkup(ra,getMsg("Networks.standardwait"));
		// TODO: confirm ignoring Networks.tivoapp
		// TODO: confirm ignoring Networks.tivoshortname
		// TODO: confirm ignoring Networks.webinterface
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#showNewNetworksPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewNetworksPage() throws Exception {
		ResultActions ra = getAsAdmin("/networkss/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Networks") + "</legend>");
		contentContainsMarkup(ra,getMsg("Networks.androidapp"));
		contentContainsMarkup(ra,getMsg("Networks.comment"));
		contentContainsMarkup(ra,getMsg("Networks.commercials"));
		contentContainsMarkup(ra,getMsg("Networks.fireapp"));
		contentContainsMarkup(ra,getMsg("Networks.freewithtwcid"));
		contentContainsMarkup(ra,getMsg("Networks.hasdirectbuyoption"));
		contentContainsMarkup(ra,getMsg("Networks.haswatchlist"));
		contentContainsMarkup(ra,getMsg("Networks.icanota"));
		// TODO: confirm ignoring Networks.id
		contentContainsMarkup(ra,getMsg("Networks.iptvservice"));
		contentContainsMarkup(ra,getMsg("Networks.onhulu"));
		contentContainsMarkup(ra,getMsg("Networks.persistance"));
		contentContainsMarkup(ra,getMsg("Networks.remembersplaceinepisode"));
		contentContainsMarkup(ra,getMsg("Networks.rememberswatchedepisodes"));
		contentContainsMarkup(ra,getMsg("Networks.rokuapp"));
		contentContainsMarkup(ra,getMsg("Networks.showsintivonpl"));
		contentContainsMarkup(ra,getMsg("Networks.site"));
		contentContainsMarkup(ra,getMsg("Networks.standardwait"));
		contentContainsMarkup(ra,getMsg("Networks.tivoapp"));
		contentContainsMarkup(ra,getMsg("Networks.tivoshortname"));
		contentContainsMarkup(ra,getMsg("Networks.webinterface"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#saveNetworks(com.dea42.watchlist.entity.Networks, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksCancel() throws Exception {
		Networks o = getNetworks(1);

		send(SEND_POST, "/networkss/save", "networks", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/networkss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#saveNetworks(com.dea42.watchlist.entity.Networks, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksSave() throws Exception {
		Networks o = getNetworks(0);
		NetworksForm form = NetworksForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/networkss/save", "networksForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
				"/networkss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#showEditNetworksPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditNetworksPage() throws Exception {
		Networks o = getNetworks(1);

		given(networksServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/networkss/edit/1");
		contentContainsMarkup(ra,o.getAndroidapp());
		contentContainsMarkup(ra,"Androidapp");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,o.getCommercials());
		contentContainsMarkup(ra,"Commercials");
		contentContainsMarkup(ra,o.getFireapp());
		contentContainsMarkup(ra,"Fireapp");
		contentContainsMarkup(ra,o.getFreewithtwcid());
		contentContainsMarkup(ra,"Freewithtwcid");
		contentContainsMarkup(ra,o.getHasdirectbuyoption());
		contentContainsMarkup(ra,"Hasdirectbuyoption");
		contentContainsMarkup(ra,o.getHaswatchlist());
		contentContainsMarkup(ra,"Haswatchlist");
		contentContainsMarkup(ra,o.getIcanota());
		contentContainsMarkup(ra,"Icanota");
		// TODO: confirm ignoring Networks.id
		contentContainsMarkup(ra,o.getIptvservice());
		contentContainsMarkup(ra,"Iptvservice");
		contentContainsMarkup(ra,o.getOnhulu());
		contentContainsMarkup(ra,"Onhulu");
		contentContainsMarkup(ra,o.getPersistance());
		contentContainsMarkup(ra,"Persistance");
		contentContainsMarkup(ra,o.getRemembersplaceinepisode());
		contentContainsMarkup(ra,"Remembersplaceinepisode");
		contentContainsMarkup(ra,o.getRememberswatchedepisodes());
		contentContainsMarkup(ra,"Rememberswatchedepisodes");
		contentContainsMarkup(ra,o.getRokuapp());
		contentContainsMarkup(ra,"Rokuapp");
		contentContainsMarkup(ra,"Showsintivonpl");
		contentContainsMarkup(ra,o.getSite());
		contentContainsMarkup(ra,"Site");
		contentContainsMarkup(ra,o.getStandardwait());
		contentContainsMarkup(ra,"Standardwait");
		contentContainsMarkup(ra,o.getTivoapp());
		contentContainsMarkup(ra,"Tivoapp");
		contentContainsMarkup(ra,o.getTivoshortname());
		contentContainsMarkup(ra,"Tivoshortname");
		contentContainsMarkup(ra,o.getWebinterface());
		contentContainsMarkup(ra,"Webinterface");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#deleteNetworks(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteNetworks() throws Exception {
		getAsAdminRedirectExpected("/networkss/delete/1","/networkss");
	}

}

