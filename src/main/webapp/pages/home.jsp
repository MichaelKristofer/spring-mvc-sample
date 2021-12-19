<%--
  Created by IntelliJ IDEA.
  User: Dadddddy
  Date: 21.11.2021
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<p>Hello ${sessionScope.user.name}</p>
<a href="/reg">Registration</a>
<a href="/auth">Authorization</a>
<a href="/calc">Calculator</a>
<a href="/logout">Logout</a>
</body>
</html>
