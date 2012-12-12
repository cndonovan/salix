<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="application.*, products.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel='stylesheet' type='text/css'
	href='http://fonts.googleapis.com/css?family=Source+Sans+Pro'>
<title>Shopping Cart</title>
</head>
<body>
	<div class="container-fluid">
		<%@ include file="/shared/header.jsp"%>
		<div class="row-fluid">
			<div class="span12">
				<%
					if (shopping_cart.getNumberOfProducts() > 0) {
						LineItem[] line_items = shopping_cart.getLineItems();
				%>
				
						<form action ="ShoppingCartServlet?action=finalize" method="post">
						<table class="table table-bordered table-striped">
							<tr>
								<td>Product</td>
								<td>Quantity</td>
								<td></td>
							</tr>
							<% 
								for (LineItem line_item : line_items) { 
									Product product = line_item.getProduct();
									int product_id = product.getProductID();
									String title = ((Painting) product).getTitle();
							%>
							<tr>
								<td><%=title%></td>
								<td>
									<ul style="list-style-type:none">
										<li style="font-size:24px;"><a href="ShoppingCartServlet?action=add_product&product_id=<%=product_id%>">&#x2303;</a></li>
										<li style="padding-left:5px"><%=line_item.getQuantity()%></li>
										<li style="font-size:24px;"><a href="ShoppingCartServlet?action=remove_product&product_id=<%=product_id%>">&#x2304;</a></li>
									</ul>
								</td>
								<td><a href="ShoppingCartServlet?action=remove_line_item&product_id=<%=product_id%>">Remove All</a></td>
							</tr>
						<% } %>
					</table>
					<input type="submit" class="btn btn-primary" value = "Submit Order">
				</form>
				<% } else { %>
				<p class="well">
					There are no items in your cart yet.
				</p>
				
				
				<% } %>
			</div>
		</div>
	</div>
</body>
</html>