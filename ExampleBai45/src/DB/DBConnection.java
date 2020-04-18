package DB;

import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {
	public static Connection CreateConnection()
	{
		
		
		Connection conn = null;
		
		String url= "jdbc:mysql://localhost:3306/example45";
		String username = "root";
		String password = "1234";
		
		
		try {
			
			
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			//create connection
			conn= DriverManager.getConnection(url,username,password);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return conn;
	}

}
