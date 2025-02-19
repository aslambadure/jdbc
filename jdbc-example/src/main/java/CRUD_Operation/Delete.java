package CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="root";
		
			Connection connection;
			try {
				connection = DriverManager.getConnection(url, username, password);
				// deleted statement		
				String deletesql="delete from student where id=?";
				PreparedStatement deleteStatement=connection.prepareStatement(deletesql);
				
				deleteStatement.setInt(1, 1);
				
				int rowDeleted=deleteStatement.executeUpdate();
				System.out.println(rowDeleted+" rows deleted");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
}
