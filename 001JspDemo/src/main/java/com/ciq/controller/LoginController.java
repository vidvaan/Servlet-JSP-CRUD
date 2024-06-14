package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.ciq.service.LoginService;
import com.ciq.service.LoginServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");

		LoginService loginService = new LoginServiceImpl();
		if (loginService.isLoggin(uname, pass)) {
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		} else {
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.println("<span style='color:red'> User Login Failed , Try again</span>");
			req.getRequestDispatcher("login.jsp").include(req, resp);
		}
	}
}
