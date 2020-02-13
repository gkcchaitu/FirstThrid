<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE Hello World</title>
</head>
<body>
	<h1> Hello World Java EE</h1>
	<center>
		<form action="HelloServlet" method="post">
		Enter a number: <input type="text" name="number" size="5" />
		Enter a Name  : <input type="text" name="name" size="20" />
		<input type="submit" values="call servlet">
		</form>
	</center>
</body>
</html>