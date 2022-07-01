<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/navbar.jsp"%>
	<br>
	<br>
	<br>
	<div class="container">
		<h2>Vehicules</h2>
		<br>
		<form method="POST">
			<div class="mb-3">
				<input type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Marque" name="marque">
			</div>
			<div class="mb-3">
				<input type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Modele" name="modele">
			</div>
			<div class="mb-3">
				<input type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Couleur" name="couleur">
			</div>
			<div class="mb-3">
				<input type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Immatriculation" name="immatriculation">
			</div>
			<br> <input type="submit" class="btn btn-secondary"
				value="Inscrire">
		</form>
	</div>
</body>
</html>