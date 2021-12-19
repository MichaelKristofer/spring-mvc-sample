<%--
  Created by IntelliJ IDEA.
  User: Dadddddy
  Date: 21.11.2021
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calc" method="post">
    <input type="text" placeholder="Num1" name="a">
    <input type="text" placeholder="Num2" name="b">
    <input type="text" placeholder="Operation" name="operation">
    <button>Submit</button>
</form>
<p>Result = ${result}</p>
</body>
</html>
