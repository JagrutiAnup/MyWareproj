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
		<input type="radio" name="userType" value="Vender">Vender
		<input type="radio" name="userType" value="Customer">Customer
User Code:
		<input type="text" name="wuserCode"/> 
User for:	
		<input type="text" name="whuser" value="Purchase/Sale"/>
User Email:
		<input type="text" name="email"/>
User Contact:
		<input type="text" name="contact"/>
User Id Type:
		<select name="whuseridtype">
		<option>--select</option>
		<option>PAN CARD</option>
		<option>AADHAR</option>
		<option>VOTERID</option>
		<option>OTHER</option>
		</select>
*If Other:
		<input type="text" name="other"/>
Id Number:
		<input type="text" name="whidnumber"/>
		
		<input type="submit" value="Create WhUserType">
		
</pre>
</form>
${message}
</body>
</html>