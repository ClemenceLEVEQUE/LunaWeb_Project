<%@page import="java.util.List"%>
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
	<div id="header">
		<%@include file="template/header.jsp"%>
	</div>

	<select onchange="changeCommande()" id="selectCommande">
		<s:iterator value="getCommandes()">
			<option value='<s:property value="idCommande"/>'><s:property
					value="numCom" /></option>
		</s:iterator>
	</select>
	<input type="text" id="commande"
		value='<s:if test="getCommandes().size != 0"><s:iterator value="getCommandes()" begin="0" end="0"><s:property value="idCommande"/></s:iterator></s:if>' />
	<select id="selectArticle" onchange="changeArticle()">
		<s:iterator value="getArticles()">
			<option value='<s:property value="idArticle"/>'><s:property
					value="codeArt" /></option>
		</s:iterator>
	</select>
	<input type="text" id="article"
		value='<s:if test="getArticles().size != 0"><s:iterator value="getArticles()" begin="0" end="0"><s:property value="idArticle"/></s:iterator></s:if>' />
	<input type="text" id="quantité" value='0' />

	<a id="action" onclick="modifLien()" href="http://"><button>Enregistrer les modifications</button></a>

	<script type="text/javascript">
		function changeCommande() {
			document.getElementById("commande").value = document
					.getElementById("selectCommande").value;
		}

		function changeArticle() {
			document.getElementById("article").value = document
					.getElementById("selectArticle").value;
		}

		function modifLien() {
			document.getElementById("action").href = "updateLig?Com="
					+ document.getElementById("commande").value + "&Art="
					+ document.getElementById("article") + "&Qte="
					+ document.getElementById("quantite");
		}
	</script>

	<%@include file="template/footer.jsp"%>
</body>
</html>