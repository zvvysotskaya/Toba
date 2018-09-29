/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Register;

import appBusinessAccount.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import appBusinessUser.User;
import data.AccountDB;
import data.DBUtil;
import data.UserDB;

import javax.servlet.http.HttpSession;

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

        String url = "/index.html";
        // get current action
        String action = request.getParameter("action");
        String message;
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        } else if (action.equals("bb")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipcode = request.getParameter("zipcode");
            String email = request.getParameter("email");
            String ln = lastName;
            String z = zipcode;
            String lastNzipC = ln + z;
            String userName = lastNzipC;
            String password = "welcome1";

            User user = new User();
            user.setAddress(address);
            user.setCity(city);
            user.setEmail(email);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setPassword(password);
            user.setPhone(phone);
            user.setState(state);
            user.setUserName(userName);
            user.setZipcode(zipcode);
            //validate the parameters

            if (UserDB.emailExists(email)) {
                message = "This email address already exist. Enter another email address.";
                url = "/newCustomer.jsp";
            } else if (firstName == null || lastName == null || phone == null || address == null || city == null || state == null || zipcode == null || email == null
                    || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty() || email.isEmpty()) {
                message = "Please fill out all the form fields!!!";

                url = "/newCustomer.jsp";
            } else {
                message = "";
                url = "/success2.jsp";
                UserDB.insert(user);
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);

        } else if (action.equals("addMoney")) {
             try{
            HttpSession session = request.getSession();
           
            session.getAttribute("user1");
            User user = (User)session.getAttribute("user1");
          
            String amount = request.getParameter("amount");
                  
               
            double amount2 = Double.parseDouble(amount);
            Account account1 = new Account();
            
            double amount3 = account1.credit(amount2, 25.00);
            account1.setAmount(amount3);
             java.util.Date today = new java.util.Date();
            account1.setTransactionDate(today);
            account1.setAccountUserID(user.getUserId());
            message = "Your transaction was seccessfuly created!";
            AccountDB.insert(account1);
            request.setAttribute("message", message);
            url = "/successAccount.jsp";
            }catch(Exception ex){
                System.out.println(ex);
               message = "Please enter an amount of money you would like to put in your account.";
               request.setAttribute("message", message);
               url = "/successAccount.jsp"; 
            }
        }
         else if (action.equals("removeMoney")) {
             try{
             HttpSession session = request.getSession();
            session.getAttribute("user1");
            User user = (User)session.getAttribute("user1");
            String amount = request.getParameter("amount");
            double amount2 = Double.parseDouble(amount);
            java.util.Date today = new java.util.Date();
            Account account1 = new Account();
            double amount3 = account1.debit(amount2, 25.00);
            account1.setAmount(amount3);
            account1.setTransactionDate(today);
            account1.setAccountUserID(user.getUserId());
            message = "Your transaction was seccessfuly created!";
            AccountDB.insert(account1);
            request.setAttribute("message", message);
            url = "/successAccount.jsp";
            }catch(Exception ex){
                System.out.println(ex);
               message = "Please enter an amount of money you would like to withdraw from your account.";
               request.setAttribute("message", message);
               url = "/successAccount.jsp"; 
            }
        }

        getServletContext().getRequestDispatcher(url)
                .forward(request, response);
    }

    private boolean isDigit(String amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
