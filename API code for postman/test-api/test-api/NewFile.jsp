<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/user" method="POST">
	<label for="email">Email</label>
	<input name="email" />
	<br/>
	<label for="password">Password</label>
	<input name="password" />
	<br/>
	<input type="submit" value="Submit" />
</form>

</body>
</html>