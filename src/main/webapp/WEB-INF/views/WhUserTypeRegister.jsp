<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="save"method="POST">
<h3>WELCOME TO WHUSERTYPE REGISTER PAGE</h3>
<pre>
User Type:
		<input type="radio" name="WhUserType" value="Vender">Vender
		<input type="radio" name="WhUserType" value="Customer">Customer
User Code:
		<input type="text" name="WhUserCode"/> 
User for:	
		<input type="text" name="WhUser" value="Purchase/Sale"/>
User Email:
		<input type="text" name="Email"/>
User Contact:
		<input type="text" name="Contact"/>
User Id Type:
		<select name="WhUserIdType">
		<option>--select</option>
		<option>PAN CARD</option>
		<option>AADHAR</option>
		<option>VOTERID</option>
		<option>OTHER</option>
		</select>
*If Other:
		<input type="text" name="Other"/>
Id Number:
		<input type="text" name="WhIdNumber"/>
		
		<input type="submit" value="Create WhUserType">
		
</pre>
</form>
${message}
</body>
</html>