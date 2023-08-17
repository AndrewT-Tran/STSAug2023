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
<title>Product / Category</title>
<!-- for Bootstrap CSS -->
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
		<h1 class="pb-2">${book.title }</h1>


		<a class="btn btn-success my-2" href="/add/book">Add Book</a>


		<c:choose>
			<c:when test="${logged  == book.user.id}">
				<h4>
					You've read <span class="text-primary h5"> ${book.title }</span> by
					<span class="h5 text-warning">${book.author }</span>
				</h4>
				<p class="thoughts">Here are your Thoughts:</p>
			</c:when>

			<c:otherwise>
				<h4>${book.user.firstName  }read${book.title } by ${book.author }</h4>
				<p class="thoughts">
					Here are <span> ${book.user.firstName  }
						${book.user.lastName  }</span> Thoughts:
				</p>
			</c:otherwise>
		</c:choose>

		<p class="description">${book.thoughts }</p>
		<c:choose>
			<c:when test="${logged  == book.user.id}">
				<a class="btn btn-warning" href="/edit/book/${ book.id}"
					class="button">Edit book</a>
			</c:when>
		</c:choose>
	</div>
</body>
</html>