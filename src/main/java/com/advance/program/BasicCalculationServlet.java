package com.advance.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/basicCalc125")
public class BasicCalculationServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String value1 = req.getParameter("Input1");
		String value2 = req.getParameter("Input2");

		int result = Integer.parseInt(value1) + Integer.parseInt(value2);

		PrintWriter out = res.getWriter();

		out.println("<html><body bgcolor='green'>");
		out.print("Result = " + result);
		out.print("</body></html>");

	}

}
