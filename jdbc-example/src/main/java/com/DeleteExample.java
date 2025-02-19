package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="root";
		
		Connection connection;
		try {
			connection = DriverManager.getConnection(url,username,password);
			String sql="Delete from employees where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, 1);
			
			int rowsDeleted=preparedStatement.executeUpdate();
			System.out.println(rowsDeleted +" rowsDeleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
