<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "InsertApplicationStatusServlet" method="post">

<h1>Application Status Details</h1>

<input type ="number" name = "statusId" placeholder="Status Id" required><br><br>
<input type ="number" name = "userId" placeholder="User Id" required><br><br>
<input type ="number" name = "applicationId" placeholder ="Application Id" required><br><br>
<input type="number" name = "courseId" placeholder="Course Id" required><br><br>
<input type ="text" name = "paymentStatus" placeholder = "Payment Status" required ><br><br>
<input type ="text" name = "applicationStatus" placeholder = "Application Status" required ><br><br>

<button type="submit">Submit</button><br><br>
</form>


</body>
</html>