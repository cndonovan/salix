<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title> Home </title>
	<link rel="stylesheet" type="text/css" 
		href="css/bootstrap.css">
	<link rel='stylesheet' type='text/css'
		href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' >
	<meta name="description" content="Salix's art portfolio" >
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="art, portfolio, fine art, Willow Solem, paintings" >
</head>
<body>
	<div class="container-fluid">
		<%@ include file="shared/header.jsp" %>
		<div class="row-fluid">
			<div class="span12">
				<table class="table table-bordered table-striped">
					<tr id="image-row">
						<td><img src="images/jay.jpg" alt="Blue Jay"></td>
						<td><img src="images/heron.jpg" alt="Blue Heron"></td>
						<td><img src="images/bluebird.jpg" alt="Bluebird"></td>
						<td><img src="images/flicker.jpg" alt="Northern Flicker"></td>
						<td><img src="images/nuthatch.jpg" alt="Crested Nuthatch"></td>
					</tr>
					<tr id="title-row">
						<th>Blue Jay</th>
						<th>Blue Heron</th>
						<th>Bluebird</th>
						<th>Northern Flicker</th>
						<th>Crested Nuthatch</th>
					</tr>
					<tr id="medium-row">
						<td>Acrylic</td>
						<td>Acrylic</td>
						<td>Acrylic</td>
						<td>Acrylic</td>
						<td>Acrylic</td>
					</tr>
					<tr id="surface-row">
						<td>Barn Wood</td>
						<td>Barn Wood</td>
						<td>Barn Wood</td>
						<td>Barn Wood</td>
						<td>Barn Wood</td>
					</tr>
					<tr id="price-row">
						<td>$100.00</td>
						<td>$150.00</td>
						<td>$100.00</td>
						<td>$100.00</td>
						<td>$100.00</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
