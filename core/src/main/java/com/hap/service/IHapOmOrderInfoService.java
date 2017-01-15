package com.hap.service;

import com.hap.dto.HapOmOrderInfo;

import java.util.List;

/**
 * Created by TandTV on 2017/1/14.
 */
public interface IHapOmOrderInfoService {
    List<HapOmOrderInfo> selectHapOmOrderInfo (HapOmOrderInfo hapOmOrderInfo);
}
