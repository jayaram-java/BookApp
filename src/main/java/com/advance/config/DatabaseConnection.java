package com.advance.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection initializeDatabase() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String jdbcUrl = "jdbc:mysql://localhost:3306/bookmgmt";
		String username = "root";
		String password = "admin";
		Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

		Connection con = DriverManager.getConnection(jdbcUrl, username, password);

		return con;
	}

	public static void closeConnection(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace(); // Handle the exception according to your needs
		}
	}
}
