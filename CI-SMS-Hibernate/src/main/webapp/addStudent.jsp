<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp"></jsp:include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/app.js"></script>
<style type="text/css">

.error{
   color: red;
   float: right;
   display: none;
}
</style>
</head>
<body>
	<div style="height: 500px;">

		<div class="formHeader">
			<h1>Add Student</h1>
		</div>
		<div class="formStyle">
			<form action="./addStudent" method="post" name="addStudent" onsubmit="return validateForm()">
				<!-- <label for="sid">Student Id <span class="error" id="sidErr"> Sid should not empty </span></label> 
				<input type="text" id="sid"
					name="sid" placeholder="Enter Student Sid...">  -->
			    <label for="sname">Student Name <span class="error" id="snameErr"> Sname should not empty </span></label> 
			    <input type="text" id="sname"
					name="sname" placeholder="Enter Student name..."> 
					
				<label for="sfee">Student Fee <span class="error" id="sfeeErr"> Sfee should not empty </span> </label> 
				<input type="text" id="sfee"
					name="sfee" placeholder="Enter Student fee..."> 
			    <input
					type="submit" value="Submit">
			</form>
		</div>

	</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>