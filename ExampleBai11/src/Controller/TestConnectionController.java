package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


import DB.DBConnection;


@WebServlet("/TestConnectionController")
public class TestConnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TestConnectionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=DBConnection.CreateConnection();
		PrintWriter out=response.getWriter();
		
		if(conn!=null)
		{
			
			try {
				conn.close();
				
				out.println("<h1>Connecter Success</h1>");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
