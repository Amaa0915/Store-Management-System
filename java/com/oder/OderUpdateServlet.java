package com.oder;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OderUpdateServlet")
public class OderUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String oder_id = request.getParameter("odrid");
		String item_id = request.getParameter("itmid");
		System.out.println("Passed Value to Update Servlet = '"+item_id+"'");
		String item_name = request.getParameter("itmname");
		System.out.println("Passed Value to Update Servlet = '"+item_name+"'");
		String qty = request.getParameter("qty");
		String date = request.getParameter("date");
		String sup_id = request.getParameter("supid");
		
		
		boolean isTrue;
		
		isTrue = adminoderDButil.updateoder(oder_id,item_id, item_name, qty, date, sup_id);
		
		if(isTrue == true) {
			
		
			RequestDispatcher dis = request.getRequestDispatcher("oderupdatesucsess.jsp");
			dis.forward(request, response);
		}
		else {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("oderupdatesucsess.jsp");
			dis.forward(request, response);
		}
	}

}
