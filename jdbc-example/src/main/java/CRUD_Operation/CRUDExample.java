package CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDExample {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="root";
		
		try {
			Connection connection =DriverManager.getConnection(url, username, password);
			
			// insert statement 
			String insertsql="insert into student(id, name, salary)values(?,?,?)";
			PreparedStatement insertStatement=connection.prepareStatement(insertsql);	
			insertStatement.setInt(1, 5);
			insertStatement.setString(2, "Elephant");
			insertStatement.setDouble(3, 500);
			
			int rowInsert=insertStatement.executeUpdate();
			System.out.println(rowInsert+" rows inserted");
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
