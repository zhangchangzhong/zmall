package com.macro.mall.portal.dao;

import com.macro.mall.portal.dto.PmsPortalProductCategoryChildren;

import java.util.List;

/**
 * 商品分类自定义Dao
 * Created by zhangchangzhong on 2019/4/18.
 */
public interface PmsPortalProductCategoryDao {
    List<PmsPortalProductCategoryChildren> listWithChildren();
}
