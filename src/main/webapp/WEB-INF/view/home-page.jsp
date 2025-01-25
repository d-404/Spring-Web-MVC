<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Love Calculator App</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	test-align: left;
	margin-left: 30px;
}
</style>
<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 3) {
			alert('Your name should have at least 3 character');
			return false;
		} else
			return true;
	}
</script>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfoDTO" onsubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for="yn">Your Name :</label>
				<form:input id="yn" path="userName" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name :</label>
				<form:input id="cn" path="crushName" />
			</p>
			<p>
				<form:checkbox path="checkBox" id="check" />
				<label>I am agreeing that this is only for fun.</label>
				<form:errors path="checkBox" cssClass="error" />
			</p>
			<input type="submit" value="Calculate">
		</div>
	</form:form>
</body>
</html>