<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#main {
	max-with: 960px;
	margin: auto;
}

#menu {
	position: fixed;
	float: left;
	float: inline-end;
	width: 20%;
	background-color: #D17E01;
	margin: 0 0 0 0;
	display: block;
	text-align: center;
}

#ajoutCommande {
	margin-left: 22%;
}

.search {
	width: 25%;
}

/* When the input field gets focus, change its width to 100% */
.search:focus {
	width: 80%;
}

h1 {
	margin: 0 0 50px 10px;
}

h2 {
	margin: 20px 0 40% 10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier ligne</title>
</head>
<body>

	<table width="100%">
		<tr>
			<td colspan="2">
				<div id="header">
					<%@include file="template/header.jsp"%>
				</div>
			</td>
		</tr>

		<tr>
			<td>
				<div id="main">
					<h1></h1>
					<div id="menu">
						<p></p>
						<p></p>

						<p></p>
						<p></p>
						<p>Liste des commande</p>
						<p></p>
						<p></p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<h1>
							<a href="AffichageCommande" title="liste des commandes"> <img
								src="${pageContext.request.contextPath}/WEB-INF/images/liste.png"
								width="80px" height="80px" />
							</a>
						</h1>
						<p></p>
						<p></p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p>Rechercher une commande</p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<h2>
							<input class="search" type="text" name="search" id="search"
								placeholder="Search.."><br/><a title="Rechercher..." id="action" href="search?Search" onclick="research()"><img src="${pageContext.request.contextPath}/images/loupe.png"/></a>
						</h2>
						<script type="text/javascript">
							function research() {
								document.getElementById("action").href = "searchCom?Search="
										+ document.getElementById("search").value;
							}
						</script>
						<p></p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
					</div>
					<div id="ajoutCommande">
						<div class="title" style="width: 300px;">Modifier une ligne
							commande</div>
						<br /> <label>Commande</label> <select onchange="changeCommande()"
							id="selectCommande">
							<s:iterator value="getCommandes()">
								<option value='<s:property value="idCommande"/>'><s:property
										value="numCom" /></option>
							</s:iterator>
						</select> <input type="text" id="commande" style="display: none;"
							value='<s:if test="getCommandes().size != 0"><s:iterator value="getCommandes()" begin="0" end="0"><s:property value="idCommande"/></s:iterator></s:if>' />
						<label>Article</label> <select id="selectArticle"
							onchange="changeArticle()">
							<s:iterator value="getArticles()">
								<option value='<s:property value="idArticle"/>'><s:property
										value="codeArt" /></option>
							</s:iterator>
						</select> <input type="text" id="article" style="display: none;"
							value='<s:if test="getArticles().size != 0"><s:iterator value="getArticles()" begin="0" end="0"><s:property value="idArticle"/></s:iterator></s:if>' />
						<br/><label>Quantit&eacute;</label>
						<input type="text" id="quantite" value='0' />
						<br/><a id="action"
							onclick="modifLien()" href="http://"><button>Enregistrer
								les modifications</button></a>

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
										+ document.getElementById("commande").value
										+ "&Art="
										+ document.getElementById("article").value
										+ "&Qte="
										+ document.getElementById("quantite").value;
							}
						</script>
					</div>

					<div id="footer">
						<%@include file="template/footer.jsp"%>
					</div>
			</td>
		</tr>
	</table>
</body>
</html>