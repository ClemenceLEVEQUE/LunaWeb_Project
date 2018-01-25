<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function changeClient() {
		document.getElementById("codecli").value = document
				.getElementById("id").value;
	}
</script>
<body>
	<s:form action="insertCom" theme="simple">
		<s:textfield placeholder="dateLivraison" name="commande.dateLivraison" />
		<select id="client" onchange="changeClient()">
			<option value="Choisir un article...">
				<s:iterator value="getClients()">
					<option value='<s:property value="idClient"/>'><s:property
							value="codeClient" /></option>
				</s:iterator>
		</select>
		<s:textfield name="commande.client" id="codecli" />
		<s:submit value="Créer l'article" />
	</s:form>
</body>
</html>