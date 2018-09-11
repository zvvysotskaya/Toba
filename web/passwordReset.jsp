<%-- 
    Document   : passwordReset
    Created on : Sep 9, 2018, 11:49:11 PM
    Author     : zhann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html"/>
               <main> 
                   <h2>Reset Password</h2>
                   
                   <p>Enter your new password</p>
                   
                    <label>New Password:</label>
                    <form action="reset" method="post">
                        <input type="hidden" name="action" value="resetpassword">
                        <input type="password" name="password" value="${user4.password}"><br>
                        <input type="submit" value="Reset">
                    </form>                   
                           <br><br>
     </main>
   <c:import url="/includes/footer.jsp"/>         
