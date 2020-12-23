package com.dea42.watchlist.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.form.ShowsUserForm;
import com.dea42.watchlist.search.ShowsUserSearchForm;
import com.dea42.watchlist.service.ShowsUserServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: ShowsUserController <br>
 * Description: ShowsUserController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Controller
@RequestMapping("/showsUsers")
public class ShowsUserController {

	@Autowired
	private ShowsUserServices showsUserService;

	private ShowsUserSearchForm getForm(HttpServletRequest request) {
		ShowsUserSearchForm form = (ShowsUserSearchForm) request.getSession().getAttribute("showsUserSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new ShowsUserSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, ShowsUserSearchForm form) {
		request.getSession().setAttribute("showsUserSearchForm", form);
		if (log.isDebugEnabled())
			log.debug("stored:" + form);
	}


	@GetMapping
	public ModelAndView getAll(HttpServletRequest request) {
		return findPaginated(request, 1, "id", "asc");
	}

	@GetMapping("/new")
	public ModelAndView showNewPage() {
		return showEditPage(0);
	}

	@PostMapping(value = "/search")
	public ModelAndView search(HttpServletRequest request, @ModelAttribute ShowsUserSearchForm form, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		setForm(request, form);
		ModelAndView mav = findPaginated(request, 1, "id", "asc");
		@SuppressWarnings("unchecked")
		List<ShowsUser> list = (List<ShowsUser>) mav.getModelMap().getAttribute("showsUsers");
		if (list == null || list.isEmpty()) {
			mav.setViewName("search_showsUser");
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.noResult", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		ShowsUserSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<ShowsUser> page = showsUserService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("showsUsers");
		mav.addObject("showsUsers", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_showsUser".concat(" :: showsUserSearchForm");
		}

		return "search_showsUser";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute ShowsUserForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_showsUser";
			}

			ShowsUser showsUser = new ShowsUser();
			showsUser.setBestexperience(form.getBestexperience());
			showsUser.setBestexperiencelink(form.getBestexperiencelink());
			showsUser.setComment(form.getComment());
			showsUser.setCommentlink(form.getCommentlink());
			showsUser.setDiff(form.getDiff());
			showsUser.setId(form.getId());
			showsUser.setImdb(form.getImdb());
			showsUser.setImdblink(form.getImdblink());
			showsUser.setInrokufeed(form.getInrokufeed());
			showsUser.setInshowrssas(form.getInshowrssas());
			showsUser.setInshowrssaslink(form.getInshowrssaslink());
			showsUser.setIntablo(form.getIntablo());
			showsUser.setJustwatch(form.getJustwatch());
			showsUser.setJustwatchlink(form.getJustwatchlink());
			showsUser.setLastwatched(form.getLastwatched());
			showsUser.setOta(form.getOta());
			showsUser.setShows(form.getShows());
			showsUser.setAccount(form.getAccount());
			try {
				showsUser = showsUserService.save(showsUser);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (showsUser == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/showsUsers";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_showsUser");
		ShowsUser showsUser = null;
		if (id > 0)
			showsUser = showsUserService.get(id);
		mav.addObject("showsUserForm", ShowsUserForm.getInstance(showsUser));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		showsUserService.delete(id);
		return "redirect:/showsUsers";
	}
}

