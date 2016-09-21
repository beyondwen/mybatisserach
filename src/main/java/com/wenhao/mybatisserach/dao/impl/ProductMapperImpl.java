package com.wenhao.mybatisserach.dao.impl;

import com.wenhao.mybatisserach.dao.IProductMapper;
import com.wenhao.mybatisserach.domain.Product;
import com.wenhao.mybatisserach.query.PageResult;
import com.wenhao.mybatisserach.query.ProductQuery;
import com.wenhao.mybatisserach.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class ProductMapperImpl implements IProductMapper {
    public PageResult<Product> queryPage(int currentPage, int pageSize) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("startIndex", (currentPage - 1) * pageSize);
        params.put("pageSize", pageSize);
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //总条数
        int totalCount = sqlSession.selectOne("com.wenhao.mybatisserach.dao.IProductMapper.totalCount");
        List<Product> list = sqlSession.selectList("com.wenhao.mybatisserach.dao.IProductMapper.queryPage", params);
        //此处要将totalCount和list  所以应该封装为一个对象进行返回
        return new PageResult<Product>(totalCount,list,currentPage,pageSize);
    }

    public List<Product> getAll(ProductQuery query) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<Product> list = sqlSession.selectList("com.wenhao.mybatisserach.dao.IProductMapper.getAll", query);
        sqlSession.close();
        return list;
    }
}
