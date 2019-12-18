<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Temperature Conversion</title>

</head>

<body style="background-color:powderblue;">


<form action="call" method="post" name="myform">
		<table>
		    <tbody>
		    <h1 >Temperature Conversion  Using JSP and Servlet</h1>
		    <tr><td></td></tr><tr><td></td></tr>
		    <tr><td></td></tr><tr><td></td></tr>
		    <tr><td></td></tr><tr><td></td></tr>
		    <tr>
				<td>Input Numerical Value</td>
				<td><input type="text"  id="ip" name="ip" required="" autofocus="" value="${param.ip}"></td>
				
			</tr>
			<tr>
				<td>Input Unit of Measure</td>
				<td> <select name="InputUM">
    				<option value="Fahrenheit">Fahrenheit</option>
    				<option value="Celsius">Celsius</option>    		
    				<option value="Kelvin">Kelvin</option>
    						<!--<option value="Rankine">Rankine</option>-->
  					</select>
  				</td>
			</tr>
			<tr>
				<td>Target Unit of Measure</td>
				<td><select name="TargetUM">
    				<option value="Fahrenheit" >Fahrenheit</option>
    				<option value="Celsius">Celsius</option>
    				<option value="Kelvin">Kelvin</option>
    						<!--<option value="Rankine">Rankine</option>-->
  					</select></td>
			</tr>
			<tr>
				<td>Student Response</td>
				<td><input type="text" name="sres" required="" value="${param.sres}"></td>
				
				<td><div id="myDIV">${message}</div></td>

			</tr>
			<tr>
				<td></td>
				
				<td><input type="submit" value="Validate" ></td>
			</tr>
			</tbody>
		</table>
		
	</form>
	<p id="demo"></p>
</body>
</html>




