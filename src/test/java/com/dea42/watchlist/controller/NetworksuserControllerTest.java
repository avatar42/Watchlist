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
import com.dea42.watchlist.entity.Networksuser;
import com.dea42.watchlist.form.NetworksuserForm;

/**
 * Title: NetworksuserControllerTest <br>
 * Description: NetworksuserController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@WebMvcTest(NetworksuserController.class)
public class NetworksuserControllerTest extends MockBase {
	private Networksuser getNetworksuser(Integer id) {
		Networksuser o = new Networksuser();
		o.setId(id);
        o.setIusefreefreewithcablepayforhuluinstead(getTestString(1));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksuserController#getAllNetworksusers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworksusers() throws Exception {
		List<Networksuser> list = new ArrayList<>();
		Networksuser o = getNetworksuser(1);
		list.add(o);

		given(networksuserServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/networksusers");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Networksuser") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Networksuser.iusefreefreewithcablepayforhuluinstead"));
		contentContainsMarkup(ra,getMsg("Networksuser.networksid"));
		contentContainsMarkup(ra,getMsg("Networksuser.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksuserController#showNewNetworksuserPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewNetworksuserPage() throws Exception {
		ResultActions ra = getAsAdmin("/networksusers/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Networksuser") + "</legend>");
		// TODO: confirm ignoring Networksuser.id
		contentContainsMarkup(ra,"Iusefreefreewithcablepayforhuluinstead");
		contentContainsMarkup(ra,"Networks");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksuserController#saveNetworksuser(com.dea42.watchlist.entity.Networksuser, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksuserCancel() throws Exception {
		Networksuser o = getNetworksuser(1);

		send(SEND_POST, "/networksusers/save", "networksuser", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/networksusers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksuserController#saveNetworksuser(com.dea42.watchlist.entity.Networksuser, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksuserSave() throws Exception {
		Networksuser o = getNetworksuser(0);
		NetworksuserForm form = NetworksuserForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/networksusers/save", "networksuserForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/networksusers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksuserController#showEditNetworksuserPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditNetworksuserPage() throws Exception {
		Networksuser o = getNetworksuser(1);

		given(networksuserServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/networksusers/edit/1");
		// TODO: confirm ignoring Networksuser.id
		contentContainsMarkup(ra,o.getIusefreefreewithcablepayforhuluinstead());
		contentContainsMarkup(ra,"Iusefreefreewithcablepayforhuluinstead");
		contentContainsMarkup(ra,"Networks");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksuserController#deleteNetworksuser(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteNetworksuser() throws Exception {
		getAsAdminRedirectExpected("/networksusers/delete/1","/networksusers");
	}

}

