package com.hap.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import com.hap.service.IHapArCustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.element.Name;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by TandTV on 2017/1/11.
 */
@RestController
@RequestMapping("/hapArCustomers")
public class HapArCustomersController extends BaseController {

    @Autowired
    @Qualifier("hapArCustomersService")
    private IHapArCustomersService hapArCustomersService;

    @RequestMapping(path = "/select",method = RequestMethod.GET)
    public ResponseData test(HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        ResponseData rd = new ResponseData(hapArCustomersService.selectAll(iRequest));
        return rd;
    }
}
