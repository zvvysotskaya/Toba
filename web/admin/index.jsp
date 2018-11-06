<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header2_admin.html"/>
<main>
    <h2>Hello Admin</h2>
    <form action="reports.jsp" method="post">
        <input type="hidden" name="action" value="reports">
    <input type="submit" value="Display Reports" class="left_margin">
    
    </form><br>
    
    <p><a href="reports.jsp">reports</p>
</main>
<c:import url="footer_admin.jsp"/>  