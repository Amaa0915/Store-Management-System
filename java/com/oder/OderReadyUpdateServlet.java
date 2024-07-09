package com.oder;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/OderReadyUpdateServlet")
public class OderReadyUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String oder_ids = request.getParameter("oderId");
		System.out.println("Redy to Update User ID passed Val = '"+oder_ids+"'");

		
		adminoderDButil.getOderDetails(oder_ids);
		
		
			
			
			List<Oders> oderData = adminoderDButil.getOderDetails(oder_ids);
			
			List<suppliers> users = adminoderDButil.selectAllSuplier();
	    	List<Items> items = adminoderDButil.selectAllItems();
	    	request.setAttribute("items", items);
	    	request.setAttribute("users", users);
	    	request.setAttribute("oderData", oderData);
			
			RequestDispatcher dis = request.getRequestDispatcher("updateodr.jsp");
			dis.forward(request, response);
		
			
		
	}

}
