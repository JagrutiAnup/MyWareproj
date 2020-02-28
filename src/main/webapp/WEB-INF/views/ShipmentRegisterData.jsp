<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO SHIPMENT TYPE DATA PAGE</h3>
	<c:choose>
		<c:when test="${!empty list}">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>CODE</th>
					<th>GRADE</th>
					<th>MODE</th>
					<th>ENABLE</th>
					<th>NOTE</th>
					<th>OPERATIONS</th>
				</tr>
				<!-- for(ShipmentType ob:list){} -->
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.shipId}</td>
						<td>${ob.shipMode}</td>
						<td>${ob.shipCode}</td>
						<td>${ob.enbShip}</td>
						<td>${ob.shipGrade}</td>
						<td>${ob.shipDesc}</td>
						<td><a href="delete?sid=${ob.shipId}">DELETE</a> || <a
							href="view?sid=${ob.shipId}">VIEW</a> || <a
							href="edit?sid=${ob.shipId}">EDIT</a></td>
					</tr>
				</c:forEach>
			</table>

		</c:when>
		<c:otherwise>
			<h4>NO DATA FOUND !!</h4>
		</c:otherwise>
	</c:choose>

	<a href="excel">Excel Export</a>

	<a href="pdf">PDF Export</a> ${message}
</body>
</html>