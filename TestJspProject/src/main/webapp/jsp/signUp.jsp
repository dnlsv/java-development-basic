<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 18.11.2021
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>

<form method="post" action="/signUp">
    <label for="firstName">First Name</label>
    <input type="text" id="firstName" name="firstName">
    <label for="lastName">Last Name</label>
    <input type="text" id="lastName" name="lastName">
    <label for="password">Password</label>
    <input type="password" id="password" name="password">
    <input type="submit" value="Sign Up">
</form>

<table>
    <tr>
        <th>User name</th>
        <th>Birth Date</th>
    </tr>
    <c:forEach items="${dataForServlet}" var="user">
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
