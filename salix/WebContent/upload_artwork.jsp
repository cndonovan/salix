<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Upload Artwork</title>
	<link rel="stylesheet" type="text/css" 
		href="css/bootstrap.css">
	<link rel='stylesheet' type='text/css'
		href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' >
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta name="description" content="Salix's art portfolio" >
	<meta name="keywords" content="art, portfolio, fine art, Willow Solem, paintings" >
	<script type="text/javascript">
		function validate(form) {
			if ((form.title.value == "")
				|| (form.height.value == "")
				|| (form.width.value == "")
				|| (form.for_sale == "")) {
				alert("Please fill in each field.");
				return false;
			} return true;
		}
	</script>
</head>
<body>
	<div class="container-fluid">
	<%@ include file="shared/header.jsp" %>
		<div class="row-fluid">
			<div class="span12">
				<form action="show_artwork.jsp" method="post" onsubmit="return validate(this);" class="form-horizontal">
					<fieldset>
					<legend>Upload Artwork</legend>
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
							<% for (int year = 2000; year < 2013; year++) { %>
								<option><%= year %></option>
							<% } %>
					</select>
					</div>
					<div class="control-group">	
						<label class="control-label">For Sale?</label>
						<input class="controls" type="radio" name="for_sale" value="yes">Yes 
						<br>
						<input class="controls" type="radio" name="for_sale" value="no">No
					</div>
					<%! Date load_date = new Date(); %>
					<input type="hidden" name="load_date" value="<%= load_date %>" />
					<div class="form-actions">
						<input type="submit" class="btn btn-primary" value="Upload" />
					</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>