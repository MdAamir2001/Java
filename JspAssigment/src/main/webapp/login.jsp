<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate Login</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body> 
<%
String user = request.getParameter("uname");
String password = request.getParameter("pass");
%>
<% 
if(user.equals("admin") && password.equals("admin")) {
    session.setAttribute("user", user);
%>
    <div class="container">
        <h2>Welcome <%= user %></h2><br/>
        <a href='addproducts.html'>Click to track admin page</a><br>
        <a href='adminView.html'>Link to view data</a>
    </div>
<% 
} else if (user.equals("user") && password.equals("user")) {
    session.setAttribute("user", user);
%>
    <div class="container">
        <a href='user.html'>Click to track user page</a>
    </div>
<% 
} else {
%>
    <div class="container">
        <h3 class="error">Invalid credentials</h3>
        <a href="login.html">Click to re-login</a>
    </div>
<% 
}
%>
</body>
</html>
