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

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.service.NetworksServices;

/**
 * Title: NetworksController <br>
 * Description: Class for  NetworksController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
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
	public String showNewNetworksPage(Model model) {
		Networks networks = new Networks();
		model.addAttribute("networks", networks);

		return "edit_networks";
	}

	@PostMapping(value = "/save")
	public String saveNetworks(@ModelAttribute("networks") Networks networks,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			networksService.save(networks);
		}
		return "redirect:/networkss";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditNetworksPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_networks");
		Networks networks = networksService.get(id);
		mav.addObject("networks", networks);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteNetworks(@PathVariable(name = "id") Integer id) {
		networksService.delete(id);
		return "redirect:/networkss";
	}
}

