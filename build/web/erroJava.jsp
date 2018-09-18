<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html"/>
<main> 
    <h1>Java Error</h1>
    <p>Sorry, Java has thrown an exception.</p>

    <p>To continue click <a href="login.html">Login / Register </a></p>
    <br><br>
    <h2>Details</h2>
    <p>Type: {pageContext.exception["class"]}</p>
    <p>Message: {pageContext.exception.message}</p>
</main>
<c:import url="/includes/footer.jsp"/>        

