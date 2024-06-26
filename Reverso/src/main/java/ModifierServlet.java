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


    @WebServlet(name = "ModifierServlet", value = "/ModifierServlet")
    public class ModifierServlet extends HttpServlet {
        private DaoClient daoClient; // Vous devez initialiser ceci

        @Override
        public void init() throws ServletException {
            super.init();
            // Initialisez votre DaoClient ici
            daoClient = new DaoClient(); // Exemple de création de l'objet DaoClient
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // Récupérer les paramètres du formulaire


                // Récupérer les paramètres du formulaire
                String raison_sociale = request.getParameter("raison_sociale");
                String Num_rue = request.getParameter("num_rue");
                String Nom_rue = request.getParameter("nom_rue");
                String Code_postal = request.getParameter("code_postal");
                String Ville = request.getParameter("ville");
                String Tel = request.getParameter("tel");
                String Email = request.getParameter("email");
                String Commentaire = request.getParameter("commentaire");
                Double Chiffre_affaires = Double.valueOf(request.getParameter("chiffre_affaires"));
                int nb_employes = Integer.parseInt(request.getParameter("nb_employes"));

                try {
                    // Créer un objet Client avec les données récupérées
                    Client client = new Client(2000, raison_sociale, Num_rue, Nom_rue, Code_postal, Ville, Tel, Email, Commentaire, Chiffre_affaires,
                            nb_employes);

                    // Appeler la méthode update du DAO pour mettre à jour le client
                    DaoClient.update(client);

                    // Rediriger vers une page de confirmation
                    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/confirmation.jsp");
                    dispatcher.forward(request, response);
                } catch (Exception ex) {
                /*    // Gérer les erreurs

                    // Rediriger l'utilisateur vers une page d'erreur ou afficher un message d'erreur
                    request.setAttribute("errorMessage", ex.getMessage());
                    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
                    dispatcher.forward(request, response);
                }*/
                    throw new RuntimeException(ex);

                }
        }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





        // Récupérer le paramètre "Raison_sociale" depuis la requête GET
        String raison_sociale = request.getParameter("id");

        try {
            // Appeler la méthode DaoClient.findByName pour obtenir les informations du client
            Client client = DaoClient.findByName(raison_sociale);

            // Définir l'objet Client comme attribut de la requête
            request.setAttribute("client", client);

            // Transférer la requête et la réponse à la page JSP Modification.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/Modification.jsp");
            dispatcher.forward(request, response);






} catch (Exception e) {
            throw new RuntimeException(e);
        }}}