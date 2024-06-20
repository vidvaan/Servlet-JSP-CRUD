<%@page import="com.ciq.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<div class="container mt-5">
		<h3>All Employees</h3>

		<table class="table">
			<tr>
				<th>Eid</th>
				<th>Ename</th>
				<th>Esal</th>
				<th>Update</th>
				<th>Delete</th>
				<th>View</th>
			</tr>
			<c:forEach var="employee" items="${employees}">
				<tr>
					<td><c:out value="${employee.eid}"></c:out></td>
					<td><c:out value="${employee.ename}"></c:out></td>
					<td><c:out value="${employee.esal}"></c:out></td>
					<td><a class="btn btn-success"
						href='./updateEmp.do?eid=${employee.eid}'>Update</a></td>
					<td><a class="btn btn-danger"
						href='./deleteEmpById.do?eid=${employee.eid}'>Delete</a></td>
					<td><a class="btn btn-primary"
						href='./findEmpById.do?eid=${employee.eid}'>View</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>