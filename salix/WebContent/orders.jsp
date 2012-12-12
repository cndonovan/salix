<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="database.*" %>   
<!DOCTYPE html>
<html>
<head>
	<title>Orders</title>
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
		<div class="row-fluid">
			<div class="span12">
			<%
				Order[] orders = Database.getOrders();
				if (orders.length > 0) {
			%>
				<table class="table table-bordered table-striped">
					<tr>
						<td>Order ID</td>
						<td>Date Created</td>
						<td>Cost </td>
					</tr>
					<% for (Order order : orders) { %>
						<tr>
							<td><%= order.getOrderID() %></td>
							<td><%= order.getDateCreated() %></td>
							<td><%= order.getCost() %></td>
						</tr>
					<% } %>
				</table>
			<% } else { %>
				<p class="well">
					There are no orders yet.
				</p>
			<% } %>
			</div>
		</div>
	</div>
</body>
</html>