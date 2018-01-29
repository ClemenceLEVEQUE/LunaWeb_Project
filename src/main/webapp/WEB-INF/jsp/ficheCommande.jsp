<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.odd {
	background-color: #B0B5B5;
}

.even {
	background-color: #C8CACA;
}

.errors {
	background-color: #FFCCCC;
	border: 1px solid #CC0000;
	width: 400px;
	margin-bottom: 8px;
}

.errors li {
	list-style: none;
}

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

#listCommande {
	background-color: #888E8E;
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
<title>Fiche commande</title>
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
								src="${pageContext.request.contextPath}/images/liste.png"
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
						<div class="title">
							Fiche commande :
							<s:property value="commande.numCom" />
						</div>
						<p>
							Date de la commande :
							<s:property value="commande.dateCom" />
						</p>
						<p>
							Date de livraison :
							<s:property value="commande.dateLivraison" />
						</p>
						<p>
							Client :
							<s:property value="commande.client.getCodeClient()" />
						</p>
						<s:if test="getLignes()!=null">
							<div id="listCommande">
								<table>
									<tr class="entete">
										<td width="34%">Article</td>
										<td width="33%">Prix unit.</td>
										<td width="33%">Qt&eacute;</td>
										<td></td>
										<td></td>
									</tr>

									<s:iterator value="getLignes()" status="modelsStatus">
										<tr
											class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
											<td><s:property value="article.codeArt" /></td>
											<td><s:property value="article.prixUnitaire" /></td>
											<td><s:property value="quantite" /></td>
											<td><a href='deleteLig?id=<s:property value="idLigne"/>'
												title="suppression de la ligne"> <img
													src="${pageContext.request.contextPath}/images/suppr.png" />
											</a></td>
											<td><a
												href='updateThisLigne?id=<s:property value="idLigne"/>'
												title="modification du client"> <img
													src="${pageContext.request.contextPath}/images/modif.png" />
											</a></td>
										</tr>
									</s:iterator>
								</table>
							</div>
						</s:if>
						<p>
							<a href="insertThisLigne"><button>Ajouter une ligne</button></a>
						</p>
					</div>

					<div id="footer">
						<%@include file="template/footer.jsp"%>
					</div>
			</td>
		</tr>
	</table>
</body>
</html>