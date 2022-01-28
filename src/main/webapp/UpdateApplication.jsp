<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="UpdateApplicationServlet" method= "post">
<label>Enter the address</label>
<input type="text" name="addrss" required>
<label>Enter the city</label>
<input type="text" name="city" required>
<label>Enter the pincode </label>
<input type="text" name="pincode" required>
<label>Enter the state</label>
<input type="text" name="State" required>
<label>Enter the nationality</label>
<input type="text" name="applicationId" required>



<button type="submit" >submit</button>
</form>

</body>
</html>