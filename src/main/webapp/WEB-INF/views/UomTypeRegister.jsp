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
<h3>WELCOME TO UOM TYPE REGISTER PAGE</h3>
<pre>
Uom Type:
             <select name="uomType">
             <option>--select--</option>
             <option>PACKING</option>
             <option>NOPACKING</option>
             <option>-NA-</option>
             </select>
Uom Model:
			<input type="text" name="uomModel"/>
Uom Description:
 			<textarea name="uomDesc"></textarea>
 			<input type="submit" value="CREATE UOM"/> 				           
</pre>
</form>
${message}
</body>
</html>