
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

</body>
</html>