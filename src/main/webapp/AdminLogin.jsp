
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<form action="adminlogin" method="post">
<label for="adminemail"> AdminEmail </label>
<input type="text" name="adminemail" pattern="[a-z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}" required> <br> <br>

<label for="adminpassword"> AdminPassword </label>
<input type="password" name="adminpassword" required min="8" > <br> <br>

<button type="submit">Submit</button>

</form>
</body>
</html>