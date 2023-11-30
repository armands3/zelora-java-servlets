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
<%@ include file="navbar.jsp" %>

<div id="contentToTranslate">
  <!-- Your page content goes here -->
  <h1>Welcome to Your Page</h1>
  <p>This is your unique content.</p>
</div>

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

