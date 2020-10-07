<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
		<script src="connect.js" type="text/javascript"></script>	
</head>
<body>
<h1>Hello Welcome to my page</h1>
<form name="userInput" id="myForm">
		<table>
			<tr>
			<td style="width: 179px; ">Please enter your birthday:</td>
				<td style="width: 200px; ">Day:<input type="text" name="day"></td>
				
				<td style="width: 250px; ">Month:<input type="text" name="month"></td>
				
				<td style="width: 200px; ">Year:<input type="text" name="year"></td>
				<td></td>
				
			</tr>
			<tr>
					<td>Please enter current date:</td>
				
				
					<td>Day:<input type="text" name="current_day"></td>
					
					<td>Month:<input type="text" name="current_month"></td>
					
					<td>Year:<input type="text" name="current_year"></td>
					<td>  </td>
				
				<tr>
				
				<td> <input id = "s_button" type = "submit" value ="Submit"/> </td>
					
				</tr>
			<tr>
				<td>Day of the week is </td><td><div id ="response">  </div> </td>
			</tr>
			<tr>
				<td style="width: 250px; ">Number of days since your birthday </td><td><div id ="response2">  </div> </td>
			</tr>
		</table>
	</form>
</body>
</html>