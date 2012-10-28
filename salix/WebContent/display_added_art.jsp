<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="products.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" 
	href="css/bootstrap.css" />
<title>Artwork Added</title>
</head>
<body>
<div class="container-fluid">
<%@ include file="header.jsp" %>
	<%
		String title = request.getParameter("title");
		String medium = request.getParameter("medium");
		String surface = request.getParameter("surface");
		String height = request.getParameter("height");
		String width = request.getParameter("width");
		String year = request.getParameter("year");
		String yesOrNo = request.getParameter("forSale");
		String loadDate = request.getParameter("loadDate");
		boolean forSale = false;
		
		
		double passHeight = (double) Integer.parseInt(height);
		double passWidth = (double) Integer.parseInt(width);
		int passYear = Integer.parseInt(year);
		if (yesOrNo.equalsIgnoreCase("yes")){
			forSale = true;
		}

 		String artEntry = "Title: " + title + ", Medium: " + medium + ", Surface: " + surface + ", Height: " + height + ", Width: " + width + ", Year: " + year + ", For Sale: " + yesOrNo;
		//ServletContext sc = this.getServletContext();
		//String path = sc.getRealPath("/WEB-INF/artlog.txt");
	
		//Painting painting = new Painting(0.0, forSale, title, medium, passYear, passHeight, passWidth, surface, loadDate);
		//AddArtEntryIO.add(path, artEntry);
	%>
	
	<h3>Your piece, <%=title%>, was added.</h3>
	<table class="table table-bordered table-striped">
		<tr class="row_a">
			<td>
				Title
			</td>
			<td>
				<%= title %>
			</td>
		</tr>
		<tr class="row_b">
			<td>
				Medium
			</td>
			<td>
				<%= medium %>
			</td>
		</tr>
		<tr class="row_a">
			<td>
				Surface
			</td>
			<td>
				<%= surface %>
			</td>
		</tr>
		<tr class="row_b">
			<td>
				Height
			</td>
			<td>
				<%= height %>
			</td>
		</tr>
		<tr class="row_a">
			<td>
				Width
			</td>
			<td>
				<%= width %>
			</td>
		</tr>
		<tr class="row_b">
			<td>
				Year
			</td>
			<td>
				<%= year %>
			</td>
		</tr>
		<% if(forSale){ %>
		<tr class="row_a">
			<td colspan="2">For Sale</td>
		</tr>
		<%} %>
	</table>
</div>
</body>
</html>