package com.createiq.hi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcomepost
 */
public class Welcomepost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcomepost() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=request.getParameter("name");
	PrintWriter printWriter=response.getWriter();
	
	int id=Integer.parseInt(request.getParameter("id"));
	double salary=Double.parseDouble(request.getParameter("salary"));
	String add=request.getParameter("address");
	String state=request.getParameter("state");
	Long l=Long.parseLong(request.getParameter("phone"));
	long l2=Long.parseLong(request.getParameter("mobile"));
	printWriter.print(username);
	printWriter.print(id);
	printWriter.print(salary);
	printWriter.print(add);
	System.out.println(state);
	printWriter.print(l);
	System.out.println(l2);
	
	}

}
