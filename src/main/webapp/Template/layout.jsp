<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" ignore="true" /></title>
</head>
<body>
	<table border="1" cellpadding="2" cellspacing="2" align="center">
		<tr>
			<td height="10%" colspan="2"><tiles:insert attribute="header" />
			</td>
		</tr>
		<tr>
			<td width="20%" height="250"><tiles:insert attribute="navig" />
			</td>
			<td><tiles:insert attribute="body" /></td>
		</tr>
		<tr>
			<td height="15%" colspan="2"><tiles:insert attribute="footer" />
			</td>
		</tr>
	</table>
</body>
</html>