package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Dethi;
import DAO.HomeDAO;
import DB.DBConnection;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
			
			
			try 
			{
				Connection conn = DBConnection.CreateConnection();
				
				HomeDAO.ImportExcel(request, response, conn);
				List<Dethi> list = HomeDAO.Displayexam(conn);
				
				request.setAttribute("listexam",list);
				
				RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
				rd.forward(request,response);
				
				conn.close();
				
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
	}

}
