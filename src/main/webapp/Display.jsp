<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<h2>Show book details</h2>

	<ul>

		<% // Declaration tag
		List<String> bookList = (List<String>) request.getAttribute("BookList");

		for (String value : bookList) {
		%>

		<li><%=value%></li>

		<%
		}
		%>

	</ul>
</body>
</html>