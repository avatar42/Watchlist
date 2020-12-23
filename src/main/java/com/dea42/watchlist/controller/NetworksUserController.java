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

import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.form.NetworksUserForm;
import com.dea42.watchlist.search.NetworksUserSearchForm;
import com.dea42.watchlist.service.NetworksUserServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: NetworksUserController <br>
 * Description: NetworksUserController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Controller
@RequestMapping("/networksUsers")
public class NetworksUserController {

	@Autowired
	private NetworksUserServices networksUserService;

	private NetworksUserSearchForm getForm(HttpServletRequest request) {
		NetworksUserSearchForm form = (NetworksUserSearchForm) request.getSession().getAttribute("networksUserSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new NetworksUserSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, NetworksUserSearchForm form) {
		request.getSession().setAttribute("networksUserSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute NetworksUserSearchForm form, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		setForm(request, form);
		ModelAndView mav = findPaginated(request, 1, "id", "asc");
		@SuppressWarnings("unchecked")
		List<NetworksUser> list = (List<NetworksUser>) mav.getModelMap().getAttribute("networksUsers");
		if (list == null || list.isEmpty()) {
			mav.setViewName("search_networksUser");
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.noResult", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		NetworksUserSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<NetworksUser> page = networksUserService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("networksUsers");
		mav.addObject("networksUsers", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_networksUser".concat(" :: networksUserSearchForm");
		}

		return "search_networksUser";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute NetworksUserForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_networksUser";
			}

			NetworksUser networksUser = new NetworksUser();
			networksUser.setId(form.getId());
			networksUser.setIusefreefreewithcablepayforhuluinstead(form.getIusefreefreewithcablepayforhuluinstead());
			networksUser.setNetworks(form.getNetworks());
			networksUser.setAccount(form.getAccount());
			try {
				networksUser = networksUserService.save(networksUser);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (networksUser == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/networksUsers";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_networksUser");
		NetworksUser networksUser = null;
		if (id > 0)
			networksUser = networksUserService.get(id);
		mav.addObject("networksUserForm", NetworksUserForm.getInstance(networksUser));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		networksUserService.delete(id);
		return "redirect:/networksUsers";
	}
}

