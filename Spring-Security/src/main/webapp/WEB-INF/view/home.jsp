<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<h1>
			Welcome to Spring MVC Using Java Annotation Configurations
		</h1>
	</head>
	
	
	<body>
		<hr>
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			<input type="submit" value="Logout"/>
		</form:form>
	</body>
</html>