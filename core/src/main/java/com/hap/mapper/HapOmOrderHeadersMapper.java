package com.hap.mapper;

import com.hand.hap.mybatis.common.BaseMapper;
import com.hand.hap.mybatis.common.Mapper;
import com.hap.dto.HapOmOrderHeaders;

/**
 * Created by TandTV on 2017/1/10.
 */
public interface HapOmOrderHeadersMapper extends Mapper<HapOmOrderHeaders> {
    int selectByOrderNumber(String orderNumber);
}
