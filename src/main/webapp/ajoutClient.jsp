<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter un client</title>
</head>
<body>
	<s:form action="insertClient" method="post">
		<s:textfield placeholder="Nom" name="client.nom" />
		<s:textfield placeholder="Prenom" name="client.prenom" />
		<s:textfield placeholder="Ville" name="client.ville" />
		<s:textfield placeholder="Rue" name="client.rue" />
		<s:textfield placeholder="Code postal" name="client.codePostal" />
		<s:textfield placeholder="Tel." name="client.tel" />
		<s:textfield placeholder="Mail" name="client.mail" />
		<s:textfield placeholder="Code client" name="client.codeClient" />
		<s:textarea placeholder="Remarques" name="client.remarques" />
		<s:submit value="Créer l'article" />
	</s:form>
</body>
</html>