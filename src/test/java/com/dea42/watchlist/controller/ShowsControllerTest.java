package com.dea42.watchlist.controller;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.ResultActions;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;

import com.dea42.watchlist.MockBase;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.form.ShowsForm;

/**
 * Title: ShowsControllerTest <br>
 * Description: ShowsController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@WebMvcTest(ShowsController.class)
public class ShowsControllerTest extends MockBase {
	private Shows getShows(Integer id) {
		Shows o = new Shows();
		o.setId(id);
        o.setAbc(getTestString(16));
        o.setAbclink(getTestString(62));
        o.setAcorntv(getTestString(43));
        o.setAcorntvlink(getTestString(32));
        o.setAmazon(getTestString(35));
        o.setAmazonlink(getTestString(144));
        o.setAmc(getTestString(29));
        o.setAmclink(getTestString(70));
        o.setBbca(getTestString(29));
        o.setBbcalink(getTestString(70));
        o.setBritbox(getTestString(11));
        o.setBritboxlink(getTestString(54));
        o.setBufferspace(getTestString(20));
        o.setCancelled(getTestString(65));
        o.setCbs(getTestString(31));
        o.setCbslink(getTestString(60));
        o.setCc(getTestString(5));
        o.setCclink(getTestString(42));
        o.setColg(getTestString(65));
        o.setCw(getTestString(6));
        o.setCwlink(getTestString(43));
        o.setDiff(getTestString(1));
        o.setEpguidesshowname(getTestString(47));
        o.setEpguidesshownamelink(getTestString(60));
        o.setFreeformabcf(getTestString(3));
        o.setFreeformabcflink(getTestString(52));
        o.setFx(getTestString(12));
        o.setFxlink(getTestString(51));
        o.setGoogleplay(getTestString(6));
        o.setGoogleplaylink(getTestString(103));
        o.setHbo(getTestString(14));
        o.setHbolink(getTestString(65));
        o.setHuluplus(getTestString(37));
        o.setHulupluslink(getTestString(53));
        o.setIfc(getTestString(20));
        o.setIfclink(getTestString(35));
        o.setIncanceledas(getTestString(47));
        o.setIncanceledaslink(getTestString(70));
        o.setIntodos(getTestString(14));
        o.setItunes(getTestString(29));
        o.setItuneslink(getTestString(73));
        o.setLastshow(getTestString(10));
        o.setLatestinroamionpl(getTestString(8));
        o.setLs(getTestString(1));
        o.setNatgeo(getTestString(11));
        o.setNatgeolink(getTestString(55));
        o.setNbc(getTestString(21));
        o.setNbclink(getTestString(64));
        o.setNetflix(getTestString(15));
        o.setNetflixlink(getTestString(115));
        o.setNetwork(getTestString(14));
        o.setNetworklink(getTestString(306));
        o.setOnepasschan(getTestString(4));
        o.setPbs(getTestString(12));
        o.setPbslink(getTestString(29));
        o.setPremiere(getTestString(65));
        o.setScience(getTestString(11));
        o.setSciencelink(getTestString(74));
        o.setStatus(getTestString(65));
        o.setSyfy(getTestString(33));
        o.setSyfylink(getTestString(41));
        o.setTnt(getTestString(6));
        o.setTntlink(getTestString(49));
        o.setTododate(getTestString(1));
        o.setTvcom(getTestString(28));
        o.setTvcomlink(getTestString(69));
        o.setTwcondemand(getTestString(39));
        o.setTwcondemandlink(getTestString(230));
        o.setUsa(getTestString(11));
        o.setUsalink(getTestString(42));
        o.setWatchedto(getTestString(1));
        o.setWs(getTestString(1));
        o.setXbox(getTestString(6));
        o.setXboxlink(getTestString(67));
        o.setYoutube(getTestString(6));
        o.setYoutubelink(getTestString(62));
		return o;
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#getAllShowss(org.springframework.ui.Model)}.
	 */
	@Test
	public void testGetAllShowss() throws Exception {
		List<Shows> list = new ArrayList<>();
		Shows o = getShows(1);
		list.add(o);

		given(showsServices.listAll()).willReturn(list);

		ResultActions ra = getAsAdmin("/showss");
		contentContainsMarkup(ra,"<h1>" + getMsg("class.Shows") + " " + getMsg("edit.list") + "</h1>");
		contentContainsMarkup(ra,getTestString(16));
		contentContainsMarkup(ra,getMsg("Shows.abc"));
		contentContainsMarkup(ra,getTestString(62));
		contentContainsMarkup(ra,getTestString(43));
		contentContainsMarkup(ra,getMsg("Shows.acorntv"));
		contentContainsMarkup(ra,getTestString(32));
		contentContainsMarkup(ra,getTestString(35));
		contentContainsMarkup(ra,getMsg("Shows.amazon"));
		contentContainsMarkup(ra,getTestString(144));
		contentContainsMarkup(ra,getTestString(29));
		contentContainsMarkup(ra,getMsg("Shows.amc"));
		contentContainsMarkup(ra,getTestString(70));
		contentContainsMarkup(ra,getTestString(29));
		contentContainsMarkup(ra,getMsg("Shows.bbca"));
		contentContainsMarkup(ra,getTestString(70));
		contentContainsMarkup(ra,getTestString(11));
		contentContainsMarkup(ra,getMsg("Shows.britbox"));
		contentContainsMarkup(ra,getTestString(54));
		contentContainsMarkup(ra,getTestString(20));
		contentContainsMarkup(ra,getMsg("Shows.bufferspace"));
		contentContainsMarkup(ra,getMsg("Shows.bufsp"));
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,getMsg("Shows.cancelled"));
		contentContainsMarkup(ra,getTestString(31));
		contentContainsMarkup(ra,getMsg("Shows.cbs"));
		contentContainsMarkup(ra,getTestString(60));
		contentContainsMarkup(ra,getTestString(5));
		contentContainsMarkup(ra,getMsg("Shows.cc"));
		contentContainsMarkup(ra,getTestString(42));
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,getMsg("Shows.colg"));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Shows.cw"));
		contentContainsMarkup(ra,getTestString(43));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Shows.diff"));
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,getMsg("Shows.epguidesshowname"));
		contentContainsMarkup(ra,getTestString(60));
		contentContainsMarkup(ra,getTestString(3));
		contentContainsMarkup(ra,getMsg("Shows.freeformabcf"));
		contentContainsMarkup(ra,getTestString(52));
		contentContainsMarkup(ra,getTestString(12));
		contentContainsMarkup(ra,getMsg("Shows.fx"));
		contentContainsMarkup(ra,getTestString(51));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Shows.googleplay"));
		contentContainsMarkup(ra,getTestString(103));
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,getMsg("Shows.hbo"));
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,getTestString(37));
		contentContainsMarkup(ra,getMsg("Shows.huluplus"));
		contentContainsMarkup(ra,getTestString(53));
		contentContainsMarkup(ra,getTestString(20));
		contentContainsMarkup(ra,getMsg("Shows.ifc"));
		contentContainsMarkup(ra,getTestString(35));
		contentContainsMarkup(ra,getTestString(47));
		contentContainsMarkup(ra,getMsg("Shows.incanceledas"));
		contentContainsMarkup(ra,getTestString(70));
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,getMsg("Shows.intodos"));
		contentContainsMarkup(ra,getTestString(29));
		contentContainsMarkup(ra,getMsg("Shows.itunes"));
		contentContainsMarkup(ra,getTestString(73));
		contentContainsMarkup(ra,getTestString(10));
		contentContainsMarkup(ra,getMsg("Shows.lastshow"));
		contentContainsMarkup(ra,getTestString(8));
		contentContainsMarkup(ra,getMsg("Shows.latestinroamionpl"));
		contentContainsMarkup(ra,getMsg("Shows.lep"));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Shows.ls"));
		contentContainsMarkup(ra,getTestString(11));
		contentContainsMarkup(ra,getMsg("Shows.natgeo"));
		contentContainsMarkup(ra,getTestString(55));
		contentContainsMarkup(ra,getTestString(21));
		contentContainsMarkup(ra,getMsg("Shows.nbc"));
		contentContainsMarkup(ra,getTestString(64));
		contentContainsMarkup(ra,getTestString(15));
		contentContainsMarkup(ra,getMsg("Shows.netflix"));
		contentContainsMarkup(ra,getTestString(115));
		contentContainsMarkup(ra,getTestString(14));
		contentContainsMarkup(ra,getMsg("Shows.network"));
		contentContainsMarkup(ra,getTestString(306));
		contentContainsMarkup(ra,getTestString(4));
		contentContainsMarkup(ra,getMsg("Shows.onepasschan"));
		contentContainsMarkup(ra,getTestString(12));
		contentContainsMarkup(ra,getMsg("Shows.pbs"));
		contentContainsMarkup(ra,getTestString(29));
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,getMsg("Shows.premiere"));
		contentContainsMarkup(ra,getMsg("Shows.premieredate"));
		contentContainsMarkup(ra,getMsg("Shows.row"));
		contentContainsMarkup(ra,getTestString(11));
		contentContainsMarkup(ra,getMsg("Shows.science"));
		contentContainsMarkup(ra,getTestString(74));
		contentContainsMarkup(ra,getTestString(65));
		contentContainsMarkup(ra,getMsg("Shows.status"));
		contentContainsMarkup(ra,getTestString(33));
		contentContainsMarkup(ra,getMsg("Shows.syfy"));
		contentContainsMarkup(ra,getTestString(41));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Shows.tnt"));
		contentContainsMarkup(ra,getTestString(49));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Shows.tododate"));
		contentContainsMarkup(ra,getTestString(28));
		contentContainsMarkup(ra,getMsg("Shows.tvcom"));
		contentContainsMarkup(ra,getTestString(69));
		contentContainsMarkup(ra,getTestString(39));
		contentContainsMarkup(ra,getMsg("Shows.twcondemand"));
		contentContainsMarkup(ra,getTestString(230));
		contentContainsMarkup(ra,getTestString(11));
		contentContainsMarkup(ra,getMsg("Shows.usa"));
		contentContainsMarkup(ra,getTestString(42));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Shows.watchedto"));
		contentContainsMarkup(ra,getMsg("Shows.wep"));
		contentContainsMarkup(ra,getTestString(1));
		contentContainsMarkup(ra,getMsg("Shows.ws"));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Shows.xbox"));
		contentContainsMarkup(ra,getTestString(67));
		contentContainsMarkup(ra,getTestString(6));
		contentContainsMarkup(ra,getMsg("Shows.youtube"));
		contentContainsMarkup(ra,getTestString(62));
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#showNewShowsPage(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowNewShowsPage() throws Exception {
		ResultActions ra = getAsAdmin("/showss/new");
		contentContainsMarkup(ra,"<legend>" + getMsg("edit.new") + " " + getMsg("class.Shows") + "</legend>");
		contentContainsMarkup(ra,"Abc");
		contentContainsMarkup(ra,"Abclink");
		contentContainsMarkup(ra,"Acorntv");
		contentContainsMarkup(ra,"Acorntvlink");
		contentContainsMarkup(ra,"Amazon");
		contentContainsMarkup(ra,"Amazonlink");
		contentContainsMarkup(ra,"Amc");
		contentContainsMarkup(ra,"Amclink");
		contentContainsMarkup(ra,"Bbca");
		contentContainsMarkup(ra,"Bbcalink");
		contentContainsMarkup(ra,"Britbox");
		contentContainsMarkup(ra,"Britboxlink");
		contentContainsMarkup(ra,"Bufferspace");
		contentContainsMarkup(ra,"Bufsp");
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,"Cbs");
		contentContainsMarkup(ra,"Cbslink");
		contentContainsMarkup(ra,"Cc");
		contentContainsMarkup(ra,"Cclink");
		contentContainsMarkup(ra,"Colg");
		contentContainsMarkup(ra,"Cw");
		contentContainsMarkup(ra,"Cwlink");
		contentContainsMarkup(ra,"Diff");
		contentContainsMarkup(ra,"Epguidesshowname");
		contentContainsMarkup(ra,"Epguidesshownamelink");
		contentContainsMarkup(ra,"Freeformabcf");
		contentContainsMarkup(ra,"Freeformabcflink");
		contentContainsMarkup(ra,"Fx");
		contentContainsMarkup(ra,"Fxlink");
		contentContainsMarkup(ra,"Googleplay");
		contentContainsMarkup(ra,"Googleplaylink");
		contentContainsMarkup(ra,"Hbo");
		contentContainsMarkup(ra,"Hbolink");
		contentContainsMarkup(ra,"Huluplus");
		contentContainsMarkup(ra,"Hulupluslink");
		// TODO: confirm ignoring Shows.id
		contentContainsMarkup(ra,"Ifc");
		contentContainsMarkup(ra,"Ifclink");
		contentContainsMarkup(ra,"Incanceledas");
		contentContainsMarkup(ra,"Incanceledaslink");
		contentContainsMarkup(ra,"Intodos");
		contentContainsMarkup(ra,"Itunes");
		contentContainsMarkup(ra,"Ituneslink");
		contentContainsMarkup(ra,"Lastshow");
		contentContainsMarkup(ra,"Latestinroamionpl");
		contentContainsMarkup(ra,"Lep");
		contentContainsMarkup(ra,"Ls");
		contentContainsMarkup(ra,"Natgeo");
		contentContainsMarkup(ra,"Natgeolink");
		contentContainsMarkup(ra,"Nbc");
		contentContainsMarkup(ra,"Nbclink");
		contentContainsMarkup(ra,"Netflix");
		contentContainsMarkup(ra,"Netflixlink");
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,"Networklink");
		contentContainsMarkup(ra,"Onepasschan");
		contentContainsMarkup(ra,"Pbs");
		contentContainsMarkup(ra,"Pbslink");
		contentContainsMarkup(ra,"Premiere");
		contentContainsMarkup(ra,"Premieredate");
		contentContainsMarkup(ra,"Row");
		contentContainsMarkup(ra,"Science");
		contentContainsMarkup(ra,"Sciencelink");
		contentContainsMarkup(ra,"Status");
		contentContainsMarkup(ra,"Syfy");
		contentContainsMarkup(ra,"Syfylink");
		contentContainsMarkup(ra,"Tnt");
		contentContainsMarkup(ra,"Tntlink");
		contentContainsMarkup(ra,"Tododate");
		contentContainsMarkup(ra,"Tvcom");
		contentContainsMarkup(ra,"Tvcomlink");
		contentContainsMarkup(ra,"Twcondemand");
		contentContainsMarkup(ra,"Twcondemandlink");
		contentContainsMarkup(ra,"Usa");
		contentContainsMarkup(ra,"Usalink");
		contentContainsMarkup(ra,"Watchedto");
		contentContainsMarkup(ra,"Wep");
		contentContainsMarkup(ra,"Ws");
		contentContainsMarkup(ra,"Xbox");
		contentContainsMarkup(ra,"Xboxlink");
		contentContainsMarkup(ra,"Youtube");
		contentContainsMarkup(ra,"Youtubelink");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsCancel() throws Exception {
		Shows o = getShows(1);

		send(SEND_POST, "/showss/save", "shows", o, ImmutableMap.of("action", "cancel"), ADMIN_USER,
				"/showss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#saveShows(com.dea42.watchlist.entity.Shows, java.lang.String)}.
	 */
	@Test
	public void testSaveShowsSave() throws Exception {
		Shows o = getShows(0);
		ShowsForm form = ShowsForm.getInstance(o);
		log.debug(form.toString());

		send(SEND_POST, "/showss/save", "showsForm", form, ImmutableMap.of("action", "save"), ADMIN_USER,
				"/showss");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#showEditShowsPage(java.lang.Integer)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testShowEditShowsPage() throws Exception {
		Shows o = getShows(1);

		given(showsServices.get(1)).willReturn(o);

		ResultActions ra = getAsAdmin("/showss/edit/1");
		contentContainsMarkup(ra,o.getAbc());
		contentContainsMarkup(ra,"Abc");
		contentContainsMarkup(ra,o.getAbclink());
		contentContainsMarkup(ra,"Abclink");
		contentContainsMarkup(ra,o.getAcorntv());
		contentContainsMarkup(ra,"Acorntv");
		contentContainsMarkup(ra,o.getAcorntvlink());
		contentContainsMarkup(ra,"Acorntvlink");
		contentContainsMarkup(ra,o.getAmazon());
		contentContainsMarkup(ra,"Amazon");
		contentContainsMarkup(ra,o.getAmazonlink());
		contentContainsMarkup(ra,"Amazonlink");
		contentContainsMarkup(ra,o.getAmc());
		contentContainsMarkup(ra,"Amc");
		contentContainsMarkup(ra,o.getAmclink());
		contentContainsMarkup(ra,"Amclink");
		contentContainsMarkup(ra,o.getBbca());
		contentContainsMarkup(ra,"Bbca");
		contentContainsMarkup(ra,o.getBbcalink());
		contentContainsMarkup(ra,"Bbcalink");
		contentContainsMarkup(ra,o.getBritbox());
		contentContainsMarkup(ra,"Britbox");
		contentContainsMarkup(ra,o.getBritboxlink());
		contentContainsMarkup(ra,"Britboxlink");
		contentContainsMarkup(ra,o.getBufferspace());
		contentContainsMarkup(ra,"Bufferspace");
		contentContainsMarkup(ra,"Bufsp");
		contentContainsMarkup(ra,o.getCancelled());
		contentContainsMarkup(ra,"Cancelled");
		contentContainsMarkup(ra,o.getCbs());
		contentContainsMarkup(ra,"Cbs");
		contentContainsMarkup(ra,o.getCbslink());
		contentContainsMarkup(ra,"Cbslink");
		contentContainsMarkup(ra,o.getCc());
		contentContainsMarkup(ra,"Cc");
		contentContainsMarkup(ra,o.getCclink());
		contentContainsMarkup(ra,"Cclink");
		contentContainsMarkup(ra,o.getColg());
		contentContainsMarkup(ra,"Colg");
		contentContainsMarkup(ra,o.getCw());
		contentContainsMarkup(ra,"Cw");
		contentContainsMarkup(ra,o.getCwlink());
		contentContainsMarkup(ra,"Cwlink");
		contentContainsMarkup(ra,o.getDiff());
		contentContainsMarkup(ra,"Diff");
		contentContainsMarkup(ra,o.getEpguidesshowname());
		contentContainsMarkup(ra,"Epguidesshowname");
		contentContainsMarkup(ra,o.getEpguidesshownamelink());
		contentContainsMarkup(ra,"Epguidesshownamelink");
		contentContainsMarkup(ra,o.getFreeformabcf());
		contentContainsMarkup(ra,"Freeformabcf");
		contentContainsMarkup(ra,o.getFreeformabcflink());
		contentContainsMarkup(ra,"Freeformabcflink");
		contentContainsMarkup(ra,o.getFx());
		contentContainsMarkup(ra,"Fx");
		contentContainsMarkup(ra,o.getFxlink());
		contentContainsMarkup(ra,"Fxlink");
		contentContainsMarkup(ra,o.getGoogleplay());
		contentContainsMarkup(ra,"Googleplay");
		contentContainsMarkup(ra,o.getGoogleplaylink());
		contentContainsMarkup(ra,"Googleplaylink");
		contentContainsMarkup(ra,o.getHbo());
		contentContainsMarkup(ra,"Hbo");
		contentContainsMarkup(ra,o.getHbolink());
		contentContainsMarkup(ra,"Hbolink");
		contentContainsMarkup(ra,o.getHuluplus());
		contentContainsMarkup(ra,"Huluplus");
		contentContainsMarkup(ra,o.getHulupluslink());
		contentContainsMarkup(ra,"Hulupluslink");
		// TODO: confirm ignoring Shows.id
		contentContainsMarkup(ra,o.getIfc());
		contentContainsMarkup(ra,"Ifc");
		contentContainsMarkup(ra,o.getIfclink());
		contentContainsMarkup(ra,"Ifclink");
		contentContainsMarkup(ra,o.getIncanceledas());
		contentContainsMarkup(ra,"Incanceledas");
		contentContainsMarkup(ra,o.getIncanceledaslink());
		contentContainsMarkup(ra,"Incanceledaslink");
		contentContainsMarkup(ra,o.getIntodos());
		contentContainsMarkup(ra,"Intodos");
		contentContainsMarkup(ra,o.getItunes());
		contentContainsMarkup(ra,"Itunes");
		contentContainsMarkup(ra,o.getItuneslink());
		contentContainsMarkup(ra,"Ituneslink");
		contentContainsMarkup(ra,o.getLastshow());
		contentContainsMarkup(ra,"Lastshow");
		contentContainsMarkup(ra,o.getLatestinroamionpl());
		contentContainsMarkup(ra,"Latestinroamionpl");
		contentContainsMarkup(ra,"Lep");
		contentContainsMarkup(ra,o.getLs());
		contentContainsMarkup(ra,"Ls");
		contentContainsMarkup(ra,o.getNatgeo());
		contentContainsMarkup(ra,"Natgeo");
		contentContainsMarkup(ra,o.getNatgeolink());
		contentContainsMarkup(ra,"Natgeolink");
		contentContainsMarkup(ra,o.getNbc());
		contentContainsMarkup(ra,"Nbc");
		contentContainsMarkup(ra,o.getNbclink());
		contentContainsMarkup(ra,"Nbclink");
		contentContainsMarkup(ra,o.getNetflix());
		contentContainsMarkup(ra,"Netflix");
		contentContainsMarkup(ra,o.getNetflixlink());
		contentContainsMarkup(ra,"Netflixlink");
		contentContainsMarkup(ra,o.getNetwork());
		contentContainsMarkup(ra,"Network");
		contentContainsMarkup(ra,o.getNetworklink());
		contentContainsMarkup(ra,"Networklink");
		contentContainsMarkup(ra,o.getOnepasschan());
		contentContainsMarkup(ra,"Onepasschan");
		contentContainsMarkup(ra,o.getPbs());
		contentContainsMarkup(ra,"Pbs");
		contentContainsMarkup(ra,o.getPbslink());
		contentContainsMarkup(ra,"Pbslink");
		contentContainsMarkup(ra,o.getPremiere());
		contentContainsMarkup(ra,"Premiere");
		contentContainsMarkup(ra,"Premieredate");
		contentContainsMarkup(ra,"Row");
		contentContainsMarkup(ra,o.getScience());
		contentContainsMarkup(ra,"Science");
		contentContainsMarkup(ra,o.getSciencelink());
		contentContainsMarkup(ra,"Sciencelink");
		contentContainsMarkup(ra,o.getStatus());
		contentContainsMarkup(ra,"Status");
		contentContainsMarkup(ra,o.getSyfy());
		contentContainsMarkup(ra,"Syfy");
		contentContainsMarkup(ra,o.getSyfylink());
		contentContainsMarkup(ra,"Syfylink");
		contentContainsMarkup(ra,o.getTnt());
		contentContainsMarkup(ra,"Tnt");
		contentContainsMarkup(ra,o.getTntlink());
		contentContainsMarkup(ra,"Tntlink");
		contentContainsMarkup(ra,o.getTododate());
		contentContainsMarkup(ra,"Tododate");
		contentContainsMarkup(ra,o.getTvcom());
		contentContainsMarkup(ra,"Tvcom");
		contentContainsMarkup(ra,o.getTvcomlink());
		contentContainsMarkup(ra,"Tvcomlink");
		contentContainsMarkup(ra,o.getTwcondemand());
		contentContainsMarkup(ra,"Twcondemand");
		contentContainsMarkup(ra,o.getTwcondemandlink());
		contentContainsMarkup(ra,"Twcondemandlink");
		contentContainsMarkup(ra,o.getUsa());
		contentContainsMarkup(ra,"Usa");
		contentContainsMarkup(ra,o.getUsalink());
		contentContainsMarkup(ra,"Usalink");
		contentContainsMarkup(ra,o.getWatchedto());
		contentContainsMarkup(ra,"Watchedto");
		contentContainsMarkup(ra,"Wep");
		contentContainsMarkup(ra,o.getWs());
		contentContainsMarkup(ra,"Ws");
		contentContainsMarkup(ra,o.getXbox());
		contentContainsMarkup(ra,"Xbox");
		contentContainsMarkup(ra,o.getXboxlink());
		contentContainsMarkup(ra,"Xboxlink");
		contentContainsMarkup(ra,o.getYoutube());
		contentContainsMarkup(ra,"Youtube");
		contentContainsMarkup(ra,o.getYoutubelink());
		contentContainsMarkup(ra,"Youtubelink");
	}

	/**
	 * Test method for
	 * {@link com.dea42.watchlist.controller.ShowsController#deleteShows(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteShows() throws Exception {
		getAsAdminRedirectExpected("/showss/delete/1","/showss");
	}

}

