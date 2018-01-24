<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="updateArt">
		<s:textfield type="text" placeholder="Code article"
			name="article.codeArt" readonly="true">
			<s:property value="article.codeArt" />
		</s:textfield>
		<s:textfield type="text" placeholder="Designation"
			name="article.nomArticle">
			<s:property value="article.nomArticle" />
		</s:textfield>
		<s:textfield type="text" placeholder="Categorie"
			name="article.categorie">
			<s:property value="article.categorie" />
		</s:textfield>
		<s:textfield type="number" placeholder="Prix unit."
			name="article.prixUnitaire">
			<s:property value="article.prixUnitaire" />
		</s:textfield>
		<s:textfield type="number" placeholder="Stock" name="article.stock">
			<s:property value="article.stock" />
		</s:textfield>
		<s:textfield disabled="true" name="article.id">
			<s:property value="article.id" />
		</s:textfield>
		<s:submit value="Enregistrer les modifications" />
	</s:form>
</body>
</html>