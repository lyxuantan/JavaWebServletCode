package DB;
import java.sql.*;

public class DBConnection {
	public static Connection CreateConnection()
	{
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/examplebai13";
		String username = "root";
		String password = "1234";
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		return conn;
		
		
	}

}
