package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.search.RoamionplSearchForm;
import com.dea42.watchlist.service.RoamionplServices;
import java.math.BigDecimal;
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
 * Title: roamionplSearch Test <br>
 * Description: Does regression tests of roamionpl search from service to DB <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoamionplSearchTest extends UnitBase {

	@Autowired
	private RoamionplServices roamionplServices;

	private Page<Roamionpl> confirmGotResult(RoamionplSearchForm form, Integer expectedID) {
		log.info("form:"+form);
		Page<Roamionpl> list = roamionplServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Roamionpl s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Roamionpl getMidRecord(RoamionplSearchForm form, Integer expectedID) {
		Page<Roamionpl> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testBitratembps() {
		// bitratembps Integer 4
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setBitratembpsMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with bitratembps of " + rec.getBitratembps());

		form = new RoamionplSearchForm();
		form.setBitratembpsMin(rec.getBitratembps());
		form.setBitratembpsMax(rec.getBitratembps() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setBitratembpsMin(rec.getBitratembps() - 1);
		form.setBitratembpsMax(rec.getBitratembps());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setBitratembpsMin(rec.getBitratembps());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setBitratembpsMax(rec.getBitratembps());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setBitratembpsMin(rec.getBitratembps());
		form.setBitratembpsMax(rec.getBitratembps());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testChannel() {
		// channel String 12
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannel("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channel of " + rec.getChannel());

		form = new RoamionplSearchForm();
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
		// date BigDecimal 6
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setDateMin(new BigDecimal(Integer.MIN_VALUE));
		rec = getMidRecord(form, 0);
		log.info("Searching for records with date of " + rec.getDate());

		form = new RoamionplSearchForm();
		form.setDateMin(rec.getDate());
		form.setDateMax(rec.getDate().add(new BigDecimal(100)));
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDateMin(rec.getDate().subtract(new BigDecimal(100)));
		form.setDateMax(rec.getDate());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDateMin(rec.getDate());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDateMax(rec.getDate());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDateMin(rec.getDate());
		form.setDateMax(rec.getDate());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testDuration() {
		// duration BigDecimal 6
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setDurationMin(new BigDecimal(Integer.MIN_VALUE));
		rec = getMidRecord(form, 0);
		log.info("Searching for records with duration of " + rec.getDuration());

		form = new RoamionplSearchForm();
		form.setDurationMin(rec.getDuration());
		form.setDurationMax(rec.getDuration().add(new BigDecimal(100)));
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDurationMin(rec.getDuration().subtract(new BigDecimal(100)));
		form.setDurationMax(rec.getDuration());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDurationMin(rec.getDuration());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDurationMax(rec.getDuration());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setDurationMin(rec.getDuration());
		form.setDurationMax(rec.getDuration());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testEpisode() {
		// episode String 12
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setEpisode("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with episode of " + rec.getEpisode());

		form = new RoamionplSearchForm();
		String text = rec.getEpisode();
		if (text.length() < 2) {
			form.setEpisode(text + "%");
			confirmGotResult(form, rec.getId());

			form.setEpisode("%" + text);
			confirmGotResult(form, rec.getId());
			form.setEpisode("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setEpisode(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setEpisode("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setEpisode("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testIsnew() {
		// isnew BigDecimal 6
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setIsnewMin(new BigDecimal(Integer.MIN_VALUE));
		rec = getMidRecord(form, 0);
		log.info("Searching for records with isnew of " + rec.getIsnew());

		form = new RoamionplSearchForm();
		form.setIsnewMin(rec.getIsnew());
		form.setIsnewMax(rec.getIsnew().add(new BigDecimal(100)));
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setIsnewMin(rec.getIsnew().subtract(new BigDecimal(100)));
		form.setIsnewMax(rec.getIsnew());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setIsnewMin(rec.getIsnew());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setIsnewMax(rec.getIsnew());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setIsnewMin(rec.getIsnew());
		form.setIsnewMax(rec.getIsnew());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testRowinshows() {
		// rowinshows Integer 4
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setRowinshowsMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with rowinshows of " + rec.getRowinshows());

		form = new RoamionplSearchForm();
		form.setRowinshowsMin(rec.getRowinshows());
		form.setRowinshowsMax(rec.getRowinshows() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setRowinshowsMin(rec.getRowinshows() - 1);
		form.setRowinshowsMax(rec.getRowinshows());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setRowinshowsMin(rec.getRowinshows());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setRowinshowsMax(rec.getRowinshows());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setRowinshowsMin(rec.getRowinshows());
		form.setRowinshowsMax(rec.getRowinshows());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testSeriesep() {
		// seriesep String 12
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setSeriesep("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with seriesep of " + rec.getSeriesep());

		form = new RoamionplSearchForm();
		String text = rec.getSeriesep();
		if (text.length() < 2) {
			form.setSeriesep(text + "%");
			confirmGotResult(form, rec.getId());

			form.setSeriesep("%" + text);
			confirmGotResult(form, rec.getId());
			form.setSeriesep("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setSeriesep(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setSeriesep("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setSeriesep("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testShow() {
		// show String 12
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setShow("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with show of " + rec.getShow());

		form = new RoamionplSearchForm();
		String text = rec.getShow();
		if (text.length() < 2) {
			form.setShow(text + "%");
			confirmGotResult(form, rec.getId());

			form.setShow("%" + text);
			confirmGotResult(form, rec.getId());
			form.setShow("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setShow(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setShow("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setShow("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testSizegb() {
		// sizegb Integer 4
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setSizegbMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with sizegb of " + rec.getSizegb());

		form = new RoamionplSearchForm();
		form.setSizegbMin(rec.getSizegb());
		form.setSizegbMax(rec.getSizegb() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSizegbMin(rec.getSizegb() - 1);
		form.setSizegbMax(rec.getSizegb());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSizegbMin(rec.getSizegb());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSizegbMax(rec.getSizegb());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSizegbMin(rec.getSizegb());
		form.setSizegbMax(rec.getSizegb());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testSortabledate() {
		// sortabledate Long -5
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setSortabledateMin(0l);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with sortabledate of " + rec.getSortabledate());

		form = new RoamionplSearchForm();
		form.setSortabledateMin(rec.getSortabledate());
		form.setSortabledateMax(rec.getSortabledate() + 1l);
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSortabledateMin(rec.getSortabledate() - 1l);
		form.setSortabledateMax(rec.getSortabledate());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSortabledateMin(rec.getSortabledate());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSortabledateMax(rec.getSortabledate());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setSortabledateMin(rec.getSortabledate());
		form.setSortabledateMax(rec.getSortabledate());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testTitle() {
		// title String 12
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setTitle("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with title of " + rec.getTitle());

		form = new RoamionplSearchForm();
		String text = rec.getTitle();
		if (text.length() < 2) {
			form.setTitle(text + "%");
			confirmGotResult(form, rec.getId());

			form.setTitle("%" + text);
			confirmGotResult(form, rec.getId());
			form.setTitle("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setTitle(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setTitle("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setTitle("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testAccount() {
		// account Account 4
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
// TODO: skip further tests now
	}

	@Test
	public void testWatchedtime() {
		// watchedtime Integer 4
		Roamionpl rec = null;
		RoamionplSearchForm form = new RoamionplSearchForm();
		rec = getMidRecord(form, 0);
		form.setWatchedtimeMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with watchedtime of " + rec.getWatchedtime());

		form = new RoamionplSearchForm();
		form.setWatchedtimeMin(rec.getWatchedtime());
		form.setWatchedtimeMax(rec.getWatchedtime() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setWatchedtimeMin(rec.getWatchedtime() - 1);
		form.setWatchedtimeMax(rec.getWatchedtime());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setWatchedtimeMin(rec.getWatchedtime());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setWatchedtimeMax(rec.getWatchedtime());
		confirmGotResult(form, rec.getId());

		form = new RoamionplSearchForm();
		form.setWatchedtimeMin(rec.getWatchedtime());
		form.setWatchedtimeMax(rec.getWatchedtime());
		confirmGotResult(form, rec.getId());
	}
}
