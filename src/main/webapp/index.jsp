<%--
  Created by IntelliJ IDEA.
  User: KieuAnh
  Date: 10/19/2018
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/prddiscount" method="post">
    <label>Product Description: </label>
    <input name="productDescription">
    <label>List Price: </label>
    <input name="listPrice">
    <label>Discount Percent: </label>
    <input name="discountPercent">
    <input type="submit">
  </form>
  </body>
</html>
