<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
</head>
<body>
    <h1>Welcome to Admin Dashboard</h1>
    
    <form action="updateCurrency" method="post">
        Currency Name: <input type="text" name="currencyName" required><br><br>
        New Value: <input type="text" name="newValue" required><br><br>
        <input type="submit" value="Update Currency">
    </form>
    
    <br><br>
    
    <form action="addCurrency" method="post">
        Currency Name: <input type="text" name="currencyName" required><br><br>
        Value: <input type="text" name="value" required><br><br>
        <input type="submit" value="Add Currency">
    </form>
</body>
</html>
