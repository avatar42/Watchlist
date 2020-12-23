package com.dea42.watchlist.search;


import com.dea42.watchlist.UnitBase;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.search.OtaSearchForm;
import com.dea42.watchlist.service.OtaServices;
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
 * Title: otaSearch Test <br>
 * Description: Does regression tests of ota search from service to DB <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtaSearchTest extends UnitBase {

	@Autowired
	private OtaServices otaServices;

	private Page<Ota> confirmGotResult(OtaSearchForm form, Integer expectedID) {
		log.info("form:"+form);
		Page<Ota> list = otaServices.listAll(form);
		assertNotNull("Checking return not null", list);
		assertTrue("Checking at least 1 return", list.toList().size() > 0);
		if (expectedID > 0) {
			boolean found = false;
			for (Ota s2 : list) {
				if (s2.getId().equals(expectedID))
					found = true;
				log.info(s2.toString());
			}

			assertTrue("Looking for record ID " + expectedID + " in results", found);
		}
		return list;
	}

	private Ota getMidRecord(OtaSearchForm form, Integer expectedID) {
		Page<Ota> list = confirmGotResult(form, expectedID);
		assertNotNull("Checking return not null", list);
		int size = list.toList().size();
		assertTrue("Checking at least 1 return", size > 0);
		int record = 0;
		if (size > 2)
			record = size / 2;
		return list.toList().get(record);


	}

	@Test
	public void testAtticant() {
		// atticant Integer 4
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setAtticantMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with atticant of " + rec.getAtticant());

		form = new OtaSearchForm();
		form.setAtticantMin(rec.getAtticant());
		form.setAtticantMax(rec.getAtticant() + 1);
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setAtticantMin(rec.getAtticant() - 1);
		form.setAtticantMax(rec.getAtticant());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setAtticantMin(rec.getAtticant());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setAtticantMax(rec.getAtticant());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setAtticantMin(rec.getAtticant());
		form.setAtticantMax(rec.getAtticant());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testChan() {
		// chan Integer 4
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setChanMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with chan of " + rec.getChan());

		form = new OtaSearchForm();
		form.setChanMin(rec.getChan());
		form.setChanMax(rec.getChan() + 1);
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setChanMin(rec.getChan() - 1);
		form.setChanMax(rec.getChan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setChanMin(rec.getChan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setChanMax(rec.getChan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setChanMin(rec.getChan());
		form.setChanMax(rec.getChan());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testChannelname() {
		// channelname String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannelname("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channelname of " + rec.getChannelname());

		form = new OtaSearchForm();
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
		// channelnumber String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannelnumber("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channelnumber of " + rec.getChannelnumber());

		form = new OtaSearchForm();
		String text = rec.getChannelnumber();
		if (text.length() < 2) {
			form.setChannelnumber(text + "%");
			confirmGotResult(form, rec.getId());

			form.setChannelnumber("%" + text);
			confirmGotResult(form, rec.getId());
			form.setChannelnumber("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setChannelnumber(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setChannelnumber("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setChannelnumber("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testChannelnumberchannelnameincluded() {
		// channelnumberchannelnameincluded String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setChannelnumberchannelnameincluded("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with channelnumberchannelnameincluded of " + rec.getChannelnumberchannelnameincluded());

		form = new OtaSearchForm();
		String text = rec.getChannelnumberchannelnameincluded();
		if (text.length() < 2) {
			form.setChannelnumberchannelnameincluded(text + "%");
			confirmGotResult(form, rec.getId());

			form.setChannelnumberchannelnameincluded("%" + text);
			confirmGotResult(form, rec.getId());
			form.setChannelnumberchannelnameincluded("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setChannelnumberchannelnameincluded(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setChannelnumberchannelnameincluded("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setChannelnumberchannelnameincluded("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testComments() {
		// comments String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setComments("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with comments of " + rec.getComments());

		form = new OtaSearchForm();
		String text = rec.getComments();
		if (text.length() < 2) {
			form.setComments(text + "%");
			confirmGotResult(form, rec.getId());

			form.setComments("%" + text);
			confirmGotResult(form, rec.getId());
			form.setComments("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setComments(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setComments("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setComments("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testDirection() {
		// direction String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setDirection("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with direction of " + rec.getDirection());

		form = new OtaSearchForm();
		String text = rec.getDirection();
		if (text.length() < 2) {
			form.setDirection(text + "%");
			confirmGotResult(form, rec.getId());

			form.setDirection("%" + text);
			confirmGotResult(form, rec.getId());
			form.setDirection("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setDirection(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setDirection("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setDirection("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testEnabled() {
		// enabled String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setEnabled("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with enabled of " + rec.getEnabled());

		form = new OtaSearchForm();
		String text = rec.getEnabled();
		if (text.length() < 2) {
			form.setEnabled(text + "%");
			confirmGotResult(form, rec.getId());

			form.setEnabled("%" + text);
			confirmGotResult(form, rec.getId());
			form.setEnabled("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setEnabled(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setEnabled("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setEnabled("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testFccinfo() {
		// fccinfo String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setFccinfo("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with fccinfo of " + rec.getFccinfo());

		form = new OtaSearchForm();
		String text = rec.getFccinfo();
		if (text.length() < 2) {
			form.setFccinfo(text + "%");
			confirmGotResult(form, rec.getId());

			form.setFccinfo("%" + text);
			confirmGotResult(form, rec.getId());
			form.setFccinfo("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setFccinfo(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setFccinfo("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setFccinfo("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testFccinfolink() {
		// fccinfolink String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setFccinfolink("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with fccinfolink of " + rec.getFccinfolink());

		form = new OtaSearchForm();
		String text = rec.getFccinfolink();
		if (text.length() < 2) {
			form.setFccinfolink(text + "%");
			confirmGotResult(form, rec.getId());

			form.setFccinfolink("%" + text);
			confirmGotResult(form, rec.getId());
			form.setFccinfolink("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setFccinfolink(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setFccinfolink("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setFccinfolink("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testFreq() {
		// freq Integer 4
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setFreqMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with freq of " + rec.getFreq());

		form = new OtaSearchForm();
		form.setFreqMin(rec.getFreq());
		form.setFreqMax(rec.getFreq() + 1);
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setFreqMin(rec.getFreq() - 1);
		form.setFreqMax(rec.getFreq());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setFreqMin(rec.getFreq());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setFreqMax(rec.getFreq());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setFreqMin(rec.getFreq());
		form.setFreqMax(rec.getFreq());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testLang() {
		// lang String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setLang("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with lang of " + rec.getLang());

		form = new OtaSearchForm();
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
	public void testListed() {
		// listed Integer 4
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setListedMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with listed of " + rec.getListed());

		form = new OtaSearchForm();
		form.setListedMin(rec.getListed());
		form.setListedMax(rec.getListed() + 1);
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setListedMin(rec.getListed() - 1);
		form.setListedMax(rec.getListed());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setListedMin(rec.getListed());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setListedMax(rec.getListed());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setListedMin(rec.getListed());
		form.setListedMax(rec.getListed());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testMytivoavgstrength() {
		// mytivoavgstrength Integer 4
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setMytivoavgstrengthMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with mytivoavgstrength of " + rec.getMytivoavgstrength());

		form = new OtaSearchForm();
		form.setMytivoavgstrengthMin(rec.getMytivoavgstrength());
		form.setMytivoavgstrengthMax(rec.getMytivoavgstrength() + 1);
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setMytivoavgstrengthMin(rec.getMytivoavgstrength() - 1);
		form.setMytivoavgstrengthMax(rec.getMytivoavgstrength());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setMytivoavgstrengthMin(rec.getMytivoavgstrength());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setMytivoavgstrengthMax(rec.getMytivoavgstrength());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setMytivoavgstrengthMin(rec.getMytivoavgstrength());
		form.setMytivoavgstrengthMax(rec.getMytivoavgstrength());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testNetwork() {
		// network String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setNetwork("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with network of " + rec.getNetwork());

		form = new OtaSearchForm();
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
	public void testOff() {
		// off String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setOff("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with off of " + rec.getOff());

		form = new OtaSearchForm();
		String text = rec.getOff();
		if (text.length() < 2) {
			form.setOff(text + "%");
			confirmGotResult(form, rec.getId());

			form.setOff("%" + text);
			confirmGotResult(form, rec.getId());
			form.setOff("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setOff(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setOff("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setOff("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testRecommendedantenna() {
		// recommendedantenna String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setRecommendedantenna("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with recommendedantenna of " + rec.getRecommendedantenna());

		form = new OtaSearchForm();
		String text = rec.getRecommendedantenna();
		if (text.length() < 2) {
			form.setRecommendedantenna(text + "%");
			confirmGotResult(form, rec.getId());

			form.setRecommendedantenna("%" + text);
			confirmGotResult(form, rec.getId());
			form.setRecommendedantenna("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setRecommendedantenna(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setRecommendedantenna("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setRecommendedantenna("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testRez() {
		// rez String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setRez("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with rez of " + rec.getRez());

		form = new OtaSearchForm();
		String text = rec.getRez();
		if (text.length() < 2) {
			form.setRez(text + "%");
			confirmGotResult(form, rec.getId());

			form.setRez("%" + text);
			confirmGotResult(form, rec.getId());
			form.setRez("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setRez(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setRez("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setRez("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testStation() {
		// station String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setStation("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with station of " + rec.getStation());

		form = new OtaSearchForm();
		String text = rec.getStation();
		if (text.length() < 2) {
			form.setStation(text + "%");
			confirmGotResult(form, rec.getId());

			form.setStation("%" + text);
			confirmGotResult(form, rec.getId());
			form.setStation("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setStation(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setStation("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setStation("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testSubchan() {
		// subchan Integer 4
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setSubchanMin(Integer.MIN_VALUE);
		rec = getMidRecord(form, 0);
		log.info("Searching for records with subchan of " + rec.getSubchan());

		form = new OtaSearchForm();
		form.setSubchanMin(rec.getSubchan());
		form.setSubchanMax(rec.getSubchan() + 1);
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setSubchanMin(rec.getSubchan() - 1);
		form.setSubchanMax(rec.getSubchan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setSubchanMin(rec.getSubchan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setSubchanMax(rec.getSubchan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setSubchanMin(rec.getSubchan());
		form.setSubchanMax(rec.getSubchan());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testTvfoolchan() {
		// tvfoolchan BigDecimal 6
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setTvfoolchanMin(new BigDecimal(Integer.MIN_VALUE));
		rec = getMidRecord(form, 0);
		log.info("Searching for records with tvfoolchan of " + rec.getTvfoolchan());

		form = new OtaSearchForm();
		form.setTvfoolchanMin(rec.getTvfoolchan());
		form.setTvfoolchanMax(rec.getTvfoolchan().add(new BigDecimal(100)));
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setTvfoolchanMin(rec.getTvfoolchan().subtract(new BigDecimal(100)));
		form.setTvfoolchanMax(rec.getTvfoolchan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setTvfoolchanMin(rec.getTvfoolchan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setTvfoolchanMax(rec.getTvfoolchan());
		confirmGotResult(form, rec.getId());

		form = new OtaSearchForm();
		form.setTvfoolchanMin(rec.getTvfoolchan());
		form.setTvfoolchanMax(rec.getTvfoolchan());
		confirmGotResult(form, rec.getId());
	}

	@Test
	public void testTvfoolestsignal() {
		// tvfoolestsignal String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setTvfoolestsignal("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with tvfoolestsignal of " + rec.getTvfoolestsignal());

		form = new OtaSearchForm();
		String text = rec.getTvfoolestsignal();
		if (text.length() < 2) {
			form.setTvfoolestsignal(text + "%");
			confirmGotResult(form, rec.getId());

			form.setTvfoolestsignal("%" + text);
			confirmGotResult(form, rec.getId());
			form.setTvfoolestsignal("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setTvfoolestsignal(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setTvfoolestsignal("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setTvfoolestsignal("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testAccount() {
		// account Account 4
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
// TODO: skip further tests now
	}

	@Test
	public void testWatchabletablo() {
		// watchabletablo String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setWatchabletablo("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with watchabletablo of " + rec.getWatchabletablo());

		form = new OtaSearchForm();
		String text = rec.getWatchabletablo();
		if (text.length() < 2) {
			form.setWatchabletablo(text + "%");
			confirmGotResult(form, rec.getId());

			form.setWatchabletablo("%" + text);
			confirmGotResult(form, rec.getId());
			form.setWatchabletablo("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setWatchabletablo(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setWatchabletablo("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setWatchabletablo("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}

	@Test
	public void testWatchabletivo() {
		// watchabletivo String 12
		Ota rec = null;
		OtaSearchForm form = new OtaSearchForm();
		rec = getMidRecord(form, 0);
		form.setWatchabletivo("%");
		rec = getMidRecord(form, 0);
		log.info("Searching for records with watchabletivo of " + rec.getWatchabletivo());

		form = new OtaSearchForm();
		String text = rec.getWatchabletivo();
		if (text.length() < 2) {
			form.setWatchabletivo(text + "%");
			confirmGotResult(form, rec.getId());

			form.setWatchabletivo("%" + text);
			confirmGotResult(form, rec.getId());
			form.setWatchabletivo("%" + text + "%");
			confirmGotResult(form, rec.getId());
		} else {
			int mid = text.length() / 2;
			form.setWatchabletivo(text.substring(0, mid) + "%");
			confirmGotResult(form, rec.getId());

			form.setWatchabletivo("%" + text.substring(mid - 1, mid) + "%");
			confirmGotResult(form, rec.getId());
			form.setWatchabletivo("%" + text.substring(mid, text.length()));
			confirmGotResult(form, rec.getId());
		}
	}
}
