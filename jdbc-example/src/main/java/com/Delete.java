package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="root";
		
		try {
			Connection connection= DriverManager.getConnection(url,password,username);
			
			String sql="Delete from employees where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, 3); // Emp id
			
			
			int rowDeleted=preparedStatement.executeUpdate();
			System.out.println(rowDeleted+" rows Deleted");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
