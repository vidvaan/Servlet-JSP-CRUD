package com.ciq.controller;

import java.io.IOException;

import com.ciq.dto.Employee;
import com.ciq.service.EmployeeService;
import com.ciq.service.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/findEmpById.do")
public class EmployeeFindByIdController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int eid = Integer.parseInt(request.getParameter("eid"));
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.findById(eid);
		request.setAttribute("employee", employee);
		
		request.getRequestDispatcher("findByIdEmp.jsp").forward(request, response);
    }
}
