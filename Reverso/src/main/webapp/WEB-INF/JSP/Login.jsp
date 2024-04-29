<%--
&lt;%&ndash;
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 11/04/2024
  Time: 13:33
  To change this template use File | Settings | File Templates.
&ndash;%&gt;
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title id="connexion">Reverso - Connexion</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">

</head>
<body>
<header class="header">

    <div class="logo">
        <img src="images/logo.PNG" alt="logo" >
        Reverso Gestion
    </div>



</header>

<article>
    <form action="LoginServlet" method="post" class="form-cnx">
        <div class="form-example">
            <label for="email">email:</label>
            <input type="email" name="username"  id="email" value="username" required />
        </div>
        <div class="form-example">
            <label for="password">Mot de passe:</label>
            <input type="password" name="password" id="password" required />
        </div>
        <div class="form-example">
            <input type="submit" value="Se connecter" />
        </div>
    </form>





</article>

<footer>
    <p>© 2024 REVERSO</p>
</footer>

</body>
</html>
--%>
