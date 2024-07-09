package com.items;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddItemsVewServlet")
public class AddItemsVewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Supplier> users = ItemDButil.selectAllUsers();
        request.setAttribute("users", users);
        
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }
}