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

import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.service.RoamiotodoServices;

/**
 * Title: RoamiotodoController <br>
 * Description: RoamiotodoController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
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
	public String showNewRoamiotodoPage(Model model) {
		Roamiotodo roamiotodo = new Roamiotodo();
		model.addAttribute("roamiotodo", roamiotodo);

		return "edit_roamiotodo";
	}

	@PostMapping(value = "/save")
	public String saveRoamiotodo(@ModelAttribute("roamiotodo") Roamiotodo roamiotodo,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			roamiotodoService.save(roamiotodo);
		}
		return "redirect:/roamiotodos";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditRoamiotodoPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamiotodo");
		Roamiotodo roamiotodo = roamiotodoService.get(id);
		mav.addObject("roamiotodo", roamiotodo);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteRoamiotodo(@PathVariable(name = "id") Integer id) {
		roamiotodoService.delete(id);
		return "redirect:/roamiotodos";
	}
}

