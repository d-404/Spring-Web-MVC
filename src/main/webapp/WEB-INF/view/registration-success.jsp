<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success</title>
</head>
<body>
	<div align="center">
		<h1>User Registration Successful</h1>
		<hr>
		<h2>Your Details are :</h2>
		User : ${userRegistrationDTO.name } <br /> User Name :
		${userRegistrationDTO.userName } <br /> Gender :
		${userRegistrationDTO.gender } <br /> Password :
		${userRegistrationDTO.password } <br /> Country :
		${userRegistrationDTO.country } <br /> Hobbies :
		<c:forEach var="temp" items="${userRegistrationDTO.hobby }">
		${temp }
		</c:forEach>
		<br />
		Email : ${userRegistrationDTO.communicationDTO.email }
		<br />
		Phone : ${userRegistrationDTO.communicationDTO.phone }
	</div>
</body>
</html>