package com.hap.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.hap.dto.HapOmOrderHeaders;
import com.hap.mapper.HapOmOrderHeadersMapper;
import com.hap.service.IHapOmOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by TandTV on 2017/1/10.
 */
@Service("hapOmOrderHeadersService")
public class HapOmOrderHeadersServiceImpl extends BaseServiceImpl<HapOmOrderHeaders> implements IHapOmOrderHeadersService {

    @Autowired
    private HapOmOrderHeadersMapper hapOmOrderHeadersMapper;

    @Override
    public boolean selectByOrderNumber(String orderNumber) {
        if (hapOmOrderHeadersMapper.selectByOrderNumber(orderNumber) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
