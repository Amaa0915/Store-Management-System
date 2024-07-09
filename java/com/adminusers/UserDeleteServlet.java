package com.adminusers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserDeleteServlet")
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user_id = request.getParameter("user_id");
		System.out.println("Passed Value to Update Servlet = '"+user_id+"'");
		
		
		
		
		boolean isTrue;
		
		isTrue = adminuserDButil.deleteUser(user_id);
		
		if(isTrue == true) {
			
		
			RequestDispatcher dis = request.getRequestDispatcher("userdeletesucsess.jsp");
			dis.forward(request, response);
		}
		else {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("userdeletesucsess.jsp");
			dis.forward(request, response);
		}
	}

}
