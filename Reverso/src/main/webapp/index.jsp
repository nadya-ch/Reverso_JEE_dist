<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
    <title>Reverso</title>
</head>
<body>

<c:import url="/template/header.jsp" ></c:import>


<article>
    <table>
    <form action="ChoixServlet" method="post">

            <h1> <li class="gestion-de-client">
               <tr><td> <input type="checkbox" id="gestion-de-client" name="gestion-de-client" value="gestion-de-client">
                 <label for="gestion-de-client">Gestion de client</label></td></tr>

                <tr><td><input type="checkbox" id="gestion-de-prospect" name="gestion-de-prospect" value="gestion-de-prospect">
                <label for="gestion-de-prospect">Gestion de prospect</label></td></tr>
            </h1>

        <tr><td> <input type="submit" value="Submit"></td></tr>
    </form>
    </table>
</article>

<footer>
    <p>© 2024 REVERSO</p>
</footer>

</body>
</html>
