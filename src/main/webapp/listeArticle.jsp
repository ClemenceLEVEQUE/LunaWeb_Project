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
	<div class="listeArticle">
		<s:if test="getModels()!=null">
			<table>
				<tr class="entete">
					<td>idArticle</td>
					<td>nomArticle</td>
					<td>Quantit�</td>
					<td>PrixUnitaire</td>
					<td>Cat�gorie</td>
					<td>CodeArt</td>
				</tr>

				<s:iterator value="getModels()" status="modelsStatus">
					<tr
						class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td width="10%"><s:property value="article.idArticle" /></td>
						<td width="20%"><s:property value="article.nomArticle" /></td>
						<td width="20%"><s:property value="article.stock" /></td>
						<td width="20%"><s:property value="article.prixUnitaire" /></td>
						<td width="20%"><s:property value="article.categorie" /></td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
	</div>
</body>
</html>