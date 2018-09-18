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
import appBusinessUser.User;
import javax.servlet.http.HttpSession;

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
        HttpSession session = request.getSession();
        if (action.equals("aaa")) {

            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            User user = (User) session.getAttribute("user");

            String newpassword = (String) session.getAttribute("password");
            if (userName.equals("jsmith@toba.com") && password.equals("letmein")) {
                url = "/transaction.html";
            } else if (password.equals(newpassword)) {

                url = "/accountActivity.jsp";
            } else {
                url = "/loginFailure.html";
            }
        } else if (action.equals("resetp")) {
            url = "/passwordReset.jsp";
        } else if (action.equals("resetpassword")) {
            url = "/login.html";
        }
        getServletContext().getRequestDispatcher(url)
                .forward(request, response);
    }
}
