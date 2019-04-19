package com.macro.mall.portal.controller;


import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.domain.PmsPortalProductDetail;
import com.macro.mall.portal.dto.PmsPortalProductCategoryChildren;
import com.macro.mall.portal.service.PmsPortalProductCategoryService;
import com.macro.mall.portal.service.PmsPortalProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品分类展示
 * Created by zhangchangzhong on 2019/4/18.
 */
@Controller
@Api(tags = "PmsProductCategoryController", description = "商品分类管理")
@RequestMapping("/productCategory")
public class PmsPortalProductCategoryController {
    @Autowired
    private PmsPortalProductCategoryService pmsPortalProductCategoryService;



    @ApiOperation("查询所有一级分类及子分类")
    @RequestMapping(value = "/list/withChildren", method = RequestMethod.GET)
    @ResponseBody
    public Object listWithChildren() {
        List<PmsPortalProductCategoryChildren> list = pmsPortalProductCategoryService.listWithChildren();
        return new CommonResult().success(list);
    }


}
