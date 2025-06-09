<!-- This is the HTML document declaration -->
<html>

<head>
    <!-- The title of the web page that appears in the browser tab -->
    <title>Welcome</title>
</head>

<body>
    <!-- The content displayed on the web page -->
    <h3>List of what you can get from this project</h3>
    
     <!-- navigate to login.jsp page -->
    <a href="Login.jsp">Login</a><br>
    
     <!-- navigate to SignUp.jsp page -->
    <a href="SignUp.jsp">Register</a><br>
    
     <!-- navigate to Embeddable.jsp page -->
    <a href="Embeddable.jsp">Embeddable Demo</a><br>
    
    <!-- navigate to LSmapping servlet page page -->
    <form action="LSmapping" method="post">
      <input type="submit" value="Relational mapping Demo">
    </form>
    
    <!-- navigate to CacheServletDemo servlet page  -->
    <form action="CacheServletDemo" method="post">
      <input type="submit" value="Cache Demo">
    </form>
   
   <!-- navigate to HqlServlet servlet page -->
   <form action="HqlServlet" method="post">
      <input type="submit" value="HqlServlet">
    </form>
</body>

</html>
