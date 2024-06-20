<%@page import="com.ciq.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap 5 Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
 <jsp:include page="navbar.jsp"></jsp:include>
 
 <div class="container mt-5">
	<h3>All Employees</h3>

	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	%>
	<table class="table">
		<tr>
			<th>Eid</th>
			<th>Ename</th>
			<th>Esal</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
		for (Employee employee : employees) {
		%>
		<tr>
			<td><%=employee.getEid()%></td>
			<td><%=employee.getEname()%></td>
			<td><%=employee.getEsal()%></td>
			<td><a class="btn btn-success" href='./updateEmp?eid=<%=employee.getEid()%>'>Update</a></td>
			<td><a class="btn btn-danger"  href='./deleteEmpById?eid=<%=employee.getEid()%>'>Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
	</div>
	
</body>
</html>