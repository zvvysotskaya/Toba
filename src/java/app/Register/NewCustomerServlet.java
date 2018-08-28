/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Register;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import appBusinessRegister.UserRegister;
/**
 *
 * @author zhann
 */
@WebServlet(name = "NewCustomerServlet", urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet {

   

    
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
       if(action.equals("bb")){
           String firstName = request.getParameter("firstName");
           String lastName = request.getParameter("lastName");
           String phone = request.getParameter("phone");
           String address = request.getParameter("address");
           String city = request.getParameter("city");
           String state = request.getParameter("state");
           String zipcode = request.getParameter("zipcode");
           String email = request.getParameter("email");
           
           UserRegister user2 = new UserRegister(firstName, lastName, phone, address, city, state, zipcode, email);
           //validate the parameters
           String message;
           if(firstName==null ||lastName == null ||phone==null || address==null || city==null || state==null || zipcode==null || email==null ||
              firstName.isEmpty() ||lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty() || email.isEmpty()){
               message = "Please fill out all the form fields!!!";
               url = "/newCustomer.jsp";
           }
           else{
               message = "";
               url = "/success.html";
           }
           
           request.setAttribute("user2", user2);         
          request.setAttribute("message", message); 
           
       }
       
      
          getServletContext().getRequestDispatcher(url)
        .forward(request, response); 
    }

}
