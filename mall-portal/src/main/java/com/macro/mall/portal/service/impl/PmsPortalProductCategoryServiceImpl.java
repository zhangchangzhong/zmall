package com.macro.mall.portal.service.impl;

import com.macro.mall.portal.dao.PmsPortalProductCategoryDao;
import com.macro.mall.portal.dto.PmsPortalProductCategoryChildren;
import com.macro.mall.portal.service.PmsPortalProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * PmsProductCategoryService实现类
 * Created by zhangchangzhong on 2019/4/18.
 */
@Service
public class PmsPortalProductCategoryServiceImpl implements PmsPortalProductCategoryService {

    @Autowired
    private PmsPortalProductCategoryDao pmsPortalProductCategoryDao;

    @Override
    public List<PmsPortalProductCategoryChildren> listWithChildren() {
        return pmsPortalProductCategoryDao.listWithChildren();
    }


}
