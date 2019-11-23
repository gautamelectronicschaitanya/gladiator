<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator</title>
</head>
<body>
<h1 align="center" style="color:Blue"><font><strong>User Details</strong></font></h1>
<div style="border:solid 2px black;display:inline-block;"></div>
<table align="center" style="color:red" cellpadding="10" cellspacing="10" border="2.2">
<tr>
<td><b>Name</b></td>
<td><b>Email</b></td>
<td><b>Password</b></td>
<td><b>Phone Number</b></td>
<td><b>Status</b></td>
</tr>
<c:forEach items="${ users }" var="ud">
<tr>
<td>${ ud.NAME } </td>
<td>${ ud.EMAIL }</td>
<td>${ ud.PHONE_NO }</td>
<td>${ ud.authDetails.status }</td>
<td><a href="UPDATE.jsp">UPDATE</a></td>
<td><a href="DELETE.jsp">DELETE</a></td>
<td><input type="radio" name="auth" value="Active" checked>Active<br></td>
<td><input type="radio" name="auth value="deactive">Deactive<br></td>
</tr>
</c:forEach>

</table>

</body>
</html>