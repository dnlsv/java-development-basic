<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 18.11.2021
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<p style="color: ${cookie.color.value}">Hello it's HOME</p>

<form method="post" action="/home">
    <label for="color">Color</label>
    <select name="color" id="color">
        <option value="red">Red</option>
        <option value="green">Green</option>
        <option value="blue">Blue</option>
    </select>
    <input type="submit" value="Send Color">
</form>

</body>
</html>
