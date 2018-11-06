<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header2_admin.html"/>
<main> 
    <h2>Report</h2>
   
        <h3>Report information</h3>
        <form action="reports.jsp" method="post">
    <input type="hidden" name="action" value="reports">
    
    <input type="submit" value="User Register Report" class="left_margin">
</form>
        ${message}
        
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
                
                <th>${user11.firstName}</th>
                <th>${user11.lastName}</th>
                <th>${user11.phone}</th>
                <th>${user11.address}</th>
                <th>${user11.city}</th>
                <th>${user11.state}</th>
                <th>${user11.zipcode}</th>
                <th>${user11.email}</th>
                <th>${user11.userName}</th>
                <th>${user11.password}</th>
            </tr>
            
        </table>
            <h2>Transactions</h2>
            <h2>${message}</h2>
            <table>
                <tr>
                    <th>User ID</th>
                    <th>Amount</th>
                    <th>Invoice Date</th>
                </tr>
                <c:forEach var="user11" items="${user11}">
                <tr>
                    <td><c:out value="${user11.userName}"/></td>
                    <td><c:out value="${user11.firstName}"/></td>
                    <td><c:out value="${user11.lastName}"/></td>
                    
                    </c:forEach>
                </tr>
            </table>
    <h3><a href="login.html">Login / Register</a></h3>
</main>
<c:import url="footer_admin.jsp"/>  
