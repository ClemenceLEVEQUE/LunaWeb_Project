<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="insertCom" theme="simple">
		<s:textfield placeholder="Code Client" name="commande.client" />
		<s:textfield placeholder="dateLivraison" name="commande.dateLivraison" />
		<s:combobox list="getClients()"></s:combobox>
		<s:submit value="Cr�er l'article" />
	</s:form>
</body>
</html>