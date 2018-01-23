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
	<div class="formulaire">
		<fieldset>
			<legend>Information Articles</legend>
			<s:form action="AffichageArticle" method="post">
				<div class="ligne">
					<s:textfield label="NomArticle" required="true" name="nomArticle"></s:textfield>
					<s:textfield label="Quantit�" required="true" name="quantite"></s:textfield>
					<s:textfield label="PrixUnitaire" required="true" name="prixUnitaire"></s:textfield>
				</div>
				<div class="ligne">
					<s:textfield label="Cat�gorie" required="true" name="categorie"></s:textfield>
				</div>
			</s:form>
		</fieldset>
	</div><body>


	<div class="affichageArticle">
		<s:if test="getArticle()!=null">
			<table>
				<tr class="entete">
					<td>idArticle</td>
					<td>nomArticle</td>
					<td>Quantit�</td>
					<td>PrixUnitaire</td>
					<td>Cat�gorie</td>
					<td>CodeArt</td>
				</tr>
				
				<s:iterator value="getArticle()" status="modelsStatus">
					<tr
						class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td><s:property value="idArticle" /></td>
						<td><s:property value="nomArticle" /></td>
						<td><s:property value="stock" /></td>
						<td><s:property value="prixUnitaire" /></td>
						<td><s:property value="categorie" /></td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
	</div>
</body>
</html>