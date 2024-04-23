<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 15/04/2024
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="fr" >
<head>
    <meta charset="UTF-8">
    <title id="connexion">Reverso - Connexion</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
</head>
<body>



<c:import url="/template/header.jsp" ></c:import>


<article>
    <form action="CreationServlet" method="post" class="form-creation">
        <div class="form-group">
            <label for="raison_sociale">Raison sociale</label>
            <input type="text" name="raison_sociale" id="raison_sociale" required />
        </div>
        <div class="form-group">
            <label for="num_rue">Numéro de rue</label>
            <input type="text" name="num_rue" id="num_rue" required />
        </div>
        <div class="form-group">
            <label for="nom_rue">Nom de rue</label>
            <input type="text" name="nom_rue" id="nom_rue" required />
        </div>
        <div class="form-group">
            <label for="code_postal">Code postal</label>
            <input type="text" name="code_postal" id="code_postal" required />
        </div>
        <div class="form-group">
            <label for="ville">Ville</label>
            <input type="text" name="ville" id="ville" required />
        </div>
        <div class="form-group">
            <label for="tel">Téléphone</label>
            <input type="tel" name="tel" id="tel" required />
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" name="email" id="email" required />
        </div>
        <div class="form-group">
            <label for="chiffre_affaires">Chiffre d'affaires</label>
            <input type="text" name="chiffre_affaires" id="chiffre_affaires" required />
        </div>
        <div class="form-group">
            <label for="nb_employes">Nombre d'employés</label>
            <input type="text" name="nb_employes" id="nb_employes" required />
        </div>
        <div class="form-group">
            <label for="commentaire">Commentaire</label>
            <textarea name="commentaire" id="commentaire"></textarea>
        </div>
        <input type="submit" value="Valider" />
    </form>
</article>


<c:import url="/template/footer.jsp"></c:import>


</body>
</html>
