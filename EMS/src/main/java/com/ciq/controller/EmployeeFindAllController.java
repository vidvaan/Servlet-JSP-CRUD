package com.ciq.controller;

import java.io.IOException;
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

		req.setAttribute("employees", employees);
		req.getRequestDispatcher("findAll.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
