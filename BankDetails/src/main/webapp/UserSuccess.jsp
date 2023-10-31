<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Account Created</title>
    <style>
        /* Style for the heading */
        h1 {
            animation: slideFromRight 1s ease-in-out;
        }

        /* Style for the link as a button */
        a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s;
        }

        a:hover {
            background-color: #45a049;
        }

        /* Keyframes for the animation */
        @keyframes slideFromRight {
            from {
                transform: translateX(100%);
                opacity: 0;
            }
            to {
                transform: translateX(0);
                opacity: 1;
            }
        }
    </style>
</head>
<body>
    <h1>Account Created Successfully!</h1>
    <a href="UserLogin.jsp">Login</a>
</body>
</html>
