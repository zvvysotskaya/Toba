
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header2.html"/>
               <main> 
                   <h1>Account Activity</h1>
                   <c:if test="${user!=null}">
                       <h2>Welcome !</h2> 
                       
                   </c:if>
                       <c:if test="${user==null}">
                           <h2>Not logged in!</h2>
                       </c:if>
                   
               </main>
               <c:import url="/includes/footer.jsp"/>  
