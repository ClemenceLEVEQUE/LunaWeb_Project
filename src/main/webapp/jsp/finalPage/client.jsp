<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href=<s:url value="/css/template.css"/> />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clients</title>
</head>
<body>
	<div id="header">
			<%@include file="template/header.jsp"%>
		</div>
	<div id="page">
		<%@include file="/jsp/menu.jsp"%>
		<div id="main">
			<div id="menu">
				<%@include file="/jsp/listeClient.jsp"%>
			</div>

			<div id="contenu">
				<%@include file="/jsp/ajoutClient.jsp"%>
			</div>
			<div id="contenu">
				<%@include file="/jsp/modifClient.jsp"%>
			</div>
		</div>

		<div id="footer">
			<%@include file="jsp/template/footer.jsp"%>
		</div>
	</div>
</body>
</html> --%>