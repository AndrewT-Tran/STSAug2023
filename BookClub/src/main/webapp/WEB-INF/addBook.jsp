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
<title>Add a Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>

<body class="bg-dark p-3 bg-opacity-10">
	<div class="container">
		<nav class="my-3">
			<a class="btn btn-primary" href="/dashboard">Dashboard</a> | <a
				class="btn btn-success" href="/add/book">Add Book</a> | <a
				class="btn btn-danger" href="/logout">Logout</a>
		</nav>
		<h1 class="text-secondary">Add Book</h1>

		<a class="btn btn-primary" href="/dashboard" class="button">View
			All Books</a>


		<form:form method="post" action="/api/add/book" modelAttribute="book">
			<div>
				<span> <form:label path="title">Title</form:label> <form:errors
						path="title" />
				</span>
				<form:input path="title" type="text" />
			</div>

			<div>
				<span> <form:label path="author">Author</form:label> <form:errors
						path="author" />
				</span>
				<form:input path="author" type="text" />
			</div>

			<div>
				<span> <form:label path="thoughts">Description</form:label> <form:errors
						path="thoughts" />
				</span>
				<form:input path="thoughts" type="text" />
			</div>

			<input type="hidden" value="${logged}" name="user" />
			<input type="submit" value="Add Book" class="my-2 btn btn-success" />
		</form:form>

	</div>
</body>

</html>