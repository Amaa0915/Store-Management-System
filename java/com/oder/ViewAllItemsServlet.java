package com.oder;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewAllItemsServlet")
public class ViewAllItemsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Items> items = adminoderDButil.selectAllItems();
        request.setAttribute("items", items);
        request.getRequestDispatcher("viewallitems.jsp").forward(request, response);
    }
}