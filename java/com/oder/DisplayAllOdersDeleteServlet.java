package com.oder;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayAllOdersDeleteServlet")
public class DisplayAllOdersDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Oders> oders = adminoderDButil.selectAllOders();
        request.setAttribute("oders", oders);
        
        request.getRequestDispatcher("admindeleteodr.jsp").forward(request, response);
    }
}