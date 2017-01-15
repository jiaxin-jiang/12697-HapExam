package com.hap.mapper;

import com.hap.dto.HapOmOrderInfo;

import java.util.List;

/**
 * Created by TandTV on 2017/1/13.
 */
public interface HapOmOrderInfoMapper {
    List<HapOmOrderInfo> selectHapOmOrderInfo (HapOmOrderInfo hapOmOrderInfo);
}
