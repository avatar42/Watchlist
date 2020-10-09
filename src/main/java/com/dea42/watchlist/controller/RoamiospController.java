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

import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.form.RoamiospForm;
import com.dea42.watchlist.service.RoamiospServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: RoamiospController <br>
 * Description: RoamiospController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.1<br>
 * @version 1.0.0<br>
 */
@Slf4j
@Controller
@RequestMapping("/roamiosps")
public class RoamiospController {

	@Autowired
	private RoamiospServices roamiospService;

	@GetMapping
	public String getAllRoamiosps(Model model) {
		model.addAttribute("roamiosps", this.roamiospService.listAll());
		return "roamiosps";
	}

	@GetMapping("/new")
	public String showNewRoamiospPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new RoamiospForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_roamiosp".concat(" :: roamiospForm");
		}

		return "edit_roamiosp";
	}

	@PostMapping(value = "/save")
	public String saveRoamiosp(@Valid @ModelAttribute RoamiospForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_roamiosp";
			}

			Roamiosp roamiosp = new Roamiosp();
			roamiosp.setCancelled(form.getCancelled());
			roamiosp.setChannel(form.getChannel());
			roamiosp.setChannelnum(form.getChannelnum());
			roamiosp.setDup(form.getDup());
			roamiosp.setEnd(form.getEnd());
			roamiosp.setId(form.getId());
			roamiosp.setInclude(form.getInclude());
			roamiosp.setInshowsstatus(form.getInshowsstatus());
			roamiosp.setKeep(form.getKeep());
			roamiosp.setNetwork(form.getNetwork());
			roamiosp.setNum(form.getNum());
			roamiosp.setOta(form.getOta());
			roamiosp.setPriority(form.getPriority());
			roamiosp.setRecord(form.getRecord());
			roamiosp.setRow(form.getRow());
			roamiosp.setSeason(form.getSeason());
			roamiosp.setShow(form.getShow());
			roamiosp.setStart(form.getStart());
			roamiosp.setStation(form.getStation());
			roamiosp.setAccount(form.getAccount());
			try {
				roamiosp = roamiospService.save(roamiosp);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (roamiosp == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/roamiosps";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditRoamiospPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamiosp");
		Roamiosp roamiosp = roamiospService.get(id);
		mav.addObject("roamiospForm", RoamiospForm.getInstance(roamiosp));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteRoamiosp(@PathVariable(name = "id") Integer id) {
		roamiospService.delete(id);
		return "redirect:/roamiosps";
	}
}

