<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 18/04/2024
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Modifier Client</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
</head>
<body>

<c:import url="/template/header.jsp" ></c:import>

<h1>Modifier Client</h1>

<article>




    <form action="ModifierServlet" method="post" class="form-modif">
    <div class="form-group">
        <label for="raison_sociale">Raison sociale</label>
        <input type="text" name="raison_sociale" id="raison_sociale" value="${client.raison_sociale}" required />
    </div>
    <div class="form-group">
        <label for="num_rue">Numéro de rue</label>
        <input type="text" name="num_rue" id="num_rue" value="${client.num_rue}" required />
    </div>
    <div class="form-group">
        <label for="nom_rue">Nom de rue</label>
        <input type="text" name="nom_rue" id="nom_rue" value="${client.nom_rue}" required />
    </div>
    <div class="form-group">
        <label for="code_postal">Code postal</label>
        <input type="text" name="code_postal" id="code_postal" value="${client.code_postal}" required />
    </div>
    <div class="form-group">
        <label for="ville">Ville</label>
        <input type="text" name="ville" id="ville" value="${client.ville}" required />
    </div>
    <div class="form-group">
        <label for="tel">Téléphone</label>
        <input type="tel" name="tel" id="tel" value="${client.tel}" required />
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input type="email" name="email" id="email" value="${client.email}" required />
    </div>
    <div class="form-group">
        <label for="chiffre_affaires">Chiffre d'affaires</label>
        <input type="text" name="chiffre_affaires" id="chiffre_affaires" value="${client.chiffre_affaires}" required />
    </div>
    <div class="form-group">
        <label for="nb_employes">Nombre d'employés</label>
        <input type="text" name="nb_employes" id="nb_employes" value="${client.nb_employes}" required />
    </div>
    <div class="form-group">
        <label for="commentaire">Commentaire</label>
        <textarea name="commentaire" id="commentaire">${client.commentaire}</textarea>
    </div>
    <input type="submit" value="Valider" />
    </form>
</article>



<c:import url="/template/footer.jsp"></c:import>

</body>
</html>