package com.user;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String first_name = request.getParameter("firstname");
		String last_name = request.getParameter("lastname");
		String address = request.getParameter("address");
		String telephone_no = request.getParameter("telephone");
		String email = request.getParameter("email");
		String nic = request.getParameter("nic");
		String type = request.getParameter("userType");
		
		boolean isTrue;
		isTrue = UserDButil.registeruser(username, password, first_name, last_name, address, telephone_no, email, nic, type);
		
		if(isTrue == true){
			out.println("<script type='text/javascript'>");
			out.println("alert('Registration Sucsessfully');");
			out.println("location='login.jsp'");
			out.println("</script>");
			
		} else {
		out.println("<script type='text/javascript'>");
		out.println("alert('Register Unsucseefull Plese Tru angain');");
		out.println("location='register.jsp'");
		out.println("</script>");
	}
	
		
	}

}
