package com.macro.mall.portal.service;


import com.macro.mall.portal.domain.PmsPortalProductDetail;


/**
 * Created by zhangchangzhong on 2019/4/11.
 * 商品展示
 */
public interface PmsPortalProductService {

    PmsPortalProductDetail getProductDetail( Long id);
}
