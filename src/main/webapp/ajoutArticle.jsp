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
	<s:form action="insertArt">
		<s:textfield type="text" placeholder="Code article" name="article.codeArt"/>
		<s:textfield type="text" placeholder="Designation" name="article.nomArticle"/>
		<s:textfield type="text" placeholder="Categorie" name="article.categorie"/>
		<s:textfield type="number" placeholder="Prix unit." name="article.prixUnitaire"/>
		<s:textfield type="number" placeholder="Stock" name="article.stock"/>
		<s:submit value="Créer l'article" />
	</s:form>
</body>
</html>