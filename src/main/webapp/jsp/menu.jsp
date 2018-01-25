<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- <!-- <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Luna Project</title>
</head>
<body>
	<a href="AffichageArticle">Articles</a>
	<a href="AffichageClient">Clients</a>
	<a href="AffichageCommande">Commandes</a>
</body>
</html>
<html> -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head>
   <%@include file="/jsp/header.jsp" %>
<body>
	<h1>Bienvenue sur Luna Discount</h1>
	<div class="container">
		<div class="BoutonAccueil">
			<s:form method="post" action="accueil">
				<s:submit name="Valider" value="Accueil"></s:submit>
			</s:form>
		</div>
		<div class="BoutonClients">
			<s:form method="post" action="AffichageClient">
				<s:submit name="Valider" value="Client"></s:submit>
			</s:form>
		</div>
		<div class="BoutonCommandes">
			<s:form method="post" action="AffichageCommande">
				<s:submit name="Valider" value="Commande"></s:submit>
			</s:form>
		</div>
		<div class="BoutonArticles">
			<s:form method="post" action="AffichageArticle">
				<s:submit name="Valider" value="Article"></s:submit>
			</s:form>
		</div>
		<div class="BoutonDeconnexion">
			<s:form method="post" action="deconnexion">
				<s:submit name="Valider" value="Déconnexion"></s:submit>
			</s:form>
		</div>
	</div>
	   <%@include file="/jsp/footer.jsp" %>
</body>
</html>