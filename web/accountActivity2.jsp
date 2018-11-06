
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header2.html"/>
<main> 
    <h2>Account Activity</h2>
    <c:if test="${user1!=null}">
        <h4><i>Welcome ${user1.firstName} ${user1.lastName}!</i></h4> 

    </c:if>
    <c:if test="${user1==null}">
        <h2><i>Not logged in!</i></h2>
    </c:if>
        <h3>Account information</h3>
        <table>
            <tr>
               
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone</th>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
                <th>Zip Code</th>
                <th>Email Address</th>
                <th>User Name</th>
                <th>Password</th>  
            </tr>
            <tr>
                
                <th>${user1.firstName}</th>
                <th>${user1.lastName}</th>
                <th>${user1.phone}</th>
                <th>${user1.address}</th>
                <th>${user1.city}</th>
                <th>${user1.state}</th>
                <th>${user1.zipcode}</th>
                <th>${user1.email}</th>
                <th>${user1.userName}</th>
                <th>${user1.password}</th>
            </tr>
            
        </table>
           
    <h3><a href="login.html">Login / Register</a></h3>
</main>
<c:import url="/includes/footer.jsp"/>  
