
<!DOCTYPE html>
<html>
<title>Registration</title>
<body>

<form action="register">
<label for="username">Enter UserName</label>
<input type="text"name="username" autofocus pattern="[a-zA-Z]{3,}"> <br> <br>
<label for="email">Email </label>
<input type="text" name="email" pattern="[a-z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}" required> <br> <br>
<label for="mobileno">Enter MobileNumber</label>
<input type="text" name="mobileno"  required  pattern="[6-9]{1}[0-9]{9}"> <br> <br>
<label for="password"> Set Password</label>
<input type="password" name="password" required min="8" > <br> <br>
<button type="submit">Submit</button><br><br>
</form>



</body>
</html>