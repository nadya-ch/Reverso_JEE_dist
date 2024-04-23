import MetierException.MetierException;
import Model.Dao.DaoProspect;
import Model.metier.Prospect;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;



@WebServlet("/")
public class ProspectServlet extends HttpServlet {


    private DaoProspect daoProspect;

    public void init() {

        daoProspect = new DaoProspect();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertProspect(request, response);
                    break;
                case "/delete":
                    deleteUser(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateProspect(request, response);
                    break;
                default:
                    listUser(request, response);
                    break;
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);

        }  catch (MetierException me) {
            request.setAttribute("errorMessage", me.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
            dispatcher.forward(request, response);


            // Redirection vers la page de confirmation

            // Gérer les erreurs

        }catch (Exception e) {
            request.setAttribute("errorMessage", e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
            dispatcher.forward(request, response);


            // Redirection vers la page de confirmation

            // Gérer les erreurs

        }

            }

    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        List<Prospect> Prospects = DaoProspect.findAll();
        request.setAttribute("listprosp", Prospects);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/affichagePro.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/formulairePro.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String Raison = request.getParameter("id");
        Prospect prospect_exist = DaoProspect.findByName(Raison);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/formulairePro.jsp");
        request.setAttribute("prospect", prospect_exist);
        dispatcher.forward(request, response);

    }

    private void insertProspect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupération des paramètres du formulaire
        String raison_sociale = request.getParameter("raison_sociale");
        String Num_rue = request.getParameter("num_rue");
        String Nom_rue = request.getParameter("nom_rue");
        String Code_postal = request.getParameter("code_postal");
        String Ville = request.getParameter("ville");
        String Tel = request.getParameter("tel");
        String Email = request.getParameter("email");
        LocalDate Date_prospection = LocalDate.parse(request.getParameter("Date_prospection"));


        /*LocalDate Date_prospection = LocalDate.parse(request.getParameter("Date_prospection").DATE_TIME_FORMATTER);*/
        String Prospect_interesse = request.getParameter("Prospect_interesse");
        String Commentaire = request.getParameter("commentaire");
       // LocalDate Date_prospection = LocalDate.parse(request.getParameter("Date_prospection"));

        // Vérification si le paramètre Date_prospection est null

            // Création de l'objet Prospect avec les paramètres

        try {
          Prospect  prospect = new Prospect(0, raison_sociale, Num_rue, Nom_rue, Code_postal, Ville, Tel,
                    Email, Commentaire, Date_prospection, Prospect_interesse);

        // Appel à la méthode DaoProspect.create pour insérer le prospect en base de données
            daoProspect.create(prospect);
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/confirmation.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e) {
            request.setAttribute("errorMessage", e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
            dispatcher.forward(request, response);


            // Redirection vers la page de confirmation

            // Gérer les erreurs

        }
    }
    private void updateProspect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String raison_sociale = request.getParameter("raison_sociale");
        String Num_rue = request.getParameter("num_rue");
        String Nom_rue = request.getParameter("nom_rue");
        String Code_postal = request.getParameter("code_postal");
        String Ville = request.getParameter("ville");
        String Tel = request.getParameter("tel");
        String Email = request.getParameter("email");
        LocalDate Date_prospection = LocalDate.parse(request.getParameter("Date_prospection"));
        String Prospect_interesse = request.getParameter("Prospect_interesse");
        String Commentaire = request.getParameter("commentaire");

        try {
         Prospect   prospect = new Prospect(0, raison_sociale, Num_rue, Nom_rue, Code_postal, Ville, Tel,
                    Email, Commentaire, Date_prospection, Prospect_interesse);
         daoProspect.update(prospect);

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
        private void deleteUser (HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            String Raison = request.getParameter("id");
            try {
                daoProspect.delete(Raison);
            } catch (Exception e) {
                // Gérer les erreurs

                // Rediriger l'utilisateur vers une page d'erreur ou afficher un message d'erreur
                request.setAttribute("errorMessage", e.getMessage());
                RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
                dispatcher.forward(request, response);
            }
        }}
