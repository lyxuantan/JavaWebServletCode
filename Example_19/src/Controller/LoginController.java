package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;

import BEAN.Users;
import DAO.LoginDao;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		Users user=new Users();
		user.setName(name);
		user.setPass(pass);
		
		boolean kt=LoginDao.Validate(name, pass);
		if(kt)
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("sessionname", name);
			
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/LoginSuccess.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			String message2="Fail";
			request.setAttribute("mess2", message2);
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
			rd.forward(request, response);
			
		}
	}

}
