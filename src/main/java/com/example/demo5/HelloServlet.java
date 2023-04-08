package com.example.demo5;

import java.io.*;

import Models.ModelsSIngIn;
import Servies.Category_Servies;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "index", value = "" )
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String myAttribute = (String) session.getAttribute("User");
        request.setAttribute("User",myAttribute);
        System.out.println("myAttribute");


        Category_Servies category_Servies=new Category_Servies();
        category_Servies.getAllEmployees();


        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);


    }
}