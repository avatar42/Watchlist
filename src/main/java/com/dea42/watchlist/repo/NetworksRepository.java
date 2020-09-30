package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dea42.watchlist.entity.Networks;

/**
 * Title: NetworksRepository <br>
 * Description: Class for the Networks Repository. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */
@Repository
public interface NetworksRepository extends JpaRepository<Networks, Integer>{
}
