<%--
  Created by IntelliJ IDEA.
  User: Dadddddy
  Date: 21.11.2021
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/reg" method="post">
    <input type="text" placeholder="Name" name="name">
    <input type="text" placeholder="Last Name" name="lastName">
    <button>Registration</button>
</form>
<p>Welcome, ${requestScope.name}</p>
</body>
</html>
