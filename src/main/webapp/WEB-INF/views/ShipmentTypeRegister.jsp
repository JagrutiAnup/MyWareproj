<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action ="save" method="POST" modelAttribute="shipmentType">
<h3>WELCOME TO SHIPMENT TYPE REGISTER PAGE</h3>
<pre>
Shipment Mode:
             <form:select path="shipMode">
             <form:option value="">--select--</form:option>
             <form:option value="Air">Air</form:option>
              <form:option value="Truck">Truck</form:option>
              <form:option value="Ship">Ship</form:option>
              <form:option value="Train">Train</form:option>
             </form:select>
Shipment Code:
			<form:input path="shipCode"/>
Enable Statement:
			<form:select path="enbShip">
             <form:option value="">--select--</form:option>
             <form:option value="Yes">Yes</form:option>
             <form:option value="No">No</form:option>
             </form:select>
 Shipment Grade: 
 			<form:radiobutton path="shipGrade" value="A"/> A
 			<form:radiobutton path="shipGrade" value="B"/> B
 			<form:radiobutton path="shipGrade" value="C"/> C
 Description:
 			<form:textarea path="shipDesc"/>
 			<input type="submit" value="CREATE SHIPMENT"/> 				           
</pre>
</form:form>
${message}
</body>
</html>