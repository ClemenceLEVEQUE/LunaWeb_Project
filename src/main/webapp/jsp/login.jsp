<%@page import="java.awt.Image"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="">
<head>
<script
	src="//production-assets.codepen.io/assets/editor/live/console_runner-079c09a0e3b9ff743e39ee2d5637b9216b3545af0de366d4b9aad9dc87e26bfd.js"></script>
<script
	src="//production-assets.codepen.io/assets/editor/live/events_runner-73716630c22bbc8cff4bd0f07b135f00a0bdc5d14629260c3ec49e5606f98fdd.js"></script>
<script
	src="//production-assets.codepen.io/assets/editor/live/css_live_reload_init-2c0dc5167d60a5af3ee189d570b1835129687ea2a61bee3513dee3a50c115a77.js"></script>
<meta charset="UTF-8">
<meta name="robots" content="noindex">
<link rel="shortcut icon" type="image/x-icon"
	href="//production-assets.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico">
<link rel="mask-icon" type=""
	href="//production-assets.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg"
	color="#111">
<link rel="canonical" href="https://codepen.io/masonfox/pen/EVovQE">

<link rel="stylesheet prefetch"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet prefetch"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<style class="cp-pen-styles">
@import url(https://fonts.googleapis.com/css?family=Lato:400,100,300);

body {
	background: #4F5454;
	min-height: 100vh;
	width: auto;
}

.title h1 {
	font-size: 3.5em;
	color: #bdbdbd;
}

.bar {
	height: .25em;
	width: 100%;
	background: #bdbdbd;
	margin: 1.5em auto 0;
}

.main {
	/*  background: $trans-orange;*/
	min-height: 50vh;
	position: relative;
	top: 20vh;
}

input[type=text], input[type=password] {
	font-size: 1.75em;
	padding: .55em;
	width: 100%;
	margin-bottom: 1em;
	border: none;
	background-color: #bdbdbd;
}

input[type=text]::-webkit-input-placeholder, input[type=password]::-webkit-input-placeholder
	{
	color: #7C7F7E;
	position: relative;
	padding: 0;
	-webkit-transition: all 0.5s ease;
	transition: all 0.5s ease;
}

input[type=text]:-ms-input-placeholder, input[type=password]:-ms-input-placeholder
	{
	color: #aaaaaa;
	position: relative;
	padding: 0;
	-webkit-transition: all 0.5s ease;
	transition: all 0.5s ease;
}

input[type=text]::-ms-input-placeholder, input[type=password]::-ms-input-placeholder
	{
	color: #aaaaaa;
	position: relative;
	padding: 0;
	-webkit-transition: all 0.5s ease;
	transition: all 0.5s ease;
}

input[type=text]::placeholder, input[type=password]::placeholder {
	color: #aaaaaa;
	position: relative;
	padding: 0;
	-webkit-transition: all 0.5s ease;
	transition: all 0.5s ease;
}

input[type=text]:hover::-webkit-input-placeholder, input[type=text]:focus::-webkit-input-placeholder,
	input[type=password]:hover::-webkit-input-placeholder, input[type=password]:focus::-webkit-input-placeholder
	{
	padding-top: 3em;
}

input[type=text]:hover:-ms-input-placeholder, input[type=text]:focus:-ms-input-placeholder,
	input[type=password]:hover:-ms-input-placeholder, input[type=password]:focus:-ms-input-placeholder
	{
	padding-top: 3em;
}

input[type=text]:hover::-ms-input-placeholder, input[type=text]:focus::-ms-input-placeholder,
	input[type=password]:hover::-ms-input-placeholder, input[type=password]:focus::-ms-input-placeholder
	{
	padding-top: 3em;
}

input[type=text]:hover::placeholder, input[type=text]:focus::placeholder,
	input[type=password]:hover::placeholder, input[type=password]:focus::placeholder
	{
	padding-top: 3em;
}

.form h2 {
	text-align: left;
	font-weight: 100;
	color: #bdbdbd;
	margin-bottom: .5em;
}

.form h4 {
	font-weight: 100;
	color: #bdbdbd;
	margin-top: 2em;
}

.login, .signup {
	color: white;
	width: 6em;
	font-family: Lato;
	font-weight: 100;
	font-size: 1.75em;
	border: 1px solid rgba(255, 255, 255, 0.75);
	background: transparent;
	-webkit-transition: all 200ms ease-in;
	transition: all 200ms ease-in;
	border-radius: .65em;
}

.login:hover, .signup:hover, .login:focus, .signup:focus {
	background: #fff;
	color: #f58421;
	border: none;
}

.signup {
	font-size: 1em;
	position: relative;
	left: 1.5em;
}

h1, h2 h3, h4, h5, h6, input {
	font: Lato;
	font-weight: 100;
}
</style>
</head>
<body>

	<div class="container main">
		<div class="row">
			<div class="col-md-6 col-md-offset-3 text-center title">
				<h1>Want to Connect?</h1>
				<div class="bar"></div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 col-md-offset-3 form">
				<h2>Login</h2>
				<s:form action="login">
					<s:textfield type="text" placeholder="Login" name="user.login"
						value="" size="50"/>
					<s:textfield type="password" placeholder="Password" name="user.mdp"
						value="" />
					<s:submit name="Valider" value="Login"
						class="btn btn-default login" />
				</s:form>
				<h4>
					Don't have an account? We can fix that!<span><a
						class="btn btn-default signup" href="sign">Signup</a></span>
				</h4>
			</div>
		</div>
	</div>

	<%@include file="template/footer.jsp"%>
</body>
</html>