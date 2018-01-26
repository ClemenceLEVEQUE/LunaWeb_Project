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
	<s:form action="insertCom" theme="simple">
		<s:textfield placeholder="dateLivraison" name="commande.dateLivraison" />
		<select id="selectClient" onchange="changeClient()">
			<s:iterator value="getClients()">
				<option value='<s:property value="idClient"/>'>
					<s:property value="codeClient" />
				</option>
			</s:iterator>
		</select>
		<s:textfield name="commande.client" id="client" />
		<s:submit value="Créer l'article" />
	</s:form>
		<hr />
	<s:form action="insertLig" theme="simple">
		<select id="selectArticle" onchange="changeArticle()">
			<s:iterator value="getArticles()">
				<option value='<s:property value="idArticle"/>'>
					<s:property value="codeArt" />
				</option>
			</s:iterator>
		</select>
		<s:textfield name="ligneCommande.article" id="article" />
	</s:form>
	
	<script type="text/javascript">
		function changeClient() {
			document.getElementById("client").value = document
					.getElementById("selectClient").value;
		}
		
		function changeArticle() {
			document.getElementById("article").value = document
					.getElementById("selectArticle").value;
		}
	</script>
</body>
</html>