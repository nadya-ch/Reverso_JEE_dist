<%--
  Created by IntelliJ IDEA.
  User: CDA09
  Date: 22/04/2024
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/web/resources/css/style.css">
</head>
<body>
<c:import url="/template/header.jsp" ></c:import>

<center>
    <h1>Reverso </h1>
    <h2>
                <a href="list">Afficher les prospects </a>

    </h2>
</center>
<div align="center">
    <form action="${prospect != null ? 'update' : 'insert'}" method="post">
        <c:if test="${prospect == null}">
        <form action="insert" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${prospect != null}">
                            Edit User
                        </c:if>
                        <c:if test="${prospect == null}">
                            Add New User
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${prospect != null}">
                    <input type="hidden" name="id" value="<c:out value='${Prospect.raison_sociale}' />" />
                </c:if>
                <tr>
                    <th>raison_sociale </th>
                    <td>
                        <input type="text" name="raison_sociale"
                               value="${prospect.raison_sociale}"
                        />
                    </td>
                </tr>
                <tr>
                    <th>num_rue </th>
                    <td>
                        <input type="text" name="num_rue"
                               value="<c:out value='${prospect.num_rue}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>nom_rue </th>
                    <td>
                        <input type="text" name="nom_rue"
                               value="<c:out value='${prospect.nom_rue}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Ville </th>
                    <td>
                        <input type="text" name="ville"
                               value="<c:out value='${prospect.ville}' />"
                        />
                    </td>
                </tr>
                  <tr>
                      <th>code postale  </th>
                      <td>
                          <input type="text" name="code_postal"
                                 value="<c:out value='${prospect.code_postal}' />"
                          />
                      </td>
                  </tr>
                <tr>
                    <th>tel </th>
                    <td>
                        <input type="text" name="tel"
                               value="<c:out value='${prospect.tel}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>email </th>
                    <td>
                        <input type="email" name="email" size="45"
                               value="<c:out value='${prospect.email}' />"
                        />
                    </td>
                </tr>
                  <tr>
                      <th>Date_prospect </th>
                      <td>
                          <input type="date" name="date_prospection" value="<c:out value='${prospect.date_prospection}' />">
                      </td>
                  </tr>
                  <tr>
                    <th>prospect_interesse </th>
                    <td>
                        <input type="text" name="prospect_interesse"
                               value="<c:out value='${prospect.prospect_interesse}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>commentaire </th>
                    <td>
                        <input type="text" name="Commentaire"
                               value="<c:out value='${prospect.commentaire}' />"
                        />
                    </td>
                </tr>

                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form>
</div>
</body>
</html>
