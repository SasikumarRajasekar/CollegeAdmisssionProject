<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "InsertApplicationServlet" method="post">
<h1>Application Details</h1>
<input type ="number" name = "userid" placeholder="User Id" required><br><br>
<input type ="text" name = "studentname" placeholder = "Student Name" pattern = "[A-Za-z.,]{3,30}"  required ><br><br>
<input type ="text" name = "fathername" placeholder ="Father Name"  pattern = "[A-Za-z., ]{3,30}" required><br><br>
<input type ="date" name = "dateofbirth" placeholder="DateofBirth" required><br><br>
<input type ="number" name = "aadharnumber" placeholder="Aadhar Number" required><br><br>
<input type ="number" name = "sslcMark" placeholder ="Sslc Mark" required><br><br>
<input type="number" name = "hscMark" placeholder="Hsc Mark" required><br><br>
<input type ="text" name = "address" placeholder = "Address" required ><br><br>
<input type ="text" name = "city" placeholder = "City" required ><br><br>
<input type ="number" name = "pincode" placeholder="Pincode" required><br><br>
<input type ="text" name = "state" placeholder = "State" required ><br><br>
<input type ="text" name = "nationality" placeholder = "Nationality" required ><br><br>

<button type="submit">Submit</button><br><br>
</form>
</body>
</html>