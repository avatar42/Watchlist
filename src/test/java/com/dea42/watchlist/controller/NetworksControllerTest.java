package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.form.NetworksForm;

/**
 * Title: NetworksControllerTest <br>
 * Description: NetworksController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */
@WebMvcTest(NetworksController.class)
public class NetworksControllerTest extends MockBase {
	private Networks getNetworks(Integer id) {
		Networks o = new Networks();
		o.setId(id);
		// TODO: confirm ignoring Networks.androidapp
		// TODO: confirm ignoring Networks.androidapplink
		// TODO: confirm ignoring Networks.comment
		// TODO: confirm ignoring Networks.commentlink
        o.setCommercials(getTestString(68));
		// TODO: confirm ignoring Networks.commercialslink
		// TODO: confirm ignoring Networks.fireapp
		// TODO: confirm ignoring Networks.fireapplink
		// TODO: confirm ignoring Networks.freewithtwcid
		// TODO: confirm ignoring Networks.freewithtwcidlink
		// TODO: confirm ignoring Networks.hasdirectbuyoption
		// TODO: confirm ignoring Networks.hasdirectbuyoptionlink
		// TODO: confirm ignoring Networks.haswatchlist
		// TODO: confirm ignoring Networks.icanota
		// TODO: confirm ignoring Networks.icanotalink
		// TODO: confirm ignoring Networks.id
		// TODO: confirm ignoring Networks.iptvservice
		// TODO: confirm ignoring Networks.iptvservicelink
        o.setOnhulu(getTestString(14));
		// TODO: confirm ignoring Networks.onhululink
        o.setPersistance(getTestString(70));
		// TODO: confirm ignoring Networks.remembersplaceinepisode
		// TODO: confirm ignoring Networks.rememberswatchedepisodes
        o.setRokuapp(getTestString(97));
		// TODO: confirm ignoring Networks.rokuapplink
		// TODO: confirm ignoring Networks.showsintivonpl
        o.setSite(getTestString(28));
		// TODO: confirm ignoring Networks.sitelink
        o.setStandardwait(getTestString(17));
		// TODO: confirm ignoring Networks.tivoapp
		// TODO: confirm ignoring Networks.tivoapplink
		// TODO: confirm ignoring Networks.tivoshortname
		// TODO: confirm ignoring Networks.webinterface
		// TODO: confirm ignoring Networks.webinterfacelink
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

		given(networksServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/networkss");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Networks") + " " + getMsg("edit.list") + "</h1>");
		// TODO: confirm ignoring Networks.androidapp
		// TODO: confirm ignoring Networks.androidapplink
		// TODO: confirm ignoring Networks.comment
		// TODO: confirm ignoring Networks.commentlink
		contentContainsMarkup(ra,getTestString(68));
		contentContainsMarkup(ra,getMsg("Networks.commercials"));
		// TODO: confirm ignoring Networks.commercialslink
		// TODO: confirm ignoring Networks.fireapp
		// TODO: confirm ignoring Networks.fireapplink
		// TODO: confirm ignoring Networks.freewithtwcid
		// TODO: confirm ignoring Networks.freewithtwcidlink
		// TODO: confirm ignoring Networks.hasdirectbuyoption
		// TODO: confirm ignoring Networks.hasdirectbuyoptionlink
		// TODO: confirm ignoring Networks.haswatchlist
		// TODO: confirm ignoring Networks.icanota
		// TODO: confirm ignoring Networks.icanotalink
		// TODO: confirm ignoring Networks.iptvservice
		// TODO: confirm ignoring Networks.iptvservicelink
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,getMsg("Networks.onhulu"));
		// TODO: confirm ignoring Networks.onhululink
		contentContainsMarkup(ra,getTestString(70));
		contentContainsMarkup(ra,getMsg("Networks.persistance"));
		// TODO: confirm ignoring Networks.remembersplaceinepisode
		// TODO: confirm ignoring Networks.rememberswatchedepisodes
		contentContainsMarkup(ra,getTestString(97));
		contentContainsMarkup(ra,getMsg("Networks.rokuapp"));
		// TODO: confirm ignoring Networks.rokuapplink
		// TODO: confirm ignoring Networks.showsintivonpl
		contentContainsMarkup(ra,getTestString(28));
		contentContainsMarkup(ra,getMsg("Networks.site"));
		// TODO: confirm ignoring Networks.sitelink
		contentContainsMarkup(ra,getTestString(17));
		contentContainsMarkup(ra,getMsg("Networks.standardwait"));
		// TODO: confirm ignoring Networks.tivoapp
		// TODO: confirm ignoring Networks.tivoapplink
		// TODO: confirm ignoring Networks.tivoshortname
		// TODO: confirm ignoring Networks.webinterface
		// TODO: confirm ignoring Networks.webinterfacelink
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
		contentContainsMarkup(ra,"Androidapp");
		contentContainsMarkup(ra,"Androidapplink");
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,"Commentlink");
		contentContainsMarkup(ra,"Commercials");
		contentContainsMarkup(ra,"Commercialslink");
		contentContainsMarkup(ra,"Fireapp");
		contentContainsMarkup(ra,"Fireapplink");
		contentContainsMarkup(ra,"Freewithtwcid");
		contentContainsMarkup(ra,"Freewithtwcidlink");
		contentContainsMarkup(ra,"Hasdirectbuyoption");
		contentContainsMarkup(ra,"Hasdirectbuyoptionlink");
		contentContainsMarkup(ra,"Haswatchlist");
		contentContainsMarkup(ra,"Icanota");
		contentContainsMarkup(ra,"Icanotalink");
		// TODO: confirm ignoring Networks.id
		contentContainsMarkup(ra,"Iptvservice");
		contentContainsMarkup(ra,"Iptvservicelink");
		contentContainsMarkup(ra,"Onhulu");
		contentContainsMarkup(ra,"Onhululink");
		contentContainsMarkup(ra,"Persistance");
		contentContainsMarkup(ra,"Remembersplaceinepisode");
		contentContainsMarkup(ra,"Rememberswatchedepisodes");
		contentContainsMarkup(ra,"Rokuapp");
		contentContainsMarkup(ra,"Rokuapplink");
		contentContainsMarkup(ra,"Showsintivonpl");
		contentContainsMarkup(ra,"Site");
		contentContainsMarkup(ra,"Sitelink");
		contentContainsMarkup(ra,"Standardwait");
		contentContainsMarkup(ra,"Tivoapp");
		contentContainsMarkup(ra,"Tivoapplink");
		contentContainsMarkup(ra,"Tivoshortname");
		contentContainsMarkup(ra,"Webinterface");
		contentContainsMarkup(ra,"Webinterfacelink");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksController#saveNetworks(com.dea42.watchlist.entity.Networks, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksCancel() throws Exception {
		Networks o = getNetworks(1);

		send(SEND_POST, "/networkss/save", "networks", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
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
		LOGGER.debug(form.toString());

		send(SEND_POST, "/networkss/save", "networksForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
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
		contentContainsMarkup(ra,o.getAndroidapplink());
		contentContainsMarkup(ra,"Androidapplink");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,o.getCommentlink());
		contentContainsMarkup(ra,"Commentlink");
		contentContainsMarkup(ra,o.getCommercials());
		contentContainsMarkup(ra,"Commercials");
		contentContainsMarkup(ra,o.getCommercialslink());
		contentContainsMarkup(ra,"Commercialslink");
		contentContainsMarkup(ra,o.getFireapp());
		contentContainsMarkup(ra,"Fireapp");
		contentContainsMarkup(ra,o.getFireapplink());
		contentContainsMarkup(ra,"Fireapplink");
		contentContainsMarkup(ra,o.getFreewithtwcid());
		contentContainsMarkup(ra,"Freewithtwcid");
		contentContainsMarkup(ra,o.getFreewithtwcidlink());
		contentContainsMarkup(ra,"Freewithtwcidlink");
		contentContainsMarkup(ra,o.getHasdirectbuyoption());
		contentContainsMarkup(ra,"Hasdirectbuyoption");
		contentContainsMarkup(ra,o.getHasdirectbuyoptionlink());
		contentContainsMarkup(ra,"Hasdirectbuyoptionlink");
		contentContainsMarkup(ra,o.getHaswatchlist());
		contentContainsMarkup(ra,"Haswatchlist");
		contentContainsMarkup(ra,o.getIcanota());
		contentContainsMarkup(ra,"Icanota");
		contentContainsMarkup(ra,o.getIcanotalink());
		contentContainsMarkup(ra,"Icanotalink");
		// TODO: confirm ignoring Networks.id
		contentContainsMarkup(ra,o.getIptvservice());
		contentContainsMarkup(ra,"Iptvservice");
		contentContainsMarkup(ra,o.getIptvservicelink());
		contentContainsMarkup(ra,"Iptvservicelink");
		contentContainsMarkup(ra,o.getOnhulu());
		contentContainsMarkup(ra,"Onhulu");
		contentContainsMarkup(ra,o.getOnhululink());
		contentContainsMarkup(ra,"Onhululink");
		contentContainsMarkup(ra,o.getPersistance());
		contentContainsMarkup(ra,"Persistance");
		contentContainsMarkup(ra,o.getRemembersplaceinepisode());
		contentContainsMarkup(ra,"Remembersplaceinepisode");
		contentContainsMarkup(ra,o.getRememberswatchedepisodes());
		contentContainsMarkup(ra,"Rememberswatchedepisodes");
		contentContainsMarkup(ra,o.getRokuapp());
		contentContainsMarkup(ra,"Rokuapp");
		contentContainsMarkup(ra,o.getRokuapplink());
		contentContainsMarkup(ra,"Rokuapplink");
		contentContainsMarkup(ra,"Showsintivonpl");
		contentContainsMarkup(ra,o.getSite());
		contentContainsMarkup(ra,"Site");
		contentContainsMarkup(ra,o.getSitelink());
		contentContainsMarkup(ra,"Sitelink");
		contentContainsMarkup(ra,o.getStandardwait());
		contentContainsMarkup(ra,"Standardwait");
		contentContainsMarkup(ra,o.getTivoapp());
		contentContainsMarkup(ra,"Tivoapp");
		contentContainsMarkup(ra,o.getTivoapplink());
		contentContainsMarkup(ra,"Tivoapplink");
		contentContainsMarkup(ra,o.getTivoshortname());
		contentContainsMarkup(ra,"Tivoshortname");
		contentContainsMarkup(ra,o.getWebinterface());
		contentContainsMarkup(ra,"Webinterface");
		contentContainsMarkup(ra,o.getWebinterfacelink());
		contentContainsMarkup(ra,"Webinterfacelink");
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

