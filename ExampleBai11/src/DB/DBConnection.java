package DB;

import java.sql.*;

public class DBConnection {
	
	public static Connection CreateConnection()
	{
		//Khởi tạo đối tượng connection
		
		Connection conn=null;
		
		String url = " jdbc:mysql://localhost:3306/examplebai11";
		
		String username = "root";
		String password = "1234";
		
		
		
		
		//load driver
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//create connection
			conn=DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return conn;
		
	}

}
