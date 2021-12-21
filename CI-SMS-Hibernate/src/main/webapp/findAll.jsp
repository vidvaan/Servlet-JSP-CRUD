<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <h1>All Students</h1>
</div>
<div class="tableDiv">

<table id="students">
  <tr>
    <th>Student Id</th>
    <th>Student Name</th>
    <th>Student Fee</th>
    <th>Delete</th>
    <th>Update</th>
  </tr>
  <c:forEach items="${students}" var="student">
  <tr>
    <td><c:out value="${student.sid}"></c:out></td>
    <td><c:out value="${student.sname}"></c:out></td>
    <td><c:out value="${student.sfee}"></c:out></td>
      <td><a href="./deleteStudent?sid=${student.sid}"><img src="icon/delete.png" height="25px;" width="25px;"></img></a></td>
    <td><a href="./updateStudent?sid=${student.sid}"><img src="icon/edit.png"height="25px;" width="25px;"></img></a></td>
  </tr>
 </c:forEach>
</table>
</div>
</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>