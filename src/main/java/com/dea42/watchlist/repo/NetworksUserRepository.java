package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dea42.watchlist.entity.NetworksUser;

/**
 * Title: NetworksUserRepository <br>
 * Description: Class for the NetworksUser Repository. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */
@Repository
public interface NetworksUserRepository extends CrudRepository<NetworksUser, Integer>,
JpaSpecificationExecutor<NetworksUser> {
}
