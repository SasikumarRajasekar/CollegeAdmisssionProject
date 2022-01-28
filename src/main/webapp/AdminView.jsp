
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>

<form action="ViewAllUsers.jsp" method="post">
<h2> Show all users </h2>
<button type="submit">Show Users</button>
</form>
 
<form action="DeleteApplicationServlet" method="post">
<h2>Delete Application</h2>
<ul>
<li>
<label for="applicationId">Application Id</label>
<input type="number" name="applicationId"  required></li>
</ul>
<button type="submit">Delete Application</button>
</form>

<form action="ViewAllApplicants.jsp" method="post">
<h2> Show all applicants </h2>
<button type="submit">Show Applicants</button>
</form>

<h2 align="center">  Courses Details </h2>
<a href="InsertCourses.jsp"> Insert </a>

<h2 align="center"> Edit Courses </h2>
<a href="UpdateCourses.jsp"> Edit </a>

<form action="DeleteCoursesServlet" method="post">
<h2>Delete Courses</h2>
<ul>
<li>
<label for="courseId">Course Id</label>
<input type="number" name="courseId"  required></li>
</ul>
<button type="submit">Delete Courses</button>
</form>


</body>
</html>