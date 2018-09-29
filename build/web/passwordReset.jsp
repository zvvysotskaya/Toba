

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html"/>
<main> 
    <h2>Reset Password</h2>

    <p>Enter your new password</p>
    <h4><i>${message}</i></h4>
    <label>New Password:</label>
    <form action="reset" method="post">
        <input type="hidden" name="action" value="resetpassword">
        <label>Enter Your Email Address:</label>
        <input type="text" name="email" value="${user.email}"><br>
        <label>Enter New Password:</label>
        <input type="password" name="password" value="${user.password}"><br>
        <input type="submit" value="Reset">
    </form>                   
    <br><br>
</main>
<c:import url="/includes/footer.jsp"/>         
