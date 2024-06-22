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

    <br><br>
	<div class="text-center">
		<h2 class="text-success">User Logged out Successfully</h2>
		<div>
			For login <a href='./login.jsp'> click Here</a>
		</div>

	</div>


</body>
</html>