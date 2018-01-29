<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajout client</title>

<style type="text/css">
.search{
    width: 30%;
}

/* When the input field gets focus, change its width to 100% */
.search:focus {
    width: 100%;
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

#ajoutClient {
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
						<p>Liste client</p>
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
							<a href="AffichageClient" title="liste des clients"> <img
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
						<p>Rechercher un article</p>
						<p></p>

						<p></p>
						<p></p>
						<p></p>
						<p></p>
						<h2>
							<input class="search" type="text" name="search"
								placeholder="Search..">
						</h2>
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
					<div id="ajoutClient">
	<s:form action="insertClient" theme="simple">
		<table>
			<tr>
				<td colspan="4">
					<div class="title">Client</div> <br />
				</td>
			</tr>
			<tr>
				<td><s:label>Code client</s:label></td>
				<td colspan="3"><s:textfield size="50%" placeholder="Code"
						name="client.codeClient" /></td>
			</tr>
			<tr>
				<td colspan="4">
					<div class="title">&Eacute;tat civil</div> <br />
				</td>
			</tr>
			<tr>
				<td><s:label>Nom</s:label></td>
				<td><s:textfield size="50%" placeholder="Nom" name="client.nom" /></td>
				<td><s:label>Prénom</s:label></td>
				<td><s:textfield size="50%" placeholder="Prenom"
						name="client.prenom" /></td>
			</tr>
			<tr>
				<td><s:label>Ville</s:label></td>
				<td><s:textfield size="50%" placeholder="Ville"
						name="client.ville" /></td>
				<td><s:label>Code postal</s:label></td>
				<td><s:textfield size="50%" placeholder="Code postal"
						name="client.codePostal" /></td>
			</tr>
			<tr>
				<td><s:label>Rue</s:label></td>
				<td colspan="3"><s:textfield size="100%" placeholder="Rue"
						name="client.rue" /></td>
			</tr>
			<tr>
				<td colspan="4">
					<div class="title">Coordonn&eacute;es</div> <br />
				</td>
			</tr>
			<tr>
				<td><s:label>Tel.</s:label></td>
				<td><s:textfield size="50%" placeholder="Tel."
						name="client.tel" /></td>
				<td><s:label>Mail</s:label></td>
				<td><s:textfield size="50%" placeholder="Mail"
						name="client.mail" /></td>
			</tr>
			<tr>
				<td colspan="4">
					<div class="title">Remarques</div> <br />
				</td>
			</tr>
			<tr>
				<td colspan="4"><s:textfield size="100%"
						placeholder="Remarques" name="client.remarques" /></td>
			</tr>
		</table>
		<br />
		<s:submit value="Créer le client" />
	</s:form>
	</div>

				<div id="footer">
					<%@include file="template/footer.jsp"%>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>