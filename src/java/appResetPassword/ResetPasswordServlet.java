/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appResetPassword;

import appBusinessUser.User;
import data.UserDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ResetPasswordServlet", urlPatterns = {"/ResetPasswordServlet"})
public class ResetPasswordServlet extends HttpServlet {

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
        String message = "";
        if (action.equals("resetpassword")) {

            String email = request.getParameter("email");
            String password = request.getParameter("password");
            //get user object from DB
            User user = UserDB.selectUser(email);
            if(UserDB.emailExists(email)){
                //change password
            user.setPassword(password);
            request.setAttribute("user", user);            
           
            UserDB.update(user);
            url = "/login.html";              
            request.setAttribute("user", user);
            }
            else{
                message= "This email addrest does not exist.";
                request.setAttribute("message", message);
                url = "/passwordReset.jsp";
            }
        }
        getServletContext().getRequestDispatcher(url)
                .forward(request, response);
    }

}
