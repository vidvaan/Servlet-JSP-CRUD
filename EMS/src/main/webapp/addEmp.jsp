<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap 5 Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>

	<div class="container mt-3">
		<h2>Add Employee</h2>
		<form action="./addEmp.do" method="post">
			<div class="mb-3 mt-3">
				<label for="eid">Employee Id:</label> <input type="text"
					class="form-control" id="eid" placeholder="Enter Eid" name="eid">
			</div>
			<div class="mb-3">
				<label for="ename">Employee Name:</label> <input type="text"
					class="form-control" id="ename" placeholder="Enter Ename"
					name="ename">
			</div>
			<div class="mb-3">
				<label for="esal">Employee Salary:</label> <input type="text"
					class="form-control" id="esal" placeholder="Enter Esal" name="esal">
			</div>
			<input class="btn btn-success" type="submit" value="Submit" >
			<input class="btn btn-warning" type="reset">
		</form>
	</div>



</body>
</html>