package Model.Dao;

import Log.LoggerExo;
import Model.metier.LoginMetier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

public class LoginDao {
    public boolean validate(LoginMetier loginMetier) throws Exception {
        boolean status = false;

        Connection connection = null;
        try {
            connection = Connexion.getInstance();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = ? and password = ? ");
            preparedStatement.setString(1, loginMetier.getUsername());
            preparedStatement.setString(2, loginMetier.getPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            LoggerExo.LOGGER.log(Level.SEVERE, "pb  an niveau de  findall" + e.getMessage());

            throw new DaoException("pb  au niveau de  findall", 5);

        }
        return status;
    }
}