package com.advance.program;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OperationServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

	
		String value1 = req.getParameter("Input1");
		String value2 = req.getParameter("Input2");

		int result = Integer.parseInt(value1) + Integer.parseInt(value2);
		
		Cookie cookie = new Cookie("Result",result+"");
		
		res.addCookie(cookie);
		
		res.sendRedirect("square");

	}

}
