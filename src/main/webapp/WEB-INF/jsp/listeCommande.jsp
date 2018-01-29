<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.odd {
	background-color: #F0C869;
}

.even {
	background-color: #FEE4A6;
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

#entete, #menu, #listeClient, #footer {
	padding: 1px 0;
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

#listeCommande {
	margin-left: 22%;
	background-color: #D17E01;
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
<title>Gestion des commandes</title>
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
						<p>Ajouter une commande</p>
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
							<a href="insertThisCom" title="Ajout d'une commande"> <img
								class="button"
								src="${pageContext.request.contextPath}/images/ajouter.png"
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
					<div id="listeCommande">
						<s:if test="getModels()!=null">
							<table>
								<tr class="entete">
									<td>Client</td>
									<td>Date de livraison</td>
									<td>Date de commande</td>
									<td>Numero de Commande</td>
								</tr>

								<s:iterator value="getModels()" status="modelsStatus">
									<tr
										class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
										<td width="25%"><s:property value="client.codeClient" /></td>
										<td width="25%"><s:property value="dateLivraison" /></td>
										<td width="25%"><s:property value="dateCom" /></td>
										<td width="25%"><s:property value="numCom" /></td>
										<td><a
											href='deleteCom?id=<s:property value="idCommande"/>'
											title="Supprimer"> <img
												src="${pageContext.request.contextPath}/images/suppr.png" />
										</a></td>

										<td><a
											href='updateThisCom?id=<s:property value="idCommande"/>'
											title="Modifier"> <img
												src="${pageContext.request.contextPath}/images/modif.png" />
										</a></td>

										<td><a
											href='ficheCommande?id=<s:property value="idCommande"/>'
											title="Fiche"> <img
												src="${pageContext.request.contextPath}/images/loupe.png" />
										</a></td>
									</tr>
								</s:iterator>
							</table>
						</s:if>

					</div>
				</div>

			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div id="footer">
					<%@include file="template/footer.jsp"%>
				</div>
			</td>
		</tr>
	</table>
</html>