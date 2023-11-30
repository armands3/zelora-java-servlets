<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">

<!DOCTYPE html>
<html>
<head>
    <title>Inventory Drill Down</title>

</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container">
    <h1>Inventory ID ${inventory.inventoryId}</h1>

    <table>
        <tr>
            <th>inventory ID</th>
        </tr>
        <tr>
            <td>${inventory.inventoryId}</td>
        </tr>

    </table>
    <p><a href="javascript:history.back()">Go Back</a></p>
</div>
</body>
</html>

