package com.adminusers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.User;
import com.user.UserDButil;

@WebServlet("/UserUpdateServlet")
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user_id = request.getParameter("user_id");
		System.out.println("Passed Value to Update Servlet = '"+user_id+"'");
		String username = request.getParameter("username");
		System.out.println("Passed Value to Update Servlet = '"+username+"'");
		String password = request.getParameter("password");
		System.out.println("Passed Value to Update Servlet = '"+password+"'");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String address = request.getParameter("address");
		String telephone_no = request.getParameter("telephone_no");
		String email = request.getParameter("email");
		String nic = request.getParameter("nic");
		String type = request.getParameter("type");
		
		
		boolean isTrue;
		
		isTrue = adminuserDButil.updateuser(user_id, username, password, first_name, last_name, address, telephone_no, email, nic, type);
		
		if(isTrue == true) {
			
			
			List<adminuser> userData = adminuserDButil.getUserDetails(user_id);
			request.setAttribute("userData", userData);
			
			RequestDispatcher dis = request.getRequestDispatcher("updateuser.jsp");
			dis.forward(request, response);
		}
		else {
			List<adminuser> userData = adminuserDButil.getUserDetails(user_id);
			request.setAttribute("userData", userData);
			
			RequestDispatcher dis = request.getRequestDispatcher("updateuser.jsp");
			dis.forward(request, response);
		}
	}

}
