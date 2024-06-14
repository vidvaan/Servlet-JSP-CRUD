<%@page import="com.ciq.service.LoginServiceImpl"%>
<%@page import="com.ciq.service.LoginService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String uname = request.getParameter("uname");
	String pass = request.getParameter("pass");

	LoginService loginService = new LoginServiceImpl();

	boolean isLoogedIn = loginService.isLoggin(uname, pass);
	if (isLoogedIn) {
	%>

	<jsp:forward page="success.jsp"></jsp:forward>
	<%
	} else {
	response.setContentType("text/html");
	out.println("<span style='color:red'> User Login Failed , Try again</span>");
	%>


	<%-- <jsp:include page="login.jsp"></jsp:include> --%>
	
	<%@include file="login.jsp" %>
	<%
	}
	%>
</body>
</html>