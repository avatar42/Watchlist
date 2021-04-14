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
import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.form.NetworksUserForm;
import com.dea42.watchlist.search.NetworksUserSearchForm;

/**
 * Title: NetworksUserControllerTest <br>
 * Description: NetworksUserController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@WebMvcTest(NetworksUserController.class)
public class NetworksUserControllerTest extends MockBase {
	private NetworksUser getNetworksUser(Integer id) {
		NetworksUser o = new NetworksUser();
		o.setId(id);
        o.setIusefreefreewithcablepayforhuluinstead(getTestString(1));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksUserController#getAllNetworksUsers(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllNetworksUsers() throws Exception {
		List<NetworksUser> list = new ArrayList<>();
		NetworksUser o = getNetworksUser(1);
		list.add(o);

		Page<NetworksUser> p = getPage(list);
		given(networksUserServices.listAll(new NetworksUserSearchForm())).willReturn(p);

		ResultActions ra = getAsAdmin("/networksUsers");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.NetworksUser") + " " + getMsg("edit.list") + "</h1>");
//		contentContainsMarkup(ra,getTestString(1));
//		contentContainsMarkup(ra,getMsg("NetworksUser.iusefreefreewithcablepayforhuluinstead"));
//		contentContainsMarkup(ra,getMsg("NetworksUser.networksid"));
//		contentContainsMarkup(ra,getMsg("NetworksUser.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksUserController#showNewNetworksUserPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewNetworksUserPage() throws Exception {
		ResultActions ra = getAsAdmin("/networksUsers/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.NetworksUser") + "</legend>");
		// TODO: confirm ignoring NetworksUser.id
		contentContainsMarkup(ra,getMsg("NetworksUser.iusefreefreewithcablepayforhuluinstead"));
		contentContainsMarkup(ra,getMsg("NetworksUser.networksid"));
		contentContainsMarkup(ra,getMsg("NetworksUser.userid"));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksUserController#saveNetworksUser(com.dea42.watchlist.entity.NetworksUser, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksUserCancel() throws Exception {
		NetworksUser o = getNetworksUser(1);

		send(SEND_POST, "/networksUsers/save", "networksUser", o, ImmutableMap.of("action", "cancel"), ADMIN_EMAIL,
				"/networksUsers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksUserController#saveNetworksUser(com.dea42.watchlist.entity.NetworksUser, java.lang.String)}.
	 */
	@Test
	public void testSaveNetworksUserSave() throws Exception {
		NetworksUser o = getNetworksUser(0);
		NetworksUserForm form = NetworksUserForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/networksUsers/save", "networksUserForm", form, ImmutableMap.of("action", "save"), ADMIN_EMAIL,
				"/networksUsers");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksUserController#showEditNetworksUserPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditNetworksUserPage() throws Exception {
		NetworksUser o = getNetworksUser(1);

		given(networksUserServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/networksUsers/edit/1");
		// TODO: confirm ignoring NetworksUser.id
		contentContainsMarkup(ra,o.getIusefreefreewithcablepayforhuluinstead());
		contentContainsMarkup(ra,"Iusefreefreewithcablepayforhuluinstead");
		contentContainsMarkup(ra,"Networks");
		contentContainsMarkup(ra,"Account");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.NetworksUserController#deleteNetworksUser(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteNetworksUser() throws Exception {
		getAsAdminRedirectExpected("/networksUsers/delete/1","/networksUsers");
	}

}

