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
 * Servlet implementation class Hi
 */
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.write("<h1>HI SERVLAET </h1>");
		System.out.println("hello");
		ServletConfig config=getServletConfig();
		System.out.println("...................init-param...............");
		System.out.println(config.getServletName());
		System.out.println("username is........"+config.getInitParameter("Ename"));
		System.out.println("Office name is............."+config.getInitParameter("Oname"));
		System.out.println("...................context-param........................");
		ServletContext context=getServletContext();
		System.out.println("driver name is......."+context.getInitParameter("Driver"));
		System.out.println("url pattern is....."+context.getInitParameter("Url"));
	}
}

	
