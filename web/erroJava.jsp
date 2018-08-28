<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>TOBA Titan Online Banking Application</title>
        <link rel="stylesheet" href="style/color.css" type="text/css">
    </head>
    <body>
      <div id="wrapper">
            <header>
                <div id="logo"></div>
                <div id="titleApp"><h1>Titan Online Banking Application</h1></div>    
                  
            </header>           
                <nav>
                    <ul>
                    <li><a href="login.html">Login / Register </a></li>
                    </ul>
                </nav>   
               <main> 
                   <h1>Java Error</h1>
        <p>Sorry, Java has thrown an exception.</p>

                   <p>To continue click <a href="login.html">Login / Register </a></p>
                           <br><br>
                           <h2>Details</h2>
                           <p>Type: {pageContext.exception["class"]}</p>
                           <p>Message: {pageContext.exception.message}</p>
     </main>
            <footer>
                <div class="copy">
copyright &copy; 2018 AAAA, Inc. All rights reserved.<br><br>
<a href="mailto:contact@AAAA.com">contact@AAAA.com</a>
</div>
            </footer>    
            
        </div>
    </body>
</html>

