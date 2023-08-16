<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
				<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
					<title>New Ninja</title>
	</head>

	<body class="bg-secondary p-2" style="--bs-bg-opacity: .25;">

		<div class="d-flex justify-content-center">
		<div class="container-fluid mx-50 my-50 text-center">
			<h1 class="text-primary my-2">
				New Ninja</h1>
			<form:form action="/ninjas" method="post" modelAttribute="ninja">
				<div class="form-group text-primary">
					<form:label path="dojo">Dojo</form:label>
					<select name="dojo_id" class="form-control">
						<c:forEach items="${dojos}" var="dojo">
							<option value="${dojo.id}">${dojo.name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group text-primary">
					<form:label path="firstName">First Name</form:label>
					<form:input path="firstName" class="form-control" />
					<form:errors path="firstName" style="color: red;" />
				</div>
				<div class="form-group text-primary">
					<form:label path="lastName">Last Name</form:label>
					<form:input path="lastName" class="form-control" />
					<form:errors path="lastName" style="color: red;" />
				</div>
				<div class="form-group text-primary">
					<form:label path="age">Age</form:label>
					<form:input path="age" class="form-control" />
					<form:errors path="age" style="color: red;" />
				</div>
				<button type="submit" class="btn btn-primary">Create</button>
			</form:form>
			</div>
		</div>
	</body>

	</html>