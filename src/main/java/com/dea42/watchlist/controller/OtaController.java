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

import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.form.OtaForm;
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.search.OtaSearchForm;
import com.dea42.watchlist.service.OtaServices;
import com.dea42.watchlist.utils.Message;
import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.utils.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * Title: OtaController <br>
 * Description: OtaController. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Slf4j
@Controller
@RequestMapping("/otas")
public class OtaController {

	@Autowired
	private OtaServices otaService;

	private OtaSearchForm getForm(HttpServletRequest request) {
		OtaSearchForm form = (OtaSearchForm) request.getSession().getAttribute("otaSearchForm");
		if (log.isDebugEnabled())
			log.debug("pulled from session:" + form);
		if (form == null) {
			form = new OtaSearchForm();
		}
		return form;
	}

	private void setForm(HttpServletRequest request, OtaSearchForm form) {
		request.getSession().setAttribute("otaSearchForm", form);
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
	public ModelAndView search(HttpServletRequest request, @ModelAttribute OtaSearchForm form, 
			RedirectAttributes ra, @RequestParam(value = "action", required = true) String action) {
		ModelAndView mav;
		if (action.equals("search")) {
			setForm(request, form);
			form.setAdvanced(true);
			mav = new ModelAndView("otas");
//			mav = findPaginated(request, 1, "id", "asc");
//			@SuppressWarnings("unchecked")
//			List<Ota> list = (List<Ota>) mav.getModelMap().getAttribute("otas");
//			if (list == null || list.isEmpty()) {
//				mav.setViewName("search_ota");
//				mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
//						new Message("search.noResult", Message.Type.WARNING));
//			}
		} else {
			form = new OtaSearchForm();
			setForm(request, form);
			mav = new ModelAndView("search_ota");
			mav.addObject("otaSearchForm", form);
			mav.getModelMap().addAttribute(Message.MESSAGE_ATTRIBUTE,
					new Message("search.formReset", Message.Type.WARNING));
		}

		return mav;
	}

	@GetMapping("/search/{pageNo}")
	public ModelAndView findPaginated(HttpServletRequest request, @PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir) {
		OtaSearchForm form = getForm(request);
		if (pageNo < 1)
			pageNo = 1;

		form.setPage(pageNo);
		form.setSortField(sortField);
		form.setSortAsc("asc".equalsIgnoreCase(sortDir));

		if (log.isDebugEnabled())
			log.debug("Searching with:" + form);

		Page<Ota> page = otaService.listAll(form);

		form.setTotalPages(page.getTotalPages());
		form.setTotalItems(page.getTotalElements());
		setForm(request, form);

		ModelAndView mav = new ModelAndView("otas");
		mav.addObject("otas", page.getContent());
		return mav;
	}

	@GetMapping("/search")
	public String showSearchPage(HttpServletRequest request, Model model,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith) {
		model.addAttribute(getForm(request));
		if (Utils.isAjaxRequest(requestedWith)) {
			return "search_ota".concat(" :: otaSearchForm");
		}

		return "search_ota";
	}

	@PostMapping(value = "/save")
	public String save(@Valid @ModelAttribute OtaForm form, Errors errors, RedirectAttributes ra,
			@RequestParam(value = "action", required = true) String action) {
		if (action.equals("save")) {
			if (errors.hasErrors()) {
				return "edit_ota";
			}

			Ota ota = new Ota();
			ota.setAtticant(form.getAtticant());
			ota.setChan(form.getChan());
			ota.setChannelname(form.getChannelname());
			ota.setChannelnumber(form.getChannelnumber());
			ota.setChannelnumberchannelnameincluded(form.getChannelnumberchannelnameincluded());
			ota.setComments(form.getComments());
			ota.setDirection(form.getDirection());
			ota.setEnabled(form.getEnabled());
			ota.setFccinfo(form.getFccinfo());
			ota.setFreq(form.getFreq());
			ota.setId(form.getId());
			ota.setLangfield(form.getLangfield());
			ota.setListed(form.getListed());
			ota.setMytivoavgstrength(form.getMytivoavgstrength());
			ota.setNetwork(form.getNetwork());
			ota.setOff(form.getOff());
			ota.setRecommendedantenna(form.getRecommendedantenna());
			ota.setRez(form.getRez());
			ota.setStation(form.getStation());
			ota.setSubchan(form.getSubchan());
			ota.setTvfoolchan(form.getTvfoolchan());
			ota.setTvfoolestsignal(form.getTvfoolestsignal());
			ota.setAccount(form.getAccount());
			ota.setWatchabletablo(form.getWatchabletablo());
			ota.setWatchabletivo(form.getWatchabletivo());
			try {
				ota = otaService.save(ota);
			} catch (Exception e) {
				log.error("Failed saving:" + form, e);
			}

			if (ota == null) {
				MessageHelper.addErrorAttribute(ra, "db.failed");
			} else {
				MessageHelper.addSuccessAttribute(ra, "save.success");
			}
		} else {
			MessageHelper.addSuccessAttribute(ra, "save.cancelled");
		}

		return "redirect:/otas";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Integer id) {
		ModelAndView mav = new ModelAndView("edit_ota");
		Ota ota = null;
		if (id > 0)
			ota = otaService.get(id);
		mav.addObject("otaForm", OtaForm.getInstance(ota));

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		otaService.delete(id);
		return "redirect:/otas";
	}

	@GetMapping("/list")
	String home(Principal principal) {
		return "otas";
	}
}
