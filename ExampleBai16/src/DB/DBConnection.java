package DB;
import java.sql.*;

public class DBConnection {
	public static Connection CreateConnection()
	{
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/dbexamplebai15";
		String username = "root";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return conn;
	}

}
