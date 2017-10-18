<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form name="login" modelAttribute="user" action="welcome" method="POST">
<form:label path="name"/>Name:<br>
<form:input path="name"/><br>
<form:errors path="name"/><br>

<form:label path="age"/>Age: <br>
<form:input path="age"/><br>
<form:errors path="age"/><br>

 <br>
<input type="submit" value="go">
</form:form>
</body>
</html>