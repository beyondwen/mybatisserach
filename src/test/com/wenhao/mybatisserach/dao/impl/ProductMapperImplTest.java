package com.wenhao.mybatisserach.dao.impl;

import com.wenhao.mybatisserach.dao.IProductMapper;
import com.wenhao.mybatisserach.domain.Product;
import com.wenhao.mybatisserach.query.ProductQuery;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class ProductMapperImplTest {
    IProductMapper dao = new ProductMapperImpl();

    @Test
    public void getAll() throws Exception {
        ProductQuery query = new ProductQuery();
        List<Product> list = dao.getAll(query);
        for (Product p : list) {
            System.out.println(p);
        }
    }

}