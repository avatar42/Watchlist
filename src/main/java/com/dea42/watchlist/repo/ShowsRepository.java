package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dea42.watchlist.entity.Shows;

/**
 * Title: ShowsRepository <br>
 * Description: Class for the Shows Repository. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Repository
public interface ShowsRepository extends CrudRepository<Shows, Long>,
JpaSpecificationExecutor<Shows> {
}
