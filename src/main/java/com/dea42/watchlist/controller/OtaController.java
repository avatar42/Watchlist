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

import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.service.OtaServices;

/**
 * Title: OtaController <br>
 * Description: Class for  OtaController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring<br>
 * @version 1.0<br>
 */
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
	public String showNewOtaPage(Model model) {
		Ota ota = new Ota();
		model.addAttribute("ota", ota);

		return "edit_ota";
	}

	@PostMapping(value = "/save")
	public String saveOta(@ModelAttribute("ota") Ota ota,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			otaService.save(ota);
		}
		return "redirect:/otas";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditOtaPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_ota");
		Ota ota = otaService.get(id);
		mav.addObject("ota", ota);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteOta(@PathVariable(name = "id") Integer id) {
		otaService.delete(id);
		return "redirect:/otas";
	}
}

