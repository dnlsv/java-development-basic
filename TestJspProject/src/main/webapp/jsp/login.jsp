<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 18.11.2021
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form method="post" action="/login">
    <label for="firstName">First Name</label>
    <input type="text" id="firstName" name="firstName">
    <label for="password">Password</label>
    <input type="password" id="password" name="password">
    <input type="submit" value="Login">
</form>

</body>
</html>
