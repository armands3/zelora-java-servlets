<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">

<html>
<head><title>All Inventory</title></head>

<body>
<%@ include file="navbar.jsp" %>
<h1>All Inventory</h1>
<br><br>
<table width='1000' border='2'>
        <tr>
            <th>ID</th>
            <th>Quantity</th>
            <th>Reserved</th>
            <th>Reorder Point</th>
            <th>Prod ID</th>
            <th>Supplier ID</th>
        </tr>
    <c:forEach items="${list}" var="anInventory">0
        <tr>
            <td><a href="drilldown?id=${inventory.inventoryID}">${inventory.inventoryID}</a></td>
            <td>${anInventory.quantityInStock}</td>
            <td>${anInventory.quanntityReserved}</td>
            <td>${anInventory.reorderPoint}</td>
            <td>${anInventory.ProductId}</td>
            <td>${anInventory.supplierId}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
