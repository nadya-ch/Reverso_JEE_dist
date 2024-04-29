<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 25/04/2024
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>




<c:import url="/template/header.jsp" ></c:import>

<center>
    <h1>Reverso </h1>
    <h2>
        <a href="list">Afficher les Client </a>

    </h2>
</center>
<div align="center">
    <form action="${client != null ? 'update' : 'insert'}" method="post">

        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${client != null}">
                        Edit User
                    </c:if>
                    <c:if test="${client == null}">
                        Add New User
                    </c:if>
                </h2>
            </caption>
            <c:if test="${client != null}">
                <input type="hidden" name="id" value="<c:out value='${client.raison_sociale}' />" />
            </c:if>

            <tr>
                <th>identifiant </th>
                <td>
                    <input type="text" name="identifiant"
                           value="${client.identifiant}"
                    />
                </td>
            </tr>


            <tr>
                <th>raison_sociale </th>
                <td>
                    <input type="text" name="raison_sociale"
                           value="${client.raison_sociale}"
                    />
                </td>
            </tr>
            <tr>
                <th>num_rue </th>
                <td>
                    <input type="text" name="num_rue"
                           value="<c:out value='${client.num_rue}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>nom_rue </th>
                <td>
                    <input type="text" name="nom_rue"
                           value="<c:out value='${client.nom_rue}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Ville </th>
                <td>
                    <input type="text" name="ville"
                           value="<c:out value='${client.ville}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>code postale  </th>
                <td>
                    <input type="text" name="code_postal"
                           value="<c:out value='${client.code_postal}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>tel </th>
                <td>
                    <input type="text" name="tel"
                           value="<c:out value='${client.tel}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>email </th>
                <td>
                    <input type="email" name="email" size="45"
                           value="<c:out value='${client.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>chiffre_affaires </th>
                <td>
                    <input type="date" name="chiffre_affaires" value="<c:out value='${client.chiffre_affaires}' />">
                </td>
            </tr>
            <tr>
                <th>nb_employes </th>
                <td>
                    <input type="text" name="nb_employes"
                           value="<c:out value='${prospect.nb_employes}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>commentaire </th>
                <td>
                    <input type="text" name="commentaire"
                           value="<c:out value='${client.commentaire}' />"
                    />
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit"  value="Save" />
                </td>
            </tr>

        </table>
    </form>
</div>



</body>
</html>
