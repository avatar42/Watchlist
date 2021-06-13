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
 * Title: NetworksUserSearchForm <br>
 * Description: Class for holding data from the NetworksUser table for searching. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Data
public class NetworksUserSearchForm implements Serializable {
	private static final long serialVersionUID = 1L;

/* info=ColInfo(fNum=2, colName=id, msgKey=NetworksUser.id, vName=id, type=Long, jtype=null, stype=-5, gsName=Id, length=0, pk=true, defaultVal=null, constraint=null, required=true, list=true, jsonIgnore=false, unique=false, hidden=false, password=false, email=false, created=false, lastMod=false, adminOnly=false, foreignTable=null, foreignCol=null, colScale=0, colPrecision=0, comment= * Table name: NetworksUser<br>
 * Column name: id<br>
 * Catalog name: Watchlist<br>
 * Primary key sequence: 1<br>
 * Primary key name: PRIMARY<br>
 *  <br>) */
	private Long idMin;
	private Long idMax;
	private String iusefreefreewithcablepayforhuluinstead = "";
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
