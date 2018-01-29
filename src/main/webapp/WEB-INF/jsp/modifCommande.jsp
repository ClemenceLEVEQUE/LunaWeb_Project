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
<title>Ajout commande</title>
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
						<div class="title" style="width: 250px;">
							Fiche commande :
							<s:property value="commande.numCom" />
						</div>
						<br /> <label>Client</label> <select id="selectClient"
							onchange="changeClient()">
							<s:iterator value="getClients()">
								<option value='<s:property value="idClient"/>'>
									<s:property value="codeClient" />
								</option>
							</s:iterator>
						</select> <input type="text" id="client" style="display: none;"
							value='<s:if test="getClients().size == 1"><s:iterator value="getClients()" begin="0" end="0"><s:property value="idClient"/></s:iterator></s:if>'>
						<input type="text" id="id" style="display: none;"
							value='<s:property value="commande.idCommande"/>'> <a
							id="action" onclick="modifLien()" href="http://"><button>Enregistrer
								les modifications</button></a>

						<script type="text/javascript">
							function changeClient() {
								document.getElementById("client").value = document
										.getElementById("selectClient").value;
							}

							function modifLien() {
								document.getElementById("action").href = "updateCom?cli="
										+ document.getElementById("client").value
										+ "&id="
										+ document.getElementById("id").value;

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