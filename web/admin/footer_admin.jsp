 <footer>
     <%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
     <%
         GregorianCalendar currentDate = new GregorianCalendar();
         int currentYear = currentDate.get(Calendar.YEAR);
         
         %>
     <div class="copy">
copyright &copy; <%= currentYear %> AAAA, Inc. All rights reserved.<br><br>
<a href="mailto:contact@AAAA.com">contact@AAAA.com</a>
</div>
            </footer>    
            
        </div>
    </body>
</html>