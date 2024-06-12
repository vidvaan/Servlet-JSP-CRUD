package com.ciq.controller;

import java.io.IOException;

import com.ciq.service.EmployeeService;
import com.ciq.service.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteEmpById")
public class EmployeeDeleteByIdController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeService employeeService = new EmployeeServiceImpl();
		int eid = Integer.parseInt(request.getParameter("eid"));
		employeeService.deleteById(eid);
		request.getRequestDispatcher("/findAll").forward(request, response);
	}

}
