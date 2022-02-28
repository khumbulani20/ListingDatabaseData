<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="org.entity.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
<table border="1">

 
<tr>
<th>User ID </th>
<th>Username </th>
<th>First name </th>
<th>Surname </th>
<th>Email </th>
 </tr>
 <%
 List<User> users= (List)request.getAttribute("users");
 for(User user: users)
 {
	 out.print("<tr>");
	 out.print("<td>"+user.getUser_id()+"</td>");
	 out.print("<td>"+user.getUsername()+"</td>");
	 out.print("<td>"+user.getFirstName()+"</td>");
	 out.print("<td>"+user.getLastName()+"</td>");
	 out.print("<td>"+user.getEmail()+"</td>");
	 out.print("</tr>");
 }
 
 
 
 
 %>

</table>
</body>
</html>