package com.adminusers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/UserReadyDeleteServlet")
public class UserReadyDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user_id = request.getParameter("user_id");
		System.out.println("Redy to Delete User ID passed Val = '"+user_id+"'");

		
		adminuserDButil.getUserDetails(user_id);
		
		
			
			
			List<adminuser> userDataDel = adminuserDButil.getUserDetails(user_id);
			request.setAttribute("userDataDel", userDataDel);
			
			RequestDispatcher dis = request.getRequestDispatcher("deleteuser.jsp");
			dis.forward(request, response);
		
			
		
	}

}
