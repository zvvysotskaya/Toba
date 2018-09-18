<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html"/>
<main> 
    <h2>This is your account information:</h2>

    <p>First Name: <c:out value="${user.firstName}"/></p>
    <p>Last Name: <c:out value="${user.lastName}"/></p>
    <p>Phone: <c:out value="${user.phone}"/></p>              
    <p>Address: <c:out value="${user.address}"/></p>
    <p>City: <c:out value="${user.city}"/></p>
    <p>State: <c:out value="${user.state}"/></p>
    <p>Zipcode:<c:out value="${user.zipcode}"/></p>
    <p>Email: <c:out value="${user.email}"/></p>
    <p>User Name: <c:out value="${user.userName}"/></p>
    <p>Password: <c:out value="${user.password}"/></p>
    <br><br>
</main>
<c:import url="/includes/footer.jsp"/>         