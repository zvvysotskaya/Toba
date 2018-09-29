<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header2.html"/>
<main> 
    <h2>Transactions</h2>

    <p>Your Balance: <c:out value="${account1.balance}"/></p>
    <Form action="register" method="post" class="addMoney">
        <input type="hidden" name ="action" value="addMoney">
        <label>Add money:</label>
        <input type="text" name="amount"  value="${account1.amount}"><br><br>
        <input type="submit" value="Add Money">
    </Form><br>
    <Form action="register" method="post" class="removeMoney">
        <input type="hidden" name ="action" value="removeMoney">
        <label>Remove money:</label>
        <input type="text" name="amount" value="${account1.amount}"><br><br>
        <input type="submit" value="Remove Money">
    </Form>

</main>
<c:import url="/includes/footer.jsp"/>    
