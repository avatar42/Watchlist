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

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.form.NetworksForm;
import com.dea42.watchlist.service.NetworksServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: NetworksController <br>
 * Description: NetworksController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Controller
@RequestMapping("/networkss")
public class NetworksController {

	@Autowired
	private NetworksServices networksService;

	@GetMapping
	public String getAllNetworkss(Model model) {
		model.addAttribute("networkss", this.networksService.listAll());
		return "networkss";
	}

	@GetMapping("/new")
	public String showNewNetworksPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new NetworksForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_networks".concat(" :: networksForm");
		}

		return "edit_networks";
	}

	@PostMapping(value = "/save")
	public String saveNetworks(@Valid @ModelAttribute NetworksForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_networks";
			}

			Networks networks = new Networks();
			networks.setAndroidapp(form.getAndroidapp());
			networks.setAndroidapplink(form.getAndroidapplink());
			networks.setComment(form.getComment());
			networks.setCommentlink(form.getCommentlink());
			networks.setCommercials(form.getCommercials());
			networks.setCommercialslink(form.getCommercialslink());
			networks.setFireapp(form.getFireapp());
			networks.setFireapplink(form.getFireapplink());
			networks.setFreewithtwcid(form.getFreewithtwcid());
			networks.setFreewithtwcidlink(form.getFreewithtwcidlink());
			networks.setHasdirectbuyoption(form.getHasdirectbuyoption());
			networks.setHasdirectbuyoptionlink(form.getHasdirectbuyoptionlink());
			networks.setHaswatchlist(form.getHaswatchlist());
			networks.setIcanota(form.getIcanota());
			networks.setIcanotalink(form.getIcanotalink());
			networks.setId(form.getId());
			networks.setIptvservice(form.getIptvservice());
			networks.setIptvservicelink(form.getIptvservicelink());
			networks.setOnhulu(form.getOnhulu());
			networks.setOnhululink(form.getOnhululink());
			networks.setPersistance(form.getPersistance());
			networks.setRemembersplaceinepisode(form.getRemembersplaceinepisode());
			networks.setRememberswatchedepisodes(form.getRememberswatchedepisodes());
			networks.setRokuapp(form.getRokuapp());
			networks.setRokuapplink(form.getRokuapplink());
			networks.setShowsintivonpl(form.getShowsintivonpl());
			networks.setSite(form.getSite());
			networks.setSitelink(form.getSitelink());
			networks.setStandardwait(form.getStandardwait());
			networks.setTivoapp(form.getTivoapp());
			networks.setTivoapplink(form.getTivoapplink());
			networks.setTivoshortname(form.getTivoshortname());
			networks.setWebinterface(form.getWebinterface());
			networks.setWebinterfacelink(form.getWebinterfacelink());
			try {
				networks = networksService.save(networks);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (networks == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/networkss";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditNetworksPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_networks");
		Networks networks = networksService.get(id);
		mav.addObject("networksForm", NetworksForm.getInstance(networks));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteNetworks(@PathVariable(name = "id") Integer id) {
		networksService.delete(id);
		return "redirect:/networkss";
	}
}

