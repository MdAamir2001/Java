<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insurance Agent Form</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
}

.container {
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    width: 400px;
    max-width: 100%;
    animation: fadeIn 1s;
}

h1 {
    font-size: 1.5em;
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}

label {
    font-weight: bold;
}

input[type="text"], input[type="password"] {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
    font-size: 16px;
}

input[type="submit"] {
    background-color: #007bff;
    color: #fff;
    font-size: 16px;
    border: none;
    cursor: pointer;
    padding: 10px 20px;
    border-radius: 5px;
    transition: background-color 0.3s;
    width: 100%;
}

input[type="submit"]:hover {
    background-color: #0056b3;
}

@keyframes fadeIn {
    from {
        opacity: 0;
        transform: translateY(-20px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}

    
</style>
</head>
<body>
<div class="container">
<h1>Insurance Agent Form</h1>
 
<spring:form action="/add-agent" method="post" modelAttribute="user">
 
    <label>Agent First Name:</label>
    <spring:input path="firstName"/><br/><br />
 
    <label>Agent Last Name:</label>
    <spring:input path="lastName"/><br/><br/>
 
    <label>Age:</label>
    <spring:input path="age"/><br/><br/>
 
    <label>Email ID:</label>
    <spring:input path="emailId"/><br/><br/>
 
    <label>Address:</label>
    <spring:input path="address"/><br/><br/>
 
    <label>Phone Number:</label>
    <spring:input path="phoneNumber"/><br/><br/>
    
    <label>Password:</label>
    <spring:input path="password"/><br/><br/>
    <spring:input path="role" value="Agent" type="hidden"/><br/><br/>
    <spring:input path="status" value="Active" type="hidden"/><br/><br/>
 
    <input type="submit" value="Add Agent">

</spring:form>
 </div>
 
</body>
</html>