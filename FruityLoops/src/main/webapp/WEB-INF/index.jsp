<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/static/css/style.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<!DOCTYPE html>

<html>

	<head>
		<title>Fruity Loops</title>
	</head>

	<body>
		<h1>Fruits List</h1>
		<table>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="fruit" items="${fruits}">
				<tr>
					<td>${fruit.name}</td>
					<td>${fruit.price}</td>
				</tr>
			</c:forEach>
		</table>
	</body>

</html>