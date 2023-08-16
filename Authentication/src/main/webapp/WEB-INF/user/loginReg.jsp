<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Login n Reg</title>
</head>
<body class="bg-success p-2 text-dark bg-opacity-10">
	<div class="container">
		<div class="row">
			<div class="col">
				<h1 class="text-success">Register</h1>
				<form:form action="/users/register" method="post"
					modelAttribute="newUser">
					<div class="form-group">
						<label >User Name</label>
						<form:input path="userName" class="form-control" />
						<form:errors path="userName" class="text-danger" />
					</div>
					<div class="form-group">
						
						<label>Email</label>
						<form:input path="email" class="form-control" />
						<form:errors path="email" class="text-danger" />
					</div>
					<div class="form-group">
						<label>Password</label>
						<form:input path="password" class="form-control" />
						<form:errors path="password" class="text-danger" />
					</div>
					<div class="form-group">
						<label>Confirm Password</label>
						<form:input path="confirm" class="form-control" />
						<form:errors path="confirm" class="text-danger" />
					</div>
					<input type="submit" value="Register User"
						class=" my-2 btn btn-success" />
				</form:form>
			</div>
			<div class="col">
				<h1 class="text-primary">Login</h1>
				<form:form action="/users/login" method="post"
					modelAttribute="loginUser">
					<div class="form-group">
						<label>Email</label>
						<form:input path="email" class="form-control" />
						<form:errors path="email" class="text-danger" />
					</div>
					<div class="form-group">
						<label>Password</label>
						<form:input path="password" class="form-control" />
						<form:errors path="password" class="text-danger" />
					</div>
					<input type="submit" value="Login" class=" my-2 btn btn-primary" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>