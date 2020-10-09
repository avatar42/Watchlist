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

import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.form.CablecardForm;
import com.dea42.watchlist.service.CablecardServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: CablecardController <br>
 * Description: CablecardController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Controller
@RequestMapping("/cablecards")
public class CablecardController {

	@Autowired
	private CablecardServices cablecardService;

	@GetMapping
	public String getAllCablecards(Model model) {
		model.addAttribute("cablecards", this.cablecardService.listAll());
		return "cablecards";
	}

	@GetMapping("/new")
	public String showNewCablecardPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new CablecardForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_cablecard".concat(" :: cablecardForm");
		}

		return "edit_cablecard";
	}

	@PostMapping(value = "/save")
	public String saveCablecard(@Valid @ModelAttribute CablecardForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_cablecard";
			}

			Cablecard cablecard = new Cablecard();
			cablecard.setChannelname(form.getChannelname());
			cablecard.setChannelnumber(form.getChannelnumber());
			cablecard.setColh(form.getColh());
			cablecard.setDt(form.getDt());
			cablecard.setHd(form.getHd());
			cablecard.setId(form.getId());
			cablecard.setInnpl(form.getInnpl());
			cablecard.setLang(form.getLang());
			cablecard.setNet(form.getNet());
			cablecard.setOd(form.getOd());
			cablecard.setReceiving(form.getReceiving());
			cablecard.setShortfield(form.getShortfield());
			cablecard.setAccount(form.getAccount());
			try {
				cablecard = cablecardService.save(cablecard);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (cablecard == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/cablecards";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditCablecardPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_cablecard");
		Cablecard cablecard = cablecardService.get(id);
		mav.addObject("cablecardForm", CablecardForm.getInstance(cablecard));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteCablecard(@PathVariable(name = "id") Integer id) {
		cablecardService.delete(id);
		return "redirect:/cablecards";
	}
}

