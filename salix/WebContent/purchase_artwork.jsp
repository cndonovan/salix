<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, products.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Purchase Artwork</title>
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
				<% Database database = new Database(); %>
				<form action="PurchaseArtworkServlet" method="post" class="form-horizontal">
					<fieldset>
						<legend>Purchase Artwork</legend>
						<div class="control-group">
							<label class="control-label">Paintings</label>
							<select name="id" class="controls" multiple>
							<% 	Enumeration<String> keys = database.keys();
								while (keys.hasMoreElements()) { 
									String key = keys.nextElement(); 
									Painting painting = database.get(key);%>
								<option value=<%=key%>> <%= painting.getTitle() %> ($<%= painting.getPrice() %>)</option>
							<% } %>
							</select>
						</div>
						<div class="form-actions">
							<input type="submit" class="btn btn-primary" value="Purchase" />
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>