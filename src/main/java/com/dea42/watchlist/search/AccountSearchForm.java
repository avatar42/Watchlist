package com.dea42.watchlist.search;

import com.dea42.watchlist.controller.FieldMatch;
import com.dea42.watchlist.controller.UniqueEmail;
import com.dea42.watchlist.controller.ValidatePassword;
import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.utils.MessageHelper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: accountSearchForm <br>
 * Description: Class for holding data from the account table for searching. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Data
public class AccountSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email = null;
	private Integer idMin;
	private Integer idMax;
	private String password = null;
	private String role = null;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	/**
	 * Clones Account obj into form
	 *
	 * @param obj
	 */
	public static AccountSearchForm getInstance(Account obj) {
		AccountSearchForm form = new AccountSearchForm();
		form.setEmail(obj.getEmail());
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setPassword(obj.getPassword());
		form.setRole(obj.getRole());
		return form;
	}

	/**
	 * Generate a Sort from fields
	 * @return
	 */
	public Sort getSort() {
		if (sortAsc)
			return Sort.by(sortField).ascending();

		return Sort.by(sortField).descending();
	}

	public String getSortDir() {
		if (sortAsc)
			return "asc";
		else
			return "desc";
	}

	public String getReverseSortDir() {
		if (sortAsc)
			return "desc";
		else
			return "asc";
	}

	boolean getSortAscFlip() {
		return !sortAsc;
	}
}