<!DOCTYPE html>
<html>
<header>
	<link rel="stylesheet" href="style.css">
	<h1>Sea World Login</h1>

</header>

<div id="form">

	<div class="seaWorld1" id="seaWorld1"></div>
	<div class="seaWorld2" id="seaWorld2"></div>

	<form id="login" method="post" action="LoginServlet">

		<div class="loginClass" id="login-form">
			<label for="name">User Name*</label> <input type="text" id="userName"
				name="userName" /> <label for="password">Password*</label> <input
				type="password" id="password" name="password" />

		</div>





		<input type="submit" value="Login!" name="submit" /> 
		<input type="submit" value="Forgot Password!" name="submit" /> 
		
	</form>
</div>



</body>
</html>