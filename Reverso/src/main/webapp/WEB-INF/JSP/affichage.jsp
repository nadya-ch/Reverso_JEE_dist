


<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 16/04/2024
  Time: 15:50
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
        <th>Chiffre d'affaires</th>
        <th>Nombre d'employés</th>
    </tr>
    </thead>
    <tbody>
    <!-- Vous pouvez utiliser les balises JSTL pour itérer sur la liste des clients -->
    <c:forEach var="client" items="${Clients}">
        <tr>
            <th scope="row"><c:out value="${client.getIdentifiant()}" /></th>
            <td><c:out value="${client.getRaison_sociale()}" /></td>
            <td><c:out value="${client.getNum_rue()}" /></td>
            <td><c:out value="${client.getNom_rue()}" /></td>
            <td><c:out value="${client.getVille()}" /></td>
            <td><c:out value="${client.getCode_postal()}" /></td>
            <td><c:out value="${client.getTel()}" /></td>
            <td><c:out value="${client.getEmail()}" /></td>
            <td><c:out value="${client.getChiffre_affaires()}" /></td>
            <td><c:out value="${client.getNb_employes()}" /></td>
            <td><a href="ModifierServlet?id=<c:out value='${client.getRaison_sociale()}' />">Modifier</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a href="SuppServlet?id=<c:out value='${client.getRaison_sociale()}' />">Supprimer</a></td>
        </tr>
    </c:forEach>
    <!-- } -->
    </tbody>
</table>
<c:import url="/template/footer.jsp"></c:import>
</body>
</html>
