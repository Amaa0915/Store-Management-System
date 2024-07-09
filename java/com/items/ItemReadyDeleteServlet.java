package com.items;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ItemReadyDeleteServlet")
public class ItemReadyDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String item_id = request.getParameter("itemId");
		System.out.println("Redy to Update Items ID passed Val = '"+item_id+"'");

		
		ItemDButil.getItemData(item_id);
		
		
			
			
			List<Item> itemDetails = ItemDButil.getItemData(item_id);
			request.setAttribute("itemDetails", itemDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("deleteitem.jsp");
			dis.forward(request, response);
		
			
		
	}

}
