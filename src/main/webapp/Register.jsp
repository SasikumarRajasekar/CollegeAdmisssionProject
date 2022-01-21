
<!DOCTYPE html>
<html>
<title>Registration</title>
<body>

<h1>Register Form</h1>

<form action="RegisterServlet" method="post">
<label for="username">Enter UserName</label>
<input type="text"name="username" placeholder="User Name" autofocus pattern="[a-zA-Z]{3,}" required> <br> <br>
<label for="email">Email </label>
<input type="email" name="email" placeholder="Email Id" id="email" required onkeyup ="emailvalid()"> <br> <br>

<label for="mobileno">Enter MobileNumber</label>
<input type="text" name="mobileno" placeholder="Mobile Number" required  pattern="[6-9]{1}[0-9]{9}"> <br> <br>
<label for="password"> Set Password</label>
<input type="password" name="password" placeholder="Password" required min="8" > <br> <br>
<button type="submit">Submit</button><br><br>
</form>

 <% String error=(String)session.getAttribute("emailexist");
      	if(error!=null){%>
      		<h3 style="margin-left:590px;margin-top:590px; size:70%"><%=session.getAttribute("emailexist") %></h3>
      	<%}%>
       

        <% session.removeAttribute("emailexist");%>


</body>
</html>