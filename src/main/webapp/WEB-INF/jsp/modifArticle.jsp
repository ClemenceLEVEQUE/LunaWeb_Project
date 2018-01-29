<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
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

#ajoutArticle {
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
<title>Modifier article</title>
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
						<p>Liste article</p>
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
							<a href="AffichageArticle" title="liste des article"> <img
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
							<input class="search" type="text" name="search" id="search"
								placeholder="Search.."><br/><a title="Rechercher..." id="action" href="search?Search" onclick="research()"><img src="${pageContext.request.contextPath}/images/loupe.png"/></a>
						</h2>
						<script type="text/javascript">
							function research() {
								document.getElementById("action").href = "searchArt?Search="
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
					<div id="ajoutArticle">
						<div class="title" style="width: 450px;">
								Fiche article :
								<s:property value="article.codeArt" />
						</div><br/>
						<s:form action="updateArt" theme="simple">
							<table>
								<tr>
									<td><s:label>D&eacute;signation</s:label></td>
									<td><s:textfield type="text" placeholder="Designation"
											name="article.nomArticle" /></td>
									<td></td>
									<td></td>
								</tr>

								<tr>
									<td><s:label>Cat&eacute;gorie</s:label></td>
									<td><s:textfield type="text" placeholder="Categorie"
											name="article.categorie" /></td>
								</tr>

								<tr>
									<td><s:label>Prix unit.</s:label></td>
									<td><s:textfield type="number" placeholder="Prix unit."
											name="article.prixUnitaire" /></td>
									<td><s:label>Stock</s:label></td>
									<td><s:textfield type="number" placeholder="Stock"
											name="article.stock" /></td>
								</tr>
							</table>
							<s:textfield style="display: none;" name="article.idArticle" />
							<s:textfield style="display: none;" name="article.codeArt" />
							<s:submit value="Enregistrer les modifications" />
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