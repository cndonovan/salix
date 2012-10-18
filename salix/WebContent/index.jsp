<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
	<title> Art by Salix </title>
	<link rel="stylesheet" type="text/css" 
		href="css/bootstrap.css">
	<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>
	<meta name="description" content="Salix's art portfolio" >
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="art, portfolio, fine art, Willow Solem, paintings" >
</head>

<body>
<div class="container-fluid">
<%@ include file="header.jsp" %>
<table class="table table-bordered table-striped">
	<tr>
		<td><img src="art/jay.jpg" alt="blue jay"></td>
		<td><img src="art/heron.jpg" alt="blue heron"></td>
		<td><img src="art/bluebird.jpg" alt="bluebird"></td>
		<td><img src="art/flicker.jpg" alt="northern flicker"></td>
		<td><img src="art/nuthatch.jpg" alt="crested nuthatch"></td>
	</tr>
	<tr id="title-row">
		<th>Blue Jay</th>
		<th>Blue Heron</th>
		<th>Bluebird</th>
		<th>Northern Flicker</th>
		<th>Crested Nuthatch</th>
	</tr>
	<tr id="medium-row">
		<td>Acrylic on barn wood</td>
		<td>Acrylic on barn wood</td>
		<td>Acrylic on barn wood</td>
		<td>Acrylic on barn wood</td>
		<td>Acrylic on barn wood</td>
	</tr>
</table>
</div>
</body>
</html>
