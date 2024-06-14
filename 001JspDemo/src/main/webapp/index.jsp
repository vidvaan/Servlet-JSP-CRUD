<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome JSP</h1>



	<%
	int a = 10;
	int b = 20;
	int result = add(a, b);
	%>



	<h1>
		Result :
		<%=result%></h1>


	<%!int add(int a, int b) {
		return a + b;
	}%>

</body>
</html>