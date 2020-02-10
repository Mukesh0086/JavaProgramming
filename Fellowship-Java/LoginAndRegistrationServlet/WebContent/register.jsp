<!DOCTYPE html>
<html>
<header>
	<link rel="stylesheet" href="style.css">
	<h1>Sea World Login</h1>

</header>

<div id="form">

	<div class="seaWorld1" id="seaWorld1"></div>
	<div class="seaWorld2" id="seaWorld2"></div>

	<form id="login" method="post" action="register">

		<div class="loginClass" id="login-form">
			<label for="name">First Name*</label> 
			<input type="text" id="firstName" name="firstName" required/>
			<label for="password">Last Name*</label> 
			<input type="text" id="lastName" name="lastName" required/>
			<label for="name">User Name*</label> 
			<input type="text" id="userName" name="userName" required/>
			<label for="password">Email*</label> 
			<input type="text" id="email" name="email" />
			<label for="name">User Contact Number*</label> 
			<input type="text" id="phoneNumber" name="phoneNumber" required/>
			<label for="password">Password*</label> 
			<input type="password" id="password" name="password" required/>
		</div>
		<input type="submit" value="Register" name="submit" required/>
	</form>
</div>
<%response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>


</body>
</html>