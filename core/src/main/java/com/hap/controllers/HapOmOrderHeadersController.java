package com.hap.controllers;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import com.hap.dto.HapOmOrderHeaders;
import com.hap.service.IHapOmOrderHeadersService;
import com.hap.service.impl.HapOmOrderHeadersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by TandTV on 2017/1/14.
 */
@RestController
@RequestMapping("/hapOmOrderHeaders")
public class HapOmOrderHeadersController extends BaseController{

    @Autowired
    @Qualifier("hapOmOrderHeadersService")
    private IHapOmOrderHeadersService hapOmOrderHeadersService;

    @RequestMapping(path = "/selectByOrderNumber",method = RequestMethod.GET)
    public ResponseData selectByOrderNumber(@RequestParam(name = "orderNumber") String orderNumber){

        ResponseData responseData = new ResponseData();
        responseData.setSuccess(hapOmOrderHeadersService.selectByOrderNumber(orderNumber));
        return responseData;
    }
}
