<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
<h1>Erreur</h1>
<p>Erreur: <%= request.getAttribute("errorMessage") %></p>

<button onclick="goBack()">Retour au formulaire </button>

<script>
    function goBack() {
        window.history.back();
    }
</script>
</body>
</html>
