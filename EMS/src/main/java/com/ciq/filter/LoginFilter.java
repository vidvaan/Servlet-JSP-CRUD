package com.ciq.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter("/*")
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter invoked");
		HttpServletRequest httpRequest = (HttpServletRequest) request;

		HttpSession session = httpRequest.getSession();

		String username = (String) session.getAttribute("username");

		System.out.println("Username : " + username);

		
		System.out.println();
		
		if (httpRequest.getRequestURI().contains("/login.do") ||  username != null) {
			chain.doFilter(request, response);
		}else {
			httpRequest.setAttribute("error", "User authentcation is required to Access resourcs");
			httpRequest.getRequestDispatcher("./login.jsp").forward(httpRequest, response);
		}
	}

}
