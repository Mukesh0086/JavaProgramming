<!DOCTYPE html>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.servlet.model.Registration"%>
<html>
<header>
	<link rel="stylesheet" href="style.css">
	<h1>Sea World Login</h1>

</header>

<div id="form">

	<div class="seaWorld1" id="seaWorld1"></div>
	<div class="seaWorld2" id="seaWorld2"></div>

	<form id="login" method="post" action="logout">

		<div class="loginClass" id="login-form">
			
			
		
		<% HttpSession httpSession=request.getSession();
		HttpSession httpSession1=request.getSession();	
			String name=(String) httpSession.getAttribute("userName");
			Registration reg=(Registration) httpSession1.getAttribute("registerObject");
			String firstName=reg.getFirstName();
			String lastName=reg.getLastName();
			long id=reg.getId();
			long phoneNumber=reg.getPhoneNumber();
			String email=reg.getEmail();
		
		%>
		<div id="details" align="center">
		<h4>Welcome <%=name%></h4>
		<table border="25px">
		<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Phone Number</th>
		<th>Email</th>
		</tr>
		<tr>
		
		<td><%=id%></td>
		<td><%=firstName%></td>
		<td><%=lastName%></td>
		<td><%=phoneNumber%></td>
		<td><%=email%></td>
		
		</tr>
		
		
		
		</table>
		</div>
		</div>
		
		
		
		<input type="submit" value="LogOut" name="submit" />
	</form>
</div>

<%response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>

</body>
</html>