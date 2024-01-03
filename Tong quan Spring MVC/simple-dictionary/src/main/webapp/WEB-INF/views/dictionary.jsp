<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 12/27/2023
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
    <h1>Simple Dictionary</h1>
    <form action="" method="post">
        <table>
            <tr>
                <th>Word</th>
                <td>
                    <label>
                        <input type="text" name="word" placeholder="import word">
                    </label>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="search">
                </td>
            </tr>
        </table>
    </form>
    <p>Result: ${dictionary}</p>
    </form>
</body>
</html>
