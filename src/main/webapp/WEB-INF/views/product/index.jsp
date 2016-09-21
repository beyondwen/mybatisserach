<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center;margin-left: auto;margin-right: auto">
    <form name="serachform" action="/product?currentPage">
        <input type="hidden" value="1" name="currentPage">
        商品名称 <input type="text" name="productName" value="${query.productName}">
        商品类型 <input type="text" name="productType" value="${query.productType}">
        价格区间 <input type="text" name="productMinPrice" value="${query.productMinPrice}">
        <input type="text" name="productMaxPrice" value="${query.productMaxPrice}">
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
    <a href="javascript:goPage(${1})">首页</a>
    <a href="javascript:goPage(${pageResult.prePage})">上一页</a>
    <a href="javascript:goPage(${pageResult.nextPage})">下一页</a>
    <a href="javascript:goPage(${pageResult.totalPage})">尾页</a>
    共${pageResult.totalPage}页
    <script>
        function goPage(page) {
            document.serachform.currentPage.value = page;
            document.serachform.submit();
        }
    </script>
</div>
</body>
</html>
