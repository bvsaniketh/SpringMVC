<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getAttribute("user")!=null)
		{
			out.println(request.getAttribute("user"));
		}

%>

<form action="lo" method="POST">
<pre>
<fieldset>
<legend> Login Form</legend>
Username:<input type="text" name="user"><br>
Password:<input type="password" name="pass"><br>
<input type="submit" value="Log In"><br>
<a href="signup.jsp" >New user ! Sign Up</a>
</fieldset>
</form>
</pre>
</body>
</html>