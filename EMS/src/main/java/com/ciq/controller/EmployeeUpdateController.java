package com.ciq.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ciq.dto.Employee;
import com.ciq.service.EmployeeService;
import com.ciq.service.EmployeeServiceImpl;

@WebServlet("/updateEmp.do")
public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.findById(eid);
		request.setAttribute("employee", employee);
		
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		
		Employee employee = new Employee(eid, ename, esal);
		
		System.out.println(employee);
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.update(employee);
		
		request.getRequestDispatcher("/findAll.do").forward(request, response);
	}

}
