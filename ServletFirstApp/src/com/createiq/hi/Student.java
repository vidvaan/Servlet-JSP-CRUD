package com.createiq.hi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sdname=request.getParameter("sname");
		PrintWriter printWriter=response.getWriter();
		
		int sid=Integer.parseInt(request.getParameter("sid"));
		double sfee=Double.parseDouble(request.getParameter("sfee"));
		String add=request.getParameter("address");
		printWriter.print(sdname);
		printWriter.print(sid);
		printWriter.print(sfee);
		printWriter.print(add);
	}

}
