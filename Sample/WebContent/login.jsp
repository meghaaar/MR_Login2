<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
 </head>
  <body>
   <h1> Login </h1> 
   <center>
   		<h2>Login Details</h2>
     	<form action="LoginController" method="post">
     	<br/>Username:<input type="text" name="username">
     	 <br/>Password:<input type="password" name="password">
     	  <br/><input type="submit" value="Login">
     	   </form>
    </center>
    <br>
    <br>
    <br>
    <a href="signup.jsp">Not yet registered? Sign up here!</a>
  </body>
</html>