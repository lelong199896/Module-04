<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 12/28/2023
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EmailValidate</title>
</head>
<body>
<h1>Email Validate</h1>
<h3 style="color: red">${message}</h3>
<form action="validate" method="post">
    <input type="text" name="email"><br>
    <input type="submit"  name="validate">
</form>
</body>
</html>
