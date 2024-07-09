package com.items;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddItemServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String item_name = request.getParameter("item_name");
		String item_brand = request.getParameter("item_brand");
		String item_qty = request.getParameter("item_qty");
		String item_price = request.getParameter("item_price");
		String item_supplier = request.getParameter("item_supplier");
		String item_discription = request.getParameter("item_discription");
		
		boolean isTrue;
		isTrue = ItemDButil.additem(item_name, item_brand, item_qty, item_price, item_supplier, item_discription);
		
		if(isTrue == true){
			out.println("<script type='text/javascript'>");
			out.println("alert('Item Aded Sucsessfully');");
			out.println("location='admin.jsp'");
			out.println("</script>");
			
		} else {
		out.println("<script type='text/javascript'>");
		out.println("alert('Item Aded Unsucseefull Plese Tru angain');");
		out.println("location='admin.jsp'");
		out.println("</script>");
	}
	
		
	}

}
