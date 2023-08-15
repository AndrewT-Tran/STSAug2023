<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Formatting (like dates) -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<c:if test="${empty expenses}">
		<h2 class="empty text-center my-3 text-danger">List is currently empty</h2>
	</c:if>

	<div class="table table-responsive text-center my-3">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Title</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="expense" items="${ expenses }">
					<tr>
						<td><a href='expense/<c:out value="${expense.id}"/>'><c:out
									value="${expense.title }" /></a></td>
						<td><c:out value="${expense.vendor }" /></td>
						<td>$<c:out value="${expense.amount }" /></td>
						<td><a href='/expense/<c:out value="${expense.id}"/>/edit' class="btn btn-primary"
							class="btn btn-primary">Edit</a></td>
						<td>

							<form action='/expense/delete/<c:out value="${expense.id}"/>'
								method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete" class="btn btn-danger">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


	<h2 class=" text-center text-success">Add an Expense</h2>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form:form action="/api/create" method="post"
					modelAttribute="expense">
					<div class="form-group">
						<form:label path="title">Title</form:label>
						<form:input type="text" path="title" class="form-control" />
						<form:errors path="title" class="text-danger" />
					</div>

					<div class="form-group">
						<form:label path="description">Description</form:label>
						<form:input type="text" path="description" class="form-control" />
						<form:errors path="description" class="text-danger" />
					</div>

					<div class="form-group">
						<form:label path="vendor">Vendor</form:label>
						<form:input type="text" path="vendor" class="form-control" />
						<form:errors path="vendor" class="text-danger" />
					</div>

					<div class="form-group">
						<form:label path="amount">Amount</form:label>
						<form:input type="number" path="amount" class="form-control" />
						<form:errors path="amount" class="text-danger" />
					</div>

					<button type="submit" class="btn btn-success my-2">Submit</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>