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

import com.dea42.watchlist.entity.Networksuser;
import com.dea42.watchlist.form.NetworksuserForm;
import com.dea42.watchlist.service.NetworksuserServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: NetworksuserController <br>
 * Description: NetworksuserController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Controller
@RequestMapping("/networksusers")
public class NetworksuserController {

	@Autowired
	private NetworksuserServices networksuserService;

	@GetMapping
	public String getAllNetworksusers(Model model) {
		model.addAttribute("networksusers", this.networksuserService.listAll());
		return "networksusers";
	}

	@GetMapping("/new")
	public String showNewNetworksuserPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new NetworksuserForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_networksuser".concat(" :: networksuserForm");
		}

		return "edit_networksuser";
	}

	@PostMapping(value = "/save")
	public String saveNetworksuser(@Valid @ModelAttribute NetworksuserForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_networksuser";
			}

			Networksuser networksuser = new Networksuser();
			networksuser.setId(form.getId());
			networksuser.setIusefreefreewithcablepayforhuluinstead(form.getIusefreefreewithcablepayforhuluinstead());
			networksuser.setNetworks(form.getNetworks());
			networksuser.setAccount(form.getAccount());
			try {
				networksuser = networksuserService.save(networksuser);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (networksuser == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/networksusers";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditNetworksuserPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_networksuser");
		Networksuser networksuser = networksuserService.get(id);
		mav.addObject("networksuserForm", NetworksuserForm.getInstance(networksuser));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteNetworksuser(@PathVariable(name = "id") Integer id) {
		networksuserService.delete(id);
		return "redirect:/networksusers";
	}
}

