<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "InsertCoursesServlet" method="post">

<h1>Insert Course Details</h1>

<input type ="number" name = "courseId" placeholder="Course ID" required><br><br>
<input type ="text" name = "courseType" placeholder="Course Type" required><br><br>
<input type ="text" name = "courseName" placeholder ="Course Name" required><br><br>
<input type="number" name = "admissionFees" placeholder="Admission Fees" required><br><br>
<input type ="number" name = "tuitionFees" placeholder = "Tuition Fees" required ><br><br>

<button type="submit">Submit</button><br><br>
</form>


</body>

</body>
</html>