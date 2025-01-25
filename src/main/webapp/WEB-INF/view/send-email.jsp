<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send Email</title>
</head>
<body>
	<h2>Hi,</h2>
	<h3>Send result to your email!</h3>
	<form:form action="/LoveCalculator/process-email" method="GET"
		modelAttribute="emailDTO">
		<label>Enter you email: </label>
		<form:input path="userEmail" />
		<input type="submit" value="send">
	</form:form>
</body>
</html>