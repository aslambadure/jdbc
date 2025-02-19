package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mian {
	public static void main( String[] args )
	{
		String url = "jdbc:mysql://localhost:3306/jdbc"; // Replace with your database name
		String username = "root"; // Replace with your database username
		String password = "root"; // Replace with your database password

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to the database!");

			// Create a statement
			Statement statement = connection.createStatement();

			// Execute a query
			String sql = "SELECT * FROM employees"; // Replace with your table name
			ResultSet resultSet = statement.executeQuery(sql);

			// Process the result set
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
			}

			// Close resources
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}