<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calc</title>
</head>
<body bgcolor='gray'>

	<%
	String value1 = request.getParameter("Input1");
	String value2 = request.getParameter("Input2");

	int result = Integer.parseInt(value1) + Integer.parseInt(value2);

	out.println("Output : " + result);
	%>

</body>
</html>