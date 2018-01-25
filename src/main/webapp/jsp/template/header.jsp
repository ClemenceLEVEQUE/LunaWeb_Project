<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="display: block; valign: middle; height: 180px;">
		<a href="accueil" title="Accueil">
			<img src="${pageContext.request.contextPath}/images/actif.png"
				width="160px" height="160px" />
		</a>
		<a href="AffichageArticle" title="Liste des produits">
			<img class="button" src="${pageContext.request.contextPath}/images/produit.png"
				width="80px" height="80px" />
		</a>
		<a href="AffichageClient" title="Liste des clients">
			<img class="button" src="${pageContext.request.contextPath}/images/client.png"
				width="80px" height="80px" />
		</a>
		<a href="AffichageCommande" title="Liste des commandes">
			<img class="button" src="${pageContext.request.contextPath}/images/commande.png"
				width="80px" height="80px" />
		</a>
		<a href="deconnexion" title="D&eacute;connexion">
			<img class="button" src="${pageContext.request.contextPath}/images/logout.png"
				width="80px" height="80px" />
		</a>
	</div>
</body>
</html>