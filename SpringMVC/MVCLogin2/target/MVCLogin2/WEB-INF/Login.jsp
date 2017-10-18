<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Login Form</h1>
<form name="Login" action="/Login" method="POST">
Username:<input type="text" name="username"><br><br><br><br><br>
Password:<input type="password" name="password">
<input type="submit" value="Login">
<a href="Register.jsp">New User?? Sign Up</a>
</form>
</body>
</html>