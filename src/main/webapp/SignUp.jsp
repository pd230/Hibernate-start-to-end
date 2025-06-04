<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
     
	<div
		style="height: 100%; width: 100%; display: flex; flex-direction: column; align-items: center; justify-content: center;">
         <h1>Registration Form</h1>
		<div
			style="height: content-fit; width: content-fit; %; display: flex; flex-direction: column; border: 1px solid black; align-items: center; justify-content: center;">
			<form action="SignUpServlet" method="post"
				style="height: full%; width: fit; align-items: center; justify-content: center; padding: 20px">
				<label>Enter First Name : </label> <input type="text" name="fname"
					required><br>
				<br> <label>Enter Last Name : </label> 
				     <input type="text" name="lname" required><br>
				<br> <label>Enter Email Id : </label> 
				     <input type="email" name="email" pattern="^[a-z]+[0-9]+@[a-z]+\.[a-z]{2,}$" required><br>
				<br> <label>Enter Username : </label>
				     <input type="text" name="uname" required><br>
				<br> <label>Enter Password : </label> 
				     <input type="password" name="password" required><br>
				<br> <input type="submit" value="submit"> 
				     <input type="reset" value="Reset">
				     <a href="GoogleSignUp">Sign Up with google</a>
			</form>
		</div>
		
		<% if(request.getAttribute("error") != null) {%>
		    <h2 style="color:red"><%=request.getAttribute("error") %></h2>
		<%} %>
	</div>
</body>
</html>