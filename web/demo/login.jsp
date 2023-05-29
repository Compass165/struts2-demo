<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>LOGIN</h1>
        
        <s:form method="post" action="login">
            <s:textfield name="username" label="Username" />
            <br>
            <s:password name="password" label="Password" />
            <br>
            <s:submit value="Login" />
        </s:form>
          
            
            <hr>
            <h5>Join with us!</h5>
        
    </body>
</html>
