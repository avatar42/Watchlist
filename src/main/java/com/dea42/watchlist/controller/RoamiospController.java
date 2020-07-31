package com.dea42.watchlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.service.RoamiospServices;

/**
 * Title: RoamiospController <br>
 * Description: RoamiospController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
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
	public String showNewRoamiospPage(Model model) {
		Roamiosp roamiosp = new Roamiosp();
		model.addAttribute("roamiosp", roamiosp);

		return "edit_roamiosp";
	}

	@PostMapping(value = "/save")
	public String saveRoamiosp(@ModelAttribute("roamiosp") Roamiosp roamiosp,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			roamiospService.save(roamiosp);
		}
		return "redirect:/roamiosps";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditRoamiospPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamiosp");
		Roamiosp roamiosp = roamiospService.get(id);
		mav.addObject("roamiosp", roamiosp);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteRoamiosp(@PathVariable(name = "id") Integer id) {
		roamiospService.delete(id);
		return "redirect:/roamiosps";
	}
}

