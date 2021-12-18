package com.createiq.sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentService;
import com.createiq.sms.service.StudentServiceImpl;

/**
 * Servlet implementation class DeleteStudentController
 */
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
		StudentService studentService = new StudentServiceImpl();
		studentService.deleteById(sid);
		request.getRequestDispatcher("/findAll").forward(request, response);
	}

	
}
