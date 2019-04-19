package com.macro.mall.portal.dto;

import com.macro.mall.model.PmsProductCategory;

import java.util.List;

/**
 * Created by zhangchangzhong on 2019/4/18.
 */
public class PmsPortalProductCategoryChildren extends PmsProductCategory {
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
