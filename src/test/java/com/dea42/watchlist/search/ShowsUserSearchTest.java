package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.search.ShowsUserSearchForm;
import com.dea42.watchlist.service.ShowsUserServices;
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
 * Title: ShowsUserSearch Test <br>
 * Description: Does regression tests of ShowsUser search from service to DB <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowsUserSearchTest extends UnitBase {

	@Autowired
	private ShowsUserServices showsUserServices;

	private Page<ShowsUser> confirmGotResult(ShowsUserSearchForm form, Long expectedID) {
		log.info("form:"+form);
		Page<ShowsUser> list = showsUserServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (ShowsUser s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private ShowsUser getMidRecord(ShowsUserSearchForm form, Long expectedID) {
		Page<ShowsUser> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testBestexperience() {
		// bestexperience String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setBestexperience("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with bestexperience of " + rec.getBestexperience());

		form = new ShowsUserSearchForm();
		String text = rec.getBestexperience();
		if (text.length() < 2) {
			form.setBestexperience(text + "%");
			confirmGotResult(form, rec.getId());

			form.setBestexperience("%" + text);
			confirmGotResult(form, rec.getId());
			form.setBestexperience("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setBestexperience(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setBestexperience("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setBestexperience("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testComment() {
		// comment String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setComment("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with comment of " + rec.getComment());

		form = new ShowsUserSearchForm();
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
	public void testImdb() {
		// imdb String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setImdb("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with imdb of " + rec.getImdb());

		form = new ShowsUserSearchForm();
		String text = rec.getImdb();
		if (text.length() < 2) {
			form.setImdb(text + "%");
			confirmGotResult(form, rec.getId());

			form.setImdb("%" + text);
			confirmGotResult(form, rec.getId());
			form.setImdb("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setImdb(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setImdb("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setImdb("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testInrokufeed() {
		// inrokufeed String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setInrokufeed("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with inrokufeed of " + rec.getInrokufeed());

		form = new ShowsUserSearchForm();
		String text = rec.getInrokufeed();
		if (text.length() < 2) {
			form.setInrokufeed(text + "%");
			confirmGotResult(form, rec.getId());

			form.setInrokufeed("%" + text);
			confirmGotResult(form, rec.getId());
			form.setInrokufeed("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setInrokufeed(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setInrokufeed("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setInrokufeed("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testInshowrssas() {
		// inshowrssas String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setInshowrssas("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with inshowrssas of " + rec.getInshowrssas());

		form = new ShowsUserSearchForm();
		String text = rec.getInshowrssas();
		if (text.length() < 2) {
			form.setInshowrssas(text + "%");
			confirmGotResult(form, rec.getId());

			form.setInshowrssas("%" + text);
			confirmGotResult(form, rec.getId());
			form.setInshowrssas("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setInshowrssas(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setInshowrssas("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setInshowrssas("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testJustwatch() {
		// justwatch String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setJustwatch("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with justwatch of " + rec.getJustwatch());

		form = new ShowsUserSearchForm();
		String text = rec.getJustwatch();
		if (text.length() < 2) {
			form.setJustwatch(text + "%");
			confirmGotResult(form, rec.getId());

			form.setJustwatch("%" + text);
			confirmGotResult(form, rec.getId());
			form.setJustwatch("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setJustwatch(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setJustwatch("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setJustwatch("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testLastwatched() {
		// lastwatched String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setLastwatched("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with lastwatched of " + rec.getLastwatched());

		form = new ShowsUserSearchForm();
		String text = rec.getLastwatched();
		if (text.length() < 2) {
			form.setLastwatched(text + "%");
			confirmGotResult(form, rec.getId());

			form.setLastwatched("%" + text);
			confirmGotResult(form, rec.getId());
			form.setLastwatched("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setLastwatched(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setLastwatched("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setLastwatched("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testN67() {
		// n67 String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setN67("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with n67 of " + rec.getN67());

		form = new ShowsUserSearchForm();
		String text = rec.getN67();
		if (text.length() < 2) {
			form.setN67(text + "%");
			confirmGotResult(form, rec.getId());

			form.setN67("%" + text);
			confirmGotResult(form, rec.getId());
			form.setN67("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setN67(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setN67("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setN67("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testOta() {
		// ota String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setOta("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with ota of " + rec.getOta());

		form = new ShowsUserSearchForm();
		String text = rec.getOta();
		if (text.length() < 2) {
			form.setOta(text + "%");
			confirmGotResult(form, rec.getId());

			form.setOta("%" + text);
			confirmGotResult(form, rec.getId());
			form.setOta("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setOta(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setOta("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setOta("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testShows() {
		// shows Shows -5
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
// TODO: skip further tests now
	}

	@Test
	public void testTablolink() {
		// tablolink String 12
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
		form.setTablolink("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with tablolink of " + rec.getTablolink());

		form = new ShowsUserSearchForm();
		String text = rec.getTablolink();
		if (text.length() < 2) {
			form.setTablolink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setTablolink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setTablolink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setTablolink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setTablolink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setTablolink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testAccount() {
		// account Account -5
		ShowsUser rec = null;
		ShowsUserSearchForm form = new ShowsUserSearchForm();
		rec = getMidRecord(form, 0l);
// TODO: skip further tests now
	}
}
