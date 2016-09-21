package com.wenhao.mybatisserach.dao;

import com.wenhao.mybatisserach.domain.Product;
import com.wenhao.mybatisserach.query.PageResult;
import com.wenhao.mybatisserach.query.ProductQuery;

import javax.management.Query;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public interface IProductMapper {
    List<Product> getAll(ProductQuery query);


    /**
     * @param currentPage 当前页
     * @param pageSize    每页多少条数据
     * @return 返回一个pageResult对象
     */
    PageResult<Product> queryPage(int currentPage, int pageSize);
}
