<html>
<body>
<h2>User Login</h2>
<form action="userlogin">

<label for="email">Email </label>
<input type="text" name="email" pattern="[a-z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}" required> <br> <br>

<label for="password"> Password </label>
<input type="password" name="password" required min="8" > <br> <br>

<button type="submit"> Login </button>

</form>
</body>
</html>
