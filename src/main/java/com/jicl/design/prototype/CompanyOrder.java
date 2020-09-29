package com.jicl.design.prototype;

import java.util.StringJoiner;

/**
 * 企业订单
 *
 * @author : xianzilei
 * @date : 2020/9/24 15:45
 */
public class CompanyOrder extends AbstractOrder {
    /**
     * 企业编码
     */
    private String companyCode;
    /**
     * 企业名称
     */
    private String companyName;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public AbstractOrder selfCopy() {
        CompanyOrder copy = new CompanyOrder();
        copy.setCompanyCode(this.companyCode);
        copy.setCompanyName(this.companyName);
        copy.setGoodsNum(getGoodsNum());
        return copy;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanyOrder{");
        sb.append("companyCode='").append(companyCode).append('\'');
        sb.append(", companyName='").append(companyName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
