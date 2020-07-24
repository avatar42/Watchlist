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

import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.service.RoamionplServices;

/**
 * Title: RoamionplController <br>
 * Description: RoamionplController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
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
	public String showNewRoamionplPage(Model model) {
		Roamionpl roamionpl = new Roamionpl();
		model.addAttribute("roamionpl", roamionpl);

		return "edit_roamionpl";
	}

	@PostMapping(value = "/save")
	public String saveRoamionpl(@ModelAttribute("roamionpl") Roamionpl roamionpl,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			roamionplService.save(roamionpl);
		}
		return "redirect:/roamionpls";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditRoamionplPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamionpl");
		Roamionpl roamionpl = roamionplService.get(id);
		mav.addObject("roamionpl", roamionpl);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteRoamionpl(@PathVariable(name = "id") Integer id) {
		roamionplService.delete(id);
		return "redirect:/roamionpls";
	}
}

