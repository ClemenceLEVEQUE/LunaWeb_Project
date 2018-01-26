<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
.odd {
	background-color: silver;
}

.even {
	background-color: white;
}
</style>
<head>
<style type="text/css">
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
	float: left;
	width: 20%;
	background-color: #3066D1;
}

#listeClient {
	margin-left: 245px;
	background-color: #9966FF;
}

.search{
    width: 25%;
}

/* When the input field gets focus, change its width to 100% */
.search:focus {
    width: 100%;
}
</style>
</head>
<body>
	<div id="header">
		<%@include file="template/header.jsp"%>
	</div>
	<div id="main">
		<div id="menu">
		<a href="insertThisClient" title="Ajout de client">
			<img class="button" src="${pageContext.request.contextPath}/images/ajouter.png"
				width="80px" height="80px" />
		</a>
		
		<input class="search" type="text" name="search" placeholder="Search..">
		</div>
		<div class="listeClient">
			<s:if test="getModels()!=null">
				<table>
					<tr class="entete">
						<td>Nom</td>
						<td>Pr�nom</td>
						<td>Ville</td>
						<td>Tel</td>
						<td>Mail</td>
						<td>Code client</td>
					</tr>

					<s:iterator value="getModels()" status="modelsStatus">
						<tr
							class="<s:if test="#modelsStatus.odd == true ">odd</s:if><s:else>even</s:else>">
							<td width="20%"><s:property value="nom" /></td>
							<td width="20%"><s:property value="prenom" /></td>
							<td width="20%"><s:property value="ville" /></td>
							<td width="10%"><s:property value="tel" /></td>
							<td width="20%"><s:property value="mail" /></td>
							<td width="20%"><s:property value="codeClient" /></td>
							<td><a href='deleteClient?id=<s:property value="idClient"/>'title="suppression du client">
			<img src="${pageContext.request.contextPath}/images/suppr.jpg" />
		</a></td>
							
							<td><a href='updateThisClient?id=<s:property value="idClient"/>' title="modification du client">
			<img src="${pageContext.request.contextPath}/images/modif.jpg" />
		</a></td>
						</tr>
					</s:iterator>
				</table>
			</s:if>

		</div>
	</div>
	<div id="footer">
		<%@include file="template/footer.jsp"%>
	</div>
</body>
</html>