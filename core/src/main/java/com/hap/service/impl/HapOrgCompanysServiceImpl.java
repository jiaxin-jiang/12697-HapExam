package com.hap.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.hap.dto.HapOrgCompanys;
import com.hap.mapper.HapOrgCompanysMapper;
import com.hap.service.IHapOrgCompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TandTV on 2017/1/10.
 */
@Service("hapOrgCompanysService")
public class HapOrgCompanysServiceImpl extends BaseServiceImpl<HapOrgCompanys> implements IHapOrgCompanysService {

    @Autowired
    private HapOrgCompanysMapper hapOrgCompanysMapper;

    public List<HapOrgCompanys> searchAll(){
        return hapOrgCompanysMapper.searchAll();
    }
}
