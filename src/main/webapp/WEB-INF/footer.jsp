<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Footer</title>
<script type="text/javascript">
	function Horloge() {
		maintenant = new Date();
		heures = maintenant.getHours();
		minutes = maintenant.getMinutes;
		secondes = maintenant.getSeconds;
		if (heures < 10) {
			heures = "0" + heures;
		}
		if (minutes < 10) {
			minutes = "0" + minutes;
		}
		if (secondes < 10) {
			secondes = "0" + secondes;
		}
		document.form1.Pendule.value = heures + ":" + minutes + ":" + secondes;
		setTimeout("Horloge()", 1000);
		H
	}
</script>
</head>
<body onload="Horloge()">

	<div class="footer">
		<table>
			<tr class="nom1">
				<td>Clémence</td>
				<td>Léveque</td>
			</tr>
			<tr class="nom2">
				<td>Karim</td>
				<td>El Koulali</td>
			</tr>
		</table>
	
</body>
</html>