package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.search.NetworksSearchForm;
import com.dea42.watchlist.service.NetworksServices;
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
 * Title: NetworksSearch Test <br>
 * Description: Does regression tests of Networks search from service to DB <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class NetworksSearchTest extends UnitBase {

	@Autowired
	private NetworksServices networksServices;

	private Page<Networks> confirmGotResult(NetworksSearchForm form, Long expectedID) {
		log.info("form:"+form);
		Page<Networks> list = networksServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Networks s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Networks getMidRecord(NetworksSearchForm form, Long expectedID) {
		Page<Networks> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testAndroidapp() {
		// androidapp String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setAndroidapp("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with androidapp of " + rec.getAndroidapp());

		form = new NetworksSearchForm();
		String text = rec.getAndroidapp();
		if (text.length() < 2) {
			form.setAndroidapp(text + "%");
			confirmGotResult(form, rec.getId());

			form.setAndroidapp("%" + text);
			confirmGotResult(form, rec.getId());
			form.setAndroidapp("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setAndroidapp(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setAndroidapp("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setAndroidapp("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testComment() {
		// comment String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setComment("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with comment of " + rec.getComment());

		form = new NetworksSearchForm();
		String text = rec.getComment();
		if (text.length() < 2) {
			form.setComment(text + "%");
			confirmGotResult(form, rec.getId());

			form.setComment("%" + text);
			confirmGotResult(form, rec.getId());
			form.setComment("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setComment(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setComment("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setComment("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testCommercials() {
		// commercials String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setCommercials("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with commercials of " + rec.getCommercials());

		form = new NetworksSearchForm();
		String text = rec.getCommercials();
		if (text.length() < 2) {
			form.setCommercials(text + "%");
			confirmGotResult(form, rec.getId());

			form.setCommercials("%" + text);
			confirmGotResult(form, rec.getId());
			form.setCommercials("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setCommercials(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setCommercials("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setCommercials("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testFireapp() {
		// fireapp String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setFireapp("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with fireapp of " + rec.getFireapp());

		form = new NetworksSearchForm();
		String text = rec.getFireapp();
		if (text.length() < 2) {
			form.setFireapp(text + "%");
			confirmGotResult(form, rec.getId());

			form.setFireapp("%" + text);
			confirmGotResult(form, rec.getId());
			form.setFireapp("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setFireapp(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setFireapp("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setFireapp("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testFreewithtwcid() {
		// freewithtwcid String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setFreewithtwcid("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with freewithtwcid of " + rec.getFreewithtwcid());

		form = new NetworksSearchForm();
		String text = rec.getFreewithtwcid();
		if (text.length() < 2) {
			form.setFreewithtwcid(text + "%");
			confirmGotResult(form, rec.getId());

			form.setFreewithtwcid("%" + text);
			confirmGotResult(form, rec.getId());
			form.setFreewithtwcid("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setFreewithtwcid(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setFreewithtwcid("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setFreewithtwcid("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testHasdirectbuyoption() {
		// hasdirectbuyoption String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setHasdirectbuyoption("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with hasdirectbuyoption of " + rec.getHasdirectbuyoption());

		form = new NetworksSearchForm();
		String text = rec.getHasdirectbuyoption();
		if (text.length() < 2) {
			form.setHasdirectbuyoption(text + "%");
			confirmGotResult(form, rec.getId());

			form.setHasdirectbuyoption("%" + text);
			confirmGotResult(form, rec.getId());
			form.setHasdirectbuyoption("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setHasdirectbuyoption(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setHasdirectbuyoption("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setHasdirectbuyoption("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testHaswatchlist() {
		// haswatchlist String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setHaswatchlist("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with haswatchlist of " + rec.getHaswatchlist());

		form = new NetworksSearchForm();
		String text = rec.getHaswatchlist();
		if (text.length() < 2) {
			form.setHaswatchlist(text + "%");
			confirmGotResult(form, rec.getId());

			form.setHaswatchlist("%" + text);
			confirmGotResult(form, rec.getId());
			form.setHaswatchlist("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setHaswatchlist(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setHaswatchlist("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setHaswatchlist("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testIcanota() {
		// icanota String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setIcanota("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with icanota of " + rec.getIcanota());

		form = new NetworksSearchForm();
		String text = rec.getIcanota();
		if (text.length() < 2) {
			form.setIcanota(text + "%");
			confirmGotResult(form, rec.getId());

			form.setIcanota("%" + text);
			confirmGotResult(form, rec.getId());
			form.setIcanota("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setIcanota(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setIcanota("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setIcanota("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testIptvservice() {
		// iptvservice String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setIptvservice("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with iptvservice of " + rec.getIptvservice());

		form = new NetworksSearchForm();
		String text = rec.getIptvservice();
		if (text.length() < 2) {
			form.setIptvservice(text + "%");
			confirmGotResult(form, rec.getId());

			form.setIptvservice("%" + text);
			confirmGotResult(form, rec.getId());
			form.setIptvservice("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setIptvservice(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setIptvservice("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setIptvservice("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testOnhulu() {
		// onhulu String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setOnhulu("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with onhulu of " + rec.getOnhulu());

		form = new NetworksSearchForm();
		String text = rec.getOnhulu();
		if (text.length() < 2) {
			form.setOnhulu(text + "%");
			confirmGotResult(form, rec.getId());

			form.setOnhulu("%" + text);
			confirmGotResult(form, rec.getId());
			form.setOnhulu("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setOnhulu(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setOnhulu("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setOnhulu("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testPersistance() {
		// persistance String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setPersistance("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with persistance of " + rec.getPersistance());

		form = new NetworksSearchForm();
		String text = rec.getPersistance();
		if (text.length() < 2) {
			form.setPersistance(text + "%");
			confirmGotResult(form, rec.getId());

			form.setPersistance("%" + text);
			confirmGotResult(form, rec.getId());
			form.setPersistance("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setPersistance(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setPersistance("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setPersistance("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testRemembersplaceinepisode() {
		// remembersplaceinepisode String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setRemembersplaceinepisode("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with remembersplaceinepisode of " + rec.getRemembersplaceinepisode());

		form = new NetworksSearchForm();
		String text = rec.getRemembersplaceinepisode();
		if (text.length() < 2) {
			form.setRemembersplaceinepisode(text + "%");
			confirmGotResult(form, rec.getId());

			form.setRemembersplaceinepisode("%" + text);
			confirmGotResult(form, rec.getId());
			form.setRemembersplaceinepisode("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setRemembersplaceinepisode(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setRemembersplaceinepisode("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setRemembersplaceinepisode("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testRememberswatchedepisodes() {
		// rememberswatchedepisodes String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setRememberswatchedepisodes("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with rememberswatchedepisodes of " + rec.getRememberswatchedepisodes());

		form = new NetworksSearchForm();
		String text = rec.getRememberswatchedepisodes();
		if (text.length() < 2) {
			form.setRememberswatchedepisodes(text + "%");
			confirmGotResult(form, rec.getId());

			form.setRememberswatchedepisodes("%" + text);
			confirmGotResult(form, rec.getId());
			form.setRememberswatchedepisodes("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setRememberswatchedepisodes(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setRememberswatchedepisodes("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setRememberswatchedepisodes("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testRokuapp() {
		// rokuapp String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setRokuapp("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with rokuapp of " + rec.getRokuapp());

		form = new NetworksSearchForm();
		String text = rec.getRokuapp();
		if (text.length() < 2) {
			form.setRokuapp(text + "%");
			confirmGotResult(form, rec.getId());

			form.setRokuapp("%" + text);
			confirmGotResult(form, rec.getId());
			form.setRokuapp("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setRokuapp(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setRokuapp("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setRokuapp("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testShowsintivonpl() {
		// showsintivonpl Integer 4
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setShowsintivonplMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with showsintivonpl of " + rec.getShowsintivonpl());

		form = new NetworksSearchForm();
		form.setShowsintivonplMin(rec.getShowsintivonpl());
		form.setShowsintivonplMax(rec.getShowsintivonpl() + 1);
		confirmGotResult(form, rec.getId());

		form = new NetworksSearchForm();
		form.setShowsintivonplMin(rec.getShowsintivonpl() - 1);
		form.setShowsintivonplMax(rec.getShowsintivonpl());
		confirmGotResult(form, rec.getId());

		form = new NetworksSearchForm();
		form.setShowsintivonplMin(rec.getShowsintivonpl());
		confirmGotResult(form, rec.getId());

		form = new NetworksSearchForm();
		form.setShowsintivonplMax(rec.getShowsintivonpl());
		confirmGotResult(form, rec.getId());

		form = new NetworksSearchForm();
		form.setShowsintivonplMin(rec.getShowsintivonpl());
		form.setShowsintivonplMax(rec.getShowsintivonpl());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testSite() {
		// site String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setSite("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with site of " + rec.getSite());

		form = new NetworksSearchForm();
		String text = rec.getSite();
		if (text.length() < 2) {
			form.setSite(text + "%");
			confirmGotResult(form, rec.getId());

			form.setSite("%" + text);
			confirmGotResult(form, rec.getId());
			form.setSite("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setSite(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setSite("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setSite("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testStandardwait() {
		// standardwait String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setStandardwait("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with standardwait of " + rec.getStandardwait());

		form = new NetworksSearchForm();
		String text = rec.getStandardwait();
		if (text.length() < 2) {
			form.setStandardwait(text + "%");
			confirmGotResult(form, rec.getId());

			form.setStandardwait("%" + text);
			confirmGotResult(form, rec.getId());
			form.setStandardwait("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setStandardwait(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setStandardwait("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setStandardwait("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testTivoapp() {
		// tivoapp String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setTivoapp("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with tivoapp of " + rec.getTivoapp());

		form = new NetworksSearchForm();
		String text = rec.getTivoapp();
		if (text.length() < 2) {
			form.setTivoapp(text + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoapp("%" + text);
			confirmGotResult(form, rec.getId());
			form.setTivoapp("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setTivoapp(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoapp("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setTivoapp("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testTivoshortname() {
		// tivoshortname String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setTivoshortname("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with tivoshortname of " + rec.getTivoshortname());

		form = new NetworksSearchForm();
		String text = rec.getTivoshortname();
		if (text.length() < 2) {
			form.setTivoshortname(text + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoshortname("%" + text);
			confirmGotResult(form, rec.getId());
			form.setTivoshortname("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setTivoshortname(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoshortname("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setTivoshortname("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testWebinterface() {
		// webinterface String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0l);
		form.setWebinterface("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with webinterface of " + rec.getWebinterface());

		form = new NetworksSearchForm();
		String text = rec.getWebinterface();
		if (text.length() < 2) {
			form.setWebinterface(text + "%");
			confirmGotResult(form, rec.getId());

			form.setWebinterface("%" + text);
			confirmGotResult(form, rec.getId());
			form.setWebinterface("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setWebinterface(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setWebinterface("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setWebinterface("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}
}
