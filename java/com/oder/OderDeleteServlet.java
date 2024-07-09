package com.oder;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OderDeleteServlet")
public class OderDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String oder_id = request.getParameter("oderId");
		System.out.println("Passed Value to Delete Servlet = '"+oder_id+"'");
		
		
		
		
		boolean isTrue;
		
		isTrue = adminoderDButil.deleteOder(oder_id);
		
		if(isTrue == true) {
			
		
			RequestDispatcher dis = request.getRequestDispatcher("oderdeletesucsess.jsp");
			dis.forward(request, response);
		}
		else {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("oderdeletesucsess.jsp");
			dis.forward(request, response);
		}
	}

}
