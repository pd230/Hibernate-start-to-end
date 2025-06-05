<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Embeddable Demo</title>
</head>
<body>
 <div
		style="height: 100%; width: 100%; display: flex; flex-direction: column; align-items: center; justify-content: center;">
         <h2>In Hibernate (and JPA), @Embeddable is an annotation used to mark a class whose instances can be embedded in other 
          entities. It's typically used when you want to group multiple fields into a
          single, reusable value object, like an address, name, or contact info, and store its fields as part of another table.</h2>><br><br>
 
         
         <h1>Registration Form</h1>
		<div
			style="height: content-fit; width: content-fit; %; display: flex; flex-direction: column; border: 1px solid black; align-items: center; justify-content: center;">
			<form action="EmbeddableServlet" method="post"
				style="height: full%; width: fit; align-items: center; justify-content: center; padding: 20px">
				<label>Enter First Name : </label> <input type="text" name="fname"
					required><br><br>
					<label>Enter midddle Name : </label> <input type="text" name="mname"
					required><br>
				<br> <label>Enter Last Name : </label> 
				     <input type="text" name="lname" required><br>
				<br> <label>Enter Age : </label> 
				     <input type="text" name="age" required><br>
				
				<br> <input type="submit" value="submit"> 
				     <input type="reset" value="Reset">
			</form>
		</div>

</body>
</html>