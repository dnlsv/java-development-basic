<html>
<body>
<#if error??>
    <script src="/js/script.js"></script>
</#if>
    <form method="post" action="/login">
        <label for="login">Login
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <input type="submit" value="Login">
        <br>
        <label for="remember-me">
            <input type="checkbox" id="remember-me" name="rememberMe">Remember me</label>
    </form>
</body>
</html>