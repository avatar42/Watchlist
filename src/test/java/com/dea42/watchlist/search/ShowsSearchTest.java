package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.search.ShowsSearchForm;
import com.dea42.watchlist.service.ShowsServices;
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
 * Title: ShowsSearch Test <br>
 * Description: Does regression tests of Shows search from service to DB <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowsSearchTest extends UnitBase {

	@Autowired
	private ShowsServices showsServices;

	private Page<Shows> confirmGotResult(ShowsSearchForm form, Long expectedID) {
		log.info("form:"+form);
		Page<Shows> list = showsServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Shows s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Shows getMidRecord(ShowsSearchForm form, Long expectedID) {
		Page<Shows> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testCancelled() {
		// cancelled String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setCancelled("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with cancelled of " + rec.getCancelled());

		form = new ShowsSearchForm();
		String text = rec.getCancelled();
		if (text.length() < 2) {
			form.setCancelled(text + "%");
			confirmGotResult(form, rec.getId());

			form.setCancelled("%" + text);
			confirmGotResult(form, rec.getId());
			form.setCancelled("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setCancelled(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setCancelled("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setCancelled("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testEpguidesshowname() {
		// epguidesshowname String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setEpguidesshowname("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with epguidesshowname of " + rec.getEpguidesshowname());

		form = new ShowsSearchForm();
		String text = rec.getEpguidesshowname();
		if (text.length() < 2) {
			form.setEpguidesshowname(text + "%");
			confirmGotResult(form, rec.getId());

			form.setEpguidesshowname("%" + text);
			confirmGotResult(form, rec.getId());
			form.setEpguidesshowname("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setEpguidesshowname(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setEpguidesshowname("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setEpguidesshowname("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testIncanceledas() {
		// incanceledas String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setIncanceledas("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with incanceledas of " + rec.getIncanceledas());

		form = new ShowsSearchForm();
		String text = rec.getIncanceledas();
		if (text.length() < 2) {
			form.setIncanceledas(text + "%");
			confirmGotResult(form, rec.getId());

			form.setIncanceledas("%" + text);
			confirmGotResult(form, rec.getId());
			form.setIncanceledas("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setIncanceledas(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setIncanceledas("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setIncanceledas("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testLastshow() {
		// lastshow String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setLastshow("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with lastshow of " + rec.getLastshow());

		form = new ShowsSearchForm();
		String text = rec.getLastshow();
		if (text.length() < 2) {
			form.setLastshow(text + "%");
			confirmGotResult(form, rec.getId());

			form.setLastshow("%" + text);
			confirmGotResult(form, rec.getId());
			form.setLastshow("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setLastshow(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setLastshow("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setLastshow("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testNetwork() {
		// network String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setNetwork("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with network of " + rec.getNetwork());

		form = new ShowsSearchForm();
		String text = rec.getNetwork();
		if (text.length() < 2) {
			form.setNetwork(text + "%");
			confirmGotResult(form, rec.getId());

			form.setNetwork("%" + text);
			confirmGotResult(form, rec.getId());
			form.setNetwork("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setNetwork(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setNetwork("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setNetwork("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testPremiere() {
		// premiere String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setPremiere("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with premiere of " + rec.getPremiere());

		form = new ShowsSearchForm();
		String text = rec.getPremiere();
		if (text.length() < 2) {
			form.setPremiere(text + "%");
			confirmGotResult(form, rec.getId());

			form.setPremiere("%" + text);
			confirmGotResult(form, rec.getId());
			form.setPremiere("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setPremiere(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setPremiere("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setPremiere("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testPremieredate() {
		// premieredate Date 93
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setPremieredateMin(new Date(0));
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with premieredate of " + rec.getPremieredate());

		form = new ShowsSearchForm();
		form.setPremieredateMin(rec.getPremieredate());
		form.setPremieredateMax(new Date(rec.getPremieredate().getTime() + DAY));
		confirmGotResult(form, rec.getId());

		form = new ShowsSearchForm();
		form.setPremieredateMin(new Date(rec.getPremieredate().getTime() - DAY));
		form.setPremieredateMax(rec.getPremieredate());
		confirmGotResult(form, rec.getId());

		form = new ShowsSearchForm();
		form.setPremieredateMin(rec.getPremieredate());
		confirmGotResult(form, rec.getId());

		form = new ShowsSearchForm();
		form.setPremieredateMax(rec.getPremieredate());
		confirmGotResult(form, rec.getId());

		form = new ShowsSearchForm();
		form.setPremieredateMin(rec.getPremieredate());
		form.setPremieredateMax(rec.getPremieredate());
		confirmGotResult(form, rec.getId());

	}

	@Test
	public void testStatus() {
		// status String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setStatus("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with status of " + rec.getStatus());

		form = new ShowsSearchForm();
		String text = rec.getStatus();
		if (text.length() < 2) {
			form.setStatus(text + "%");
			confirmGotResult(form, rec.getId());

			form.setStatus("%" + text);
			confirmGotResult(form, rec.getId());
			form.setStatus("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setStatus(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setStatus("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setStatus("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testTivoname() {
		// tivoname String 12
		Shows rec = null;
		ShowsSearchForm form = new ShowsSearchForm();
		rec = getMidRecord(form, 0l);
		form.setTivoname("%");
		rec = getMidRecord(form, 0l);
		log.info("Searching for records with tivoname of " + rec.getTivoname());

		form = new ShowsSearchForm();
		String text = rec.getTivoname();
		if (text.length() < 2) {
			form.setTivoname(text + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoname("%" + text);
			confirmGotResult(form, rec.getId());
			form.setTivoname("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setTivoname(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setTivoname("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setTivoname("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}
}
