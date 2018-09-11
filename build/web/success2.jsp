<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html"/>
               <main> 
                   <h2>This is your account information:</h2>
                   
                   <p>First Name: <c:out value="${user2.firstName}"/></p>
                   <p>Last Name: <c:out value="${user2.lastName}"/></p>
                   <p>Phone: <c:out value="${user2.phone}"/></p>              
                   <p>Address: <c:out value="${user2.address}"/></p>
                   <p>City: <c:out value="${user2.city}"/></p>
                   <p>State: <c:out value="${user2.state}"/></p>
                   <p>Zipcode:<c:out value="${user2.zipcode}"/></p>
                   <p>Email: <c:out value="${user2.email}"/></p>
                   <p>User Name: <c:out value="${user3.userName}"/></p>
                   <p>Password: <c:out value="${user3.password}"/></p>
                           <br><br>
     </main>
   <c:import url="/includes/footer.jsp"/>         