package com.items;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ItemUpdateServlet")
public class ItemUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String item_id = request.getParameter("item_id");
		System.out.println("Passed Value to Update Servlet = '"+item_id+"'");
		String item_name = request.getParameter("item_name");
		System.out.println("Passed Value to Update Servlet = '"+item_name+"'");
		String item_brand = request.getParameter("item_brand");
		System.out.println("Passed Value to Update Servlet = '"+item_brand+"'");
		String item_qty = request.getParameter("item_qty");
		String item_price = request.getParameter("item_price");
		String item_supplier = request.getParameter("item_supplier");
		String item_discription = request.getParameter("item_discription");
		
		
		
		boolean isTrue;
		
		isTrue = ItemDButil.updateitem(item_id, item_name, item_brand, item_qty, item_price, item_supplier, item_discription);
		
		if(isTrue == true) {
			
		
			RequestDispatcher dis = request.getRequestDispatcher("itemupdatesucsess.jsp");
			dis.forward(request, response);
		}
		else {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("itemupdatesucsess.jsp");
			dis.forward(request, response);
		}
	}

}
