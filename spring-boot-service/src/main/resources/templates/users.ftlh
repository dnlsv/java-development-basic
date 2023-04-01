<html>
<head>
    <title>Users</title>
</head>
<body>

<form method="post" action="/users">
    <label for="firstName">First Name</label>
    <input type="text" id="firstName" name="firstName">
    <label for="lastName">Last Name</label>
    <input type="text" id="lastName" name="lastName">
    <input type="submit" value="Add User">
</form>


<table>
    <tr>
        <th>User name</th>
        <th>Birth Date</th>
    </tr>
    <#list dataFromServer as user>
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
        </tr>
   </#list>
</table>

</body>
</html>
