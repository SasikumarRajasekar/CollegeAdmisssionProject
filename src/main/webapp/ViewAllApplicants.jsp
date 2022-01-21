<%@page import="com.collegeadmission.model.ApplicationDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.collegeadmission.impl.ApplicationDaoImpl"%>

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
ApplicationDaoImpl applis=new ApplicationDaoImpl();
List<ApplicationDetails> userList= applis.showAllApplications();
%>
<div id="allusers">
<table>
<thead>
<tr>
<th>Application Id</th>
<th>User Id</th>
<th>Student Name</th>
<th>Father Name</th>
<th>Date of Birth</th>
<th>Aadhar Number</th>
<th>Sslc Mark</th>
<th>Hsc Mark</th>
<th>Address</th>
<th>City</th>
<th>Pincode</th>
<th>User State</th>
<th>Nationality</th>

</tr>
</thead>
<tbody>
<%
for(ApplicationDetails users:userList){
%>
<tr>
<td><%=users.getApplicationId()%></td>
<td><%=users.getUserId()%></td>
<td><%=users.getStudentName()%></td>
<td><%=users.getFatherName()%></td>
<td><%=users.getDateofBirth() %></td>
<td><%=users.getAadharNumber()%></td>
<td><%=users.getSslcMark()%></td>
<td><%=users.getHscMark()%></td>
<td><%=users.getAddress()%></td>
<td><%=users.getCity()%></td>
<td><%=users.getPincode()%></td>
<td><%=users.getUserState%></td>
<td><%=users.getNationality()%></td>

</tr>
<%} %>
</tbody>
</table>
</div>


</body>
</html>