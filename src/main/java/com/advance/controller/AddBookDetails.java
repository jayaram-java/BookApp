package com.advance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advance.config.DatabaseConnection;


public class AddBookDetails extends HttpServlet  {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		try {

			int n = 1;

			Connection con = DatabaseConnection.initializeDatabase();

			PreparedStatement st = con.prepareStatement("INSERT INTO book_details VALUES (?,?,?,?)");

			st.setInt(1, n);
			st.setString(2, req.getParameter("Input1"));
			st.setDouble(3, Double.valueOf(req.getParameter("Input2")));
			st.setString(4, req.getParameter("Input3"));

			st.executeUpdate();
			st.close();
			con.close();

			PrintWriter out = res.getWriter();

			out.println("<html><body><b> Successfully inserted </b></body></html>");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
