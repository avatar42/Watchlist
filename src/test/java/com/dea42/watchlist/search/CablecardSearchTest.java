package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.search.CablecardSearchForm;
import com.dea42.watchlist.service.CablecardServices;
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
 * Title: cablecardSearch Test <br>
 * Description: Does regression tests of cablecard search from service to DB <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class CablecardSearchTest extends UnitBase {

	@Autowired
	private CablecardServices cablecardServices;

	private Page<Cablecard> confirmGotResult(CablecardSearchForm form, Integer expectedID) {
		log.info("form:"+form);
		Page<Cablecard> list = cablecardServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Cablecard s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Cablecard getMidRecord(CablecardSearchForm form, Integer expectedID) {
		Page<Cablecard> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testChannelname() {
		// channelname String 12
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannelname("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channelname of " + rec.getChannelname());

		form = new CablecardSearchForm();
		String text = rec.getChannelname();
		if (text.length() < 2) {
			form.setChannelname(text + "%");
			confirmGotResult(form, rec.getId());

			form.setChannelname("%" + text);
			confirmGotResult(form, rec.getId());
			form.setChannelname("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setChannelname(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setChannelname("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setChannelname("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testChannelnumber() {
		// channelnumber Integer 4
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannelnumberMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channelnumber of " + rec.getChannelnumber());

		form = new CablecardSearchForm();
		form.setChannelnumberMin(rec.getChannelnumber());
		form.setChannelnumberMax(rec.getChannelnumber() + 1);
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setChannelnumberMin(rec.getChannelnumber() - 1);
		form.setChannelnumberMax(rec.getChannelnumber());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setChannelnumberMin(rec.getChannelnumber());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setChannelnumberMax(rec.getChannelnumber());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setChannelnumberMin(rec.getChannelnumber());
		form.setChannelnumberMax(rec.getChannelnumber());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testDt() {
		// dt Integer 4
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setDtMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with dt of " + rec.getDt());

		form = new CablecardSearchForm();
		form.setDtMin(rec.getDt());
		form.setDtMax(rec.getDt() + 1);
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setDtMin(rec.getDt() - 1);
		form.setDtMax(rec.getDt());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setDtMin(rec.getDt());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setDtMax(rec.getDt());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setDtMin(rec.getDt());
		form.setDtMax(rec.getDt());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testHd() {
		// hd Integer 4
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setHdMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with hd of " + rec.getHd());

		form = new CablecardSearchForm();
		form.setHdMin(rec.getHd());
		form.setHdMax(rec.getHd() + 1);
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setHdMin(rec.getHd() - 1);
		form.setHdMax(rec.getHd());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setHdMin(rec.getHd());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setHdMax(rec.getHd());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setHdMin(rec.getHd());
		form.setHdMax(rec.getHd());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testInnpl() {
		// innpl Integer 4
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setInnplMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with innpl of " + rec.getInnpl());

		form = new CablecardSearchForm();
		form.setInnplMin(rec.getInnpl());
		form.setInnplMax(rec.getInnpl() + 1);
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setInnplMin(rec.getInnpl() - 1);
		form.setInnplMax(rec.getInnpl());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setInnplMin(rec.getInnpl());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setInnplMax(rec.getInnpl());
		confirmGotResult(form, rec.getId());

		form = new CablecardSearchForm();
		form.setInnplMin(rec.getInnpl());
		form.setInnplMax(rec.getInnpl());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testLang() {
		// lang String 12
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setLang("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with lang of " + rec.getLang());

		form = new CablecardSearchForm();
		String text = rec.getLang();
		if (text.length() < 2) {
			form.setLang(text + "%");
			confirmGotResult(form, rec.getId());

			form.setLang("%" + text);
			confirmGotResult(form, rec.getId());
			form.setLang("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setLang(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setLang("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setLang("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testNet() {
		// net String 12
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setNet("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with net of " + rec.getNet());

		form = new CablecardSearchForm();
		String text = rec.getNet();
		if (text.length() < 2) {
			form.setNet(text + "%");
			confirmGotResult(form, rec.getId());

			form.setNet("%" + text);
			confirmGotResult(form, rec.getId());
			form.setNet("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setNet(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setNet("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setNet("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testReceiving() {
		// receiving String 12
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setReceiving("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with receiving of " + rec.getReceiving());

		form = new CablecardSearchForm();
		String text = rec.getReceiving();
		if (text.length() < 2) {
			form.setReceiving(text + "%");
			confirmGotResult(form, rec.getId());

			form.setReceiving("%" + text);
			confirmGotResult(form, rec.getId());
			form.setReceiving("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setReceiving(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setReceiving("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setReceiving("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testShortfield() {
		// shortfield String 12
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
		form.setShortfield("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with shortfield of " + rec.getShortfield());

		form = new CablecardSearchForm();
		String text = rec.getShortfield();
		if (text.length() < 2) {
			form.setShortfield(text + "%");
			confirmGotResult(form, rec.getId());

			form.setShortfield("%" + text);
			confirmGotResult(form, rec.getId());
			form.setShortfield("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setShortfield(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setShortfield("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setShortfield("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testAccount() {
		// account Account 4
		Cablecard rec = null;
		CablecardSearchForm form = new CablecardSearchForm();
		rec = getMidRecord(form, 0);
// TODO: skip further tests now
	}
}
