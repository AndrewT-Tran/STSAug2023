<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
				<td <c:if test="${fn:startsWith(fruit.name, 'G')}">style="color:orange"</c:if>>${fruit.name}</td>
				<td>${fruit.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>s
</html>