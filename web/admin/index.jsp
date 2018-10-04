<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header2.html"/>
<main>
    <h2>Hello Admin</h2>
    <form action="reports.jsp" method="post">
    <input type="submit" value="Display Reports" class="left_margin">
    
    </form><br>
</main>
<c:import url="/includes/footer.jsp"/>  