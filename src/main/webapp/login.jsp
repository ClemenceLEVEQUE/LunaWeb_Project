<%@page import="java.awt.Image"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="login">
		<div class="format">
			<s:form action="login">
				<s:label value="LUNA_DISCOUNT">
					<img src="../resources/com/luna/graphique/actif.png" />
				</s:label>
				<s:textfield type="text" placeholder="Login" name="user.login" />
				<s:textfield type="password" placeholder="Password" name="user.mdp" />
				<s:submit name="Valider" value="Connexion" />
			</s:form>
		</div>
	</div>
</body>
</html>