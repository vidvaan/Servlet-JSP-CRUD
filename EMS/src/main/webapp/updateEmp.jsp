<%@page import="com.ciq.dto.Employee"%>
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

	<%
	Employee employee = (Employee) request.getAttribute("employee");
	%>

	<div class="container mt-3">
		<h2>Update Employee</h2>
		<form action="./updateEmp" method="post">
			<div class="mb-3 mt-3">
				<label for="eid">Employee Id:</label> <input type="text"
					class="form-control" id="eid" placeholder="Enter Eid" name="eid" value="<%=employee.getEid()%>" readonly="readonly">
			</div>
			<div class="mb-3">
				<label for="ename">Employee Name:</label> <input type="text"
					class="form-control" id="ename" placeholder="Enter Ename"
					name="ename" value="<%=employee.getEname()%>">
			</div>
			<div class="mb-3">
				<label for="esal">Employee Salary:</label> <input type="text"
					class="form-control" id="esal" placeholder="Enter Esal" name="esal" value="<%=employee.getEsal()%>">
			</div>
			<input class="btn btn-success" type="submit" value="Update" >
			<input class="btn btn-warning" type="reset">
		</form>
	</div>

</body>
</html>