<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
.odd {
	background-color: #A6BBFE;
}

.even {
	background-color: #8CB4E2;
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
	background-color: #3f87a1;
	margin: 0 0 0 0;
	display: block;
	text-align: center;
}

#listeClient {
	margin-left: 22%;
	background-color: #3f87a1;
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
<title>Gestion des clients</title>
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
						<p>Ajouter un client</p>
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
							<a href="insertThisClient" title="Ajout de client"> <img
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
						<p>Rechercher un client</p>
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
								document.getElementById("action").href = "searchClient?Search="
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
					<div id="listeClient">
						<s:if test="getModels()!=null">
							<table>
								<tr class="entete">
									<td>Code client</td>
									<td>Nom</td>
									<td>Pr&eacute;nom</td>
									<td>Ville</td>
									<td>Tel</td>
									<td>Mail</td>
								</tr>

								<s:iterator value="getModels()" status="modelsStatus">
									<tr
										class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
										<td width="20%"><s:property value="codeClient" /></td>
										<td width="20%"><s:property value="nom" /></td>
										<td width="20%"><s:property value="prenom" /></td>
										<td width="20%"><s:property value="ville" /></td>
										<td width="10%"><s:property value="tel" /></td>
										<td width="20%"><s:property value="mail" /></td>
										<td><a
											href='deleteClient?id=<s:property value="idClient"/>'
											title="Supprimer"> <img
												src="${pageContext.request.contextPath}/images/suppr.png" />
										</a></td>

										<td><a
											href='updateThisClient?id=<s:property value="idClient"/>'
											title="Modifier"> <img
												src="${pageContext.request.contextPath}/images/modif.png" />
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
</body>
</html>