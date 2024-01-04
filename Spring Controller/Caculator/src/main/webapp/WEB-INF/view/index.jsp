<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form action="caculator" method="post">
    <input type="number" name="num1" value="${num1}" placeholder="Enter the first number">
    <input type="number" name="num2" value="${num2}" placeholder="Enter the second number">
    <p>
        <input type="submit" name="caculator" value="+">
        <input type="submit" name="caculator" value="-">
        <input type="submit" name="caculator" value="*">
        <input type="submit" name="caculator" value="/">
    </p>
</form>
<h1>Result: ${result}</h1>
</body>
</html>