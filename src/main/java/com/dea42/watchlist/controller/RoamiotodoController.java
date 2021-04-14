package com.dea42.watchlist.controller;

import java.util.Date;
import java.security.Principal;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.form.RoamiotodoForm;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.search.RoamiotodoSearchForm;
import com.dea42.watchlist.service.RoamiotodoServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: RoamiotodoController <br>
 * Description: RoamiotodoController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Controller
@RequestMapping("/roamiotodos")
public class RoamiotodoController {

	@Autowired
	private RoamiotodoServices roamiotodoService;

	private RoamiotodoSearchForm getForm(HttpServletRequest request) {
		RoamiotodoSearchForm form = (RoamiotodoSearchForm) request.getSession().getAttribute("roamiotodoSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new RoamiotodoSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, RoamiotodoSearchForm form) {
		request.getSession().setAttribute("roamiotodoSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute RoamiotodoSearchForm form, 
			RedirectAttributes ra, @RequestParam(value = "action", required = true) String action) {
		ModelAndView mav;
		if (action.equals("search")) {
			setForm(request, form);
			form.setAdvanced(true);
			mav = new ModelAndView("roamiotodos");
//			mav = findPaginated(request, 1, "id", "asc");
//			@SuppressWarnings("unchecked")
//			List<Roamiotodo> list = (List<Roamiotodo>) mav.getModelMap().getAttribute("roamiotodos");
//			if (list == null || list.isEmpty()) {
//				mav.setViewName("search_roamiotodo");
//				mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
//						new Message("search.noResult", Message.Type.WARNING));
//			}
		} else {
			form = new RoamiotodoSearchForm();
			setForm(request, form);
			mav = new ModelAndView("search_roamiotodo");
			mav.addObject("roamiotodoSearchForm", form);
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.formReset", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		RoamiotodoSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Roamiotodo> page = roamiotodoService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("roamiotodos");
		mav.addObject("roamiotodos", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_roamiotodo".concat(" :: roamiotodoSearchForm");
		}

		return "search_roamiotodo";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute RoamiotodoForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_roamiotodo";
			}

			Roamiotodo roamiotodo = new Roamiotodo();
			roamiotodo.setChannel(form.getChannel());
			roamiotodo.setDatefield(form.getDatefield());
			roamiotodo.setDuration(form.getDuration());
			roamiotodo.setEp(form.getEp());
			roamiotodo.setEpisodename(form.getEpisodename());
			roamiotodo.setId(form.getId());
			roamiotodo.setShowname(form.getShowname());
			roamiotodo.setShowtrimmed(form.getShowtrimmed());
			roamiotodo.setAccount(form.getAccount());
			try {
				roamiotodo = roamiotodoService.save(roamiotodo);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (roamiotodo == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/roamiotodos";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamiotodo");
		Roamiotodo roamiotodo = null;
		if (id > 0)
			roamiotodo = roamiotodoService.get(id);
		mav.addObject("roamiotodoForm", RoamiotodoForm.getInstance(roamiotodo));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		roamiotodoService.delete(id);
		return "redirect:/roamiotodos";
	}

	@GetMapping("/list")
	String home(Principal principal) {
		return "roamiotodos";
	}
}
