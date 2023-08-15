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
<title>Edit</title>
</head>
<body>

<body>
	<div class="container">
		<a href="/expense">Back to Home</a>
		<h1 class="text-success mb-2">Edit Expense:</h1>
		<form:form action="/expense/${expense.id}" method="PUT"
			modelAttribute="expense">
			<div>
				<span> <form:label path="title">Title</form:label> <form:errors
						path="title" class="error" />
				</span>
				<form:input type="text" path="title" />
			</div>

			<div>
				<span> <form:label path="description">Description</form:label>
					<form:errors path="description" class="error" />
				</span>
				<form:input type="text" path="description" />
			</div>

			<div>
				<span> <form:label path="vendor">Vendor</form:label> <form:errors
						path="vendor" class="error" />
				</span>
				<form:input type="text" path="vendor" />
			</div>

			<div>
				<span> <form:label path="amount">Amount</form:label> <form:errors
						path="amount" class="error" />
				</span>
				<form:input type="number" path="amount" />
			</div>

			<form:hidden path="id" />

			<input type="submit" class="btn btn-primary my-2" value="Submit" />
		</form:form>
	</div>

	<!-- Add the following script to handle the form submission -->
	<script>
		// Get the form element
		const form = document.querySelector('form');

		// Add an event listener to the form submission
		form.addEventListener('submit', async (event) => {
			// Prevent the default form submission behavior
			event.preventDefault();

			// Get the form data
			const formData = new FormData(form);

			// Send a PUT request to update the expense
			const response = await fetch(form.action, {
				method: 'PUT',
				body: formData
			});

			// Redirect to the home page
			window.location.href = '/expense';
		});
	</script>
</body>

</html>