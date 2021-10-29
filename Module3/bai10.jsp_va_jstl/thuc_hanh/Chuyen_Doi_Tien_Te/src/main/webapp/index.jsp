<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27/10/2021
  Time: 8:43 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <style>
    .convert {
      border: 1px solid cadetblue;
      position: absolute;
      height: 190px;
      width: 220px
    }
    .convert label {
      padding: 5px;
      margin: 5px;
    }
    .convert input {
      padding: 5px;
      margin: 5px;
      height: 40px;
    }
    #submit {
      background-color: darkgray;
    }
  </style>
</head>
<body>
<form method="post" action="converter.jsp">
  <div class="convert">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type="submit" id="submit" value="Converter"/>
  </div>
</form>
</body>
</html>
