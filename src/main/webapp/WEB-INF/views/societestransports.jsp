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
	<h2>CRUD SocieteTransport</h2>
	<div>
		<f:form modelAttribute="societetransport" method="POST" action="saveSociete">
			<table>
				<tr>
					<td><f:hidden path="idSociete"/> </td>
				</tr>
				<tr>
					<td>NomDeSociete:</td>
					<td><f:input path="nomSociete" /></td>
					<td><f:errors path="nomSociete" cssClass="error"/></td>
				</tr>
				<tr>
					<td>NumDeSiret:</td>
					<td><f:input path="numSiret" /></td>
					<td><f:errors path="numSiret" cssClass="error"/></td>
				</tr>
				<tr>
					<td>DateDeCreation:</td>
					<td><f:input path="dateCreation" /></td>
					<td><f:errors path="dateCreation" type="date"  cssClass="error"/></td>
					<td><f:errors path="dateCreation" type="date" cssClass="error"/></td>
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
				<th>NomDeSociete</th>
				<th>NumDeSiret</th>
				<th>DateCreation</th>
				<th>SUPPRIMER</th>
				<th>MODIFIER</th>
			</tr>
			<c:forEach var="s" items="${societestransports}">
				<tr>
					<td>${s.idSociete}</td>
					<td>${s.nomSociete}</td>
					<td>${s.numSiret}</td>
					<td>${s.dateCreation}</td>
					<td><a href="deleteSociete?idSociete=${s.idSociete}">supprimer</a></td>
					<td><a href="editSociete?idSociete=${s.idSociete}">editer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>