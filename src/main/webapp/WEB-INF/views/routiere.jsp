<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h2>CRUD CARGAISONS ROUTIERES</h2>
	<div>
		<f:form modelAttribute="routiere" method="POST" action="saveRoutiere">
			<table>
				<tr>
					<td><f:hidden path="idCargaison"/> </td>
				</tr>
				<tr>
					<td>NOM DE LA CARGAISON:</td>
					<td><f:input path="nomCargaison" /></td>
					<td><f:errors path="nomCargaison" cssClass="error"/></td>
				</tr>
				<tr>
					<td>DEPART:</td>
					<td><f:input path="depart" /></td>
					<td><f:errors path="depart" cssClass="error"/></td>
				</tr>
				<tr>
					<td>DESTINATION:</td>
					<td><f:input path="destination" /></td>
					<td><f:errors path="destination" cssClass="error"/></td>
				</tr>
				<tr>
					<td>IMMATRICULATION:</td>
					<td><f:input path="immatriculation" /></td>
					<td><f:errors path="immatriculation" cssClass="error"/></td>
				</tr>
				<tr>
					<td>PEAGE:</td>
					<td><f:input path="peage" /></td>
					<td><f:errors path="peage" cssClass="error"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="enregistrer" /></td>
				</tr>
			</table>
		</f:form>
	</div>
	<div id="listProduits">
		<table class="table1">
			<tr>
				<th>ID</th>
				<th>NOMS DES CARGAISONS</th>
				<th>DEPARTS</th>
				<th>DESTINATIONS</th>
				<th>IMMATRICULATIONS</th>
				<th>PEAGES</th>
				<th>SUPPRIMER</th>
				<th>MODIFIER</th>
			</tr>
			<c:forEach var="p" items="${routieres}">
				<tr>
					<td>${p.idCargaison}</td>
					<td>${p.nomCargaison}</td>
					<td>${p.depart}</td>
					<td>${p.destination}</td>
					<td>${p.immatriculation}</td>
					<td>${p.peage}</td>
					<td><a href="deleteRoutiere?idRoutiere=${p.idCargaison}">supprimer</a></td>
					<td><a href="editRoutiere?idRoutiere=${p.idCargaison}">editer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>