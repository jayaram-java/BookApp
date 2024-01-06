package com.advance.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advance.config.DatabaseConnection;

public class GetBookDetails extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		
		List<String> data = fetchBookNames();
		
		req.setAttribute("BookList", data); // httpsession
		
		req.getRequestDispatcher("Display.jsp").forward(req, res);
		
	}

	private List<String> fetchBookNames() {

		ArrayList<String> data = new ArrayList<>();

		try {

			Connection con = DatabaseConnection.initializeDatabase();

			PreparedStatement st = con.prepareStatement("SELECT BookName FROM book_details");

			ResultSet resultSet = st.executeQuery();

			while (resultSet.next()) {

				String bookName = resultSet.getString("BookName");
				data.add(bookName);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return data;

	}

}
