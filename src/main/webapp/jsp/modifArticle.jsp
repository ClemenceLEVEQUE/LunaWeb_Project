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
	<h2>
		Fiche article :
		<s:property value="article.codeArt" />
	</h2>
	<s:form action="updateArt" theme="simple">
		<table>
			<tr>
				<td><s:label>D&eacute;signation</s:label></td>
				<td><s:textfield type="text" placeholder="Designation"
						name="article.nomArticle" /></td>
				<td></td>
				<td></td>
			</tr>

			<tr>
				<td><s:label>Cat&eacute;gorie</s:label></td>
				<td><s:textfield type="text" placeholder="Categorie"
						name="article.categorie" /></td>
			</tr>

			<tr>
				<td><s:label>Prix unit.</s:label></td>
				<td><s:textfield type="number" placeholder="Prix unit."
						name="article.prixUnitaire" /></td>
				<td><s:label>Stock</s:label></td>
				<td><s:textfield type="number" placeholder="Stock"
						name="article.stock" /></td>
			</tr>
		</table>
		<s:textfield style="display: none;" name="article.idArticle" />
		<s:textfield style="display: none;" name="article.codeArt" />
		<s:submit value="Enregistrer les modifications" />
	</s:form>
</body>
</html>