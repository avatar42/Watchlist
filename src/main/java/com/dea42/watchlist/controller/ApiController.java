package com.dea42.watchlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.service.NetworksServices;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.service.ShowsServices;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.service.RoamiospServices;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.service.CablecardServices;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.service.RoamionplServices;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.service.OtaServices;
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.service.RoamiotodoServices;

import java.util.List;
/**
 * Title: ApiController <br>
 * Description: Api REST Controller. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.2.0<br>
 * @version 1.0<br>
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private NetworksServices networksServices;
    @Autowired
    private ShowsServices showsServices;
    @Autowired
    private RoamiospServices roamiospServices;
    @Autowired
    private CablecardServices cablecardServices;
    @Autowired
    private RoamionplServices roamionplServices;
    @Autowired
    private OtaServices otaServices;
    @Autowired
    private RoamiotodoServices roamiotodoServices;

    public ApiController(){
    }

    @GetMapping("/networkss")
    public List<Networks> getAllNetworkss(){
        return this.networksServices.listAll();
    }

    @GetMapping("/showss")
    public List<Shows> getAllShowss(){
        return this.showsServices.listAll();
    }

    @GetMapping("/roamiosps")
    public List<Roamiosp> getAllRoamiosps(){
        return this.roamiospServices.listAll();
    }

    @GetMapping("/cablecards")
    public List<Cablecard> getAllCablecards(){
        return this.cablecardServices.listAll();
    }

    @GetMapping("/roamionpls")
    public List<Roamionpl> getAllRoamionpls(){
        return this.roamionplServices.listAll();
    }

    @GetMapping("/otas")
    public List<Ota> getAllOtas(){
        return this.otaServices.listAll();
    }

    @GetMapping("/roamiotodos")
    public List<Roamiotodo> getAllRoamiotodos(){
        return this.roamiotodoServices.listAll();
    }
}
