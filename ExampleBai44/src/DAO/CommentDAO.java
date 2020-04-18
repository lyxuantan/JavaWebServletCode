package DAO;

import java.sql.*;
import java.util.*;

import BEAN.Comment;

public class CommentDAO
{
		//them du lieu vao mysql
		//hien thi du lieu vao mysql
	
		public static void Insertcomment(Connection conn,Comment cmt)
		{
			PreparedStatement ptmt = null;
			String sql = "insert into comment(content,username) value (?,?)";
			
			
			try
			{
				ptmt = conn.prepareStatement(sql);
				String content = cmt.getContent();
				String username = cmt.getUsername();
				
				ptmt.setString(1, content);
				ptmt.setString(2, username);
				ptmt.executeUpdate();
				ptmt.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static List<Comment> Displaycomment (Connection conn)
		{
			List<Comment> list =new ArrayList<Comment>();
			String sql="select *from comment";
			
			try {
				
				
				PreparedStatement ptmt = conn.prepareStatement(sql);
				ResultSet rs = ptmt.executeQuery();
				while(rs.next())
					{
						Comment cmt = new Comment();
						String content = rs.getString("content");
						String username = rs.getString("username");
						
						cmt.setContent(content);
						cmt.setUsername(username);
						list.add(cmt);
						
					}
			}catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
		
		
	//hien thi du lieu vao mysql

}
