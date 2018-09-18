<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html"/>
               <main> 
                   <h2>Create an Account</h2>
                   <p id="center">To create an account, please fill out the form.</p>
                   <h2> <i>${message}</i></h2>
                   
                   <form action="register" method="post" class="customer">
                       <input type="hidden" name="action" value="bb">
                           <label>First Name:</label>
                           <input type="text" name="firstName" value="${user.firstName}"><br>
                           
                           <label>Last Name:</label>
                           <input type="text" name="lastName" value="${user.lastName}"><br>
                           
                           <label>Phone:</label>
                           <input type="tel" name="phone" value=" ${user.phone}"><br>
                           <label>Address:</label>
                           <input type="text" name="address" value=" ${user.address}"><br>
                           <label>City:</label>
                           <input type="text" name="city" value="${user.city}"><br>
                           <label>State:</label>
                           <input type="text" name="state" value="${user.state}"><br>
                           <label>Zipcode:</label>
                           <input type="text" name="zipcode" value="${user.zipcode}"><br>
                           <label>Email:</label>
                           <input type="text" name="email" value="${user.email}"><br><br>
                           <input type="submit" value="Submit"><br>
                           
                   </form>
                           <br><br>
     </main>
            <c:import url="/includes/footer.jsp"/>      
            
        
