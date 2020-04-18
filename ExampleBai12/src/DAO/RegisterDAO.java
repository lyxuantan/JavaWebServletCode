package DAO;

import java.sql.*;

import BEAN.Account;

public class RegisterDAO {
	
	public static boolean InsertAccount(Connection conn, Account acc)
	{
		
		//Khởi tạo đối tượng PrepareStatement
		
		PreparedStatement ptmt=null;
		//Truyền truy vấn sql cho đối tượng PreparedStatement
		
		String sql = "insert into account(uname,pass) values(?,?)";
		//truyền sql vào đối tượng pqmt
		
		try {
			
			
			ptmt = conn.prepareStatement(sql);
			
			String uname=acc.getUname();
			String pass=acc.getPass();
			
			ptmt.setString(1, uname);
			ptmt.setString(2, pass);
			
			//Thực thi truy vấn
			
			//vì là kiểu int nên phải gán
			int kt=ptmt.executeUpdate();
			
			if(kt !=0) {
				return true;
			}
			
			//Đóng đối tượng PreparedStatement sau khi kết thúc
		
			ptmt.close();
			
			
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		
		
		
		
		
	}

}
