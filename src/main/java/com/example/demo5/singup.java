package com.example.demo5;


import Core.AuthenticationContext;
import Models.ModelsSIngIn;
import Servies.UsernamePasswordStrategy;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Servies.UsernamePasswordStrategy.ModelsSIngIns;

@WebServlet(name = "singup", value = "/singup")
public class singup extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("title", "Singup");

        RequestDispatcher dispatcher = request.getRequestDispatcher("jsps/singup.jsp");
        dispatcher.forward(request, response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("error","");

        String Email=request.getParameter("email");
        String password=request.getParameter("password");



        System.out.println(Email + password);
        AuthenticationContext authContext = new AuthenticationContext(new UsernamePasswordStrategy());
        boolean isExist=authContext.Singup(Email,password);

        if (isExist){
            request.setAttribute("error","this email is already exist  ");
            //response.sendRedirect("jsps/login.jsp");
        }else {
            request.setAttribute("error","Email create successful ");
            ModelsSIngIns.add(new ModelsSIngIn(Email,password));
            RequestDispatcher dispatcher = request.getRequestDispatcher("jsps/singup.jsp");
            dispatcher.forward(request, response);
        }
    }
}
