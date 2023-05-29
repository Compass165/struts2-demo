<%-- 
    Document   : forgot
    Created on : May 29, 2023, 2:36:17 PM
    Author     : nguye
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>FORGOT PASSWORD</h1>
        
        <s:form method="post" action="forgot">
            <s:textfield name="userName" label="Username" />
            <br>
            <s:password name="passWord" label="Password" />
            <br>
            <s:submit value="Save" />
        </s:form>
          
            
          
            
    </body>
</html>
