package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dea42.watchlist.entity.Roamiosp;

/**
 * Title: RoamiospRepository <br>
 * Description: Class for the Roamiosp Repository. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@Repository
public interface RoamiospRepository extends CrudRepository<Roamiosp, Integer>,
JpaSpecificationExecutor<Roamiosp> {
}
