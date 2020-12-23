package com.dea42.watchlist.service;

import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.repo.ShowsUserRepository;
import com.dea42.watchlist.search.SearchCriteria;
import com.dea42.watchlist.search.SearchOperation;
import com.dea42.watchlist.search.SearchSpecification;
import com.dea42.watchlist.search.ShowsUserSearchForm;
import com.dea42.watchlist.utils.Utils;
import java.math.BigDecimal;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * Title: ShowsUserServices <br>
 * Description: ShowsUserServices. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Slf4j
@Service
public class ShowsUserServices {
    @Autowired
    private ShowsUserRepository showsUserRepository;

	public Page<ShowsUser> listAll(ShowsUserSearchForm form) {
		SearchSpecification<ShowsUser> searchSpec = new SearchSpecification<ShowsUser>();
		if (form != null) {
			log.debug(form.toString());
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getBestexperience())) {
				searchSpec.add(new SearchCriteria<String>("bestexperience", form.getBestexperience().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getBestexperiencelink())) {
				searchSpec.add(new SearchCriteria<String>("bestexperiencelink", form.getBestexperiencelink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getComment())) {
				searchSpec.add(new SearchCriteria<String>("comment", form.getComment().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getCommentlink())) {
				searchSpec.add(new SearchCriteria<String>("commentlink", form.getCommentlink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getDiff())) {
				searchSpec.add(new SearchCriteria<String>("diff", form.getDiff().toLowerCase(), SearchOperation.LIKE));
			}
			if (form.getIdMin() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMin(), SearchOperation.GREATER_THAN_EQUAL));
			}
			if (form.getIdMax() != null) {
				searchSpec.add(new SearchCriteria<Integer>("id", form.getIdMax(), SearchOperation.LESS_THAN_EQUAL));
			}
			if (!StringUtils.isBlank(form.getImdb())) {
				searchSpec.add(new SearchCriteria<String>("imdb", form.getImdb().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getImdblink())) {
				searchSpec.add(new SearchCriteria<String>("imdblink", form.getImdblink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getInrokufeed())) {
				searchSpec.add(new SearchCriteria<String>("inrokufeed", form.getInrokufeed().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getInshowrssas())) {
				searchSpec.add(new SearchCriteria<String>("inshowrssas", form.getInshowrssas().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getInshowrssaslink())) {
				searchSpec.add(new SearchCriteria<String>("inshowrssaslink", form.getInshowrssaslink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getIntablo())) {
				searchSpec.add(new SearchCriteria<String>("intablo", form.getIntablo().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getJustwatch())) {
				searchSpec.add(new SearchCriteria<String>("justwatch", form.getJustwatch().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getJustwatchlink())) {
				searchSpec.add(new SearchCriteria<String>("justwatchlink", form.getJustwatchlink().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getLastwatched())) {
				searchSpec.add(new SearchCriteria<String>("lastwatched", form.getLastwatched().toLowerCase(), SearchOperation.LIKE));
			}
			if (!StringUtils.isBlank(form.getOta())) {
				searchSpec.add(new SearchCriteria<String>("ota", form.getOta().toLowerCase(), SearchOperation.LIKE));
			}

		} else {
			form = new ShowsUserSearchForm();
		}
		Pageable pageable = PageRequest.of(form.getPage() - 1, form.getPageSize(),
				form.getSort());
		if (log.isInfoEnabled())
			log.info("searchSpec:" + searchSpec);
		return showsUserRepository.findAll(searchSpec, pageable);
	}

	public ShowsUser save(ShowsUser showsUser) {
		return showsUserRepository.save(showsUser);
	}
	
	public ShowsUser get(Integer id) {
		return showsUserRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		showsUserRepository.deleteById(id);
	}

}

