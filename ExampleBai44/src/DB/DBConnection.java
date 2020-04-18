package DB;


import java.sql.*;




public class DBConnection {
	public static Connection createConnection()
	{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/examplebai44?useUnicode=true&amp;characterEncoding=utf8";
		String username = "root";
		String password = "1234";
		
		//load driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		//create connection
		try {
			conn=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
		
	}
	
	
	
	
	
	
	
	
	
	

}
