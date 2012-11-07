<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="products.*, java.util.ArrayList" %>   
<!DOCTYPE html>
<html>
<head>
	<title>Invoice</title>
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
			Invoice invoice = (Invoice) request.getAttribute("invoice");
			ArrayList<LineItem> line_items = invoice.getLineItems();
		%>
		<div class="row-fluid">
			<div class="span12">
				<p>Please review your order.</p>
				<table class="table table-bordered table-striped">
					<tr><td>Product</td><td>Price</td><td>Quantity</td><td>Total Price</td></tr>
					<% 
						for (int i = 0; i < line_items.size(); i++) {
							LineItem line_item = line_items.get(i);
							Painting painting = (Painting) line_item.getProduct();
					%>
					<tr>
						<td> <%= painting.getTitle() %> </td>
						<td> <%= painting.getPrice() %> </td>
						<td> <%= line_item.getQuantity() %> </td>
						<td> <%= line_item.getTotalPriceString() %> </td>
					<tr>
					<% } %>
					<tr><td></td><td></td><td></td><td> <%= invoice.getTotalPriceString() %> </td></tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>