/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appAdminController;

import appBusinessUser.User;
import data.UserDB;
import java.io.IOException;
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
@WebServlet(name = "AdminControllerServlet", urlPatterns = {"/AdminControllerServlet"})
public class AdminControllerServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
    String url = "";
    String message = "";
        if(action.equals("reports")){
          url = "admin/reports.jsp";
            message= "Hello! Here we are";
            request.setAttribute("message", message);
        }
        getServletContext().getRequestDispatcher(url)
                .forward(request, response);
        }
    }
    