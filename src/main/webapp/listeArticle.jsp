<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.odd {
	background-color: silver;
}

.even {
	background-color: white;
}
</style>
<head>
<style type="text/css">
.errors {
	background-color: #FFCCCC;
	border: 1px solid #CC0000;
	width: 400px;
	margin-bottom: 8px;
}

.errors li {
	list-style: none;
}
</style>
</head>
<body>
	<div class="listeArticle">
		<s:if test="getModels()!=null">
			<table>
				<tr class="entete">
					<td>idArti cle</td>
					<td>nomArticle</td>
					<td>Quantité</td>
					<td>PrixUnitaire</td>
					<td>Catégorie</td>
					<td>CodeArt</td>
				</tr>

				<s:iterator value="getModels()" status="modelsStatus">
					<tr
						class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td width="10%"><s:property value="idArticle" /></td>
						<td width="20%"><s:property value="nomArticle" /></td>
						<td width="20%"><s:property value="stock" /></td>
						<td width="20%"><s:property value="prixUnitaire" /></td>
						<td width="20%"><s:property value="categorie" /></td>
						<td width="20%"><s:property value="codeArt" /></td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
	</div>
</body>
</html>