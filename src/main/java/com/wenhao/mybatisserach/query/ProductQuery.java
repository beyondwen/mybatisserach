package com.wenhao.mybatisserach.query;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class ProductQuery {
    private String productName;
    private String productType;
    private BigDecimal productMinPrice;
    private BigDecimal productMaxPrice;

    private int pageSize;//每页多少条
    private int startIndex;//起始下标


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

    //创建list用于存放sql
    private List<String> condtion = new ArrayList<String>();

    //消除where1=1的
    public String getQuerySql() {
        StringBuilder sql = new StringBuilder();
        if (StringUtils.isNotEmpty(productName)) {
            condtion.add(" productName like concat('%',#{productName},'%') ");
        }
        if (StringUtils.isNotEmpty(productType)) {
            condtion.add(" productType like concat('%',#{productType},'%') ");
        }
        if (productMinPrice != null) {
            condtion.add(" productMinPrice >= #{productMinPrice} ");
        }
        if (productMaxPrice != null) {
            condtion.add(" productMaxPrice <= #{productMaxPrice} ");
        }
        if (condtion.size() > 0) {
            sql.append(" where ");
        }
        boolean isNotFirst = true;
        for (String c : condtion) {
            if (isNotFirst) {
                sql.append(c);
                isNotFirst = false;
            } else {
                sql.append(" and ").append(c);
            }
        }
        return sql.toString();

    }

    /*这是带where 1=1的
    public String getQuerySql() {
        StringBuilder sql = new StringBuilder();
        sql.append(" where 1=1 ");
        if (!StringUtils.isEmpty(productName)) {
            sql.append(" and productName like concat('%',#{productName},'%') ");
        }
        if (!StringUtils.isEmpty(productType)) {
            sql.append(" and productType like concat('%',#{productType},'%') ");
        }
        if (productMinPrice != null) {
            sql.append(" and productMinPrice >= #{productMinPrice} ");
        }
        if (productMaxPrice != null) {
            sql.append(" and productMaxPrice <= #{productMaxPrice} ");
        }
        return sql.toString();
    }*/
}
