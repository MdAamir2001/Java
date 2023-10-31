<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Currency Converter</title>
</head>
<body>
    <h1>Currency Converter</h1>
    
    <form action="convert" method="post">
        Amount: <input type="text" name="amount" required><br><br>
        
        From Currency:
        <select name="fromCurrency">
            <option value="USD">US Dollar</option>
            <option value="EUR">Euro</option>
            <option value="GBP">British Pound</option>
            <!-- Add more currency options as needed -->
        </select><br><br>
        
        To Currency:
        <select name="toCurrency">
            <option value="USD">US Dollar</option>
            <option value="EUR">Euro</option>
            <option value="GBP">British Pound</option>
            <!-- Add more currency options as needed -->
        </select><br><br>
        
        <input type="submit" value="Convert">
    </form>
</body>
</html>
