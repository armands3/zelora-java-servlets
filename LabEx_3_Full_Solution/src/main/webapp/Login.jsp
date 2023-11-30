<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
    <title>Login Page</title>
</head>

<body>
<%@ include file="navbar.jsp" %>
<section>
    <div class="login-form">
        <h2>Login</h2>
        <form action="#" method="post">
            <input type="text" class="login-input" placeholder="Username" required>
            <input type="password" class="login-input" placeholder="Password" required>
            <button type="submit" class="login-button">Login</button>
        </form>
    </div>
</section>


<footer>
</footer>
</body>

</html>

