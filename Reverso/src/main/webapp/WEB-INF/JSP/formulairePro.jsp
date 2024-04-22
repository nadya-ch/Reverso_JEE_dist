<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 22/04/2024
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
</head>
<body>
<c:import url="/template/header.jsp" ></c:import>

<center>
    <h1>Gestion de prospect</h1>
    <h2>
        <a href="new">ajouter un prospect</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list">Afficher les prospects </a>

    </h2>
</center>
<div align="center">
    <c:if test="${user != null}">
    <form action="update" method="post">
        </c:if>
        <c:if test="${user == null}">
        <form action="insert" method="post">
            </c:if>
            <table border="1" cellpadding="5">

                <c:if test="${user != null}">
                    <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                </c:if>


            </table>
        </form>
</div>

</body>
</html>
