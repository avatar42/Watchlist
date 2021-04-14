package com.dea42.watchlist.search;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Title: networksuserSearchForm <br>
 * Description: Class for holding data from the networksuser table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Data
public class NetworksUserSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idMin;
	private Integer idMax;
	private String iusefreefreewithcablepayforhuluinstead = null;
	private NetworksSearchForm networks;
	private AccountSearchForm account;
	private String sortField = "id";
	private int page = 1;
	private int pageSize = 10;
	private boolean sortAsc = true;
	private int totalPages = 0;
	private long totalItems = 0;
	private SearchType doOr = SearchType.ADD;
	private boolean advanced = true;
	/**
	 * Clones NetworksUser obj into form
	 *
	 * @param obj
	 */
	public static NetworksUserSearchForm getInstance(NetworksUser obj) {
		NetworksUserSearchForm form = new NetworksUserSearchForm();
		form.setIdMin(obj.getId());
		form.setIdMax(obj.getId());
		form.setIusefreefreewithcablepayforhuluinstead(obj.getIusefreefreewithcablepayforhuluinstead());
		form.setNetworks(NetworksSearchForm.getInstance(obj.getNetworks()));
		form.setAccount(AccountSearchForm.getInstance(obj.getAccount()));
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
