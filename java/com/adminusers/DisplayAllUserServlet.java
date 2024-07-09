package com.adminusers;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayAllUserServlet")
public class DisplayAllUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<adminuser> users = adminuserDButil.selectAllUsers();
        request.setAttribute("users", users);
        
        request.getRequestDispatcher("adminmanageusr.jsp").forward(request, response);
    }
}