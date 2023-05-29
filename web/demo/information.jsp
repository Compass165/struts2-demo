<%-- 
    Document   : information
    Created on : May 16, 2023, 4:39:12 PM
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
        <h6>Register Successfully</h6>
        <hr>
        <h1>Information</h1>
        <br>
        <h2>Welcome new User with: </h2>
        <br>
        <h4>Username: ${user.username}</h4>
        <br>
        <h4>Password: ${user.password}</h4>
        <br>
        <h4>Type: ${user.type}</h4>
        <br>
        <h4>Email: ${user.email}</h4>
        <br>
        <h4>Website: ${user.website}</h4>
    </body>
</html>
