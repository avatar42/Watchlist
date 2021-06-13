package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.search.NetworksUserSearchForm;
import com.dea42.watchlist.service.NetworksUserServices;
import javax.validation.constraints.NotBlank;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Title: NetworksUserSearch Test <br>
 * Description: Does regression tests of NetworksUser search from service to DB <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class NetworksUserSearchTest extends UnitBase {

	@Autowired
	private NetworksUserServices networksUserServices;

	private Page<NetworksUser> confirmGotResult(NetworksUserSearchForm form, Long expectedID) {
		log.info("form:"+form);
		Page<NetworksUser> list = networksUserServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (NetworksUser s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private NetworksUser getMidRecord(NetworksUserSearchForm form, Long expectedID) {
		Page<NetworksUser> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testIusefreefreewithcablepayforhuluinstead() {
		// iusefreefreewithcablepayforhuluinstead String 12
		NetworksUser rec = null;
		NetworksUserSearchForm form = new NetworksUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setIusefreefreewithcablepayforhuluinstead("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with iusefreefreewithcablepayforhuluinstead of " + rec.getIusefreefreewithcablepayforhuluinstead());

		form = new NetworksUserSearchForm();
		String text = rec.getIusefreefreewithcablepayforhuluinstead();
		if (text.length() < 2) {
			form.setIusefreefreewithcablepayforhuluinstead(text + "%");
			confirmGotResult(form, rec.getId());

			form.setIusefreefreewithcablepayforhuluinstead("%" + text);
			confirmGotResult(form, rec.getId());
			form.setIusefreefreewithcablepayforhuluinstead("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setIusefreefreewithcablepayforhuluinstead(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setIusefreefreewithcablepayforhuluinstead("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setIusefreefreewithcablepayforhuluinstead("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testNetworks() {
		// networks Networks -5
		NetworksUser rec = null;
		NetworksUserSearchForm form = new NetworksUserSearchForm();
		rec = getMidRecord(form, 0l);
// TODO: skip further tests now
	}

	@Test
	public void testAccount() {
		// account Account -5
		NetworksUser rec = null;
		NetworksUserSearchForm form = new NetworksUserSearchForm();
		rec = getMidRecord(form, 0l);
// TODO: skip further tests now
	}
}
