<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fiche commande</title>
</head>
<body>
	<h2>
		Fiche commande :
		<s:property value="commande.numCom" />
	</h2>
	<p>
		Date de la commande :
		<s:property value="commande.dateCom" />
	</p>
	<p>
		Date de livraison :
		<s:property value="commande.dateLivr" />
	</p>
	<p>
		Client :
		<s:property value="commande.client.getCodeClient()" />
	</p>
	<s:if test="getLignes()!=null">
		<table>
			<tr class="entete">
				<td>Article</td>
				<td>Prix unit.</td>
				<td>Qt&eacute;</td>
				<td></td>
				<td></td>
			</tr>

			<s:iterator value="getLignes()" status="modelsStatus">
				<tr
					class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td width="30%"><s:property value="article.codeArt" /></td>
					<td width="30%"><s:property value="article.prixUnitaire" /></td>
					<td width="30%"><s:property value="quantite" /></td>
					<td width="5%"><a
						href='deleteLig?id=<s:property value="idLigne"/>'
						title="suppression de la ligne"> <img
							src="${pageContext.request.contextPath}/images/suppr.jpg" />
					</a></td>
					<td width="5%"><a
						href='updateThisLigne?id=<s:property value="idLigne"/>'
						title="modification du client"> <img
							src="${pageContext.request.contextPath}/images/modif.jpg" />
					</a></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
</body>
</html>