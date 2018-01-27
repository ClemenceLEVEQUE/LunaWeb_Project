<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<%@include file="template/header.jsp"%>
	</div>

	<label>Client</label>
	<select id="selectClient" onchange="changeClient()">
		<s:iterator value="getClients()">
			<option value='<s:property value="idClient"/>'>
				<s:property value="codeClient" />
			</option>
		</s:iterator>
	</select>
	<input type="text" id="client"
		value='<s:if test="getClients().size == 1"><s:iterator value="getClients()"><s:property value="idClient"/></s:iterator></s:if>'>
	<a id="action" onclick="modifLien()" href="http://"><button>Cr&eacute;er
			la commande</button></a>

	<script type="text/javascript">
		function changeClient() {
			document.getElementById("client").value = document
					.getElementById("selectClient").value;
		}

		function modifLien() {
			document.getElementById("action").href = "insertCom?cli="
					+ document.getElementById("client").value;
		}
	</script>

	<%@include file="template/footer.jsp"%>
</body>
</html>