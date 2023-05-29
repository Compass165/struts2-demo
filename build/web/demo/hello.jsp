<%-- 
    Document   : hello
    Created on : May 16, 2023, 11:47:55 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Page</h1>
        <a>${name}</a>
        <h3>Product information</h3>
        <br>
        <h4>ID: ${product.idProd}</h4>
        <br>
        <h4>Name: ${product.nameProd}</h4>
        <br>
        <h4>Price: $${product.priceProd}</h4>
    </body>
</html>
