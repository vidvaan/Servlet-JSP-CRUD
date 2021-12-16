package com.createiq.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {

	private static Properties properties = null;

	static {
		properties = new Properties();
		try {
			properties.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("db_driver"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(properties.getProperty("db_url"),
					properties.getProperty("db_username"), properties.getProperty("db_password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			e.printStackTrace();
		}
	}

	public static void close(Statement statement, Connection connection) {
		try {
			if (statement != null) {
				statement.close();
			}
			close(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs, Statement statement, Connection connection) {
		try {
			if (rs != null) {
				rs.close();
			}
			close(statement, connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
