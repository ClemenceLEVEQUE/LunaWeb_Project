<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire</title>
</head>
<body>

<s:form action="addUser" validate="true">
	<s:textfield name="firstName" id="firstName" label="Pr�nom"></s:textfield>
	<s:textfield name="lastName" id="lastName" label="Nom" ></s:textfield>
	<s:textfield name="email" id="email" label="Adresse Email" ></s:textfield>
	<s:submit value="Valider"></s:submit>
	</s:form>

</body>
</html>