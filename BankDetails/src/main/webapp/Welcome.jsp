<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Information</title>
    <style>
@keyframes flyIn {
    0% { transform: translateY(50px); opacity: 0; }
    100% { transform: translateY(0); opacity: 1; }
}

a {
    display: inline-block;
    margin: 10px 0;
    padding: 10px 20px;
    font-size: 18px;
    text-align: center;
    text-decoration: none;
    color: #fff;
    background-color: #4CAF50; /* Green color */
    border-radius: 4px;
    animation: flyIn 0.5s ease-in-out forwards;
    opacity: 0;
}

a:hover {
    background-color: #45a049; /* Darker green on hover */
    text-decoration: none;
}
</style>

</head>
<body>
    <h1>User Information</h1>
    <p>User ID: <%= request.getAttribute("fetchedUserId") %></p>
    <p>Password: <%= request.getAttribute("fetchedPassword") %></p>
    <a href="Withdraw.jsp">Withdraw money</a><br>
    <a href="Transfer.jsp">Transfer money</a><br>
    <a href="Deposit.jsp">Deposit money</a><br>
    <a href="Balance.jsp">Check balance</a><br>
</body>
</html>
