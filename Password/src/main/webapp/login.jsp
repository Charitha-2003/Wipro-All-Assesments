<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Enter Your Details</h2>
    <form action="display.jsp" method="post">
        Name: <input type="text" name="username" /><br/><br/>
        Password: <input type="password" name="password" /><br/><br/>
        <input type="submit" value="Submit" />
        <input type="reset" value="Reset" />
    </form>
</body>
</html>