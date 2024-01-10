package com.advance.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test {

	// RequestDispatcher - to forward a request to one servlet page to another page
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String value1 = req.getParameter("Input1");
		String value2 = req.getParameter("Input2");

		int result = Integer.parseInt(value1) + Integer.parseInt(value2);

		// session
		req.setAttribute("result", result);

		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);

		// PrintWriter out = res.getWriter();
		// out.println(result);

	}
	
	// HttpSession - Allows us to set objects as attributes that can be retrieved in future requests.
	public void httpsession(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		
		String value1 = req.getParameter("Input1");
		String value2 = req.getParameter("Input2");

		int result = Integer.parseInt(value1) + Integer.parseInt(value2);
		
		HttpSession session = req.getSession();
		
		session.setAttribute("Result", result);
		
		res.sendRedirect("square");

	}
	
	// Servlet Config
	public void servletConfig(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter out = res.getWriter();

		out.print("Book name is ");

		//ServletConfig ob = getServletConfig();
		
		//String value = ob.getInitParameter("BookName");
		
		//out.print(value);

	}
	
	// Servlet Context
	public void servletContext(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter out = res.getWriter();

		out.print("Book name is ");

		//ServletContext ob = getServletContext();

		//String value = ob.getInitParameter("BookName");

		//out.println(value);

	}
	
    // Send Redirect
	public void sendRedirectCode(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String value1 = req.getParameter("Input1");
		String value2 = req.getParameter("Input2");

		int result = Integer.parseInt(value1) + Integer.parseInt(value2);

		res.sendRedirect("square?result=" + result);
		
		

	}

	
	public void doGet12(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		// PrintWriter out = res.getWriter();

		// out.println("Hello to Advanced calc");

		PrintWriter out = res.getWriter();

		int n = (int) req.getAttribute("result");
	

		out.println("Sum of the two values is " + n);

		int output = n * n;

		out.println("Squre the value is " + output);
	}

}
