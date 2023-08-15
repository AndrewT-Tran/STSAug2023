<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <!-- Formatting (like dates) -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Single Expense</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class="container">
		<a href="/expenses">Home</a>
<table>
  <tr>
    <th>Title</th>
    <td>${expense.title}</td>
  </tr>
  <tr>
    <th>Vendor</th>
    <td>${expense.vendor}</td>
  </tr>
  <tr>
    <th>Description</th>
    <td>${expense.description}</td>
  </tr>
  <tr>
    <th>Amount</th>
    <td>$${expense.amount}</td>
  </tr>
</table>
	</div>
</body>
</html>