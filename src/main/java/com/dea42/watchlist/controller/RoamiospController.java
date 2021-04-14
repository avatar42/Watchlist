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

import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.form.RoamiospForm;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.search.RoamiospSearchForm;
import com.dea42.watchlist.service.RoamiospServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: RoamiospController <br>
 * Description: RoamiospController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Controller
@RequestMapping("/roamiosps")
public class RoamiospController {

	@Autowired
	private RoamiospServices roamiospService;

	private RoamiospSearchForm getForm(HttpServletRequest request) {
		RoamiospSearchForm form = (RoamiospSearchForm) request.getSession().getAttribute("roamiospSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new RoamiospSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, RoamiospSearchForm form) {
		request.getSession().setAttribute("roamiospSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute RoamiospSearchForm form, 
			RedirectAttributes ra, @RequestParam(value = "action", required = true) String action) {
		ModelAndView mav;
		if (action.equals("search")) {
			setForm(request, form);
			form.setAdvanced(true);
			mav = new ModelAndView("roamiosps");
//			mav = findPaginated(request, 1, "id", "asc");
//			@SuppressWarnings("unchecked")
//			List<Roamiosp> list = (List<Roamiosp>) mav.getModelMap().getAttribute("roamiosps");
//			if (list == null || list.isEmpty()) {
//				mav.setViewName("search_roamiosp");
//				mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
//						new Message("search.noResult", Message.Type.WARNING));
//			}
		} else {
			form = new RoamiospSearchForm();
			setForm(request, form);
			mav = new ModelAndView("search_roamiosp");
			mav.addObject("roamiospSearchForm", form);
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.formReset", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		RoamiospSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Roamiosp> page = roamiospService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("roamiosps");
		mav.addObject("roamiosps", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_roamiosp".concat(" :: roamiospSearchForm");
		}

		return "search_roamiosp";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute RoamiospForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_roamiosp";
			}

			Roamiosp roamiosp = new Roamiosp();
			roamiosp.setChannel(form.getChannel());
			roamiosp.setEnd(form.getEnd());
			roamiosp.setId(form.getId());
			roamiosp.setInclude(form.getInclude());
			roamiosp.setKeep(form.getKeep());
			roamiosp.setNum(form.getNum());
			roamiosp.setPriority(form.getPriority());
			roamiosp.setRecord(form.getRecord());
			roamiosp.setSeason(form.getSeason());
			roamiosp.setShow(form.getShow());
			roamiosp.setStart(form.getStart());
			roamiosp.setAccount(form.getAccount());
			try {
				roamiosp = roamiospService.save(roamiosp);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (roamiosp == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/roamiosps";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_roamiosp");
		Roamiosp roamiosp = null;
		if (id > 0)
			roamiosp = roamiospService.get(id);
		mav.addObject("roamiospForm", RoamiospForm.getInstance(roamiosp));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		roamiospService.delete(id);
		return "redirect:/roamiosps";
	}

	@GetMapping("/list")
	String home(Principal principal) {
		return "roamiosps";
	}
}
