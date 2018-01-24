<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter un client</title>

<style type="text/css">
.title {
	text-align: left;
	border: none;
	border-bottom: 2px dotted black;
	width: 100%;
	font-family: Courrier New;
	font-size: 25;
	text-shadow: 1px 1px 1px skyblue;
}
</style>
</head>
<body>
	<s:form action="insertClient" theme="simple">
		<table>
			<tr>
				<td colspan="4">
					<div class="title">Client</div> <br />
				</td>
			</tr>
			<tr>
				<td><s:label>Code client</s:label></td>
				<td colspan="3"><s:textfield size="50%" placeholder="Code"
						name="client.codeClient" /></td>
			</tr>
			<tr>
				<td colspan="4">
					<div class="title">&Eacute;tat civil</div> <br />
				</td>
			</tr>
			<tr>
				<td><s:label>Nom</s:label></td>
				<td><s:textfield size="50%" placeholder="Nom" name="client.nom" /></td>
				<td><s:label>Prénom</s:label></td>
				<td><s:textfield size="50%" placeholder="Prenom"
						name="client.prenom" /></td>
			</tr>
			<tr>
				<td><s:label>Ville</s:label></td>
				<td><s:textfield size="50%" placeholder="Ville"
						name="client.ville" /></td>
				<td><s:label>Code postal</s:label></td>
				<td><s:textfield size="50%" placeholder="Code postal"
						name="client.codePostal" /></td>
			</tr>
			<tr>
				<td><s:label>Rue</s:label></td>
				<td colspan="3"><s:textfield size="100%" placeholder="Rue"
						name="client.rue" /></td>
			</tr>
			<tr>
				<td colspan="4">
					<div class="title">Coordonn&eacute;es</div> <br />
				</td>
			</tr>
			<tr>
				<td><s:label>Tel.</s:label></td>
				<td><s:textfield size="50%" placeholder="Tel."
						name="client.tel" /></td>
				<td><s:label>Mail</s:label></td>
				<td><s:textfield size="50%" placeholder="Mail"
						name="client.mail" /></td>
			</tr>
			<tr>
				<td colspan="4">
					<div class="title">Remarques</div> <br />
				</td>
			</tr>
			<tr>
				<td colspan="4"><s:textfield size="100%"
						placeholder="Remarques" name="client.remarques" /></td>
			</tr>
		</table>
		<br />
		<s:submit value="Créer le client" />
	</s:form>
</body>
</html>