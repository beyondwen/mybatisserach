package com.wenhao.mybatisserach.controller;

import com.wenhao.mybatisserach.dao.IProductMapper;
import com.wenhao.mybatisserach.dao.impl.ProductMapperImpl;
import com.wenhao.mybatisserach.domain.Product;
import com.wenhao.mybatisserach.query.ProductQuery;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    IProductMapper dao = new ProductMapperImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("productName");
        String productType = req.getParameter("productType");
        String productMinPrice = req.getParameter("productMinPrice");
        String productMaxPrice = req.getParameter("productMaxPrice");
        ProductQuery query = new ProductQuery();
        query.setProductName(productName);
        query.setProductType(productType);
        if (!StringUtils.isEmpty(productMaxPrice)) {
            BigDecimal max = new BigDecimal(productMaxPrice);
            query.setProductMaxPrice(max);
        }
        if (!StringUtils.isEmpty(productMinPrice)) {
            BigDecimal min = new BigDecimal(productMinPrice);
            query.setProductMinPrice(min);
        }
        List<Product> list = dao.getAll(query);
        req.setAttribute("list", list);
        req.getRequestDispatcher("/WEB-INF/views/product/index.jsp").forward(req, resp);
    }


}
