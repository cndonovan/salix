<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="application.*, products.*, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
	<title> Store </title>
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
					<tr>
						<td><img src="images/jay.jpg" alt="Blue Jay" width="150px"></td>
						<th>Blue Jay</th>
						<td>Acrylic</td>
						<td>Barn Wood</td>
						<td>$100.00</td>
						<td><a href="ShoppingCartServlet?action=increment&id=blue_jay">Add to Cart</a></td>		
					</tr>
					<tr>
						<td><img src="images/heron.jpg" alt="Blue Heron" width="150px"></td>
						<th>Blue Heron</th>
						<td>Acrylic</td>
						<td>Barn Wood</td>
						<td>$150.00</td>
						<td><a href="ShoppingCartServlet?action=increment&id=blue_heron">Add to Cart</a></td> 							
					</tr>
					<tr>
						<td><img src="images/bluebird.jpg" alt="Bluebird" width="150px"></td>
						<th>Bluebird</th>
						<td>Acrylic</td>
						<td>Barn Wood</td>
						<td>$100.00</td>
						<td><a href="ShoppingCartServlet?action=increment&id=bluebird">Add to Cart</a></td> 
					</tr>
					<tr>
						<td><img src="images/flicker.jpg" alt="Northern Flicker" width="150px"></td>
						<th>Northern Flicker</th>
						<td>Acrylic</td>
						<td>Barn Wood</td>
						<td>$100.00</td>
						<td><a href="ShoppingCartServlet?action=increment&id=northern_flicker">Add to Cart</a></td> 
					</tr>
					<tr>
						<td><img src="images/nuthatch.jpg" alt="Crested Nuthatch" width="150px"></td>
						<th>Crested Nuthatch</th>
						<td>Acrylic</td>
						<td>Barn Wood</td>
						<td>$100.00</td>
						<td><a href="ShoppingCartServlet?action=increment&id=crested_nuthatch">Add to Cart</a></td> 
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
