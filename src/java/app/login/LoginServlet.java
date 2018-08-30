/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import appBusiness.UserLogin;
/**
 *
 * @author zhann
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String url = "";   
       String action = request.getParameter("action");
       if(action.equals("aaa")){
           String userName = request.getParameter("userName");
           String password = request.getParameter("password");
           UserLogin user = new UserLogin(userName, password);
           request.setAttribute("user", user);
           if(userName.equals("jsmith@toba.com") && password.equals("letmein"))
            url = "/transaction.html"; 
           
           else
               url = "/loginFailure.html";
           
       }
            
          getServletContext().getRequestDispatcher(url)
        .forward(request, response); 
    }

       

}