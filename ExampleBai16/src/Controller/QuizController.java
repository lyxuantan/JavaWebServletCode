package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Answeruser;
import BEAN.Incompletesentence;
import DAO.QuizDAO;
import DB.DBConnection;
import java.sql.*;
import java.util.*;


@WebServlet("/QuizController")
public class QuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public QuizController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
			Connection conn = DBConnection.CreateConnection();
			int countrow = QuizDAO.Getcountrow(conn);
			
			List<Incompletesentence> listcorrectanswer = QuizDAO.GetCorrectanswer(conn);
			
			List<Answeruser> listansweruser = new ArrayList<Answeruser>();
			
			for (int i =1; i<= countrow; i++)
			{
				String answer = request.getParameter("ans["+i+"]");
				
				if (answer != null)
				{
					Answeruser au = new Answeruser();
					
					au.setNumber(i);
					au.setAnswer(answer);
					
					listansweruser.add(au);
				}
				else
				{
					request.setAttribute("msg","Bạn chưa trả lời hết các câu hỏi");
					
					List<Incompletesentence> list = QuizDAO.DisplayQuestion(conn);
					
					
					request.setAttribute("listincomplete",list);
					
					RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Quiz.jsp");
					rd.forward(request,response);
				}
					
				
			}
			
			request.setAttribute("listcorrectanswer", listcorrectanswer);
			request.setAttribute("listansweruser",listansweruser);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Result.jsp");
			rd.forward(request,response);
			
			
	}

}
