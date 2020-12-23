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

import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.form.RoamionplForm;
import com.dea42.watchlist.search.RoamionplSearchForm;
import com.dea42.watchlist.service.RoamionplServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: RoamionplController <br>
 * Description: RoamionplController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Controller
@RequestMapping("/roamionpls")
public class RoamionplController {

	@Autowired
	private RoamionplServices roamionplService;

	private RoamionplSearchForm getForm(HttpServletRequest request) {
		RoamionplSearchForm form = (RoamionplSearchForm) request.getSession().getAttribute("roamionplSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new RoamionplSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, RoamionplSearchForm form) {
		request.getSession().setAttribute("roamionplSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute RoamionplSearchForm form, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		setForm(request, form);
		ModelAndView mav = findPaginated(request, 1, "id", "asc");
		@SuppressWarnings("unchecked")
		List<Roamionpl> list = (List<Roamionpl>) mav.getModelMap().getAttribute("roamionpls");
		if (list == null || list.isEmpty()) {
			mav.setViewName("search_roamionpl");
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.noResult", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		RoamionplSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Roamionpl> page = roamionplService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("roamionpls");
		mav.addObject("roamionpls", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_roamionpl".concat(" :: roamionplSearchForm");
		}

		return "search_roamionpl";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute RoamionplForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_roamionpl";
			}

			Roamionpl roamionpl = new Roamionpl();
			roamionpl.setBitratembps(form.getBitratembps());
			roamionpl.setChannel(form.getChannel());
			roamionpl.setDate(form.getDate());
			roamionpl.setDuration(form.getDuration());
			roamionpl.setEpisode(form.getEpisode());
			roamionpl.setId(form.getId());
			roamionpl.setIsnew(form.getIsnew());
			roamionpl.setRowinshows(form.getRowinshows());
			roamionpl.setSeriesep(form.getSeriesep());
			roamionpl.setShow(form.getShow());
			roamionpl.setSizegb(form.getSizegb());
			roamionpl.setSortabledate(form.getSortabledate());
			roamionpl.setTitle(form.getTitle());
			roamionpl.setAccount(form.getAccount());
			roamionpl.setWatchedtime(form.getWatchedtime());
			try {
				roamionpl = roamionplService.save(roamionpl);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (roamionpl == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/roamionpls";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamionpl");
		Roamionpl roamionpl = null;
		if (id > 0)
			roamionpl = roamionplService.get(id);
		mav.addObject("roamionplForm", RoamionplForm.getInstance(roamionpl));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		roamionplService.delete(id);
		return "redirect:/roamionpls";
	}
}

