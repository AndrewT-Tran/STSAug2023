<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body class="bg-dark p-2 text-dark bg-opacity-25">
<div class="container text-center my-5">
	<h1 class="text-dark">Welcome to <span class="text-success"> your </span> dashboard, <span class="text-primary">
	<c:out value="${loginUser.userName}"/>
	</span> !
	</h1>
</div>
</body>
</html>