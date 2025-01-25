<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	test-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
	<h1 align="center">Please Register Here!</h1>
	<hr>
	<div align="center">
		<form:form modelAttribute="userRegistrationDTO"
			action="registration-success" method="GET">
			<label>Name : </label>
			<form:input path="name" cssClass="error" />
			<br />

			<label>User Name : </label>
			<form:input path="userName" />
			<br />

			<label>Password : </label>
			<form:password path="password" />
			<br />

			<label>Country : </label>
			<form:select path="country">
				<form:option value="IN" label="India"></form:option>
				<form:option value="US" label="United States"></form:option>
				<form:option value="PAK" label="Pakistan"></form:option>
				<form:option value="RUS" label="Russia"></form:option>
			</form:select>
			<br />

			<label>Hobbies : </label>
			Cricket : <form:checkbox path="hobby" value="Cricket" />
			Badminton : <form:checkbox path="hobby" value="Badminton" />
			Travel : <form:checkbox path="hobby" value="Travel" />
			Reading : <form:checkbox path="hobby" value="Reading " />
			<br />

			<label>Gender : </label>
			Male : <form:radiobutton path="gender" />
			Female : <form:radiobutton path="gender" />
			<br />

			<label>Age: </label>
			<form:input path="age" />
			<form:errors path="age" cssClass="error" />
			<br />

			<h3>Communication</h3>
			<label>Email : </label>
			<form:input path="communicationDTO.email" />
			<form:errors path="communicationDTO.email" cssClass="error" />
			<br />
			<label>Phone : </label>
			<form:input path="communicationDTO.phone" />

			<input type="submit" value="Register">
		</form:form>
	</div>
</body>
</html>