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

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.service.ShowsServices;

/**
 * Title: ShowsController <br>
 * Description: ShowsController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@Controller
@RequestMapping("/showss")
public class ShowsController {

	@Autowired
	private ShowsServices showsService;

	@GetMapping
	public String getAllShowss(Model model) {
		model.addAttribute("showss", this.showsService.listAll());
		return "showss";
	}

	@GetMapping("/new")
	public String showNewShowsPage(Model model) {
		Shows shows = new Shows();
		model.addAttribute("shows", shows);

		return "edit_shows";
	}

	@PostMapping(value = "/save")
	public String saveShows(@ModelAttribute("shows") Shows shows,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			showsService.save(shows);
		}
		return "redirect:/showss";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditShowsPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_shows");
		Shows shows = showsService.get(id);
		mav.addObject("shows", shows);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteShows(@PathVariable(name = "id") Integer id) {
		showsService.delete(id);
		return "redirect:/showss";
	}
}

