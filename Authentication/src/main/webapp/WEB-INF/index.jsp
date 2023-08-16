<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
</head>
<body>
  <div class="container">
    <h1>Login</h1>
    <form:form method="post" modelAttribute="newLogin">
      <div class="mb-3">
        <label for="username" class="form-label">Username</label>
        <form:input type="text" class="form-control" id="username" path="userName" />
        <form:errors path="userName" cssClass="text-danger" />
      </div>
      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <form:password class="form-control" id="password" path="password" />
        <form:errors path="password" cssClass="text-danger" />
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
  </div>
</body>
</html>