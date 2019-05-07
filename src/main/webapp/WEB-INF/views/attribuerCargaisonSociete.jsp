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
	<h2>Attribuer une cargaison à une societe de transport</h2>
	<div>
		<f:form modelAttribute="societetransport" method="POST" action="attribCargaisonSociete">
			<table>
				<tr>
  					<td>
  					<div>
  					SOCIETES DE TRANSPORT : <select name="idSociete">
						<optgroup>
							<option value="0">---</option>
							<c:if test="${not empty societestransports }">
  							<c:forEach items="${societestransports }" var="a">
  							<option value="${a.idSociete }"><c:out value="${a.nomSociete },${a.numSiret },${a.dateCreation }"/></option>		<!-- les id,nom,prenom,age correspondent aux attributs de la classe metier car je  -->				
  							</c:forEach>
  							</c:if>
						</optgroup></br>
					</select>
					</div>
					</td>
  				</tr>
				<tr>
  					<td>
  					<div>
  					CARGAISONS AERIENNES : <select name="idCargaison">
						<optgroup>
							<option value="0">---</option>
							<c:if test="${not empty aeriennes }">
  							<c:forEach items="${aeriennes }" var="a">
  							<option value="${a.idCargaison }"><c:out value="${a.nomCargaison },${a.depart },${a.destination },${a.numVol },${a.taxe }"/></option>		<!-- les id,nom,prenom,age correspondent aux attributs de la classe metier car je  -->				
  							</c:forEach>
  							</c:if>
						</optgroup></br>
					</select>
					</div>
					</td>
  				</tr>
				<tr>
  					<td>
  					<div>
  					CARGAISONS ROUTIERES : <select name="idCargaison">
						<optgroup>
							<option value="0">---</option>
							<c:if test="${not empty routieres }">
  							<c:forEach items="${routieres }" var="a">
  							<option value="${a.idCargaison }"><c:out value="${a.nomCargaison },${a.depart },${a.destination },${a.immatriculation },${a.peage }"/></option>		<!-- les id,nom,prenom,age correspondent aux attributs de la classe metier car je  -->				
  							</c:forEach>
  							</c:if>
						</optgroup></br>
					</select>
					</div>
					</td>
  				</tr>
				<tr>
					<td><input type="submit" value="enregistrer" /></td>
				</tr>
			</table>
		</f:form>
	</div>
</body>
</html>