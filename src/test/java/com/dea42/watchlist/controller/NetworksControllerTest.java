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

/**
 * Title: NetworksControllerTest <br>
 * Description: NetworksController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@WebMvcTest(NetworksController.class)
public class NetworksControllerTest extends MockBase {
	private Networks getNetworks(Integer id) {
		Networks o = new Networks();
		o.setId(id);
        o.setRokuapp(getTestString(97));
        o.setSite(getTestString(28));
        o.setCommercials(getTestString(68));
        o.setPersistance(getTestString(70));
        o.setOnhulu(getTestString(14));
        o.setStandardwait(getTestString(17));
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
		contentContainsMarkup(ra,getTestString(97));
		contentContainsMarkup(ra,getMsg("Networks.rokuapp"));
		contentContainsMarkup(ra,getTestString(28));
		contentContainsMarkup(ra,getMsg("Networks.site"));
		contentContainsMarkup(ra,getTestString(68));
		contentContainsMarkup(ra,getMsg("Networks.commercials"));
		contentContainsMarkup(ra,getTestString(70));
		contentContainsMarkup(ra,getMsg("Networks.persistance"));
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,getMsg("Networks.onhulu"));
		contentContainsMarkup(ra,getTestString(17));
		contentContainsMarkup(ra,getMsg("Networks.standardwait"));
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
		contentContainsMarkup(ra,"<h1>" + getMsg("edit.new") + " " + getMsg("class.Networks") + "</h1>");
		contentContainsMarkup(ra,"AndroidApp");
		contentContainsMarkup(ra,"AndroidAppLink");
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,"CommentLink");
		contentContainsMarkup(ra,"Commercials");
		contentContainsMarkup(ra,"CommercialsLink");
		contentContainsMarkup(ra,"FireApp");
		contentContainsMarkup(ra,"FireAppLink");
		contentContainsMarkup(ra,"FreeWithTwcId");
		contentContainsMarkup(ra,"FreeWithTwcIdLink");
		contentContainsMarkup(ra,"HasDirectBuyOption");
		contentContainsMarkup(ra,"HasDirectBuyOptionLink");
		contentContainsMarkup(ra,"HasWatchList");
		contentContainsMarkup(ra,"ICanOta");
		contentContainsMarkup(ra,"ICanOtaLink");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,"IptvService");
		contentContainsMarkup(ra,"IptvServiceLink");
		contentContainsMarkup(ra,"OnHulu");
		contentContainsMarkup(ra,"OnHuluLink");
		contentContainsMarkup(ra,"Persistance");
		contentContainsMarkup(ra,"RemembersPlaceInEpisode");
		contentContainsMarkup(ra,"RemembersWatchedEpisodes");
		contentContainsMarkup(ra,"RokuApp");
		contentContainsMarkup(ra,"RokuAppLink");
		contentContainsMarkup(ra,"ShowsInTivoNpl");
		contentContainsMarkup(ra,"Site");
		contentContainsMarkup(ra,"SiteLink");
		contentContainsMarkup(ra,"StandardWait");
		contentContainsMarkup(ra,"TivoApp");
		contentContainsMarkup(ra,"TivoAppLink");
		contentContainsMarkup(ra,"TivoShortName");
		contentContainsMarkup(ra,"WebInterface");
		contentContainsMarkup(ra,"WebInterfaceLink");
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

		send(SEND_POST, "/networkss/save", "networks", o, ImmutableMap.of("action", "save"), ADMIN_USER,
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
		contentContainsMarkup(ra,"AndroidApp");
		contentContainsMarkup(ra,o.getAndroidapplink());
		contentContainsMarkup(ra,"AndroidAppLink");
		contentContainsMarkup(ra,o.getComment());
		contentContainsMarkup(ra,"Comment");
		contentContainsMarkup(ra,o.getCommentlink());
		contentContainsMarkup(ra,"CommentLink");
		contentContainsMarkup(ra,o.getCommercials());
		contentContainsMarkup(ra,"Commercials");
		contentContainsMarkup(ra,o.getCommercialslink());
		contentContainsMarkup(ra,"CommercialsLink");
		contentContainsMarkup(ra,o.getFireapp());
		contentContainsMarkup(ra,"FireApp");
		contentContainsMarkup(ra,o.getFireapplink());
		contentContainsMarkup(ra,"FireAppLink");
		contentContainsMarkup(ra,o.getFreewithtwcid());
		contentContainsMarkup(ra,"FreeWithTwcId");
		contentContainsMarkup(ra,o.getFreewithtwcidlink());
		contentContainsMarkup(ra,"FreeWithTwcIdLink");
		contentContainsMarkup(ra,o.getHasdirectbuyoption());
		contentContainsMarkup(ra,"HasDirectBuyOption");
		contentContainsMarkup(ra,o.getHasdirectbuyoptionlink());
		contentContainsMarkup(ra,"HasDirectBuyOptionLink");
		contentContainsMarkup(ra,o.getHaswatchlist());
		contentContainsMarkup(ra,"HasWatchList");
		contentContainsMarkup(ra,o.getIcanota());
		contentContainsMarkup(ra,"ICanOta");
		contentContainsMarkup(ra,o.getIcanotalink());
		contentContainsMarkup(ra,"ICanOtaLink");
		contentContainsMarkup(ra,"id");
		contentContainsMarkup(ra,o.getIptvservice());
		contentContainsMarkup(ra,"IptvService");
		contentContainsMarkup(ra,o.getIptvservicelink());
		contentContainsMarkup(ra,"IptvServiceLink");
		contentContainsMarkup(ra,o.getOnhulu());
		contentContainsMarkup(ra,"OnHulu");
		contentContainsMarkup(ra,o.getOnhululink());
		contentContainsMarkup(ra,"OnHuluLink");
		contentContainsMarkup(ra,o.getPersistance());
		contentContainsMarkup(ra,"Persistance");
		contentContainsMarkup(ra,o.getRemembersplaceinepisode());
		contentContainsMarkup(ra,"RemembersPlaceInEpisode");
		contentContainsMarkup(ra,o.getRememberswatchedepisodes());
		contentContainsMarkup(ra,"RemembersWatchedEpisodes");
		contentContainsMarkup(ra,o.getRokuapp());
		contentContainsMarkup(ra,"RokuApp");
		contentContainsMarkup(ra,o.getRokuapplink());
		contentContainsMarkup(ra,"RokuAppLink");
		contentContainsMarkup(ra,"ShowsInTivoNpl");
		contentContainsMarkup(ra,o.getSite());
		contentContainsMarkup(ra,"Site");
		contentContainsMarkup(ra,o.getSitelink());
		contentContainsMarkup(ra,"SiteLink");
		contentContainsMarkup(ra,o.getStandardwait());
		contentContainsMarkup(ra,"StandardWait");
		contentContainsMarkup(ra,o.getTivoapp());
		contentContainsMarkup(ra,"TivoApp");
		contentContainsMarkup(ra,o.getTivoapplink());
		contentContainsMarkup(ra,"TivoAppLink");
		contentContainsMarkup(ra,o.getTivoshortname());
		contentContainsMarkup(ra,"TivoShortName");
		contentContainsMarkup(ra,o.getWebinterface());
		contentContainsMarkup(ra,"WebInterface");
		contentContainsMarkup(ra,o.getWebinterfacelink());
		contentContainsMarkup(ra,"WebInterfaceLink");
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

