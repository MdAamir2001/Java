<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bank Account Creation</title>
    <link rel="stylesheet" type="text/css" href="Loginstyles.css">
    
</head>
<body>
<div class=container>
    <h1>Welcome to the  Indian Bank</h1>
    <form action="CreateAccountServlet" method="post">
        User ID: <input type="text" name="userId" required><br>
        Password: <input type="password" name="password" required><br>
        Account Number: <input type="text" name="accountNumber" required><br>
        Balance: <input type="text" name="balance" required><br>
        <input type="submit" value="Create Account">
    </form>
    </div>
</body>
</html>
