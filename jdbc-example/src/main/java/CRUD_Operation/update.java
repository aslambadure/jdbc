package CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="root";
		
		try {
			Connection connection=DriverManager.getConnection(url,username, password);
			
			String updatesql="update student set id=? , name=?,salary=?  where id=?";
			PreparedStatement updateStatement=connection.prepareStatement(updatesql);
			
			updateStatement.setInt(1, 4);
			updateStatement.setString(2, "dog");
			updateStatement.setDouble(3, 400);
			updateStatement.setInt(4, 5);
			
			int rowupdate=updateStatement.executeUpdate();
			System.out.println(rowupdate+"rows updated");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
