<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="height: 500px;">

<div class="formHeader">
    <h1>Add Student</h1>
</div>
<div class="formStyle">
 <form action="./addStudent" method="post">
    <label for="sid">Student Id</label>
    <input type="text" id="sid" name="sid" placeholder="Enter Student Sid...">

    <label for="sname">Student Name</label>
    <input type="text" id="sname" name="sname" placeholder="Enter Student name...">

    <label for="sfee">Student Fee</label>
    <input type="text" id="sfee" name="sfee" placeholder="Enter Student fee...">
  
    <input type="submit" value="Submit">
  </form>
</div>

</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>