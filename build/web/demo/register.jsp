<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register</h1>
        <s:form method="post" action="register">
            <s:textfield label="Username" name="user.username" />
            <br>
            <s:password label="Password" name="user.password" />
            <br>
            <s:textfield label="Type" name="user.type" />
            <br>
            <s:textfield label="Email" name="user.email" />
            <br>
            <s:textfield label="Website" name="user.website" />
            <br>
            <s:submit value="Register" />
        </s:form>
            
            <hr>
            <h5>Join with us!</h5>
    </body>
</html>
