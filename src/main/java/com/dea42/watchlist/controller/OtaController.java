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

import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.form.OtaForm;
import com.dea42.watchlist.service.OtaServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: OtaController <br>
 * Description: OtaController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Slf4j
@Controller
@RequestMapping("/otas")
public class OtaController {

	@Autowired
	private OtaServices otaService;

	@GetMapping
	public String getAllOtas(Model model) {
		model.addAttribute("otas", this.otaService.listAll());
		return "otas";
	}

	@GetMapping("/new")
	public String showNewOtaPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new OtaForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_ota".concat(" :: otaForm");
		}

		return "edit_ota";
	}

	@PostMapping(value = "/save")
	public String saveOta(@Valid @ModelAttribute OtaForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_ota";
			}

			Ota ota = new Ota();
			ota.setAtticant(form.getAtticant());
			ota.setChan(form.getChan());
			ota.setChannelname(form.getChannelname());
			ota.setChannelnumber(form.getChannelnumber());
			ota.setChannelnumberchannelnameincluded(form.getChannelnumberchannelnameincluded());
			ota.setComments(form.getComments());
			ota.setDirection(form.getDirection());
			ota.setEnabled(form.getEnabled());
			ota.setFccinfo(form.getFccinfo());
			ota.setFccinfolink(form.getFccinfolink());
			ota.setFreq(form.getFreq());
			ota.setId(form.getId());
			ota.setLang(form.getLang());
			ota.setListed(form.getListed());
			ota.setMytivoavgstrength(form.getMytivoavgstrength());
			ota.setNetwork(form.getNetwork());
			ota.setOff(form.getOff());
			ota.setRecommendedantenna(form.getRecommendedantenna());
			ota.setRez(form.getRez());
			ota.setShelfant(form.getShelfant());
			ota.setStation(form.getStation());
			ota.setSubchan(form.getSubchan());
			ota.setTvfoolestsignal(form.getTvfoolestsignal());
			ota.setAccount(form.getAccount());
			ota.setWatchable(form.getWatchable());
			try {
				ota = otaService.save(ota);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (ota == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/otas";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditOtaPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_ota");
		Ota ota = otaService.get(id);
		mav.addObject("otaForm", OtaForm.getInstance(ota));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteOta(@PathVariable(name = "id") Integer id) {
		otaService.delete(id);
		return "redirect:/otas";
	}
}

