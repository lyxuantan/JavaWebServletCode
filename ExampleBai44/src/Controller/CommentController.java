package Controller;

import java.io.IOException;
import java.sql.*;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.Comment;
import DAO.CommentDAO;
import DB.DBConnection;

import java.util.*;

@WebServlet("/CommentController")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CommentController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getCharacterEncoding()!=null)
		{
			request.setCharacterEncoding("UTF-8");//kiểm tra dữ liệu truyền vào sql đã là utf 8  chưa nếu chưa thì chuyển thành utf8
		}
		try {
		
		
		String content = request.getParameter("content");
		String username = request.getParameter("username");
		Connection conn = DBConnection.createConnection();//gán conn
		
		Comment cmt = new Comment();
		cmt.setContent(content);
		cmt.setUsername(username);
		
		CommentDAO.Insertcomment(conn, cmt);
		
		
		List<Comment> list = CommentDAO.Displaycomment(conn);//đổ vào list
		request.setAttribute("listcomment", list);//lấy dữ liệu từ list
		
		
		//gửi qua displaycomment
		RequestDispatcher rd = request.getRequestDispatcher("View/Displaycomment.jsp");
		rd.forward(request, response);
		conn.close();
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}

}
}
