<%@page import="com.collegeadmission.model.UserDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.collegeadmission.impl.UserDaoImpl"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
UserDaoImpl obj1=new UserDaoImpl();
List<UserDetails> userList= obj1.showAllUsers();
%>
<div id="allusers">
<table>
<thead>
<tr>
<th>User Id</th>
<th>User Name</th>
<th>MailId</th>
<th>Mobile Number</th>
<th>User Password</th>
</tr>
</thead>

<tbody>
<%
for(UserDetails users:userList){
%>
<tr>
<td><%=users.getUserId()%></td>
<td><%=users.getUserName()%></td>
<td><%=users.getEmail()%></td>
<td><%=users.getMobileNumber() %></td>
<td><%=users.getUserPassword()%></td>

</tr>
<%} %>
</tbody>
</table>
</div>

</body>
</html>