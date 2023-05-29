<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <s:a action="hello">Hello</s:a>
        <br>
        <s:a action="show">Show</s:a>
        <br>
        <s:a href="demo/login.jsp">Login</s:a>
        <br>
        <s:a href="demo/register.jsp">Register</s:a>
        <br>
        <s:a href="demo/forgot.jsp">forgot</s:a>
    </body>
</html>
