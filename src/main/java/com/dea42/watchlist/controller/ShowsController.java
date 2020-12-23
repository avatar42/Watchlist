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

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.form.ShowsForm;
import com.dea42.watchlist.search.ShowsSearchForm;
import com.dea42.watchlist.service.ShowsServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: ShowsController <br>
 * Description: ShowsController. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Controller
@RequestMapping("/showss")
public class ShowsController {

	@Autowired
	private ShowsServices showsService;

	private ShowsSearchForm getForm(HttpServletRequest request) {
		ShowsSearchForm form = (ShowsSearchForm) request.getSession().getAttribute("showsSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new ShowsSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, ShowsSearchForm form) {
		request.getSession().setAttribute("showsSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute ShowsSearchForm form, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		setForm(request, form);
		ModelAndView mav = findPaginated(request, 1, "id", "asc");
		@SuppressWarnings("unchecked")
		List<Shows> list = (List<Shows>) mav.getModelMap().getAttribute("showss");
		if (list == null || list.isEmpty()) {
			mav.setViewName("search_shows");
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.noResult", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		ShowsSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Shows> page = showsService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("showss");
		mav.addObject("showss", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_shows".concat(" :: showsSearchForm");
		}

		return "search_shows";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute ShowsForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_shows";
			}

			Shows shows = new Shows();
			shows.setCancelled(form.getCancelled());
			shows.setEpguidesshowname(form.getEpguidesshowname());
			shows.setEpguidesshownamelink(form.getEpguidesshownamelink());
			shows.setId(form.getId());
			shows.setIncanceledas(form.getIncanceledas());
			shows.setIncanceledaslink(form.getIncanceledaslink());
			shows.setLastshow(form.getLastshow());
			shows.setNetwork(form.getNetwork());
			shows.setNetworklink(form.getNetworklink());
			shows.setPremiere(form.getPremiere());
			shows.setPremieredate(form.getPremieredate());
			shows.setStatus(form.getStatus());
			shows.setTivoname(form.getTivoname());
			shows.setTivonamelink(form.getTivonamelink());
			try {
				shows = showsService.save(shows);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (shows == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/showss";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_shows");
		Shows shows = null;
		if (id > 0)
			shows = showsService.get(id);
		mav.addObject("showsForm", ShowsForm.getInstance(shows));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		showsService.delete(id);
		return "redirect:/showss";
	}
}

