<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head>
<div id="Header">
	<div id="header">
		<img src="${pageContext.request.contextPath}/images/actif.png"
			width="160px" height="160px" />
	</div>
</div>
<body bgcolor="#4F5454">
	<h1>Bienvenue sur Luna</h1>
	<table>
		<tr height="33%">
			<td width="33%"></td>
			<td width="34%"><a href="AffichageArticle"
				title="Liste des produits"> <img class="button"
					src="${pageContext.request.contextPath}/images/produit.png" />
			</a></td>
			<td width="33%"></td>
		</tr>

		<tr width="34%">
			<td width="33%"><a href="AffichageClient"
				title="Liste des clients"> <img class="button"
					src="${pageContext.request.contextPath}/images/client.png" />
			</a></td>
			<td width="34%"></td>
			<td width="33%"><a href="AffichageCommande"
				title="Liste des commandes"> <img class="button"
					src="${pageContext.request.contextPath}/images/commande.png" /></a></td>
		</tr>

		<tr width="33%">
			<td width="33%"></td>
			<td width="34%"><a href="deconnexion" title="D&eacute;connexion">
					<img class="button"
					src="${pageContext.request.contextPath}/images/logout.png" />
			</a></td>
			<td width="33%"></td>
		</tr>
	</table>
	<%@include file="template/footer.jsp"%>
</body>
</html>