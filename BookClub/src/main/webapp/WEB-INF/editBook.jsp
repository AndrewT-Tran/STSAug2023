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
<title>Edit Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<nav class="my-3">
			<a class="btn btn-primary" href="/dashboard">Dashboard</a> | <a
				class="btn btn-success" href="/add/book">Add Book</a> | <a
				class="btn btn-danger" href="/logout">Logout</a>
		</nav>
		<h1 class="my-2">Edit Book</h1>
		<h4 class="text-secondary">Its fine, we all make mistakes...</h4>
		<div class="button-wrp">
			<a class="btn btn-success my-1" href="/add/book" class="button">Add
				Book</a>
		</div>
		<form:form method="post" action="/api/edit/book" modelAttribute="book">
			<div class="my-2">
				<span> <form:label path="title">Title</form:label> <form:errors
						path="title" />
				</span>
				<form:input path="title" type="text" value="${thisBook.title }" />
			</div>

			<div class="my-2">
				<span> <form:label path="author">Author</form:label> <form:errors
						path="author" />
				</span>
				<form:input path="author" type="text" value="${thisBook.author }" />
			</div>

			<div class="my-2">
				<span> <form:label path="thoughts">Description</form:label> <form:errors
						path="thoughts" />
				</span>
				<form:input path="thoughts" type="text"
					value="${thisBook.thoughts }" />
			</div>

			<input type="hidden" value="${thisBook.id }" name="book" />
			<input type="submit" value="Make Edit" class="my-2 btn btn-warning" />
		</form:form>
	</div>
</body>
</html>