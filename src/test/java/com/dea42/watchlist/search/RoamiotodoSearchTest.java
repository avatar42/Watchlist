package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.search.RoamiotodoSearchForm;
import com.dea42.watchlist.service.RoamiotodoServices;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Title: roamiotodoSearch Test <br>
 * Description: Does regression tests of roamiotodo search from service to DB <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoamiotodoSearchTest extends UnitBase {

	@Autowired
	private RoamiotodoServices roamiotodoServices;

	private Page<Roamiotodo> confirmGotResult(RoamiotodoSearchForm form, Integer expectedID) {
		log.info("form:"+form);
		Page<Roamiotodo> list = roamiotodoServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Roamiotodo s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Roamiotodo getMidRecord(RoamiotodoSearchForm form, Integer expectedID) {
		Page<Roamiotodo> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testChannel() {
		// channel String 12
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannel("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channel of " + rec.getChannel());

		form = new RoamiotodoSearchForm();
		String text = rec.getChannel();
		if (text.length() < 2) {
			form.setChannel(text + "%");
			confirmGotResult(form, rec.getId());

			form.setChannel("%" + text);
			confirmGotResult(form, rec.getId());
			form.setChannel("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setChannel(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setChannel("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setChannel("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testDate() {
		// date Date 93
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
		form.setDateMin(new Date(0));
		rec = getMidRecord(form, 0);
		log.info("Searching for records with date of " + rec.getDate());

		form = new RoamiotodoSearchForm();
		form.setDateMin(rec.getDate());
		form.setDateMax(new Date(rec.getDate().getTime() + DAY));
		confirmGotResult(form, rec.getId());

		form = new RoamiotodoSearchForm();
		form.setDateMin(new Date(rec.getDate().getTime() - DAY));
		form.setDateMax(rec.getDate());
		confirmGotResult(form, rec.getId());

		form = new RoamiotodoSearchForm();
		form.setDateMin(rec.getDate());
		confirmGotResult(form, rec.getId());

		form = new RoamiotodoSearchForm();
		form.setDateMax(rec.getDate());
		confirmGotResult(form, rec.getId());

		form = new RoamiotodoSearchForm();
		form.setDateMin(rec.getDate());
		form.setDateMax(rec.getDate());
		confirmGotResult(form, rec.getId());

	}

	@Test
	public void testDuration() {
		// duration String 12
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
		form.setDuration("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with duration of " + rec.getDuration());

		form = new RoamiotodoSearchForm();
		String text = rec.getDuration();
		if (text.length() < 2) {
			form.setDuration(text + "%");
			confirmGotResult(form, rec.getId());

			form.setDuration("%" + text);
			confirmGotResult(form, rec.getId());
			form.setDuration("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setDuration(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setDuration("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setDuration("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testEp() {
		// ep String 12
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
		form.setEp("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with ep of " + rec.getEp());

		form = new RoamiotodoSearchForm();
		String text = rec.getEp();
		if (text.length() < 2) {
			form.setEp(text + "%");
			confirmGotResult(form, rec.getId());

			form.setEp("%" + text);
			confirmGotResult(form, rec.getId());
			form.setEp("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setEp(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setEp("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setEp("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testEpisodename() {
		// episodename String 12
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
		form.setEpisodename("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with episodename of " + rec.getEpisodename());

		form = new RoamiotodoSearchForm();
		String text = rec.getEpisodename();
		if (text.length() < 2) {
			form.setEpisodename(text + "%");
			confirmGotResult(form, rec.getId());

			form.setEpisodename("%" + text);
			confirmGotResult(form, rec.getId());
			form.setEpisodename("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setEpisodename(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setEpisodename("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setEpisodename("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testShowname() {
		// showname String 12
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
		form.setShowname("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with showname of " + rec.getShowname());

		form = new RoamiotodoSearchForm();
		String text = rec.getShowname();
		if (text.length() < 2) {
			form.setShowname(text + "%");
			confirmGotResult(form, rec.getId());

			form.setShowname("%" + text);
			confirmGotResult(form, rec.getId());
			form.setShowname("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setShowname(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setShowname("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setShowname("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testShowtrimmed() {
		// showtrimmed String 12
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
		form.setShowtrimmed("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with showtrimmed of " + rec.getShowtrimmed());

		form = new RoamiotodoSearchForm();
		String text = rec.getShowtrimmed();
		if (text.length() < 2) {
			form.setShowtrimmed(text + "%");
			confirmGotResult(form, rec.getId());

			form.setShowtrimmed("%" + text);
			confirmGotResult(form, rec.getId());
			form.setShowtrimmed("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setShowtrimmed(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setShowtrimmed("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setShowtrimmed("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testAccount() {
		// account Account 4
		Roamiotodo rec = null;
		RoamiotodoSearchForm form = new RoamiotodoSearchForm();
		rec = getMidRecord(form, 0);
// TODO: skip further tests now
	}
}
