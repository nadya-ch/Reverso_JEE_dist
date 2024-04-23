import Model.Dao.DaoClient;
import Model.metier.Client;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ChoixServlet", value = "/ChoixServlet")
public class ChoixServlet extends HttpServlet {



        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // Récupérer les valeurs des cases à cocher
            String gestionDeClient = request.getParameter("gestion-de-client");
            String gestionDeProspect = request.getParameter("gestion-de-prospect");

            // Vérifier quelles cases sont cochées
            if (gestionDeClient != null) {
                // Rediriger vers la page Creation.jsp si "Gestion de client" est sélectionné
                RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/accueil.jsp");
                dispatcher.forward(request, response);
            } else if (gestionDeProspect != null) {
                // Rediriger vers la page prospect.jsp si "Gestion de prospect" est sélectionné

                RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/accueilprospect.jsp");
                dispatcher.forward(request, response);
            } else {
                // Aucun choix n'a été sélectionné, vérifier s'il s'agit d'une tentative de connexion
                String action = request.getParameter("action");
                if ("connexion".equals(action)) {
                    // Rediriger vers la page de connexion si l'action est connexion
                    response.sendRedirect("connexion.html");
                } else {
                    // Ni une sélection d'option ni une tentative de connexion, rediriger vers une page d'erreur
                    response.sendRedirect("error.jsp");
                }
            }
        }
    }
