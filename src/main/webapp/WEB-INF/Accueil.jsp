<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<button type="submit" >
			Deconnecter
		</button>
	</form>
	<h3>
		Bienvenu 
	</h3>
	<ul>
		<c:forEach var="utilisateur" items="${ utilisateurs }">
			<li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" />
			
			</li>
		</c:forEach>
	</ul>
</body>
</html>