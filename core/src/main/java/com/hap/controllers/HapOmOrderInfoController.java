package com.hap.controllers;

import com.github.pagehelper.PageHelper;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import com.hap.dto.HapOmOrderInfo;
import com.hap.service.IHapOmOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TandTV on 2017/1/14.
 */
@RestController
@RequestMapping("/hapOmOrderInfo")
public class HapOmOrderInfoController extends BaseController {

    @Autowired
    @Qualifier("hapOmOrderInfoService")
    private IHapOmOrderInfoService hapOmOrderInfoService;

    @RequestMapping(path = "/select",method = RequestMethod.GET)
    public ResponseData selectHapOmOrderInfo(HapOmOrderInfo omOrderInfo,
                                             @RequestParam(name = "page")Integer page,
                                             @RequestParam(name = "pageSize")Integer pageSize
                                             ) {
        List<HapOmOrderInfo> list = hapOmOrderInfoService.selectHapOmOrderInfo(omOrderInfo);
        ResponseData rs = new ResponseData(list);
        return rs;
    }
}