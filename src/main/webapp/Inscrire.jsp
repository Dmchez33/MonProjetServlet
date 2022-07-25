<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscrire</title>
<link rel="stylesheet" href="/MonServletJsp/index.css">
</head>
<body>
	<h2>Bienvenu sur la page d'inscription</h2>
	
	<form action="Accueil" method="post">
	
		  <p>
		    <label for="nom">Nom</label>
		    <input type="text" name="nom" id="nom">
		  </p>
		
		  <p>
		    <label for="prenom">Prenom</label>
		    <input type="text" name="prenom" id="prenom">
		  </p>
		  <p>
		    <label for="email">Email</label>
		    <input type="email" name="email" id="email">
		  </p>
		  <p>
		    <label for="passe">Mot de passe</label>
		    <input type="password" name="passe" id="passe">
		  </p>
		  <p>
		    <label for="repeat-pass">Repeter le mot de passe</label>
		    <input type="password" name="repeat-pass" id="repeat-pass">
		  </p>
		  
		  <input type="submit" value="Envoyer" />
	</form>
	
	<!--  <ul>
		<c:forEach var="utilisateur" items="${ utilisateurs }">
			<li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" />
			
			</li>
		</c:forEach>
	</ul>-->
	
</body>
</html>