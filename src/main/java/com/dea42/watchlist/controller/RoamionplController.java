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

import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.form.RoamionplForm;
import com.dea42.watchlist.service.RoamionplServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: RoamionplController <br>
 * Description: RoamionplController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Controller
@RequestMapping("/roamionpls")
public class RoamionplController {

	@Autowired
	private RoamionplServices roamionplService;

	@GetMapping
	public String getAllRoamionpls(Model model) {
		model.addAttribute("roamionpls", this.roamionplService.listAll());
		return "roamionpls";
	}

	@GetMapping("/new")
	public String showNewRoamionplPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new RoamionplForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_roamionpl".concat(" :: roamionplForm");
		}

		return "edit_roamionpl";
	}

	@PostMapping(value = "/save")
	public String saveRoamionpl(@Valid @ModelAttribute RoamionplForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_roamionpl";
			}

			Roamionpl roamionpl = new Roamionpl();
			roamionpl.setBitratembps(form.getBitratembps());
			roamionpl.setChan(form.getChan());
			roamionpl.setChannel(form.getChannel());
			roamionpl.setDate(form.getDate());
			roamionpl.setDuration(form.getDuration());
			roamionpl.setEpisode(form.getEpisode());
			roamionpl.setF(form.getF());
			roamionpl.setId(form.getId());
			roamionpl.setInnetworkstab(form.getInnetworkstab());
			roamionpl.setIsnew(form.getIsnew());
			roamionpl.setIsseries(form.getIsseries());
			roamionpl.setNetwork(form.getNetwork());
			roamionpl.setRowinshows(form.getRowinshows());
			roamionpl.setSeriesep(form.getSeriesep());
			roamionpl.setShow(form.getShow());
			roamionpl.setSizegb(form.getSizegb());
			roamionpl.setSortabledate(form.getSortabledate());
			roamionpl.setSpchannel0nosp(form.getSpchannel0nosp());
			roamionpl.setTitle(form.getTitle());
			roamionpl.setAccount(form.getAccount());
			roamionpl.setWatched(form.getWatched());
			roamionpl.setWatchedtime(form.getWatchedtime());
			try {
				roamionpl = roamionplService.save(roamionpl);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (roamionpl == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/roamionpls";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditRoamionplPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamionpl");
		Roamionpl roamionpl = roamionplService.get(id);
		mav.addObject("roamionplForm", RoamionplForm.getInstance(roamionpl));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteRoamionpl(@PathVariable(name = "id") Integer id) {
		roamionplService.delete(id);
		return "redirect:/roamionpls";
	}
}

