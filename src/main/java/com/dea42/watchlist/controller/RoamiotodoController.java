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

import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.form.RoamiotodoForm;
import com.dea42.watchlist.service.RoamiotodoServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: RoamiotodoController <br>
 * Description: RoamiotodoController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@Controller
@RequestMapping("/roamiotodos")
public class RoamiotodoController {

	@Autowired
	private RoamiotodoServices roamiotodoService;

	@GetMapping
	public String getAllRoamiotodos(Model model) {
		model.addAttribute("roamiotodos", this.roamiotodoService.listAll());
		return "roamiotodos";
	}

	@GetMapping("/new")
	public String showNewRoamiotodoPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new RoamiotodoForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_roamiotodo".concat(" :: roamiotodoForm");
		}

		return "edit_roamiotodo";
	}

	@PostMapping(value = "/save")
	public String saveRoamiotodo(@Valid @ModelAttribute RoamiotodoForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_roamiotodo";
			}

			Roamiotodo roamiotodo = new Roamiotodo();
			roamiotodo.setChannel(form.getChannel());
			roamiotodo.setColi(form.getColi());
			roamiotodo.setDate(form.getDate());
			roamiotodo.setDuration(form.getDuration());
			roamiotodo.setEp(form.getEp());
			roamiotodo.setEpdate(form.getEpdate());
			roamiotodo.setEpisode(form.getEpisode());
			roamiotodo.setEpisodename(form.getEpisodename());
			roamiotodo.setEpname2(form.getEpname2());
			roamiotodo.setEpname3(form.getEpname3());
			roamiotodo.setEpnum(form.getEpnum());
			roamiotodo.setId(form.getId());
			roamiotodo.setShow(form.getShow());
			roamiotodo.setShowname(form.getShowname());
			roamiotodo.setShowtrimmed(form.getShowtrimmed());
			roamiotodo.setSortabledate(form.getSortabledate());
			roamiotodo.setAccount(form.getAccount());
			try {
				roamiotodo = roamiotodoService.save(roamiotodo);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (roamiotodo == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/roamiotodos";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditRoamiotodoPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamiotodo");
		Roamiotodo roamiotodo = roamiotodoService.get(id);
		mav.addObject("roamiotodoForm", RoamiotodoForm.getInstance(roamiotodo));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteRoamiotodo(@PathVariable(name = "id") Integer id) {
		roamiotodoService.delete(id);
		return "redirect:/roamiotodos";
	}
}

