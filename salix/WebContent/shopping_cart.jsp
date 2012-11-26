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
					if (cart.getTotal() > 0) {
						String[] items = cart.getItems();
				%>
						<form>
						<table class="table table-bordered table-striped">
							<tr>
								<td>Item</td>
								<td>Quantity</td>
							</tr>
							<% for (String item_id : items) { %>
							<tr>
								<td><%=item_id%></td>
								<td>
									<ul style="list-style-type:none">
										<li style="font-size:24px;"><a href="ShoppingCartServlet?action=increment&id=<%=item_id%>">&#x2303;</a></li>
										<li style="padding-left:5px"><%=cart.getQuantityOfItem(item_id)%></li>
										<li style="font-size:24px;"><a href="ShoppingCartServlet?action=decrement&id=<%=item_id%>">&#x2304;</a></li>
									</ul>
									<a href="ShoppingCartServlet?action=remove&id=<%=item_id%>">Remove All</a>
								</td>
							</tr>
						<% } %>
					</table>
				</form>
				<% } else { %>
				<p class="well">
					There are no items in your cart.
				</p>
				<% } %>
			</div>
		</div>
	</div>
</body>
</html>