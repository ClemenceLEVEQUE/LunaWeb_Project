<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.odd {
	background-color: #40A497;
}

.even {
	background-color: #2F796F;
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
	background-color: #5e8b2b;
	margin: 0 0 0 0;
	display: block;
	text-align: center;
}

#listeArticle {
	margin-left: 22%;
	background-color: #5e8b2b;
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
<title>Gestion des articles</title>
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
						<p>Ajouter un article</p>
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
							<a href="insertThisArt" title="Ajout d'un article"> <img
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
	<div id="listeArticle">
		<s:if test="getModels()!=null">
			<table>
				<tr class="entete">
					<td>Code article</td>
					<td>D&eacute;signation</td>
					<td>Cat&eacute;gorie</td>
					<td>Prix unit.</td>
					<td>Stock</td>
					<td></td>
					<td></td>
				</tr>

				<s:iterator value="getModels()" status="modelsStatus">
					<tr
						class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td width="20%"><s:property value="codeArt" /></td>
						<td width="20%"><s:property value="nomArticle" /></td>
						<td width="20%"><s:property value="categorie" /></td>
						<td width="20%"><s:property value="prixUnitaire" /></td>
						<td width="20%"><s:property value="stock" /></td>
						<td><a href='deleteArt?id=<s:property value="idArticle"/>'
											title="Supprimer"> <img
												src="${pageContext.request.contextPath}/images/suppr.png" />
										</a></td>
						<td><a href='updateThisArt?id=<s:property value="idArticle"/>'
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
</html>