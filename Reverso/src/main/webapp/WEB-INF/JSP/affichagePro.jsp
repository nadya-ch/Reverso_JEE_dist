<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 22/04/2024
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title id="connexion">Reverso - Connexion</title>
</head>
<body>

<c:import url="/template/header.jsp" ></c:import>

<table class="affichage">
    <thead>
    <tr>
        <th>Identifiant</th>
        <th>Raison sociale</th>
        <th>Num rue</th>
        <th>Nom rue</th>
        <th>Code postal</th>
        <th>Ville</th>
        <th>Tel</th>
        <th>Email</th>
        <th>Date prosection</th>
        <th>Prospect interessé</th>
    </tr>
    </thead>
    <tbody>
    <!-- Vous pouvez utiliser les balises JSTL pour itérer sur la liste des clients -->
    <c:forEach var="prospect" items="${listprosp}">
        <tr>
            <th scope="row"><c:out value="${prospect.getIdentifiant()}" /></th>
            <td><c:out value="${prospect.getRaison_sociale()}" /></td>
            <td><c:out value="${prospect.getNum_rue()}" /></td>
            <td><c:out value="${prospect.getNom_rue()}" /></td>
            <td><c:out value="${prospect.getVille()}" /></td>
            <td><c:out value="${prospect.getCode_postal()}" /></td>
            <td><c:out value="${prospect.getTel()}" /></td>
            <td><c:out value="${prospect.getEmail()}" /></td>
            <td><c:out value="${prospect.getDate_prospection()}" /></td>
            <td><c:out value="${client.getProspect_interesse()}" /></td>

            <td><a href="edit?id=<c:out value='${prospect.getRaison_sociale()}' />">Modifier</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a href="delete?id=<c:out value='${prospect.getRaison_sociale()}' />">Supprimer</a></td>
        </tr>
    </c:forEach>
    <!-- } -->
    </tbody>
</table>
<c:import url="/template/footer.jsp"></c:import>
</body>
</html>
