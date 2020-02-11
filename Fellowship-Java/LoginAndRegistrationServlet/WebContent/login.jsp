<!DOCTYPE html>
<html>
<header>
	<link rel="stylesheet" href="style.css">
	<h1>Sea World Login</h1>

</header>
<%response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
<div id="form">

	<div class="seaWorld1" id="seaWorld1"></div>
	<div class="seaWorld2" id="seaWorld2"></div>

	<form id="login" method="post" action="login">

		<div class="loginClass" id="login-form">
			<label for="name">User Name*</label> <input type="text" id="userName"
				name="userName" /> <label for="password">Password*</label> <input
				type="password" id="password" name="password" />

		</div>



		<input type="submit" value="Login!" name="submit" /> 
		
		
	</form>
</div>



</body>
</html>
.
