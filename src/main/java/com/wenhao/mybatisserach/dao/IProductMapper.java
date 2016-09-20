package com.wenhao.mybatisserach.dao;

import com.wenhao.mybatisserach.domain.Product;
import com.wenhao.mybatisserach.query.ProductQuery;

import javax.management.Query;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public interface IProductMapper {
    List<Product> getAll(ProductQuery query);
}
