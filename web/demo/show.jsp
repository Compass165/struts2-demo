<%-- 
    Document   : show
    Created on : May 16, 2023, 1:37:54 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Product</h1>
        <c:forEach var="listProduct" items="${listProduct}">
            <h4>ID: ${listProduct.idProd}</h4>
            <br>
            <h4>Name: ${listProduct.nameProd}</h4>
            <br>
            <h4>Price: $${listProduct.priceProd}</h4>
            ======================================
            <br>
        </c:forEach>
    </body>
</html>
