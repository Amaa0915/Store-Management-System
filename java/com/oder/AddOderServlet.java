package com.oder;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddOderServlet")
public class AddOderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String itm_id = request.getParameter("itmid");
		String itm_name = request.getParameter("itmname");
		String qty = request.getParameter("qty");
		String date = request.getParameter("date");
		String supid = request.getParameter("supid");
		
		boolean isTrue;
		isTrue = adminoderDButil.addoder(itm_id, itm_name, qty, date, supid);
		
		if(isTrue == true){
			out.println("<script type='text/javascript'>");
			out.println("alert('Oder Aded Sucsessfully');");
			out.println("location='adminaddodr.jsp'");
			out.println("</script>");
			
		} else {
		out.println("<script type='text/javascript'>");
		out.println("alert('Oder Add Unsucseefull Plese Tru angain');");
		out.println("location='adminaddodr.jsp'");
		out.println("</script>");
	}
	
		
	}

}
