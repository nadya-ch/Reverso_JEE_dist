import Model.Dao.Connexion;
import Model.Dao.DaoClient;
import Model.metier.Client;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AffichageServlet", value = "/AffichageServlet")
public class AffichageServlet extends HttpServlet {

    private static final String VUE = "/WEB-INF/JSP/affichage.jsp";
    private static final String ATT_MESSAGE = "messages";
    private DaoClient daoClient = null;
   // private DaoProspect prospectDAO = null;
    private Connexion CONNECT = null;

    @Override
    public void init() {
        // recuperation de l'instance de la DAO
        daoClient = new DaoClient();
       // prospectDAO = new ProspectDAO();

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // recuperation de l'attribut contenant ma connection


        // recuperation de la liste des clients
        List<Client> clients = null;
        try {
            clients = DaoClient.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // mise en place de la liste dans la requette
        request.setAttribute("Clients", clients);

        // recuperation de la liste des prospects
       /* List<Prospect> prospectList =  prospectDAO.findALL(CONNECT);
        // mise en place de la liste dans la requette
        request.setAttribute("listProspect", prospectList);

        // dispatch vers la vue*/
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public void destroy() {

    }
}