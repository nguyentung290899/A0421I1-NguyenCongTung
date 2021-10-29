<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27/10/2021
  Time: 5:34 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
  <style>
    table {
      border-collapse: collapse;
      width: 60%;
    }
    th, td {
      text-align: left;
      padding: 8px;
    }
    tr:nth-child(even){background-color: #f2f2f2}
    th {
      background-color: #4CAF50;
      color: white;
    }
    img {
      width: 100px;
      height: 100px;
    }
  </style>
</head>
<body>
<h1>Danh Sách khách Hàng</h1>
<table>
  <tr>
    <th>Tên</th>
    <th>Ngày Sinh</th>
    <th>Địa chỉ</th>
    <th>Ảnh</th>
  </tr>
  <c:forEach var="customer" items="${customerListServlet}" varStatus="loop">
    <tr>
      <td><c:out value="${customer.name}"></c:out></td>
      <td><c:out value="${customer.day_of_birth}"></c:out></td>
      <td><c:out value="${customer.address}"></c:out></td>
      <td><img src="<c:url value="${customer.image}"/> "></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>