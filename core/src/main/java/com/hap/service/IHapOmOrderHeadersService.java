package com.hap.service;

        import com.hand.hap.system.service.IBaseService;
        import com.hap.dto.HapOmOrderHeaders;

/**
 * Created by TandTV on 2017/1/10.
 */
public interface IHapOmOrderHeadersService extends IBaseService<HapOmOrderHeaders> {
    boolean selectByOrderNumber(String orderNumber);
}
