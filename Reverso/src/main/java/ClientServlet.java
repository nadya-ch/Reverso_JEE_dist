import Model.Dao.DaoClient;
import Model.metier.Client;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ClientServlet", value = "/ClientServlet")
public class ClientServlet extends HttpServlet {
    private DaoClient daoClient;

    @Override
    public void init() {
        daoClient=new DaoClient();


    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action=request.getServletPath();


switch(action){
    case "/nv":
        newForm(request,response);
        break;
    case "/insert":
        insertClient(request,response);
        break;
   /* case "/delete":
        deletClietn(request,response);
        break;
    case "/edit":
        modifForm(request,response);
        break;
    case "/update":
        updateClient(request,response);
        break;
    case "/list":
        listClient(request,response);
        break;
    default:
        Login(request,response);
        break;*/
}


}

    private void insertClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    // Récupérer les données soumises par le formulaire

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
    }

    private void newForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/formulaireCl.jsp");
            dispatcher.forward(request, response);
    }
}