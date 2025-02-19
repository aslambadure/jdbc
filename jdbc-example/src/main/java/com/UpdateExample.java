package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="root";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			String sql="update employees set salary=? where id=?";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setDouble(1, 7000.0);   // Set new salary for row with id=5
			preparedStatement.setInt(2, 4);		// Target row where id=5

			
			int rowupdated=preparedStatement.executeUpdate();
			System.out.println(rowupdated+" rows updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
