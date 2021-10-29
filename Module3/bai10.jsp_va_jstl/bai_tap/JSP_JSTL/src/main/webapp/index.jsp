<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25/10/2021
  Time: 8:29 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
  <style>
    fieldset {
      width: 340px;
    }
    tr td {
      padding: 5px;
      font-size: 14pt;
    }
    form {
      font-size: 18pt;
    }
    input {
      height: 30px;
      border-radius: 5px;
    }
    select {
      height: 30px;
      width: 150px;
      border-radius: 5px;
      border: 2px solid black;
    }
    button {
      border-radius: 5px;
      width: 120px;
      height: 30px;
    }
  </style>
</head>
<body>
<h1>Simple Calculator</h1>

<form action="/calculator" method="post">
  <fieldset>
    <legend>Calculator</legend>
    <table>
      <tr>
        <td>
          <label> First operand:</label>
        </td>
        <td>
          <input type="number" name="firstOperand">
        </td>
      </tr>
      <tr>
        <td>
          <label> Operator: </label>
        </td>
        <td>
          <select name="operator">
            <option value="addition">Addition</option>
            <option value="subtraction">Subtraction</option>
            <option value="multiplication">Multiplication</option>
            <option value="division">Division</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>
          <label> Second Operand: </label>
        </td>
        <td>
          <input type="number" name="secondOperand">
        </td>
      </tr>
      <tr>
        <td></td>
        <td>
          <button type="submit">Calculator</button>
        </td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
