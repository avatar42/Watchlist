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

import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.service.CablecardServices;

/**
 * Title: CablecardController <br>
 * Description: CablecardController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
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
	public String showNewCablecardPage(Model model) {
		Cablecard cablecard = new Cablecard();
		model.addAttribute("cablecard", cablecard);

		return "edit_cablecard";
	}

	@PostMapping(value = "/save")
	public String saveCablecard(@ModelAttribute("cablecard") Cablecard cablecard,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			cablecardService.save(cablecard);
		}
		return "redirect:/cablecards";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditCablecardPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_cablecard");
		Cablecard cablecard = cablecardService.get(id);
		mav.addObject("cablecard", cablecard);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteCablecard(@PathVariable(name = "id") Integer id) {
		cablecardService.delete(id);
		return "redirect:/cablecards";
	}
}

