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

	<jsp:include page="navbar-home.jsp"></jsp:include>

	<div class="container mt-3">
		<h2>User Login Page</h2>
		<form action="./login.do" method="post">
			<div class="mb-3 mt-3">
				<label for="eid">Username:</label> <input type="text"
					class="form-control" id="uname" placeholder="Enter Username" name="uname">
			</div>
			<div class="mb-3">
				<label for="ename">Password:</label> <input type="text"
					class="form-control" id="pass" placeholder="Enter Password"
					name="pass">
			</div>
		
			<input class="btn btn-success" type="submit" value="Submit" >
			<input class="btn btn-warning" type="reset">
		</form>
	</div>



</body>
</html>