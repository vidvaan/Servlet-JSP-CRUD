package com.createiq.hi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.write("<h1>welcome SERVLAET </h1>");
		System.out.println();
		System.out.println("welcome servlet............");
		ServletContext context=getServletContext();
	
		System.out.println("Employee name is "+context.getInitParameter("Driver"));
		System.out.println("address is..............."+context.getInitParameter("Url"));
		System.out.println("config initparameter.....................");
		ServletConfig config=getServletConfig();
		System.out.println("ENAME OF........"+config.getInitParameter("Ename"));
		System.out.println("oname is..........." +config.getInitParameter("Oname"));
	}

}
