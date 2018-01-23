<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire Article</title>
</head>
<body>


	<div class="affichageArticle">
		<s:if test="getArticle()!=null">
			<table>
				<tr class="entete">
					<td>idArticle</td>
					<td>nomArticle</td>
					<td>Quantité</td>
					<td>PrixUnitaire</td>
					<td>Catégorie</td>
					<td>CodeArt</td>
				</tr>
				
				<s:iterator value="getArticle()" status="modelsStatus">
					<tr
						class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td><s:property value="idArticle" /></td>
						<td><s:property value="nomArticle" /></td>
						<td><s:property value="Stock" /></td>
						<td><s:property value="prix" /></td>
						<td><s:property value="categorie.nom" /></td>
					</tr>
				</s:iterator>
				
			</table>
		</s:if>
	</div>
</body>
</html>