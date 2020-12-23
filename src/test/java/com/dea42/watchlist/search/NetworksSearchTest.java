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
 * Title: networksSearch Test <br>
 * Description: Does regression tests of networks search from service to DB <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class NetworksSearchTest extends UnitBase {

	@Autowired
	private NetworksServices networksServices;

	private Page<Networks> confirmGotResult(NetworksSearchForm form, Integer expectedID) {
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

	private Networks getMidRecord(NetworksSearchForm form, Integer expectedID) {
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
		rec = getMidRecord(form, 0);
		form.setAndroidapp("%");
		rec = getMidRecord(form, 0);
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
	public void testAndroidapplink() {
		// androidapplink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setAndroidapplink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with androidapplink of " + rec.getAndroidapplink());

		form = new NetworksSearchForm();
		String text = rec.getAndroidapplink();
		if (text.length() < 2) {
			form.setAndroidapplink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setAndroidapplink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setAndroidapplink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setAndroidapplink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setAndroidapplink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setAndroidapplink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testComment() {
		// comment String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setComment("%");
		rec = getMidRecord(form, 0);
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
	public void testCommentlink() {
		// commentlink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setCommentlink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with commentlink of " + rec.getCommentlink());

		form = new NetworksSearchForm();
		String text = rec.getCommentlink();
		if (text.length() < 2) {
			form.setCommentlink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setCommentlink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setCommentlink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setCommentlink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setCommentlink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setCommentlink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testCommercials() {
		// commercials String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setCommercials("%");
		rec = getMidRecord(form, 0);
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
	public void testCommercialslink() {
		// commercialslink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setCommercialslink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with commercialslink of " + rec.getCommercialslink());

		form = new NetworksSearchForm();
		String text = rec.getCommercialslink();
		if (text.length() < 2) {
			form.setCommercialslink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setCommercialslink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setCommercialslink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setCommercialslink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setCommercialslink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setCommercialslink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testFireapp() {
		// fireapp String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setFireapp("%");
		rec = getMidRecord(form, 0);
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
	public void testFireapplink() {
		// fireapplink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setFireapplink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with fireapplink of " + rec.getFireapplink());

		form = new NetworksSearchForm();
		String text = rec.getFireapplink();
		if (text.length() < 2) {
			form.setFireapplink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setFireapplink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setFireapplink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setFireapplink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setFireapplink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setFireapplink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testFreewithtwcid() {
		// freewithtwcid String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setFreewithtwcid("%");
		rec = getMidRecord(form, 0);
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
	public void testFreewithtwcidlink() {
		// freewithtwcidlink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setFreewithtwcidlink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with freewithtwcidlink of " + rec.getFreewithtwcidlink());

		form = new NetworksSearchForm();
		String text = rec.getFreewithtwcidlink();
		if (text.length() < 2) {
			form.setFreewithtwcidlink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setFreewithtwcidlink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setFreewithtwcidlink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setFreewithtwcidlink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setFreewithtwcidlink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setFreewithtwcidlink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testHasdirectbuyoption() {
		// hasdirectbuyoption String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setHasdirectbuyoption("%");
		rec = getMidRecord(form, 0);
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
	public void testHasdirectbuyoptionlink() {
		// hasdirectbuyoptionlink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setHasdirectbuyoptionlink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with hasdirectbuyoptionlink of " + rec.getHasdirectbuyoptionlink());

		form = new NetworksSearchForm();
		String text = rec.getHasdirectbuyoptionlink();
		if (text.length() < 2) {
			form.setHasdirectbuyoptionlink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setHasdirectbuyoptionlink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setHasdirectbuyoptionlink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setHasdirectbuyoptionlink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setHasdirectbuyoptionlink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setHasdirectbuyoptionlink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testHaswatchlist() {
		// haswatchlist String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setHaswatchlist("%");
		rec = getMidRecord(form, 0);
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
		rec = getMidRecord(form, 0);
		form.setIcanota("%");
		rec = getMidRecord(form, 0);
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
	public void testIcanotalink() {
		// icanotalink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setIcanotalink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with icanotalink of " + rec.getIcanotalink());

		form = new NetworksSearchForm();
		String text = rec.getIcanotalink();
		if (text.length() < 2) {
			form.setIcanotalink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setIcanotalink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setIcanotalink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setIcanotalink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setIcanotalink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setIcanotalink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testIptvservice() {
		// iptvservice String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setIptvservice("%");
		rec = getMidRecord(form, 0);
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
	public void testIptvservicelink() {
		// iptvservicelink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setIptvservicelink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with iptvservicelink of " + rec.getIptvservicelink());

		form = new NetworksSearchForm();
		String text = rec.getIptvservicelink();
		if (text.length() < 2) {
			form.setIptvservicelink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setIptvservicelink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setIptvservicelink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setIptvservicelink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setIptvservicelink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setIptvservicelink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testOnhulu() {
		// onhulu String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setOnhulu("%");
		rec = getMidRecord(form, 0);
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
	public void testOnhululink() {
		// onhululink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setOnhululink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with onhululink of " + rec.getOnhululink());

		form = new NetworksSearchForm();
		String text = rec.getOnhululink();
		if (text.length() < 2) {
			form.setOnhululink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setOnhululink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setOnhululink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setOnhululink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setOnhululink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setOnhululink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testPersistance() {
		// persistance String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setPersistance("%");
		rec = getMidRecord(form, 0);
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
		rec = getMidRecord(form, 0);
		form.setRemembersplaceinepisode("%");
		rec = getMidRecord(form, 0);
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
		rec = getMidRecord(form, 0);
		form.setRememberswatchedepisodes("%");
		rec = getMidRecord(form, 0);
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
		rec = getMidRecord(form, 0);
		form.setRokuapp("%");
		rec = getMidRecord(form, 0);
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
	public void testRokuapplink() {
		// rokuapplink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setRokuapplink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with rokuapplink of " + rec.getRokuapplink());

		form = new NetworksSearchForm();
		String text = rec.getRokuapplink();
		if (text.length() < 2) {
			form.setRokuapplink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setRokuapplink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setRokuapplink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setRokuapplink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setRokuapplink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setRokuapplink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testShowsintivonpl() {
		// showsintivonpl Integer 4
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setShowsintivonplMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
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
		rec = getMidRecord(form, 0);
		form.setSite("%");
		rec = getMidRecord(form, 0);
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
	public void testSitelink() {
		// sitelink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setSitelink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with sitelink of " + rec.getSitelink());

		form = new NetworksSearchForm();
		String text = rec.getSitelink();
		if (text.length() < 2) {
			form.setSitelink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setSitelink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setSitelink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setSitelink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setSitelink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setSitelink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testStandardwait() {
		// standardwait String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setStandardwait("%");
		rec = getMidRecord(form, 0);
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
		rec = getMidRecord(form, 0);
		form.setTivoapp("%");
		rec = getMidRecord(form, 0);
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
	public void testTivoapplink() {
		// tivoapplink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setTivoapplink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with tivoapplink of " + rec.getTivoapplink());

		form = new NetworksSearchForm();
		String text = rec.getTivoapplink();
		if (text.length() < 2) {
			form.setTivoapplink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoapplink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setTivoapplink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setTivoapplink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoapplink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setTivoapplink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testTivoshortname() {
		// tivoshortname String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setTivoshortname("%");
		rec = getMidRecord(form, 0);
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
		rec = getMidRecord(form, 0);
		form.setWebinterface("%");
		rec = getMidRecord(form, 0);
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

	@Test
	public void testWebinterfacelink() {
		// webinterfacelink String 12
		Networks rec = null;
		NetworksSearchForm form = new NetworksSearchForm();
		rec = getMidRecord(form, 0);
		form.setWebinterfacelink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with webinterfacelink of " + rec.getWebinterfacelink());

		form = new NetworksSearchForm();
		String text = rec.getWebinterfacelink();
		if (text.length() < 2) {
			form.setWebinterfacelink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setWebinterfacelink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setWebinterfacelink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setWebinterfacelink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setWebinterfacelink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setWebinterfacelink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}
}
