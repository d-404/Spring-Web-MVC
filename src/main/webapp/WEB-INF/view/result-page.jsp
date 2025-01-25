<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h2 align="center">Love Calculator Prediction:</h2>
	<hr>
	<p>User Name is : ${userInfoDTO.userName}
	<p>
		Crush Name is : ${userInfoDTO.crushName} <br /> are FRIENDs<br /> <a
			href="/LoveCalculator/sendEmail/"> Send result to email</a>
</body>
</html>