package com.ciq.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ciq", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

	public static void close(Connection connection) {

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close(Connection connection, Statement statement) {

		try {
			if (statement != null) {
				statement.close();
			}
			close(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection connection, Statement statement, ResultSet resultSet) {

		try {
			if (resultSet != null) {
				resultSet.close();
			}
			close(connection, statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
