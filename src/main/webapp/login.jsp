<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Results</title>
</head>
<body style="background-color:lightblue">
<center>
<div style="background-color:yellow">
<h1><b>Exam Results</b></h1>
</div>
<marquee behaviour="scroll"><span style="color:red"><h3>*Exam Results are out*</h3></span></marquee>
<div style="background-color:red">
<form action="login.do" method="post">
	<table>
		<th><h3>Login Here</h3></th>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email" placeholder="Enter your email" /></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password" minlength=8 placeholder="Enter your Password" /></td>
		</tr>
		<tr >
			<td colspan=2 style="text-align:center"><button type="submit">Log in</button></td>
		</tr>
		<tr>
		<td  style="color:black"><a href=""><h5>NEW USER</h5></td>&nbsp&nbsp
		<td style="color:black"><a href=""><h5>Forget Password</h5></td>
		</tr>
	</table>
</form>
</div>
</center>
</body>
</html>
