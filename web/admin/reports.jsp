<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header2.html"/>
<main> 
    <h2>Report</h2>
   
        <h3>Report information</h3>
        <form action="<c:url value='/adminController/displayReport'/>" method="post">
    <input type="hidden" name="reportName" value="userEmail">
    <input type="hidden" name="reportTitle" value="The User Email report">
    <input type="submit" value="User Register Report" class="left_margin">
</form>
        
        
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
            <h2>Transactions</h2>
            <h2>${message}</h2>
            <table>
                <tr>
                    <th>User ID</th>
                    <th>Amount</th>
                    <th>Invoice Date</th>
                </tr>
                <c:forEach var="account7" items="${account7}">
                <tr>
                    <td><c:out value="${account7.accountUserID}"/></td>
                    <td><c:out value="${account7.amount}"/></td>
                    <td><c:out value="${account7.transactionDate}"/></td>
                    
                    </c:forEach>
                </tr>
            </table>
    <h3><a href="login.html">Login / Register</a></h3>
</main>
<c:import url="/includes/footer.jsp"/>  
