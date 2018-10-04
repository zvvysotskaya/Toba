/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appAdminControler;

import appBusinessAccount.Account;
import appBusinessUser.User;
import data.AccountDB;
import data.UserDB;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author zhann
 */
@WebServlet(name = "AdminControlerServlet", urlPatterns = {"/AdminControlerServlet"})
public class AdminControlerServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String url = "/admin";
        if (requestURI.endsWith("/displayReport")) {
            displayReport(request, response);
        }
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
        
    }
 private String displayReport(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
 String url="";
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String message = "";
        HttpSession session = request.getSession();        
        if(UserDB.emailExists(email)){
            
            try {                 
                
                List<User> user11 = UserDB.selectUsers();
                for (int i = 0; i < user11.size(); i++) {
                    User user = user11.get(i);
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                    user.setUserName(userName);
                    user.setPassword(password);
                    user.setEmail(email);
                 
                }
                session.setAttribute("user11", user11);
                url = "/admin/reports.jsp";
            } catch (Exception ex) {
                System.out.println(ex);
                message = "Something is wrong!!!.";
                request.setAttribute("message", message);
                url = "/admin/reports.jsp";
            }
            
            
        
       
        
          url = "/admin/reports.jsp";
        }
        return url;
 }
 
 
}
