<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Display Info</title>
</head>
<body>
    <h2>Submitted Information:</h2>
    <p>Name: <%= request.getParameter("username") %></p>
    <p>Password: <%= request.getParameter("password") %></p>
</body>
</html>