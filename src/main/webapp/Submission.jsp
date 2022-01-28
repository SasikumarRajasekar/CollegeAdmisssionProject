<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Thank you for selecting the course</h1>
<%String courseid=request.getParameter("courseid"); %>
<p><%= courseid %></p>
</body>
</html>