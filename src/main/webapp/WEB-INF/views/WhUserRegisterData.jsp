<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO WHUSER TYPE DATA PAGE</h3>
<table border="1">
<tr>
<th>ID</th>
	<th>CODE</th>
	<th>TYPE</th>
	<th>AUTOFILL</th>
	<th>EMAIL</th>
	<th>CONTACT</th>
	<th>IDTYPE</th>
	<th>OTHER</th>
	<th>IDNUMBER</th>
	<th>OPERATIONS</th>
	</tr>
	<!-- for(WhUserType ob:list){} -->
	
	<c:forEach items="${list}" var="ob">
	<tr>
		<td>${ob.wid}</td>
		<td>${ob.WhUserCode}</td>
		<td>${ob.WhUserType}</td>
		<td>${ob.WhUser}</td>
		<td>${ob.Email}</td>
		<td>${ob.Contact}</td>
		<td>${ob.WhUserIdType}</td>
		<td>${ob.Other}</td>
		<td>${ob.WhIdNumber}</td>
		</tr>
		</c:forEach>
		</table>
		${message}
</body>
</html>