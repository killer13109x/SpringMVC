<%--
  Created by IntelliJ IDEA.
  User: thelo
  Date: 27-Mar-19
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<center>
    <h1>CHUYỂN ĐỔI TIỀN TỆ VNĐ - USD</h1>
    <form method="post">
        <fieldset>
            <legend>Chuyển đổi tiền tệ</legend>
            <table border="1">
                VND to USD
                <tr>
                    <th>VNĐ</th>
                    <th><input type="number" name="ipVND" id="ipVND" value="${requestScope['VND']}"></th>
                </tr>
                <tr>
                    <th>USD</th>
                    <th>
                        <d:if test="${requestScope['resultUSD'] != null}">
                            ${requestScope['resultUSD']}
                        </d:if>
                    </th>
                </tr>
            </table>
            <hr>
            <table border="1">
                USD to VND
                <tr>
                    <th>USD</th>
                    <th><input type="number" name="ipUSD" id="ipUSD" value="${requestScope['USD']}"></th>
                </tr>
                <tr>
                    <th>VND</th>
                    <th>
                        <d:if test="${requestScope['resultVND'] != null}">
                            ${requestScope['resultVND']}
                        </d:if>
                    </th>
                </tr>
            </table>
            <button type="submit" id="btnUSDtoVND">Convert</button>
        </fieldset>
    </form>
</center>
</body>
</html>
