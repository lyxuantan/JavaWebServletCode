package Controller;

import java.io.IOException;
import java.sql.Connection;
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


@WebServlet("/HomeForward")
public class HomeForward extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    
    public HomeForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		Connection conn = DBConnection.CreateConnection();
		
		List<Dethi> list = HomeDAO.Displayexam(conn);
		request.setAttribute("listexam",list);
		
		//RequestDispatcher rd = request.getRequestDispatcher("View/Home.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
