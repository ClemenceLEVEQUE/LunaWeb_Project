<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
		<title><tiles:insertAttribute name="title" ignore="true"/></title>
	</head>
	<body>
		<table borders="1" cellpading="2" cellspacing="2" aligne="center">
			<tr>
				<td height="30" colspan="2"><tiles:insertAttributer name="header"/></td>
			</tr>
			
			<tr>
				<td height="250"><tiles:insertAttribute name="navig"/></td>
				<td width="350"><tiles:insertAttribute name="body"/></td>
			</tr>
			
			<tr>
				<td height="30" colspan="2"><tiles:insertAttributer name="footer"/></td>
			</tr>
		</table>
	</body>
</html>