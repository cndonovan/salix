<%@ page import="application.*" %>
<% 
	Cart cart = (Cart) session.getAttribute("cart");
	if (cart == null) {
		cart = new Cart();
		session.setAttribute("cart", cart);
	}
	int total = cart.getTotal();
%>
<div class="navbar navbar-fixed-top" id="header">
	<div class="navbar-inner">
		<!--<a class="brand" href="about.jsp">Salix</a>-->
		<ul class="nav">
			<li><a href="store.jsp">Store</a>
			<li><a href="about.jsp">About</a></li>
		</ul>
		<ul class="nav pull-right">
			<li><a href="shopping_cart.jsp">Shopping Cart (<%=total%>)</a></li>
		</ul>
	</div>
</div>