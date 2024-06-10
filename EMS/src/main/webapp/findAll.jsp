<%@page import="com.ciq.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All Employees</h1>

	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	%>
	<table border="1px">
		<tr>
			<th>Eid</th>
			<th>Ename</th>
			<th>Esal</th>
		</tr>
		<%
		for (Employee employee : employees) {
		%>
		<tr>
			<td><%=employee.getEid()%></td>
			<td><%=employee.getEname()%></td>
			<td><%=employee.getEsal()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>