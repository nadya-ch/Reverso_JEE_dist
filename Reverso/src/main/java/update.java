import MetierException.MetierException;
import Model.Dao.DaoClient;
import Model.metier.Client;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "update", value = "/update")
public class update extends HttpServlet {

    @Override
    public void init() {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            int identifiant = Integer.parseInt(request.getParameter("id"));
            String raison_sociale = request.getParameter("Raison_Sociale");
            String num_rue = request.getParameter("num_rue");
            String nom_rue = request.getParameter("nom_rue");
        String code_postal = request.getParameter("num_rue");
        String ville = request.getParameter("nom_rue");
        String tel = request.getParameter("num_rue");
        String mail = request.getParameter("nom_rue");
        String commentaire = request.getParameter("num_rue");
        Double chiffre_affaires = Double.valueOf(request.getParameter("nom_rue"));
        int nb_employes = Integer.parseInt(request.getParameter("num_rue"));


        Client client = null;
        try {
            client = new Client(identifiant, raison_sociale,num_rue,nom_rue,code_postal,ville,tel,mail,commentaire,chiffre_affaires,nb_employes);

            DaoClient.update(client);
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/confirmation.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e) {
               request.setAttribute("errorMessage", e.getMessage());
                RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
                dispatcher.forward(request, response);

        }
}}