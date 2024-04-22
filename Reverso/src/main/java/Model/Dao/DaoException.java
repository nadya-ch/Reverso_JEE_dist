package Model.Dao;


public class DaoException extends Exception {
    private int gravity;


    public DaoException(String message,int gravity) {
        super(message);
        this.gravity=gravity;
    }
    public int getGravity() {
        return gravity;
    }
}
