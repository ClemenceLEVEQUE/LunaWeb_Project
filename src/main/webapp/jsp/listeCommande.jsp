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
	<div class="listeCommande">
		<s:if test="getModels()!=null">
			<table>
				<tr class="entete">
					<td>idCommande</td>
					<td>Client</td>
					<td>Date de livraison</td>
					<td>Date de commande</td>
					<td>Etat</td>
					<td>Numero de Commande</td>
					<td>Total</td>
				</tr>

				<s:iterator value="getModels()" status="modelsStatus">
					<tr
						class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td width="10%"><s:property value="idCommande" /></td>
						<td width="20%"><s:property value="client" /></td>
						<td width="20%"><s:property value="dateLivraison" /></td>
						<td width="20%"><s:property value="dateCom" /></td>
						<td width="20%"><s:property value="etat" /></td>
						<td width="20%"><s:property value="numCom" /></td>
						<td width="10%"><s:property value="total" /></td>
						<td><a href='deleteCom?id=<s:property value="idCommande"/>'>Supprimer</a></td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
	</div>
	<%@include file="template/footer.jsp" %>
</body>
</html>