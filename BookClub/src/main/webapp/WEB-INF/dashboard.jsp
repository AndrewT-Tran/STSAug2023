<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<!-- c:out ; c:forEach ; c:if -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (like dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<meta charset="UTF-8">
<title>BookClub</title>
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
		<h1>
			Hello <span class="text-primary">${logged.firstName }</span>, ready
			to explore? !
		</h1>


		<c:choose>
			<c:when test="${allBooks.size() == 0}">
				<h3 class="gold">No books at this time</h3>
			</c:when>

			<c:otherwise>



				<c:forEach var="book" items="${allBooks }">
					<div class="elm ">
						<h4>
							<a href="/book/${book.id}">${book.title }</a> by
						</h4>
						<h5 class="text-secondary">${book.author }</h5>
						<p class="text-danger">Owned by ${book.user.firstName }${book.user.lastName }

						
						<p>
					</div>
				</c:forEach>
			</c:otherwise>
		</c:choose>

		<a class="btn btn-warning" href="/add/book" class="button">Add
			Book</a>

	</div>
</body>
</html>