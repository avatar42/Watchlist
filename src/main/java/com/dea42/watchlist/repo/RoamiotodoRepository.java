package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dea42.watchlist.entity.Roamiotodo;

/**
 * Title: RoamiotodoRepository <br>
 * Description: Class for the Roamiotodo Repository. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.4<br>
 * @version 0.5.4<br>
 */
@Repository
public interface RoamiotodoRepository extends JpaRepository<Roamiotodo, Integer>{
}
