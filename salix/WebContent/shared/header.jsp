<%@ page import="orders.*" %>
<%
	ShoppingCart shopping_cart = (ShoppingCart) session.getAttribute("shopping_cart");
	if (shopping_cart == null) {
		shopping_cart = new ShoppingCart();
		session.setAttribute("shopping_cart", shopping_cart);
	}
	int total = shopping_cart.getNumberOfProducts();
%>
<div class="navbar navbar-fixed-top" id="header">
	<div class="navbar-inner">
		<div class="brand">Salix</div>
		<ul class="nav">
			<li><a href="gallery.jsp">Gallery</a>
		</ul>
		<ul class="nav pull-right">
			<li><a href="orders.jsp">Orders</a></li>
			<li><a href="shopping_cart.jsp">Shopping Cart (<%=total%>)</a></li>
		</ul>
	</div>
</div>
<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
%>
	<div class="alert"><%=message%></div>		
<%	} %>