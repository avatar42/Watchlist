package com.dea42.watchlist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dea42.watchlist.entity.Cablecard;

/**
 * Title: CablecardRepository <br>
 * Description: Class for the Cablecard Repository. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.2<br>
 * @version 1.0<br>
 */
@Repository
public interface CablecardRepository extends JpaRepository<Cablecard, Integer>{
}
