<%--
  Created by IntelliJ IDEA.
  User: velzevul
  Date: 18/03/2020
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hallo World fromJSP</title>
</head>
<body>
My First JSP ${errorMessage}
<form action="/login" method="post" >
    Enter your name, please
    <input type="text" name="name"/>
    <input type="password" name="password"/>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
