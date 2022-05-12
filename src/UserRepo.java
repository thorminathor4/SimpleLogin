import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepo {

    static Connection connection = DBConnection.connection;

    static User getUserByUsername(String username){
        try {
            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                int id = resultSet.getInt("id");
                String password = resultSet.getString("password");

                User user = new User(id, username, password);
                //System.out.println("Received a user: " + user);
                return user;
            }

        }catch (Exception exception){
            exception.printStackTrace();
        }
        //System.out.println("Didn't receive a user with the username: " + username);
        return null;
    }
}
