<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- c:out ; c:forEach ; c:if -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (like dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookClub</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="bg-dark p-3 bg-opacity-25">

	<header class="text-center text-secondary h1 my-2">
		Welcome to <span class="text-danger">Book</span><span
			class="text-dark">Club</span>
	</header>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1 class="text-success">Register</h1>
				<form:form method="post" action="/api/register"
					modelAttribute="newUser">
					<div class="form-group">

						<label>First Name</label>
						<form:input path="firstName" class="form-control" />
						<form:errors path="firstName" class="text-danger" />
					</div>

					<div class="form-group">

						<label>Last Name</label>
						<form:input path="lastName" class="form-control" />
						<form:errors path="lastName" class="text-danger" />
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
				<form:form method="post" action="/api/login"
					modelAttribute="newLogin">
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