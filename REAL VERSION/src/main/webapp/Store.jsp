<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
  <title>Store Page</title>
</head>

<body>
<header>
  <img src="assets/images/thumbs/no-image.png" alt="Zelora Logo" id="logo">
  <h1>Zelora</h1>
</header>

<nav>
  <a href="index.jsp">Home</a>
  <a href="Login.jsp">Login</a>
</nav>

<section>
  <form id="searchForm">
    <input type="text" id="searchInput" placeholder="Search by name, color, size...">
    <button type="button" onclick="searchProducts()">Search</button>
  </form>

  <div id="searchResults">

  </div>

</section>

<footer>
</footer>
</body>

</html>

