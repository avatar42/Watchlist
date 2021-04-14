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

import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.form.NetworksForm;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.search.NetworksSearchForm;
import com.dea42.watchlist.service.NetworksServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: NetworksController <br>
 * Description: NetworksController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Controller
@RequestMapping("/networkss")
public class NetworksController {

	@Autowired
	private NetworksServices networksService;

	private NetworksSearchForm getForm(HttpServletRequest request) {
		NetworksSearchForm form = (NetworksSearchForm) request.getSession().getAttribute("networksSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new NetworksSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, NetworksSearchForm form) {
		request.getSession().setAttribute("networksSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute NetworksSearchForm form, 
			RedirectAttributes ra, @RequestParam(value = "action", required = true) String action) {
		ModelAndView mav;
		if (action.equals("search")) {
			setForm(request, form);
			form.setAdvanced(true);
			mav = new ModelAndView("networkss");
//			mav = findPaginated(request, 1, "id", "asc");
//			@SuppressWarnings("unchecked")
//			List<Networks> list = (List<Networks>) mav.getModelMap().getAttribute("networkss");
//			if (list == null || list.isEmpty()) {
//				mav.setViewName("search_networks");
//				mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
//						new Message("search.noResult", Message.Type.WARNING));
//			}
		} else {
			form = new NetworksSearchForm();
			setForm(request, form);
			mav = new ModelAndView("search_networks");
			mav.addObject("networksSearchForm", form);
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.formReset", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		NetworksSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Networks> page = networksService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("networkss");
		mav.addObject("networkss", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_networks".concat(" :: networksSearchForm");
		}

		return "search_networks";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute NetworksForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_networks";
			}

			Networks networks = new Networks();
			networks.setAndroidapp(form.getAndroidapp());
			networks.setComment(form.getComment());
			networks.setCommercials(form.getCommercials());
			networks.setFireapp(form.getFireapp());
			networks.setFreewithtwcid(form.getFreewithtwcid());
			networks.setHasdirectbuyoption(form.getHasdirectbuyoption());
			networks.setHaswatchlist(form.getHaswatchlist());
			networks.setIcanota(form.getIcanota());
			networks.setId(form.getId());
			networks.setIptvservice(form.getIptvservice());
			networks.setOnhulu(form.getOnhulu());
			networks.setPersistance(form.getPersistance());
			networks.setRemembersplaceinepisode(form.getRemembersplaceinepisode());
			networks.setRememberswatchedepisodes(form.getRememberswatchedepisodes());
			networks.setRokuapp(form.getRokuapp());
			networks.setShowsintivonpl(form.getShowsintivonpl());
			networks.setSite(form.getSite());
			networks.setStandardwait(form.getStandardwait());
			networks.setTivoapp(form.getTivoapp());
			networks.setTivoshortname(form.getTivoshortname());
			networks.setWebinterface(form.getWebinterface());
			try {
				networks = networksService.save(networks);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (networks == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/networkss";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_networks");
		Networks networks = null;
		if (id > 0)
			networks = networksService.get(id);
		mav.addObject("networksForm", NetworksForm.getInstance(networks));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		networksService.delete(id);
		return "redirect:/networkss";
	}

	@GetMapping("/list")
	String home(Principal principal) {
		return "networkss";
	}
}
