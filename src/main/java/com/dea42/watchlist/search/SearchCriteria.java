package com.dea42.watchlist.search;

import lombok.Data;

/**
 * Class for holding Criteria info
 * 
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 *
 */
@Data
public class SearchCriteria<T> {
	private String key;
	private Object value;
	private SearchOperation operation;

	public SearchCriteria() {
	}

	public SearchCriteria(String key, T value, SearchOperation operation) {
		this.key = key;
		this.value = value;
		this.operation = operation;
	}

}
