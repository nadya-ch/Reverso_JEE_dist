<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 18/04/2024
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="header">

    <div class="logo">
        <img src="images/logo.PNG" alt="logo" >
        Reverso Gestion
    </div>


    <div class="logo">
        <%-- Rediriger vers la servlet de connexion lorsque le lien est cliqué --%>
        <a href="LoginServlet">Connexion</a>
        <!-- Utilisation de request.getContextPath() pour obtenir le chemin de contexte de l'application -->
        <!-- Assurez-vous que "/servletlogin" correspond à l'URL de votre servlet de connexion -->
    </div>

</header>
