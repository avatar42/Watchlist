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

import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.form.CablecardForm;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.search.CablecardSearchForm;
import com.dea42.watchlist.service.CablecardServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: CablecardController <br>
 * Description: CablecardController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Controller
@RequestMapping("/cablecards")
public class CablecardController {

	@Autowired
	private CablecardServices cablecardService;

	private CablecardSearchForm getForm(HttpServletRequest request) {
		CablecardSearchForm form = (CablecardSearchForm) request.getSession().getAttribute("cablecardSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new CablecardSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, CablecardSearchForm form) {
		request.getSession().setAttribute("cablecardSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute CablecardSearchForm form, 
			RedirectAttributes ra, @RequestParam(value = "action", required = true) String action) {
		ModelAndView mav;
		if (action.equals("search")) {
			setForm(request, form);
			form.setAdvanced(true);
			mav = new ModelAndView("cablecards");
//			mav = findPaginated(request, 1, "id", "asc");
//			@SuppressWarnings("unchecked")
//			List<Cablecard> list = (List<Cablecard>) mav.getModelMap().getAttribute("cablecards");
//			if (list == null || list.isEmpty()) {
//				mav.setViewName("search_cablecard");
//				mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
//						new Message("search.noResult", Message.Type.WARNING));
//			}
		} else {
			form = new CablecardSearchForm();
			setForm(request, form);
			mav = new ModelAndView("search_cablecard");
			mav.addObject("cablecardSearchForm", form);
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.formReset", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		CablecardSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Cablecard> page = cablecardService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("cablecards");
		mav.addObject("cablecards", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_cablecard".concat(" :: cablecardSearchForm");
		}

		return "search_cablecard";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute CablecardForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_cablecard";
			}

			Cablecard cablecard = new Cablecard();
			cablecard.setChannelname(form.getChannelname());
			cablecard.setChannelnumber(form.getChannelnumber());
			cablecard.setDt(form.getDt());
			cablecard.setHd(form.getHd());
			cablecard.setId(form.getId());
			cablecard.setInnpl(form.getInnpl());
			cablecard.setLangfield(form.getLangfield());
			cablecard.setNet(form.getNet());
			cablecard.setReceiving(form.getReceiving());
			cablecard.setShortfield(form.getShortfield());
			cablecard.setAccount(form.getAccount());
			try {
				cablecard = cablecardService.save(cablecard);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (cablecard == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/cablecards";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_cablecard");
		Cablecard cablecard = null;
		if (id > 0)
			cablecard = cablecardService.get(id);
		mav.addObject("cablecardForm", CablecardForm.getInstance(cablecard));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		cablecardService.delete(id);
		return "redirect:/cablecards";
	}

	@GetMapping("/list")
	String home(Principal principal) {
		return "cablecards";
	}
}
