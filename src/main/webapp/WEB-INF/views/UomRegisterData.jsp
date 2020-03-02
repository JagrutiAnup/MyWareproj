<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO UOM TYPE DATA PAGE</h3>
<c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr>
	<th>ID</th>
	<th>TYPE</th>
	<th>MODEL</th>
	<th>NOTE</th>
	<th>OPERATIONS</th>
	</tr>
	<!-- for(UomType ob:list){} -->
	<c:forEach items="${list}" var="ob">
	<tr>
		<td>${ob.uomId}</td>
		<td>${ob.uomType}</td>
		<td>${ob.uomModel}</td>
		<td>${ob.uomDesc}</td>
		<td>
		<a href="delete?umid=${ob.uomId}">DELETE</a>
		</td>
		</tr>
		</c:forEach>
		</table>
		</c:when>
		<c:otherwise>
			<h4>NO DATA FOUND !!</h4>
			</c:otherwise>
		</c:choose>
${message}
</body>
</html>