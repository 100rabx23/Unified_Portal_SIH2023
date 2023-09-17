<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register As</title>
<style>
	h2{
		justify-content: center;
		display:flex;
	}
	section{
		margin-top: 70px;
		justify-content: center;
		display: flex;
		align-items: center;
	}
	h1{
		font-size: 50px;
		margin: -7px; 
	}
	p{
		font-size: 30px;
		margin: -7px; 
	}
	input,select{
		margin: 5px;
	}
	
	aside{
		margin: 20px;
		margin-left: 70px;
	}
	
	form{
		font-family: cursive;
		background-color: white;
		/* border: 2px solid blue;
 */		box-shadow: 3px 2px 10px;
		border-radius: 10px;
		padding: 20px;
	}
	input[type="submit"]{
		box-shadow: 1px 1px 1px;
		border-radius: 5px;
		background-color: black;
		color: white;
		padding:5px 10px;
	}
</style>
</head>
<body>
	<form action="servlet" method="post">
		<label>Name: </label>
		<input type="text" name="Fname" placeholder="First Name" onmouseover="hover">
		<input type="text" name="Lname" placeholder="Last Name">
		<br/>
		
		<label>Institute Mail-ID: </label>
		<input type="email" name="email" placeholder="E-mail address">
		<br/>
		<label>Contact: </label>
		<input type="text" name="mobile" placeholder="Contact no.">
		<br/>
		<label>Gender: </label>
		<input type="radio" name="gender" value="Male" >Male 
		<input type="radio" name="gender" value="Female">Female
		<br/>
		<label>Register As :</label>
		<select name="degree">
			<option>--</option>
			<option>Educator</option>
			<option>Curriculum Designer</option>
			<option>Administrator</option>

		</select>
		<br/>
		<center><input type="submit"></center>
	</form>
</body>
</html>