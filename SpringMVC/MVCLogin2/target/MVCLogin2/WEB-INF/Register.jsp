<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Registration Form</h1>
<form name="Register" action="/Register" method="POST">
Name:<input type="text" name="name"><br>
Age:<input type="text" name="age"><br>
Mobile Number:<input type="text" name="mobile"><br>
Username:<input type="text" name="username"><br>
Password:<input type="password" name="password"><br>

<input type="submit" value="Login">
</form>
<a href="Login.jsp">Login</a>

</body>
</html>