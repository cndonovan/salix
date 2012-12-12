<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="application.*, products.*, database.*"%>
<!DOCTYPE html>
<html>
<head>
	<title> Gallery </title>
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
		<div class="gallery row-fluid">
			<div class="span12">
				<table>
					<tr>
					<!-- We realized we could put all the information about a painting
					in a single div, but we didn't want to deal with the formatting,
					so instead we iterated through the array for each table row -->
					<%
						Painting[] paintings = Database.getPaintings();
						for (int i = 0; i < paintings.length; i++) {
							Painting painting = paintings[i];
					%>
							<td><img src="images/<%=painting.getFile()%>" alt="<%=painting.getTitle()%>"></td>
					<%	} %>
					</tr>
					<tr>
					<%
						for (int i = 0; i < paintings.length; i++) {
							Painting painting = paintings[i];
					%>
							<td class="title"><%=painting.getTitle()%></td>
					<%	} %>
					</tr>
					<tr>
					<%
						for (int i = 0; i < paintings.length; i++) { 
							Painting painting = paintings[i];
					%>
							<td><%=painting.getYearCreated()%></td>
					<%	} %>
					</tr>
					<tr>
					<%
						for (int i = 0; i < paintings.length; i++) { 
							Painting painting = paintings[i];
					%>
							<td><%=painting.getWidth()%> x <%=painting.getHeight()%></td>
					<%	} %>
					</tr>
					<tr>
					<%
						for (int i = 0; i < paintings.length; i++) { 
							Painting painting = paintings[i];
					%>
						<td><%=painting.getMedium()%></td>							
					<%	} %>
					</tr>
					<tr>
					<%
						for (int i = 0; i < paintings.length; i++) {
							Painting painting = paintings[i];
					%>
							<td><%=painting.getSurface()%></td>							
					<%	} %>
					</tr>
					<tr>
					<%
						for (int i = 0; i < paintings.length; i++) {
							Painting painting = paintings[i];
					%>
							<td><%=painting.getPrice()%></td>							
					<%	} %>
					</tr>
					<tr>
					<%
						for(int i = 0; i < paintings.length; i++) { 
							Painting painting = paintings[i];
					%>
							<td><a href="ShoppingCartServlet?action=add_product&product_id=<%=painting.getProductID()%>">Add to cart</a></td> 							
					<%	} %>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
