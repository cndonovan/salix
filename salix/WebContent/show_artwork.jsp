<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="products.*" %>   
<!DOCTYPE html>
<html>
<head>
	<title>Artwork</title>
	<link rel="stylesheet" type="text/css" 
		href="css/bootstrap.css">
	<link rel='stylesheet' type='text/css'
		href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' >
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta name="description" content="Salix's art portfolio" >
	<meta name="keywords" content="art, portfolio, fine art, Willow Solem, paintings" >
</head>
<body>
	<div class="container-fluid">
		<%@ include file="shared/header.jsp" %>
		<%
			String title = request.getParameter("title");
			String medium = request.getParameter("medium");
			String surface = request.getParameter("surface");
			String height = request.getParameter("height");
			String width = request.getParameter("width");
			String year = request.getParameter("year");
			String yes_or_no = request.getParameter("for_sale");
			String load_date = request.getParameter("load_date");
		%>
		<div class="row-fluid">
			<div class="span12">
				<p>Your piece, <%=title%>, was uploaded.</p>
				<table class="table table-bordered table-striped">
					<tr class="row_a">
						<td>Title</td>
						<td><%= title %></td>
					</tr>
					<tr class="row_b">
						<td>Medium</td>
						<td><%= medium %></td>
					</tr>
					<tr class="row_a">
						<td>Surface</td>
						<td><%= surface %></td>
					</tr>
					<tr class="row_b">
						<td>Height</td>
						<td><%= height %></td>
					</tr>
					<tr class="row_a">
						<td>Width</td>
						<td><%= width %></td>
					</tr>
					<tr class="row_b">
						<td>Year</td>
						<td><%= year %></td>
					</tr>
					<tr class="row_a">
						<td>For sale?</td>
						<td><%= Character.toUpperCase(yes_or_no.charAt(0)) + yes_or_no.substring(1) %></td> 
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>