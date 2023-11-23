<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">


<html>
<head><title>All Inventory</title></head>

<body>
<h1>All Inventory</h1>
<br><br>
<table width='1000' border='2'>
        <tr>
            <th>ID</th>
            <th>Quantity</th>
        </tr>
    <c:forEach items="${list}" var="anInventory">0
        <tr>
            <td>${anInventory.inventoryId}</td>
            <td>${anInventory.quantityInStock}</td>
        </tr>
    </c:forEach>
</table>

<br><br><br>
<a href="index.jsp">Home</a>

</body>
</html>
