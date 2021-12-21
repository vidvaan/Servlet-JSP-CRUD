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
 * Servlet implementation class AddStudentController
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("addStudent.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int sid = Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		double sfee = Double.parseDouble(request.getParameter("sfee"));
		
		Student student = new Student();
		student.setSname(sname);
		student.setSfee(sfee);
		
		StudentService studentService = new StudentServiceImpl();
		studentService.add(student);
		
		request.getRequestDispatcher("/findAll").forward(request, response);
		
		
	}

}
