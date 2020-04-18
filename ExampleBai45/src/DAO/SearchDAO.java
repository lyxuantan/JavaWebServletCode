package DAO;
import java.sql.*;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import BEAN.Employee;

public class SearchDAO {
	public static List<Employee> Displayresult (HttpServletRequest request,Connection conn, String name1)
	{
		List<Employee> list = new ArrayList<Employee>();
		String sql = "select *from employee where name like '"+name1+"%'";
		
		
		
		PreparedStatement ptmt;
		try {
			ptmt = conn.prepareStatement(sql);
			ResultSet rs= ptmt.executeQuery();
			if(!rs.isBeforeFirst())
			{
				request.setAttribute("ketqua", "Không có kết quả");
			}
			else
			{
				while (rs.next())//trỏ từng hàng của database
				{
					Employee emp = new Employee();
					String name = rs.getString("name");
					emp.setName(name);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
