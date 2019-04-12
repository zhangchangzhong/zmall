package com.macro.mall.portal.service.impl;

import com.macro.mall.portal.dao.PortalProductDao;
import com.macro.mall.portal.domain.PmsPortalProductDetail;
import com.macro.mall.portal.service.PmsPortalProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by macro on 2018/8/27.
 * 促销管理Service实现类
 */
@Service
public class PmsPortalProductServiceImpl implements PmsPortalProductService {
    @Autowired
    private PortalProductDao portalProductDao;

    public PmsPortalProductDetail getProductDetail(Long id){
        return portalProductDao.getProductDetail(id);
    };
}
