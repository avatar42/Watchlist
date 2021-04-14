package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dea42.watchlist.entity.Cablecard;

/**
 * Title: CablecardRepository <br>
 * Description: Class for the Cablecard Repository. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Repository
public interface CablecardRepository extends CrudRepository<Cablecard, Integer>,
JpaSpecificationExecutor<Cablecard> {
}
