package com.dea42.watchlist.controller;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Date;

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.form.ShowsForm;
import com.dea42.watchlist.service.ShowsServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: ShowsController <br>
 * Description: ShowsController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.2<br>
 * @version 0.5.2<br>
 */
@Slf4j
@Controller
@RequestMapping("/showss")
public class ShowsController {

	@Autowired
	private ShowsServices showsService;

	@GetMapping
	public String getAllShowss(Model model) {
		model.addAttribute("showss", this.showsService.listAll());
		return "showss";
	}

	@GetMapping("/new")
	public String showNewShowsPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new ShowsForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_shows".concat(" :: showsForm");
		}

		return "edit_shows";
	}

	@PostMapping(value = "/save")
	public String saveShows(@Valid @ModelAttribute ShowsForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_shows";
			}

			Shows shows = new Shows();
			shows.setAbc(form.getAbc());
			shows.setAbclink(form.getAbclink());
			shows.setAcorntv(form.getAcorntv());
			shows.setAcorntvlink(form.getAcorntvlink());
			shows.setAmazon(form.getAmazon());
			shows.setAmazonlink(form.getAmazonlink());
			shows.setAmc(form.getAmc());
			shows.setAmclink(form.getAmclink());
			shows.setBbca(form.getBbca());
			shows.setBbcalink(form.getBbcalink());
			shows.setBritbox(form.getBritbox());
			shows.setBritboxlink(form.getBritboxlink());
			shows.setBufferspace(form.getBufferspace());
			shows.setBufsp(form.getBufsp());
			shows.setCancelled(form.getCancelled());
			shows.setCbs(form.getCbs());
			shows.setCbslink(form.getCbslink());
			shows.setCc(form.getCc());
			shows.setCclink(form.getCclink());
			shows.setColg(form.getColg());
			shows.setCw(form.getCw());
			shows.setCwlink(form.getCwlink());
			shows.setDiff(form.getDiff());
			shows.setEpguidesshowname(form.getEpguidesshowname());
			shows.setEpguidesshownamelink(form.getEpguidesshownamelink());
			shows.setFreeformabcf(form.getFreeformabcf());
			shows.setFreeformabcflink(form.getFreeformabcflink());
			shows.setFx(form.getFx());
			shows.setFxlink(form.getFxlink());
			shows.setGoogleplay(form.getGoogleplay());
			shows.setGoogleplaylink(form.getGoogleplaylink());
			shows.setHbo(form.getHbo());
			shows.setHbolink(form.getHbolink());
			shows.setHuluplus(form.getHuluplus());
			shows.setHulupluslink(form.getHulupluslink());
			shows.setId(form.getId());
			shows.setIfc(form.getIfc());
			shows.setIfclink(form.getIfclink());
			shows.setIncanceledas(form.getIncanceledas());
			shows.setIncanceledaslink(form.getIncanceledaslink());
			shows.setIntodos(form.getIntodos());
			shows.setItunes(form.getItunes());
			shows.setItuneslink(form.getItuneslink());
			shows.setLastshow(form.getLastshow());
			shows.setLatestinroamionpl(form.getLatestinroamionpl());
			shows.setLep(form.getLep());
			shows.setLs(form.getLs());
			shows.setNatgeo(form.getNatgeo());
			shows.setNatgeolink(form.getNatgeolink());
			shows.setNbc(form.getNbc());
			shows.setNbclink(form.getNbclink());
			shows.setNetflix(form.getNetflix());
			shows.setNetflixlink(form.getNetflixlink());
			shows.setNetwork(form.getNetwork());
			shows.setNetworklink(form.getNetworklink());
			shows.setOnepasschan(form.getOnepasschan());
			shows.setPbs(form.getPbs());
			shows.setPbslink(form.getPbslink());
			shows.setPremiere(form.getPremiere());
			shows.setPremieredate(form.getPremieredate());
			shows.setRow(form.getRow());
			shows.setScience(form.getScience());
			shows.setSciencelink(form.getSciencelink());
			shows.setStatus(form.getStatus());
			shows.setSyfy(form.getSyfy());
			shows.setSyfylink(form.getSyfylink());
			shows.setTnt(form.getTnt());
			shows.setTntlink(form.getTntlink());
			shows.setTododate(form.getTododate());
			shows.setTvcom(form.getTvcom());
			shows.setTvcomlink(form.getTvcomlink());
			shows.setTwcondemand(form.getTwcondemand());
			shows.setTwcondemandlink(form.getTwcondemandlink());
			shows.setUsa(form.getUsa());
			shows.setUsalink(form.getUsalink());
			shows.setWatchedto(form.getWatchedto());
			shows.setWep(form.getWep());
			shows.setWs(form.getWs());
			shows.setXbox(form.getXbox());
			shows.setXboxlink(form.getXboxlink());
			shows.setYoutube(form.getYoutube());
			shows.setYoutubelink(form.getYoutubelink());
			try {
				shows = showsService.save(shows);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (shows == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/showss";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditShowsPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_shows");
		Shows shows = showsService.get(id);
		mav.addObject("showsForm", ShowsForm.getInstance(shows));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteShows(@PathVariable(name = "id") Integer id) {
		showsService.delete(id);
		return "redirect:/showss";
	}
}

