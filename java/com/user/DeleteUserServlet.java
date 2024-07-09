package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DeleteUserServlet() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		String user_id = request.getParameter("user_id");
		String username = request.getParameter("username");
		boolean isTrue;
		isTrue = UserDButil.deleteUser(user_id);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Account Deleted Sucsessfully');");
			out.println("location='register.jsp'");
			out.println("</script>");
			
			}
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Account Deleted UnSucsessfully FAIL');");
			
			out.println("</script>");
				List<User> usrDetails = UserDButil.getUser(username);
				request.setAttribute("usrDetails", usrDetails);
			
				RequestDispatcher dis = request.getRequestDispatcher("manegeuser.jsp");
				dis.forward(request, response);
		}
	}

}
