package com.dea42.watchlist.paging;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Search paging support class
 * 
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order {

	private Integer column;
	private Direction dir;

}