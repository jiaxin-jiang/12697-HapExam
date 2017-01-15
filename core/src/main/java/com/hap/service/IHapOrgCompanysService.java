package com.hap.service;

import com.hand.hap.system.service.IBaseService;
import com.hap.dto.HapOrgCompanys;

import java.util.List;

/**
 * Created by TandTV on 2017/1/10.
 */
public interface IHapOrgCompanysService extends IBaseService<HapOrgCompanys> {

    List<HapOrgCompanys> searchAll();
}
