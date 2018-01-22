<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertTemplate template="layout.jsp" flush="true">
	<tiles:insertAttribute name="header" value="/header.jsp" />
	<tiles:insertAttribute name="menu" value="/menu.jsp" />
	<tiles:insertAttribute name="body" value="/body.jsp" />
	<tiles:insertAttribute name="footer" value="/footer.jsp" />
</tiles:insertTemplate>