package com.dea42.watchlist.controller;

import com.dea42.watchlist.entity.Account;
import com.dea42.watchlist.entity.Cablecard;
import com.dea42.watchlist.entity.Networks;
import com.dea42.watchlist.entity.NetworksUser;
import com.dea42.watchlist.entity.Ota;
import com.dea42.watchlist.entity.Roamionpl;
import com.dea42.watchlist.entity.Roamiosp;
import com.dea42.watchlist.entity.Roamiotodo;
import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.entity.ShowsUser;
import com.dea42.watchlist.service.AccountServices;
import com.dea42.watchlist.service.CablecardServices;
import com.dea42.watchlist.service.NetworksServices;
import com.dea42.watchlist.service.NetworksUserServices;
import com.dea42.watchlist.service.OtaServices;
import com.dea42.watchlist.service.RoamionplServices;
import com.dea42.watchlist.service.RoamiospServices;
import com.dea42.watchlist.service.RoamiotodoServices;
import com.dea42.watchlist.service.ShowsServices;
import com.dea42.watchlist.service.ShowsUserServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Title: ApiController <br>
 * Description: Api REST Controller. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.6.3<br>
 * @version 0.6.3<br>
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private AccountServices accountServices;
    @Autowired
    private NetworksServices networksServices;
    @Autowired
    private ShowsServices showsServices;
    @Autowired
    private RoamiospServices roamiospServices;
    @Autowired
    private ShowsUserServices showsUserServices;
    @Autowired
    private CablecardServices cablecardServices;
    @Autowired
    private OtaServices otaServices;
    @Autowired
    private RoamionplServices roamionplServices;
    @Autowired
    private NetworksUserServices networksUserServices;
    @Autowired
    private RoamiotodoServices roamiotodoServices;

    public ApiController(){
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return this.accountServices.listAll(null).toList();
    }

    @GetMapping("/networkss")
    public List<Networks> getAllNetworkss(){
        return this.networksServices.listAll(null).toList();
    }

    @GetMapping("/showss")
    public List<Shows> getAllShowss(){
        return this.showsServices.listAll(null).toList();
    }

    @GetMapping("/roamiosps")
    public List<Roamiosp> getAllRoamiosps(){
        return this.roamiospServices.listAll(null).toList();
    }

    @GetMapping("/showsUsers")
    public List<ShowsUser> getAllShowsUsers(){
        return this.showsUserServices.listAll(null).toList();
    }

    @GetMapping("/cablecards")
    public List<Cablecard> getAllCablecards(){
        return this.cablecardServices.listAll(null).toList();
    }

    @GetMapping("/otas")
    public List<Ota> getAllOtas(){
        return this.otaServices.listAll(null).toList();
    }

    @GetMapping("/roamionpls")
    public List<Roamionpl> getAllRoamionpls(){
        return this.roamionplServices.listAll(null).toList();
    }

    @GetMapping("/networksUsers")
    public List<NetworksUser> getAllNetworksUsers(){
        return this.networksUserServices.listAll(null).toList();
    }

    @GetMapping("/roamiotodos")
    public List<Roamiotodo> getAllRoamiotodos(){
        return this.roamiotodoServices.listAll(null).toList();
    }
}
