package com.ciq.controller;

import java.io.IOException;

import com.ciq.service.LoginService;
import com.ciq.service.LoginServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login.do")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		LoginService loginService = new LoginServiceImpl();
		
		boolean isLogin = loginService.doLogin(uname, pass);
		
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else {
			request.setAttribute("error", "Invalid username or password. Try again! ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
	}

}
