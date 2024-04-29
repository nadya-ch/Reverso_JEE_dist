<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Gestion</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
</head>
<body>
<c:if test="${!empty sessionScope.user}">
    <p>Bonjour ${sessionScope.user}</p>
</c:if>

<div class="center">
    <h1>Gestion de client</h1>
    <!-- Boutons transformés -->
    <a href="nv" class="button">Ajouter un client</a>
    <a href="AffichageServlet" class="button">Afficher les client </a>



</div>

</body>
</html>
