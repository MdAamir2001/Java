<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome to Currency Converter</h1>
    
    <form action="result.jsp" method="post">
        Amount: <input type="text" name="amount" required><br><br>
        
        From Currency:
        <select name="fromCurrency">
            <option value="USD">US Dollar</option>
            <option value="EUR">Euro</option>
            <option value="INR">Indian Rupee</option>
        </select><br><br>
        
        To Currency:
        <select name="toCurrency">
            <option value="USD">US Dollar</option>
            <option value="EUR">Euro</option>
            <option value="INR">Indian Rupee</option>
        </select><br><br>
        
        <input type="submit" value="Convert">
    </form>
    
    <br><br>
    
    <a href="login.jsp">Login</a>
</body>
</html>
