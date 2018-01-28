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
	background-color: #0FC917;
	margin: 0 0 0 0;
	display: block;
	text-align: center;
}

#ajoutArticle {
	margin-left: 22%;
	background-color: #09DC12;
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
<title>Ajouter un article</title>
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
					<div id="ajoutArticle">
	<s:form action="insertArt" theme="simple">
		<div id="main">
			<table>

				<tr>
					<td><s:label>Code article</s:label></td>
					<td><s:textfield type="text" placeholder="Code article"
							name="article.codeArt" /></td>
					<td><s:label>Designation</s:label></td>
					<td><s:textfield type="text" placeholder="Designation"
							name="article.nomArticle" /></td>
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
		</div>
		<br />
		<s:submit value="Créer l'article" />
	
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