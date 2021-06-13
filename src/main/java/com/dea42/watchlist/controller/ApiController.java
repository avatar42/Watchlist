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
import com.dea42.watchlist.paging.PageInfo;
import com.dea42.watchlist.paging.PagingRequest;
import com.dea42.watchlist.search.AccountSearchForm;
import com.dea42.watchlist.search.CablecardSearchForm;
import com.dea42.watchlist.search.NetworksSearchForm;
import com.dea42.watchlist.search.NetworksUserSearchForm;
import com.dea42.watchlist.search.OtaSearchForm;
import com.dea42.watchlist.search.RoamionplSearchForm;
import com.dea42.watchlist.search.RoamiospSearchForm;
import com.dea42.watchlist.search.RoamiotodoSearchForm;
import com.dea42.watchlist.search.ShowsSearchForm;
import com.dea42.watchlist.search.ShowsUserSearchForm;
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
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Title: ApiController <br>
 * Description: Api REST Controller. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
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

	@PostMapping(value = "/accounts/list")
	public PageInfo<Account> listAccount(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return accountServices.getAccounts(request, pagingRequest);
	}

    @GetMapping("/networkss")
    public List<Networks> getAllNetworkss(){
        return this.networksServices.listAll(null).toList();
    }

	@PostMapping(value = "/networkss/list")
	public PageInfo<Networks> listNetworks(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return networksServices.getNetworkss(request, pagingRequest);
	}

    @GetMapping("/showss")
    public List<Shows> getAllShowss(){
        return this.showsServices.listAll(null).toList();
    }

	@PostMapping(value = "/showss/list")
	public PageInfo<Shows> listShows(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return showsServices.getShowss(request, pagingRequest);
	}

    @GetMapping("/roamiosps")
    public List<Roamiosp> getAllRoamiosps(){
        return this.roamiospServices.listAll(null).toList();
    }

	@PostMapping(value = "/roamiosps/list")
	public PageInfo<Roamiosp> listRoamiosp(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return roamiospServices.getRoamiosps(request, pagingRequest);
	}

    @GetMapping("/showsUsers")
    public List<ShowsUser> getAllShowsUsers(){
        return this.showsUserServices.listAll(null).toList();
    }

	@PostMapping(value = "/showsUsers/list")
	public PageInfo<ShowsUser> listShowsUser(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return showsUserServices.getShowsUsers(request, pagingRequest);
	}

    @GetMapping("/cablecards")
    public List<Cablecard> getAllCablecards(){
        return this.cablecardServices.listAll(null).toList();
    }

	@PostMapping(value = "/cablecards/list")
	public PageInfo<Cablecard> listCablecard(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return cablecardServices.getCablecards(request, pagingRequest);
	}

    @GetMapping("/otas")
    public List<Ota> getAllOtas(){
        return this.otaServices.listAll(null).toList();
    }

	@PostMapping(value = "/otas/list")
	public PageInfo<Ota> listOta(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return otaServices.getOtas(request, pagingRequest);
	}

    @GetMapping("/roamionpls")
    public List<Roamionpl> getAllRoamionpls(){
        return this.roamionplServices.listAll(null).toList();
    }

	@PostMapping(value = "/roamionpls/list")
	public PageInfo<Roamionpl> listRoamionpl(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return roamionplServices.getRoamionpls(request, pagingRequest);
	}

    @GetMapping("/networksUsers")
    public List<NetworksUser> getAllNetworksUsers(){
        return this.networksUserServices.listAll(null).toList();
    }

	@PostMapping(value = "/networksUsers/list")
	public PageInfo<NetworksUser> listNetworksUser(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return networksUserServices.getNetworksUsers(request, pagingRequest);
	}

    @GetMapping("/roamiotodos")
    public List<Roamiotodo> getAllRoamiotodos(){
        return this.roamiotodoServices.listAll(null).toList();
    }

	@PostMapping(value = "/roamiotodos/list")
	public PageInfo<Roamiotodo> listRoamiotodo(HttpServletRequest request,@RequestBody PagingRequest pagingRequest) {

		return roamiotodoServices.getRoamiotodos(request, pagingRequest);
	}
}
