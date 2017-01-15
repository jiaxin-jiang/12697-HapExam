package com.hap.service.impl;

import com.hap.dto.HapOmOrderInfo;
import com.hap.mapper.HapOmOrderInfoMapper;
import com.hap.service.IHapOmOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TandTV on 2017/1/14.
 */
@Service("hapOmOrderInfoService")
public class HapOmOrderInfoServiceImpl implements IHapOmOrderInfoService {

    @Autowired
    private HapOmOrderInfoMapper hapOmOrderInfoMapper;

    @Override
    public List<HapOmOrderInfo> selectHapOmOrderInfo(HapOmOrderInfo hapOmOrderInfo) {
        return hapOmOrderInfoMapper.selectHapOmOrderInfo(hapOmOrderInfo);
    }
}
