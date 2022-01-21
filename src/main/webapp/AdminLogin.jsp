<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="AdminLoginServlet" method="post">
<label for="adminemail"> AdminEmail </label>
<input type="text" name="email" pattern="[a-z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}" required> <br> <br>

<label for="adminpassword"> AdminPassword </label>
<input type="password" name="adminpassword" required min="8" > <br> <br>

<button type="submit">Submit</button>

</form>
</body>

</html>