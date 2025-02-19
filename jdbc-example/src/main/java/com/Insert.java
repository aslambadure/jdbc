package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="root";
		try(Connection connection=DriverManager.getConnection(url,username,password)){
	
			String sql="insert into employees(id, name,salary) values(?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "subhan");
			preparedStatement.setDouble(3, 5000.0);
			
			// Execute the insert statement
			int rowInserted=preparedStatement.executeUpdate();
			System.out.println(rowInserted+" rowInserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}












