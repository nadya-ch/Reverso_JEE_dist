<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
    <title>Reverso</title>
</head>
<body>

<header class="header">

    <div class="logo">
        <img src="images/logo.PNG" alt="logo" >
        Reverso Gestion
    </div>


    <div class="logo">
        <!-- Formulaire pour la connexion -->
        <form action="ChoixServlet" method="post">
            <input type="hidden" name="action" value="connexion">
            <button type="submit">Se connecter</button>
        </form>
        <!-- Fin du formulaire de connexion -->
        <img src="images/cnx.png" alt="logo connexion"></div>

</header>


<article>
    <form action="ChoixServlet" method="post">
        <ul>
            <h1> <li class="gestion-de-client">
                <input type="checkbox" id="gestion-de-client" name="gestion-de-client" value="gestion-de-client">
                 <label for="gestion-de-client">Gestion de client</label>

                <input type="checkbox" id="gestion-de-prospect" name="gestion-de-prospect" value="gestion-de-prospect">
                <label for="gestion-de-prospect">Gestion de prospect</label>
            </h1>
        </ul>
        <input type="submit" value="Submit">
    </form>
</article>

<footer>
    <p>© 2024 REVERSO</p>
</footer>

</body>
</html>
