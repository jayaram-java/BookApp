package com.advance.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdvancedCalcServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int n = 0;

		Cookie cookies[] = req.getCookies();

		for (Cookie cookie : cookies) {

			if (cookie.getName().equals("Result")) {

				n = Integer.parseInt(cookie.getValue());

			}

		}

		int output = n * n;

		PrintWriter out = res.getWriter();

		out.println("Squre the value is " + output);
	}

}
