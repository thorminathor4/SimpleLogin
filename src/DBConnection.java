import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static Connection connection;

    static void getConnection() {
        String dbUsername = "root"; //Change if necessary
        String dbPassword = ""; //INSERT PASSWORD!!!
        String dbUrl = "jdbc:mysql://localhost:3306/simplelogin?serverTimezone=UTC";
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
