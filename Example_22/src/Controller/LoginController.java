package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import BEAN.Users;
import DAO.Validate;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String pass=request.getParameter("pass");
		Users user=new Users();
		user.setPass(pass);
		
		
		if(Validate.Check(pass)) {
			HttpSession session=request.getSession(true);
			session.setAttribute("sessionname", name);
			
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);
			
			
					
			
		}
		else {
			request.setAttribute("mess", "Login Thất Bại");
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
