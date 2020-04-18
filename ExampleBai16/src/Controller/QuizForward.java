package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Incompletesentence;
import DAO.QuizDAO;
import DB.DBConnection;

import java.util.*;
import java.sql.*;

@WebServlet("/QuizForward")
public class QuizForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public QuizForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		Connection conn = DBConnection.CreateConnection();
		
		List<Incompletesentence> list = QuizDAO.DisplayQuestion(conn);
		
		
		request.setAttribute("listincomplete",list);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Quiz.jsp");
		rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
