<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" 
	href="css/bootstrap.css">
<title>Adding Artwork</title>

</head>
<body>
<div class="container-fluid">
<%@ include file="header.jsp" %>
<div class="row-fluid">
<div class="span12">
<form action="display_added_art.jsp" method="post" class="form-horizontal">
	<fieldset>
	<legend>Adding Artwork</legend>
	<div class="control-group">
		<label class="control-label">Title</label>
		<input type="text" name="title" class="controls" />
	</div>
	<div class="control-group">
		<label class="control-label">Medium</label>
		<select name="medium" class="controls">
			<option> Acrylic </option>
			<option> Oil </option>
			<option> Mixed Media </option>
		</select>
	</div>
	<div class="control-group">
		<label class="control-label">Surface</label>
		<select name="surface" class="controls">
			<option> Canvas </option>
			<option> Wood </option>
			<option> Paper </option>
			<option> Other </option>
		</select>
	</div>
	<div class="control-group">
		<label class="control-label">Height</label>
		<div class="input-append">
			<input class="controls" type="text" name="height" /><span class="add-on">inches</span>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label">Width</label>
		<div class="input-append">
			<input class="controls" type="text" name="width" /><span class="add-on">inches</span>
		</div>
	</div>	
	<div class="control-group">
		<label class="control-label"> Year Created </label>
		<select class="controls" name="year">
		<% 
			for (int year = 2000; year < 2013; year++){
		%>
				<option> <%= year %> </option>
		<%
			}
		%>
	</select>
	</div>
	<div class="control-group">	
		<label class="control-label">For Sale?</label>
		<input class="controls" type="radio" name="forSale" value="yes">Yes 
		<br>
		<input class="controls" type="radio" name="forSale" value="no">No
	</div>
	<%! Date loadDate = new Date(); %>
	<input type="hidden" name="loadDate" value="<%= loadDate %>" />
	<div class="form-actions">
		<input type="submit" class="btn btn-primary" value="Submit" />
		<input type="reset" class="btn" value="Reset" />
	</div>
	</fieldset>
</form>
</div>
</div>
</div>
</body>
</html>