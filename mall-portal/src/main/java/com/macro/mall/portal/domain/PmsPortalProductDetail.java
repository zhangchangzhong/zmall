package com.macro.mall.portal.domain;

import com.macro.mall.model.*;

import java.util.List;

/**
 * 门户查看商品详情
 * Created by zcz on 2019/4/11.
 */
public class PmsPortalProductDetail extends PmsProduct{
    private List<PmsMemberPrice> memberPriceList;

    private List<PmsSkuStock> skuStockList;

    private List<PmsProductAttributeValue> productAttributeValueList;

    private List<PmsProductAttribute> productAttributeList;

    public List<PmsMemberPrice> getMemberPriceList() {
        return memberPriceList;
    }

    public void setMemberPriceList(List<PmsMemberPrice> memberPriceList) {
        this.memberPriceList = memberPriceList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductAttributeValue> getProductAttributeValueList() {
        return productAttributeValueList;
    }

    public void setProductAttributeValueList(List<PmsProductAttributeValue> productAttributeValueList) {
        this.productAttributeValueList = productAttributeValueList;
    }

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }


}
