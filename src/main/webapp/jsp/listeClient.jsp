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
<div id="header">
			<%@include file="template/header.jsp"%>
		</div>
		
	<div class="listeClient">
		<s:if test="getModels()!=null">
			<table>
				<tr class="entete">
					<td>IdClient</td>
					<td>Nom</td>
					<td>Prénom</td>
					<td>Ville</td>
					<td>Rue</td>
					<td>CodePostal</td>
					<td>Tel</td>
					<td>Mail</td>
					<td>Date de création</td>
					<td>Code client</td>
					<td>Remarques</td>
				</tr>

				<s:iterator value="getModels()" status="modelsStatus">
					<tr
						class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td width="10%"><s:property value="idClient" /></td>
						<td width="20%"><s:property value="nom" /></td>
						<td width="20%"><s:property value="prenom" /></td>
						<td width="20%"><s:property value="ville" /></td>
						<td width="20%"><s:property value="rue" /></td>
						<td width="20%"><s:property value="codePostal" /></td>
						<td width="10%"><s:property value="tel" /></td>
						<td width="20%"><s:property value="mail" /></td>
						<td width="20%"><s:property value="date_creation" /></td>
						<td width="20%"><s:property value="codeClient" /></td>
						<td width="20%"><s:property value="remarques" /></td>
						<td><a href='deleteClient?id=<s:property value="idClient"/>'>Supprimer</a></td>
						<td><a href='updateThisClient?id=<s:property value="idClient"/>'>Modifier</a></td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
	</div>
		   <%@include file="template/footer.jsp" %>
</body>
</html>