package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.search.RoamiospSearchForm;
import com.dea42.watchlist.service.RoamiospServices;
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
 * Title: roamiospSearch Test <br>
 * Description: Does regression tests of roamiosp search from service to DB <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoamiospSearchTest extends UnitBase {

	@Autowired
	private RoamiospServices roamiospServices;

	private Page<Roamiosp> confirmGotResult(RoamiospSearchForm form, Integer expectedID) {
		log.info("form:"+form);
		Page<Roamiosp> list = roamiospServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Roamiosp s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Roamiosp getMidRecord(RoamiospSearchForm form, Integer expectedID) {
		Page<Roamiosp> list = confirmGotResult(form, expectedID);
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
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannel("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channel of " + rec.getChannel());

		form = new RoamiospSearchForm();
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
	public void testEnd() {
		// end Integer 4
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setEndMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with end of " + rec.getEnd());

		form = new RoamiospSearchForm();
		form.setEndMin(rec.getEnd());
		form.setEndMax(rec.getEnd() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setEndMin(rec.getEnd() - 1);
		form.setEndMax(rec.getEnd());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setEndMin(rec.getEnd());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setEndMax(rec.getEnd());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setEndMin(rec.getEnd());
		form.setEndMax(rec.getEnd());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testInclude() {
		// include String 12
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setInclude("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with include of " + rec.getInclude());

		form = new RoamiospSearchForm();
		String text = rec.getInclude();
		if (text.length() < 2) {
			form.setInclude(text + "%");
			confirmGotResult(form, rec.getId());

			form.setInclude("%" + text);
			confirmGotResult(form, rec.getId());
			form.setInclude("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setInclude(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setInclude("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setInclude("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testKeep() {
		// keep String 12
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setKeep("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with keep of " + rec.getKeep());

		form = new RoamiospSearchForm();
		String text = rec.getKeep();
		if (text.length() < 2) {
			form.setKeep(text + "%");
			confirmGotResult(form, rec.getId());

			form.setKeep("%" + text);
			confirmGotResult(form, rec.getId());
			form.setKeep("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setKeep(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setKeep("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setKeep("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testNum() {
		// num Integer 4
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setNumMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with num of " + rec.getNum());

		form = new RoamiospSearchForm();
		form.setNumMin(rec.getNum());
		form.setNumMax(rec.getNum() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setNumMin(rec.getNum() - 1);
		form.setNumMax(rec.getNum());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setNumMin(rec.getNum());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setNumMax(rec.getNum());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setNumMin(rec.getNum());
		form.setNumMax(rec.getNum());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testPriority() {
		// priority Integer 4
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setPriorityMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with priority of " + rec.getPriority());

		form = new RoamiospSearchForm();
		form.setPriorityMin(rec.getPriority());
		form.setPriorityMax(rec.getPriority() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setPriorityMin(rec.getPriority() - 1);
		form.setPriorityMax(rec.getPriority());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setPriorityMin(rec.getPriority());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setPriorityMax(rec.getPriority());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setPriorityMin(rec.getPriority());
		form.setPriorityMax(rec.getPriority());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testRecord() {
		// record String 12
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setRecord("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with record of " + rec.getRecord());

		form = new RoamiospSearchForm();
		String text = rec.getRecord();
		if (text.length() < 2) {
			form.setRecord(text + "%");
			confirmGotResult(form, rec.getId());

			form.setRecord("%" + text);
			confirmGotResult(form, rec.getId());
			form.setRecord("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setRecord(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setRecord("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setRecord("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testSeason() {
		// season Integer 4
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setSeasonMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with season of " + rec.getSeason());

		form = new RoamiospSearchForm();
		form.setSeasonMin(rec.getSeason());
		form.setSeasonMax(rec.getSeason() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setSeasonMin(rec.getSeason() - 1);
		form.setSeasonMax(rec.getSeason());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setSeasonMin(rec.getSeason());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setSeasonMax(rec.getSeason());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setSeasonMin(rec.getSeason());
		form.setSeasonMax(rec.getSeason());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testShow() {
		// show String 12
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setShow("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with show of " + rec.getShow());

		form = new RoamiospSearchForm();
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
	public void testStart() {
		// start Integer 4
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
		form.setStartMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with start of " + rec.getStart());

		form = new RoamiospSearchForm();
		form.setStartMin(rec.getStart());
		form.setStartMax(rec.getStart() + 1);
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setStartMin(rec.getStart() - 1);
		form.setStartMax(rec.getStart());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setStartMin(rec.getStart());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setStartMax(rec.getStart());
		confirmGotResult(form, rec.getId());

		form = new RoamiospSearchForm();
		form.setStartMin(rec.getStart());
		form.setStartMax(rec.getStart());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testAccount() {
		// account Account 4
		Roamiosp rec = null;
		RoamiospSearchForm form = new RoamiospSearchForm();
		rec = getMidRecord(form, 0);
// TODO: skip further tests now
	}
}
