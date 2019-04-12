package com.macro.mall.portal.controller;


import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.domain.PmsPortalProductDetail;
import com.macro.mall.portal.service.PmsPortalProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品展示
 * Created by zhangchangzhong on 2019/4/11.
 */
@Controller
@Api(tags = "PmsProductController", description = "商品管理")
@RequestMapping("/product")
public class PmsPortalProductController {
    @Autowired
    private PmsPortalProductService pmsPortalProductService;



    @ApiOperation("根据商品id获取商品详情")
    @RequestMapping(value = "/getProductDetail", method = RequestMethod.GET)
    @ResponseBody
    public Object getProductDetail(@Param("id") Long id) {
        PmsPortalProductDetail productResult = pmsPortalProductService.getProductDetail(id);
        return new CommonResult().success(productResult);
    }


}
