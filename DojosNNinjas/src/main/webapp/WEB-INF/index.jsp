<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
			<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
				<!DOCTYPE html>
				<html>

				<head>
					<meta charset="UTF-8">
					<title>Welcome to Dojo</title>
					<!-- for Bootstrap CSS -->
					<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
					<!-- YOUR own local CSS -->
					<link rel="stylesheet" href="/css/main.css" />
					<!-- For any Bootstrap that uses JS -->
					<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

				</head>

				<body class="bg-dark p-2" style="--bs-bg-opacity: .25;">
					<div class="text-center">
						<h1>Welcome to Dojo</h1>
						<h4>
							<a class="btn btn-primary" href="/ninjas/new">Add New Ninja</a> | <a class="btn btn-success"
								href="/dojos/new">Add
								New Dojo</a>

						</h4>
					</div>
					<div class="container-fluid text-center">

						<h1 class="text-primary my-2">Information</h1>
					</div>
					<table class="table text-center table-striped table-responsive">
						<thead>
							<tr>
								<th scope="col">Dojo Name</th>
								<th scope="col">Ninja Count</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${dojos}" var="dojo">
								<tr>
									<td><a href="/dojos/${dojo.id}">${dojo.name}</a></td>
									<td>${fn:length(dojo.ninjas)}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</body>

				</html>