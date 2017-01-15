package com.hap.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import com.hap.dto.HapOrgCompanys;
import com.hap.service.IHapOrgCompanysService;
import com.hap.service.impl.HapOrgCompanysServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by TandTV on 2017/1/13.
 */
@RestController
@RequestMapping("/hapOrgCompanys")
public class HapOrgCompanysController extends BaseController {

    @Autowired
    @Qualifier("hapOrgCompanysService")
    private IHapOrgCompanysService hapOrgCompanysService;

    @RequestMapping(path = "/selectHapOrgCompanys" , method = RequestMethod.GET)
    public ResponseData selectHbiLanguage(HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        ResponseData rd = new ResponseData(hapOrgCompanysService.searchAll());
        return rd;
    }
}
