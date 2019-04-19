package com.macro.mall.portal.service;


import com.macro.mall.portal.dto.PmsPortalProductCategoryChildren;

import java.util.List;

/**
 * 产品分类Service
 * Created by zhangchangzhong on 2019/4/18.
 */
public interface PmsPortalProductCategoryService {

    List<PmsPortalProductCategoryChildren> listWithChildren();
}
