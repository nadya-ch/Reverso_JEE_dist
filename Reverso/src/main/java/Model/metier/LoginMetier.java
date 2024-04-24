package Model.metier;

import java.io.Serializable;

public class LoginMetier implements Serializable {
    private static final long serialVersionUID = 1L;
    private static String username;
    private static String password;

    public  String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public  String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
