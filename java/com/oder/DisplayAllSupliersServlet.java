package com.oder;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayAllSupliersServlet")
public class DisplayAllSupliersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<suppliers> users = adminoderDButil.selectAllSuplier();
        request.setAttribute("users", users);
        
        request.getRequestDispatcher("viewallsuppliers.jsp").forward(request, response);
    }
}