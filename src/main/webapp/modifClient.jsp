<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier un client</title>
</head>
<body>
	<h2>
		Fiche client :
		<s:property value="client.codeClient" />
	</h2>
	<s:form action="updateClient" method="post">
		<s:textfield placeholder="Nom" name="client.nom" 
			abel="Nom" />
		<s:textfield placeholder="Prenom" name="client.prenom"
			label="Prenom" />
		<s:textfield placeholder="Ville" name="client.ville"
			label="Ville" />
		<s:textfield placeholder="Rue" name="client.rue"
			label="Rue" />
		<s:textfield placeholder="Code postal" name="client.codePostal"
			label="Code postal" />
		<s:textfield placeholder="Tel." name="client.tel"
			label="Tel." />
		<s:textfield placeholder="Mail" name="client.mail"
			label="Mail" />
		<s:textarea placeholder="Remarques" name="client.remarques"
			label="Remarques" />
		<s:textfield style="display: none;" name="client.id" />
		<s:submit value="Créer l'article" />
	</s:form>
</body>
</html>