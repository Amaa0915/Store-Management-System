package com.items;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayAllItemsServletdelete")
public class DisplayAllItemsServletdelete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 List<Item> items = ItemDButil.selectAllItems();
         request.setAttribute("items", items);
        request.getRequestDispatcher("admindeleteitm.jsp").forward(request, response);
    }
}