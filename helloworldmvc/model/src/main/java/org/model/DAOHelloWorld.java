package org.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DAOHelloWorld {
	public static String URL = "jdbc:mysql://localhost/helloworld?autoReconnect=true&useSSL=false";
	public static String LOGIN = "root";
	public static String PASSWORD = "";
	private Connection connection;
	private Statement statement;

	public DAOHelloWorld() {
		this.connection = null;
		this.statement = null;
	}

	public Boolean open() {
		System.out.println("Test1");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = (Connection) DriverManager.getConnection(URL, LOGIN, PASSWORD);
			this.statement = this.connection.createStatement();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public void close() {
	}

	private ResultSet executeQuery(final String query) {
		return null;
	}

	private int executeUpdate(final String query) throws SQLException {

		return this.statement.executeUpdate(query);
	}

}
