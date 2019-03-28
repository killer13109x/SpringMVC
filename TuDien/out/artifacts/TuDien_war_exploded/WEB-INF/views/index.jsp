<%--
  Created by IntelliJ IDEA.
  User: thelo
  Date: 28-Mar-19
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển</title>
</head>
<body>
<center>
    <h1>TỪ ĐIỂN TRA CỨU ANH - VIỆT</h1>
    <form method="post">
        <table width="100%">
            <tr>
                <th>Nhập từ tra cứu:</th>
                <td><input type="text" id="word" name="word" value="${requestScope['word']}"></td>
            </tr>
            <tr>
                <th>Kết quả:</th>
                <td>${requestScope['result']}</td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
