<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center;margin-left: auto;margin-right: auto">
    <form action="/product">
        商品名称 <input type="text" name="productName">
        商品类型 <input type="text" name="productType">
        价格区间 <input type="text" name="productMinPrice"><input type="text" name="productPrice">
        <input type="submit" value="查询">
    </form>
    <table border="1px" align="center" width="80%">
        <tr>
            <th>序号</th>
            <th>名称</th>
            <th>类型</th>
            <th>最低价格</th>
            <th>最高价格</th>
        </tr>

        <c:forEach items="${pageResult.pageList}" var="li">

            <tr>
                <td>${li.id}</td>
                <td>${li.productName}</td>
                <td>${li.productType}</td>
                <td>${li.productMinPrice}</td>
                <td>${li.productMaxPrice}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/product?currentPage=1">首页</a>
    <a href="/product?currentPage=${pageResult.prePage}">上一页</a>
    <a href="/product?currentPage=${pageResult.nextPage}">下一页</a>
</div>
</body>
</html>
