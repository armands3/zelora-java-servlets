<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">


<html>
<head><title>All Customers</title></head>

<body>
<%@ include file="navbar.jsp" %>
<h1>All Customers</h1>
<br><br>
<table width='1000' border='2'>
  <tr>
    <th>ID</th>
    <th>Quantity</th>
  </tr>
  <c:forEach items="${list}" var="aCustomer">0
    <tr>
      <td>${aCustomer.firstName}</td>
      <td>${aCustomer.lastName}</td>
  </c:forEach>
</table>



</body>
</html>
