import Model.Dao.DaoClient;
import Model.metier.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "CreationServlet", value = "/CreationServlet")
public class CreationServlet extends HttpServlet {

    private DaoClient daoClient; // Vous devez initialiser ceci

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialisez votre DaoClient ici
        daoClient = new DaoClient(); // Exemple de création de l'objet DaoClient
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /*    // Vérifier si l'utilisateur est connecté
        HttpSession session = request.getSession(false); // Ne crée pas de nouvelle session s'il n'en existe pas
        if (session == null || session.getAttribute("utilisateur") == null) {
            // L'utilisateur n'est pas connecté, rediriger vers la page de connexion
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/Login.jsp");
            dispatcher.forward(request, response);
        } else {
            // L'utilisateur est connecté, afficher la page pour ajouter un client
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/Modification.jsp");
            dispatcher.forward(request, response);
        }*/

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/Creation.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les données soumises par le formulaire

        String Raison_sociale = request.getParameter("raison_sociale");
        String Num_rue = request.getParameter("num_rue");
        String Nom_rue = request.getParameter("nom_rue");
        String Code_postal = request.getParameter("code_postal");
        String Ville = request.getParameter("ville");
        String Tel = request.getParameter("tel");
        String Email = request.getParameter("email");
        Double Chiffre_affaires = Double.valueOf(request.getParameter("chiffre_affaires"));
        int nb_employes = Integer.parseInt(request.getParameter("nb_employes"));
        String Commentaire = request.getParameter("commentaire");

try {
    // Créer un objet Client avec les données récupérées
    Client client = new Client( 0,Raison_sociale, Num_rue, Nom_rue, Code_postal, Ville, Tel, Email, Commentaire, Chiffre_affaires,
            nb_employes);

    // Appeler la méthode create de DaoClient pour insérer le client dans la base de données
    daoClient.create(client);

    // Rediriger l'utilisateur vers une autre page ou afficher un message de succès
    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/confirmation.jsp");
    dispatcher.forward(request, response);
} catch (Exception e) {
    // Gérer les erreurs

    // Rediriger l'utilisateur vers une page d'erreur ou afficher un message d'erreur
    request.setAttribute("errorMessage", e.getMessage());
    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
    dispatcher.forward(request, response);
}
    }}