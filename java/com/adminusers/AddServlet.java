package com.adminusers;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
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
		String userStaus = request.getParameter("userStaus");
		boolean isTrue;
		isTrue = adminuserDButil.adduser(username, password, first_name, last_name, address, telephone_no, email, nic, type , userStaus);
		
		if(isTrue == true){
			out.println("<script type='text/javascript'>");
			out.println("alert('User Aded Sucsessfully');");
			out.println("location='adminaddusr.jsp'");
			out.println("</script>");
			
		} else {
		out.println("<script type='text/javascript'>");
		out.println("alert('Use Add Unsucseefull Plese Tru angain');");
		out.println("location='adminaddusr.jsp'");
		out.println("</script>");
	}
	
		
	}

}
