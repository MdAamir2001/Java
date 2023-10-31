<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Records</title>
</head>
<body>
    <h1>View Records</h1>

    <table border="10">
        <tr>
            <th>Part ID</th>
            <th>Part Name</th>
            <th>Color</th>
        <c:forEach var="part" items="${parts}">
            <tr>
                <td>${part.pid}</td>
                <td>${part.pname}</td>
                <td>${part.color}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
