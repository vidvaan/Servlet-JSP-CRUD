package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.ciq.dto.Employee;
import com.ciq.service.EmployeeService;
import com.ciq.service.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/findAll")
public class EmployeeFindAllController extends HttpServlet {

	private EmployeeService employeeService = new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Employee> employees = employeeService.findAll();

//		resp.setContentType("text/html");

//		PrintWriter out = resp.getWriter();
//
//		out.println("<table border='1px;'>");
//		out.println("<tr>");
//		out.println("<th>Eid</th>");
//		out.println("<th>Ename</th>");
//		out.println("<th>sal</th>");
//		out.println("</tr>");
//
//		for (Employee employee : employees) {
//			out.println("<tr>");
//			out.println("<td>" + employee.getEid() + "</td>");
//			out.println("<td>" + employee.getEname() + "</td>");
//			out.println("<td>" + employee.getEsal() + "</td>");
//			out.println("</tr>");
//		}
//
//		out.println("</table>");
        req.setAttribute("employees", employees);
		req.getRequestDispatcher("findAll.jsp").forward(req, resp);

	}
}
