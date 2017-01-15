package com.hap.mapper;

import com.hand.hap.mybatis.common.BaseMapper;
import com.hand.hap.mybatis.common.Mapper;
import com.hap.dto.HapOrgCompanys;

import java.util.List;

/**
 * Created by TandTV on 2017/1/10.
 */
public interface HapOrgCompanysMapper extends Mapper<HapOrgCompanys> {
    List<HapOrgCompanys> searchAll();
}
