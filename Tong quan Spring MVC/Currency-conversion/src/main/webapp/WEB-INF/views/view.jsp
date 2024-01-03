<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 12/26/2023
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h1>Currency Converter</h1>
<br>
<form action="/convert" method="post">
    <table>
        <tr>
            <th>USD</th>
            <td>
                <label>
                    <input type="text" name="usd" placeholder="usd">
                </label>
            </td>
        </tr>
        <tr>
            <th>Currency</th>
            <td>
                <label>
                    <input type="text" name="currency" placeholder="currency">
                </label>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Convert">
            </td>
        </tr>
    </table>
</form>
<p>Result: ${result}</p>

</body>
</html>
