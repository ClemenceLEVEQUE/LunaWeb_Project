<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier un article</title>
</head>
<body>
	<h2>Fiche article : <s:property value="article.codeArt"/></h2>
	<s:form action="updateArt">
		<s:textfield type="text" placeholder="Designation"
			name="article.nomArticle" label="Designation" />
		<s:textfield type="text" placeholder="Categorie"
			name="article.categorie" label="Categorie" />
		<s:textfield type="number" placeholder="Prix unit."
			name="article.prixUnitaire" label="Prix unit." />
		<s:textfield type="number" placeholder="Stock"
			name="article.stock" label="Stock" />
		<s:textfield style="display: none;" name="article.idArticle" />
		<s:textfield style="display: none;" name="article.codeArt" />
		<s:submit value="Enregistrer les modifications" />
	</s:form>
</body>
</html>