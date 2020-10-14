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

import com.dea42.watchlist.entity.Showsuser;
import com.dea42.watchlist.form.ShowsuserForm;
import com.dea42.watchlist.service.ShowsuserServices;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;

/**
 * Title: ShowsuserController <br>
 * Description: ShowsuserController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.2<br>
 * @version 0.5.2<br>
 */
@Slf4j
@Controller
@RequestMapping("/showsusers")
public class ShowsuserController {

	@Autowired
	private ShowsuserServices showsuserService;

	@GetMapping
	public String getAllShowsusers(Model model) {
		model.addAttribute("showsusers", this.showsuserService.listAll());
		return "showsusers";
	}

	@GetMapping("/new")
	public String showNewShowsuserPage(Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(new ShowsuserForm());
		if (Utils.isAjaxRequest(requestedWith)) {
			return "edit_showsuser".concat(" :: showsuserForm");
		}

		return "edit_showsuser";
	}

	@PostMapping(value = "/save")
	public String saveShowsuser(@Valid @ModelAttribute ShowsuserForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_showsuser";
			}

			Showsuser showsuser = new Showsuser();
			showsuser.setBestexperience(form.getBestexperience());
			showsuser.setBestexperiencelink(form.getBestexperiencelink());
			showsuser.setComment(form.getComment());
			showsuser.setCommentlink(form.getCommentlink());
			showsuser.setId(form.getId());
			showsuser.setImdb(form.getImdb());
			showsuser.setImdblink(form.getImdblink());
			showsuser.setInrokufeed(form.getInrokufeed());
			showsuser.setInshowrssas(form.getInshowrssas());
			showsuser.setInshowrssaslink(form.getInshowrssaslink());
			showsuser.setJustwatch(form.getJustwatch());
			showsuser.setJustwatchlink(form.getJustwatchlink());
			showsuser.setLastwatched(form.getLastwatched());
			showsuser.setOta(form.getOta());
			showsuser.setShows(form.getShows());
			showsuser.setTivoname(form.getTivoname());
			showsuser.setTivonamelink(form.getTivonamelink());
			showsuser.setAccount(form.getAccount());
			try {
				showsuser = showsuserService.save(showsuser);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (showsuser == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/showsusers";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditShowsuserPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_showsuser");
		Showsuser showsuser = showsuserService.get(id);
		mav.addObject("showsuserForm", ShowsuserForm.getInstance(showsuser));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteShowsuser(@PathVariable(name = "id") Integer id) {
		showsuserService.delete(id);
		return "redirect:/showsusers";
	}
}

