package DAO;

import java.sql.*;
import java.util.*;

import BEAN.Incompletesentence;

public class QuizDAO 
{
		public static List<Incompletesentence> DisplayQuestion(Connection conn)
		{
			List<Incompletesentence> list = new ArrayList<Incompletesentence>();
			
			String sql = "select * from incompletesentence";
			
			try 
			{
				PreparedStatement ptmt = conn.prepareStatement(sql);
				
				
				ResultSet rs = ptmt.executeQuery();
				
				while (rs.next())
				{
						int number = rs.getInt("number");
						String question = rs.getString("question");
						String option1 = rs.getString("option1");
						String option2 = rs.getString("option2");
						String option3 = rs.getString("option3");
						String option4 = rs.getString("option4");
						String correctanswer = rs.getString("correctanswer");
						
						
						Incompletesentence ipt = new Incompletesentence();
						
						ipt.setNumber(number);
						ipt.setQuestion(question);
						ipt.setOption1(option1);
						ipt.setOption2(option2);
						ipt.setOption3(option3);
						ipt.setOption4(option4);
						ipt.setCorrectanswer(correctanswer);
						list.add(ipt);
						
				}
				
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
			
			
			return list;
		}
		
		public static List<Incompletesentence> GetCorrectanswer(Connection conn)
		{
			List<Incompletesentence> list = new ArrayList<Incompletesentence>();
			
			String sql = "select * from incompletesentence";
			
			try 
			{
				PreparedStatement ptmt = conn.prepareStatement(sql);
				
				
				ResultSet rs = ptmt.executeQuery();
				
				while (rs.next())
				{
						int number = rs.getInt("number");
						String question = rs.getString("question");
						String option1 = rs.getString("option1");
						String option2 = rs.getString("option2");
						String option3 = rs.getString("option3");
						String option4 = rs.getString("option4");
						String correctanswer = rs.getString("correctanswer");
						
						
						Incompletesentence ipt = new Incompletesentence();
						
						ipt.setNumber(number);
						ipt.setQuestion(question);
						ipt.setOption1(option1);
						ipt.setOption2(option2);
						ipt.setOption3(option3);
						ipt.setOption4(option4);
						ipt.setCorrectanswer(correctanswer);
						list.add(ipt);
						
				}
				
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
			
			
			return list;
		}
		
		//tra ve so luong cau hoi trong bai tap
		
		public static int Getcountrow(Connection conn)
		{
			int count = 0;
			
			String sql = "select count(*) from incompletesentence";
			
			PreparedStatement ptmt;
			try 
			{
				ptmt = conn.prepareStatement(sql);
				
				ResultSet rs = ptmt.executeQuery();
				
				rs.next();
				
				count = rs.getInt(1);
				
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
			
			
			
			
				
			return count;
		}
		
		
}
