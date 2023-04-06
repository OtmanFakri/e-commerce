package com.example.demo5;

import Core.AuthenticationContext;
import Models.ModelsSIngIn;
import Servies.UsernamePasswordStrategy;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

import static Servies.UsernamePasswordStrategy.ModelsSIngIns;

@WebServlet(name = "login", value = "/Login" )
public class Login extends HttpServlet {

    ArrayList<ModelsSIngIn> User = new ArrayList<ModelsSIngIn>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("title", "Login");
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsps/login.jsp");
        dispatcher.forward(request, response);


    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("User", null);

        String Email=request.getParameter("email");
        String password=request.getParameter("password");


        AuthenticationContext authContext = new AuthenticationContext(new UsernamePasswordStrategy());
        boolean isAuthenticated = authContext.authenticateUser(Email, password);


        if (isAuthenticated){
            System.out.println("true");
            //request.setAttribute("User", User.add(new ModelsSIngIn(Email,password)));
            session.setAttribute("User", Email);
            response.sendRedirect("/");
        }else {
            request.setAttribute("Auth", "false");
            System.out.println("False");
            response.sendRedirect("jsps/login.jsp");
        }
    }
}
