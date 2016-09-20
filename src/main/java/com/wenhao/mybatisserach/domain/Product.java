package com.wenhao.mybatisserach.domain;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class Product {
    private Long id;
    private String productName;
    private String productType;
    private BigDecimal productMinPrice;
    private BigDecimal productMaxPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getProductMinPrice() {
        return productMinPrice;
    }

    public void setProductMinPrice(BigDecimal productMinPrice) {
        this.productMinPrice = productMinPrice;
    }

    public BigDecimal getProductMaxPrice() {
        return productMaxPrice;
    }

    public void setProductMaxPrice(BigDecimal productMaxPrice) {
        this.productMaxPrice = productMaxPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productMinPrice=" + productMinPrice +
                ", productMaxPrice=" + productMaxPrice +
                '}';
    }
}
